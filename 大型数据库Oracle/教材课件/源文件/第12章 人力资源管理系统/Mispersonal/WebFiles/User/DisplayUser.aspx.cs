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
public partial class WebFiles_User_User_view : System.Web.UI.Page
{
    protected void Page_Load(object sender, EventArgs e)
    {
        if (!IsPostBack)
        {
           string id=Request["ID"];
           string name=Request["userName"];
           Session["ID"] = id;
           Session["userName"] = name;
           Bond();
        }
    }
    private void Bond()
    {
        string id=(string)Session["ID"];
        //string name=Session["userName"];
        string sql = "select * from [Tb_User_Login] where ID='" + id + "'";
        string connstr = ConfigurationManager.ConnectionStrings["Mispersonalconn"].ConnectionString;
        OracleConnection Sqlconn = new OracleConnection(connstr);
        OracleDataAdapter sda = new OracleDataAdapter(sql,Sqlconn);
        OracleCommandBuilder sc=new OracleCommandBuilder(sda);
        DataSet ds = new DataSet();
        
        sda.Fill(ds,"temp");
        ds.Tables["temp"].DefaultView.Sort="id";
        int index=ds.Tables["temp"].DefaultView.Find(id);
        TxtUserID.Text=(string)ds.Tables["temp"].Rows[index]["ID"];
        TxtUser.Text=(string)ds.Tables["temp"].Rows[index]["userName"];
        TxtPass.Text=(string)ds.Tables["temp"].Rows[index]["userPass"];
        TxtPass1.Text=(string)ds.Tables["temp"].Rows[index]["userPass"];
        role.SelectedValue=(string)ds.Tables["temp"].Rows[index]["userRole"];
    
    }
    protected void Edit_Click(object sender, EventArgs e)
    {
        if ((string)Session["Name"] != "")
        {
            if ((string)Session["role"] == "管理员")
            {
                try
                {
                    string id = (string)Session["ID"];
                    //string name=Session["userName"];
                    string sql = "select * from [Tb_User_Login] where ID='" + id + "'";
                    string connstr = ConfigurationManager.ConnectionStrings["Mispersonalconn"].ConnectionString;
                    OracleConnection Sqlconn = new OracleConnection(connstr);
                    OracleDataAdapter sda = new OracleDataAdapter(sql, Sqlconn);
                    OracleCommandBuilder sc = new OracleCommandBuilder(sda);
                    DataSet ds = new DataSet();

                    sda.Fill(ds, "temp");
                    ds.Tables["temp"].DefaultView.Sort = "id";
                    int index = ds.Tables["temp"].DefaultView.Find(id);
                    ds.Tables["temp"].Rows[index]["ID"] = TxtUserID.Text.Trim();
                    ds.Tables["temp"].Rows[index]["userName"] = TxtUser.Text.Trim();
                    ds.Tables["temp"].Rows[index]["userPass"] = TxtPass.Text.Trim();
                    ds.Tables["temp"].Rows[index]["userRole"] = role.SelectedValue.Trim();
                    int rows = sda.Update(ds, "temp");
                    lbMessage.Text = "您已成功更新" + rows + "条记录!";
                }
                catch(Exception ex)
                {

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
    protected void Delete_Click(object sender, EventArgs e)
    {
        if ((string)Session["Name"] != "")
        {
            if ((string)Session["role"] == "管理员")
            {
                string id = (string)Session["ID"];
                //string name=Session["userName"];
                string sql = "delete from [Tb_User_Login] where ID='" + id + "'";
                string connstr = ConfigurationManager.ConnectionStrings["Mispersonalconn"].ConnectionString;
                OracleConnection Sqlconn = new OracleConnection(connstr);
                Sqlconn.Open();
                OracleCommand sc = new OracleCommand(sql, Sqlconn);
               // OracleDataAdapter sda= new OracleDataAdapter();
               // sda.DeleteCommand = sc;
                sc.ExecuteNonQuery();
                Sqlconn.Close();
               // DataSet ds = new DataSet();
               // DataTable temp = new DataTable();
               // sda.Fill(temp);
               // OracleCommandBuilder scb = new OracleCommandBuilder(sda);
               // sda.Update(temp);
                Response.Redirect("~/WebFiles/User/User_List.aspx");
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
