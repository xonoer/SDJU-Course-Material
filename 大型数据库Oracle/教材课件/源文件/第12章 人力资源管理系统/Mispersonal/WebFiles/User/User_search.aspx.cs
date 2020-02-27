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
using Oracle.DataAccess.Client;
public partial class WebFiles_User_User_search : System.Web.UI.Page
{
    protected void Page_Load(object sender, EventArgs e)
    {
    }
    protected void Btn_Search_Click(object sender, EventArgs e)
    {
        if (role.SelectedValue== "用户编号")
        {
            if (TxtContent.Text.Trim() == "")
            {
                Response.Write("<script>alert('用户名不能为空!')</script>");
            }
            else
            {
                string sql = "select ID 用户编号,userName 用户名,userRole 用户权限 from [Tb_User_Login] where ID='" +TxtContent.Text.Trim()+ "'";
                user Search = new user();
               OracleDataReader myreader = Search.Login(sql);
                User_List.DataSource = myreader;
                User_List.DataBind();
            }
            }
        else
        {
            if (TxtContent.Text.Trim() == "")
            {
                Response.Write("<script>alert('用户名不能为空!')</script>");
            }
            else
            {

                string sql = "select ID 用户编号,userName 用户名,userRole 用户权限 from [Tb_User_Login] where userName='" + TxtContent.Text.Trim() + "'";
                user Search = new user();
                OracleDataReader myreader = Search.Login(sql);
                User_List.DataSource = myreader;
                User_List.DataBind();
            }
        }
    }
}
