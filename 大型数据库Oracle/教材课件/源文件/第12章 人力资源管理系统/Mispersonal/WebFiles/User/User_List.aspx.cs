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

public partial class WebFiles_User_User_List : System.Web.UI.Page
{
    protected void Page_Load(object sender, EventArgs e)
    {
        if (!IsPostBack)
            Bind();
    }
    private void Bind()
    {
        OracleConnection con = new OracleConnection(ConfigurationManager.ConnectionStrings["Mispersonalconn"].ConnectionString);
        string sql = "select ID 用户编号,userName 用户姓名,userRole 用户角色 from [Tb_User_Login]";
        OracleDataAdapter sda = new OracleDataAdapter(sql, con);
        DataSet ds = new DataSet();
        sda.Fill(ds, "temp");
        con.Close();
        List.DataSource = ds.Tables["temp"].DefaultView;
        List.DataBind();
    }
   // public string GetLinkUser(string userid)
   // {
   //     return ID;
   // }


    protected void List_PageIndexChanging(object sender, GridViewPageEventArgs e)
    {

        List.PageIndex= e.NewPageIndex;
        DataBind();
    }
}
//5_1_a_s_p_x.c_o_m
