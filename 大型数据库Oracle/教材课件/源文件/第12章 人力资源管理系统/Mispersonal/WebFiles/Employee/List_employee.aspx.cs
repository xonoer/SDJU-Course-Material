using System;
using System.Data;
using System.Configuration;
using System.Collections;
using System.Web;
using System.Web.Security;
using System.Web.UI;
using System.Web.UI.WebControls;
using System.Web.UI.WebControls.WebParts;
using System.Web.UI.HtmlControls;
using Oracle.DataAccess.Client;
public partial class WebFiles_Employee_List_employee : System.Web.UI.Page
{
    protected void Page_Load(object sender, EventArgs e)
    {
        if(!IsPostBack)
        Bind();
    }
    private void Bind()
    {
        OracleConnection con = new OracleConnection(ConfigurationManager.ConnectionStrings["Mispersonalconn"].ConnectionString);
        string sql = "select E_ID 员工编号,E_Name 员工姓名,E_Sex 员工性别,E_Tel 联系电话,E_Address 联系地址,E_Birth 出生年月,D_Name 所属部门 from [Tb_employee]";
        OracleDataAdapter sda = new OracleDataAdapter(sql,con);
        DataSet ds = new DataSet();
        sda.Fill(ds, "temp");
        con.Close();
        list1.DataSource =ds.Tables["temp"].DefaultView;
        list1.DataBind();
    }

    protected void list1_PageIndexChanging(object sender, GridViewPageEventArgs e)
    {
        list1.PageIndex = e.NewPageIndex;
        DataBind();

    }

}
