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
public partial class WebFiles_Department_List_Depart : System.Web.UI.Page
{
    protected void Page_Load(object sender, EventArgs e)
    {
        if(!IsPostBack)
         Bind();
    }
    private void Bind()
    {
        OracleConnection con = new OracleConnection(ConfigurationManager.ConnectionStrings["Mispersonalconn"].ConnectionString);
        string sql = "select D_ID 部门编号,D_Name 部门名称,D_Tel 联系电话,D_Address 联系地址,D_Chief 负责人,D_Belong 所属部门 from [Tb_department]";
        OracleDataAdapter sda = new OracleDataAdapter(sql, con);
        DataSet ds = new DataSet();
        sda.Fill(ds, "temp");
        con.Close();
        ListDepart.DataSource = ds.Tables["temp"].DefaultView;
        ListDepart.DataBind();
    }

    protected void ListDepart_PageIndexChanging(object sender, GridViewPageEventArgs e)
    {
        ListDepart.PageIndex = e.NewPageIndex;
        DataBind();

    }
}
