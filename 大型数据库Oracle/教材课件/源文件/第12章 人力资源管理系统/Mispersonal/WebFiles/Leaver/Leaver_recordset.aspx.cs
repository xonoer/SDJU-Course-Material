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
public partial class WebFiles_Leaver_Leaver_recordset : System.Web.UI.Page
{
    protected void Page_Load(object sender, EventArgs e)
    {
        if (!IsPostBack)
            Bind();
    }
    private void Bind()
    {
        OracleConnection con = new OracleConnection(ConfigurationManager.ConnectionStrings["Mispersonalconn"].ConnectionString);
        string sql = "select E_Name 员工姓名,L_Kind 请假类别,L_Reason 请假理由,L_Agreer 批假人,L_StartTime 开始时间,L_EndTime 结束时间 from [Tb_leaver_recordrest]";
        OracleDataAdapter sda = new OracleDataAdapter(sql, con);
        DataSet ds = new DataSet();
        sda.Fill(ds, "temp");
        con.Close();
        ListLeaverRs.DataSource = ds.Tables["temp"].DefaultView;
        ListLeaverRs.DataBind();
    }
}
