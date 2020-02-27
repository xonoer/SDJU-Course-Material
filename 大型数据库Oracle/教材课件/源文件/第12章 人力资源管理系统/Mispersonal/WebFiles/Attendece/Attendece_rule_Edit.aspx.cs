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
public partial class WebFiles_Attendece_Edit_Attendece_rule : System.Web.UI.Page
{
    protected void Page_Load(object sender, EventArgs e)
    {
        string connstr = ConfigurationManager.ConnectionStrings["Mispersonalconn"].ConnectionString;
        OracleConnection Sqlconn = new OracleConnection(connstr);
        OracleCommand cmm = new OracleCommand("select * from Tb_attendece_rule",Sqlconn);
        OracleDataReader read;
        Sqlconn.Open();
        read=cmm.ExecuteReader();
        if (read.Read())
        {
            TextBox1.Text = read[0].ToString().Split(':')[0];
            TextBox2.Text = read[0].ToString().Split(':')[1];
            TextBox3.Text = read[0].ToString().Split(':')[2];
            TextBox4.Text = read[1].ToString().Split(':')[0];
            TextBox5.Text = read[1].ToString().Split(':')[1];
            TextBox6.Text = read[1].ToString().Split(':')[2];
            TextBox7.Text = read[2].ToString().Split(':')[0];
            TextBox8.Text = read[2].ToString().Split(':')[1];
            TextBox9.Text = read[2].ToString().Split(':')[2];
            TextBox10.Text = read[3].ToString().Split(':')[0];
            TextBox11.Text = read[3].ToString().Split(':')[1];
            TextBox12.Text = read[3].ToString().Split(':')[2];
        }
        read.Close();
        Sqlconn.Close();
    }
    protected void BtnOK_Click(object sender, EventArgs e)
    {
        if ((string)Session["Name"] != "")
        {
            if ((string)Session["role"] == "管理员")
            {
                string sql= "Update Tb_attendece_rule set Onwork_Ahead='" 
                    +TextBox1.Text.ToString().Trim()+":"
                    +TextBox2.Text.ToString().Trim()+":"
                    +TextBox3.Text.ToString().Trim()+ "',Onwork_Normal='" 
                    +TextBox4.Text.ToString().Trim()+":"
                    +TextBox5.Text.ToString().Trim()+":"
                    +TextBox6.Text.ToString().Trim()+ "',Offwork_Delay='"
                    +TextBox7.Text.ToString().Trim()+":"
                    +TextBox8.Text.ToString().Trim()+":"
                    +TextBox9.Text.ToString().Trim()+ "',Offwork_Normal='" 
                    +TextBox10.Text.ToString().Trim()+":"
                    +TextBox11.Text.ToString().Trim()+":"
                    +TextBox12.Text.ToString().Trim()+ "'";
                string connstr = ConfigurationManager.ConnectionStrings["Mispersonalconn"].ConnectionString;
                OracleConnection Sqlconn = new OracleConnection(connstr);
                Sqlconn.Open();
                OracleCommand sc = new OracleCommand(sql, Sqlconn);
                sc.ExecuteNonQuery();
                lbMessage.Text = "设置成功!";
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

}
