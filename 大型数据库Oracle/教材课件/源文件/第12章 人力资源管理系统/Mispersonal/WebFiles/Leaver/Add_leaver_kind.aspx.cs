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
public partial class WebFiles_Leaver_Add_leaver_kind : System.Web.UI.Page
{
    protected void Page_Load(object sender, EventArgs e)
    {

    }
    protected void btnAdd_Click(object sender, EventArgs e)
    {
        if(TxtID.Text.Trim()=="")
        {
            Response.Write("<script>alert('假别编号不能为空!')</script>");
        }
        if(TxtName.Text.Trim()=="")
        {
            Response.Write("<script>alert('假别名称不能为空!')</script>");
        }

        if ((string)Session["Name"] != "")
        {
            if ((string)Session["role"] == "管理员")
            {
                if (IsSalaryOrNot.Checked)
                {
                    string connstr = ConfigurationManager.ConnectionStrings["Mispersonalconn"].ConnectionString;
                    OracleConnection Sqlconn = new OracleConnection(connstr);
                    OracleCommand Sqlcmd = new OracleCommand();
                    Sqlcmd.CommandText = "insert into [Tb_leaver_kind] values('" + TxtID.Text.Trim() + "','" + TxtName.Text.Trim() + "','" + IsSalaryOrNot.Text + "')";
                    Sqlcmd.Connection = Sqlconn;
                    Sqlconn.Open();
                    Sqlcmd.ExecuteNonQuery();
                }
                else
                {
                    string connstr = ConfigurationManager.ConnectionStrings["Mispersonalconn"].ConnectionString;
                    OracleConnection Sqlconn = new OracleConnection(connstr);
                    OracleCommand Sqlcmd = new OracleCommand();
                    Sqlcmd.CommandText = "insert into [Tb_leaver_kind] values('" + TxtID.Text.Trim() + "','" + TxtName.Text.Trim() + "','否 ')";
                    Sqlcmd.Connection = Sqlconn;
                    Sqlconn.Open();
                    Sqlcmd.ExecuteNonQuery();
                    lbMessage.Text = "您已成功添加1条记录!";
                }
            }
            else
            {
                Response.Write("<script>alert('只有管理员才可以进行此操作!')</script>");
            }
        }
        else
        {
            Response.Redirect("Default.aspx"); ;
        }

    }
}
