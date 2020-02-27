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
public partial class WebFiles_Department_View_Depart : System.Web.UI.Page
{
    protected void Page_Load(object sender, EventArgs e)
    {
        if (!IsPostBack)
        {
            string id = Request["D_ID"];
            string name = Request["D_Name"];
            Session["D_ID"] = id;
            Session["D_Name"] = name;
            Bond();
        }
    }
    private void Bond()
    {
        string id = (string)Session["D_ID"];
        string sql = "select * from [Tb_department] where D_ID='" + id + "'";
        string connstr = ConfigurationManager.ConnectionStrings["Mispersonalconn"].ConnectionString;
        OracleConnection Sqlconn = new OracleConnection(connstr);
        Sqlconn.Open();
        OracleCommand sc = new OracleCommand(sql, Sqlconn);
        OracleDataReader myreader = sc.ExecuteReader();
        if (myreader.Read())
        {
            TxtID.Text = myreader[0].ToString();
            TxtName.Text = myreader[1].ToString();
            TxtTel.Text = myreader[2].ToString();
            TxtAddress.Text = myreader[3].ToString();
            TxtChief.Text = myreader[4].ToString();
            TxtBelong.Text = myreader[5].ToString();
            Sqlconn.Close();
        }
    }
    protected void Edit_Click(object sender, EventArgs e)
    {
        if ((string)Session["Name"] != "")
        {
            if ((string)Session["role"] == "管理员")
            {
                string sql = "Update [Tb_department] set D_Name='"
                    +TxtName.Text.Trim()+"',D_Tel='"
                    +TxtTel.Text.Trim()+"',D_Address='"
                    +TxtAddress.Text.Trim()+"',D_Chief='"
                    +TxtChief.Text.Trim()+"',D_Belong='"
                    +TxtBelong.Text.Trim()+"'"+"where D_ID='"
                    +TxtID.Text.Trim()+"' ";
                string connstr = ConfigurationManager.ConnectionStrings["Mispersonalconn"].ConnectionString;
                OracleConnection Sqlconn = new OracleConnection(connstr);
                Sqlconn.Open();
                OracleCommand sc = new OracleCommand(sql, Sqlconn);
                sc.ExecuteNonQuery();
                lbMessage.Text = "您已成功更新1条记录!";
                Sqlconn.Close();
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
    protected void Delete_Click(object sender, EventArgs e)
    {
        if ((string)Session["Name"] != "")
        {
            if ((string)Session["role"] == "管理员")
            {
                string id = (string)Session["D_ID"];
                string sql = "delete from [Tb_department] where D_ID='" + id + "'";
                string connstr = ConfigurationManager.ConnectionStrings["Mispersonalconn"].ConnectionString;
                OracleConnection Sqlconn = new OracleConnection(connstr);
                Sqlconn.Open();
                OracleCommand sc = new OracleCommand(sql, Sqlconn);
                sc.ExecuteNonQuery();
                Sqlconn.Close();
                Response.Redirect("~/WebFiles/Department/List_Depart.aspx");
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
