using System;
using System.Data;
using System.Configuration;
using System.Web;
using System.Web.Security;
using System.Web.UI;
using System.Web.UI.WebControls;
using System.Web.UI.WebControls.WebParts;
using System.Web.UI.HtmlControls;
using Oracle.DataAccess.Client;
/// <summary>
/// attendece 的摘要说明
/// </summary>
public class attendece
{
    //先申明一系列常用的对象
    private string connstr;
    private OracleConnection Sqlconn;
    private OracleCommand Sqlcmd;
    private OracleDataAdapter Sqladpter;
    private DataSet ds;
    private OracleDataReader Sqlreader;
	
    public attendece()
    {//初始化所有的实例
        connstr = ConfigurationManager.ConnectionStrings["Mispersonalconn"].ConnectionString;
        Sqlconn = new OracleConnection(connstr);
        Sqlcmd = new OracleCommand();
        Sqladpter = new OracleDataAdapter();
        ds = new DataSet();
	}
    public OracleDataReader List(string sql)
    {
        Sqlcmd.CommandText = sql;
        Sqlcmd.Connection = Sqlconn;
        if (Sqlconn.State == ConnectionState.Closed) { Sqlconn.Open(); }
        Sqlreader = Sqlcmd.ExecuteReader(CommandBehavior.CloseConnection);
        return Sqlreader;
    }
}
