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
public partial class WebFiles_Employee_DisplayEmployee : System.Web.UI.Page
{
    protected void Page_Load(object sender, EventArgs e)
    {
        if (!IsPostBack)
        {
            this.TxtBirth.Attributes.Add("onfocus", "javascript:calendar()");
            string id = Request["E_ID"];
            string name = Request["E_Name"];
            Session["E_ID"] = id;
            Session["E_Name"] = name;
            Bond();

            string connstr = ConfigurationManager.ConnectionStrings["Mispersonalconn"].ConnectionString;
            OracleConnection Sqlconn = new OracleConnection(connstr);
            DataSet ds = new DataSet();
            string Agreerstr = "select D_ID,D_Name from Tb_department order by D_ID desc";
            OracleDataAdapter SqlAgreer = new OracleDataAdapter(Agreerstr, Sqlconn);
            SqlAgreer.Fill(ds, "Agreer");
            Agreer.DataSource = ds.Tables["Agreer"].DefaultView;
            Agreer.DataTextField = "D_Name";
            Agreer.DataValueField = "D_ID";
            Agreer.DataBind();
            Sqlconn.Close();
        }
    }
    private void Bond()
    {
        string id = (string)Session["E_ID"];
        string sql = "select * from [Tb_employee] where E_ID='" + id + "'";
        string connstr = ConfigurationManager.ConnectionStrings["Mispersonalconn"].ConnectionString;
        OracleConnection Sqlconn = new OracleConnection(connstr);
        Sqlconn.Open();
        OracleCommand sc = new OracleCommand(sql, Sqlconn);
        OracleDataReader myreader = sc.ExecuteReader();
        if(myreader.Read())
        {
        TxtID.Text =myreader[0].ToString();   
        TxtName.Text =myreader[1].ToString();
        TxtBirth.Text = myreader[3].ToString();
        TxtTel.Text =myreader[4].ToString();       
        TxtAddress.Text =myreader[5].ToString();     
        TxtIntro.Text = myreader[6].ToString();
        Pic.ImageUrl = myreader[7].ToString();
        Sqlconn.Close();
        }
    }
    protected void btn_edit_Click(object sender, EventArgs e)
    {
        if ((string)Session["Name"] != "")
        {
            if ((string)Session["role"] == "管理员")
            {
                string id = (string)Session["E_ID"];
                string sql = "update [Tb_employee] set E_Name='"
                + TxtName.Text.Trim() + "',E_Sex='"
                + Sex.SelectedValue + "',E_Birth='"
                + TxtBirth.Text + "',E_Tel='"
                + TxtTel.Text.Trim() + "',E_Address='"
                + TxtAddress.Text.Trim() + "',D_Name='"
                 +Agreer.SelectedValue + "',E_Intro='"
                + TxtIntro.Text.Trim() + "',E_Picurl='"
                + picurl.SelectedValue + "'"+"where E_ID='"
                 +TxtID.Text.Trim()+ "'";
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

    protected void btn_delete_Click(object sender, EventArgs e)
    {
        if ((string)Session["Name"] != "")
        {
            if ((string)Session["role"] == "管理员")
            {
                string id = (string)Session["E_ID"];
                string sql = "delete from [Tb_employee] where E_ID='" + id + "'";
                string connstr = ConfigurationManager.ConnectionStrings["Mispersonalconn"].ConnectionString;
                OracleConnection Sqlconn = new OracleConnection(connstr);
                Sqlconn.Open();
                OracleCommand sc = new OracleCommand(sql, Sqlconn);
                sc.ExecuteNonQuery();
                Sqlconn.Close();
                Response.Redirect("~/WebFiles/Employee/List_employee.aspx");
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
