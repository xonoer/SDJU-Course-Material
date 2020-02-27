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
public partial class WebFiles_Employee_Search_employee : System.Web.UI.Page
{
    protected void Page_Load(object sender, EventArgs e)
    {

    }
    protected void btn_search_Click(object sender, EventArgs e)
    {
        if (role.SelectedValue == "员工编号")
        {
            if (TxtContent.Text.Trim() == "")
            {
                Response.Write("<script>alert('员工编号不能为空!')</script>");
            }
            else
            {
                string sql = "select E_ID 员工编号,E_Name 员工姓名,E_Sex 员工性别,E_Birth 出生年月,E_Tel 联系电话,E_Address 联系地址 from [Tb_employee] where E_ID='" + TxtContent.Text.Trim() + "'";
                user Search = new user();
                OracleDataReader myreader = Search.Login(sql);
                List_employee.DataSource = myreader;
                List_employee.DataBind();
            }
        }
        else
        {
            if (TxtContent.Text.Trim() == "")
            {
                Response.Write("<script>alert('员工姓名不能为空!')</script>");
            }
            else
            {
                string sql = "select E_ID 员工编号,E_Name 员工姓名,E_Sex 员工性别,E_Birth 出生年月,E_Tel 联系电话,E_Address 联系地址 from [Tb_employee] where E_Name='" + TxtContent.Text.Trim() + "'";
                user Search = new user();
                OracleDataReader myreader = Search.Login(sql);
                List_employee.DataSource = myreader;
                List_employee.DataBind();
            }
        }
    }
}
