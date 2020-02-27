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
public partial class WebFiles_Job_Job_Kind : System.Web.UI.Page
{
    protected void Page_Load(object sender, EventArgs e)
    {
        if (!IsPostBack)
            Bind();
    }
    private void Bind()
    {
        OracleConnection con = new OracleConnection(ConfigurationManager.ConnectionStrings["Mispersonalconn"].ConnectionString);
        string sql = "select J_ID 班种编号,J_Name 班种名称,J_Property 班种性质,J_Onwork1 上半时间一,J_Offwork1 下班时间一,J_Onwork2 上班时间二,J_Offwork2 下班时间二 from [Tb_job_kind]";
        OracleDataAdapter sda = new OracleDataAdapter(sql, con);
        DataSet ds = new DataSet();
        sda.Fill(ds, "temp");
        con.Close();
        JobList.DataSource = ds.Tables["temp"].DefaultView;
        JobList.DataBind();
    }
}
