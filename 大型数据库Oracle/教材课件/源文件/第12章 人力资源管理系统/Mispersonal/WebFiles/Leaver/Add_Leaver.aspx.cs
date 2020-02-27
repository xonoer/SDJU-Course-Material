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
public partial class WebFiles_Leaver_Add_Leaver : System.Web.UI.Page
{

    private void Page_Load(object sender, System.EventArgs e)
    {
        //   在此处放置用户代码以初始化页面   
        if (!IsPostBack)
        {
            //this.TxtStartTime.Attributes.Add("onfocus", "javascript:calendar()");
            //this.TxtEndTime.Attributes.Add("onfocus", "javascript:calendar()");
            string connstr = ConfigurationManager.ConnectionStrings["Mispersonalconn"].ConnectionString;
            OracleConnection Sqlconn = new OracleConnection(connstr);
            DataSet ds = new DataSet();
            string Personstr = "select E_ID,E_Name from Tb_employee order by E_ID desc";
            string Kindstr = "select L_ID,L_Kind from Tb_leaver_kind order by L_ID desc";
            string Agreerstr = "select D_ID,D_Chief from Tb_department order by D_ID desc";
            //读取考勤字段   
            OracleDataAdapter SqlPerson = new OracleDataAdapter(Personstr, Sqlconn);
            OracleDataAdapter SqlKind = new OracleDataAdapter(Kindstr, Sqlconn);
            OracleDataAdapter SqlAgreer = new OracleDataAdapter(Agreerstr, Sqlconn);
            Sqlconn.Open();

            SqlPerson.Fill(ds, "Person");
            Person.DataSource = ds.Tables["Person"].DefaultView;
            Person.DataTextField = "E_Name";
            Person.DataValueField = "E_ID";
            Person.DataBind();

            SqlKind.Fill(ds, "Kind");
            Kind.DataSource = ds.Tables["Kind"].DefaultView;
            Kind.DataTextField = "L_Kind";
            Kind.DataValueField = "L_ID";
            Kind.DataBind();

            SqlAgreer.Fill(ds, "Agreer");
            Agreer.DataSource = ds.Tables["Agreer"].DefaultView;
            Agreer.DataTextField = "D_Chief";
            Agreer.DataValueField = "D_ID";
            Agreer.DataBind();
            Sqlconn.Close();
           
        }

    }

    protected void BtnOK_Click(object sender, EventArgs e)
    {
        if ((string)Session["Name"] != "")
        {
            if ((string)Session["role"] == "管理员")
            {

                string connstr = ConfigurationManager.ConnectionStrings["Mispersonalconn"].ConnectionString;
                OracleConnection Sqlconn = new OracleConnection(connstr);
                Sqlconn.Open();
                OracleCommand cmm = new OracleCommand("insert into [Tb_leaver_recordrest] (E_Name,L_Kind,L_Reason,L_Agreer,L_StartTime,L_EndTime) values('" + Person.SelectedValue + "','" + Kind.SelectedValue + "','" + TxtReason.Text.Trim() + "','" + Agreer.SelectedValue + "','" + TxtStartTime.Text.Trim() + "','" + TxtEndTime.Text.Trim() + "')", Sqlconn);
                cmm.ExecuteNonQuery();
                Sqlconn.Close();
                lbMessage.Text = "登记成功!";
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
