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
public partial class WebFiles_Department_Search_Depart : System.Web.UI.Page
{
    protected void Page_Load(object sender, EventArgs e)
    {

    }
    protected void brn_search_Click(object sender, EventArgs e)
    {
        if (role.SelectedValue == "部门编号")
        {
            if (TxtContent.Text.Trim() == "")
            {
                Response.Write("<script>alert('部门编号不能为空!')</script>");
            }
            else
            {
                string sql = "select D_ID 部门编号,D_Name 部门名称,D_Tel 联系电话,D_Address 联系地址,D_Chief 负责人,D_Belong 所属部门 from [Tb_department] where [D_ID]='" + TxtContent.Text.Trim() + "'";
                user Search = new user();
               OracleDataReader myreader = Search.Login(sql);
                List_employee.DataSource = myreader;
                List_employee.DataBind();
            }
        }
        else if (role.SelectedValue == "部门名称")
        {
            if (TxtContent.Text.Trim() == "")
            {
                Response.Write("<script>alert('部门名称不能为空!')</script>");
            }
            else
            {
                string sql = "select D_ID 部门编号,D_Name 部门名称,D_Tel 联系电话,D_Address 联系地址,D_Chief 负责人,D_Belong 所属部门 from [Tb_department] where [D_Name]='" + TxtContent.Text.Trim() + "'";
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
                Response.Write("<script>alert('负责人不能为空!')</script>");
            }
            else
            {
                string sql = "select D_ID 部门编号,D_Name 部门名称,D_Tel 联系电话,D_Address 联系地址,D_Chief 负责人,D_Belong 所属部门 from [Tb_department] where [D_Chief]='" + TxtContent.Text.Trim() + "'";
                user Search = new  user();
                OracleDataReader myreader = Search.Login(sql);
                List_employee.DataSource = myreader;
                List_employee.DataBind();
            }
        }
    }
}
