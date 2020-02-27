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
/// department 的摘要说明
/// </summary>


public class department
{
    
		 //先申明一系列常用的对象
        private string connstr;
        private OracleConnection Sqlconn;
        private OracleCommand Sqlcmd;
        private OracleDataAdapter Sqladpter;
        private DataSet ds;
        private OracleDataReader Sqlreader;

	public department()
	{//初始化所有的实例
            connstr = ConfigurationManager.ConnectionStrings["Mispersonalconn"].ConnectionString;
            Sqlconn = new OracleConnection(connstr);
            Sqlcmd = new OracleCommand();
            Sqladpter = new OracleDataAdapter();
            ds = new DataSet();
	}

    public OracleDataReader Login(string sql)
    {
        Sqlcmd.CommandText = sql;
        Sqlcmd.Connection = Sqlconn;
        if (Sqlconn.State == ConnectionState.Closed) { Sqlconn.Open(); }
        Sqlreader = Sqlcmd.ExecuteReader(CommandBehavior.CloseConnection);
        return Sqlreader;
    }

    public void Insert(string D_ID, string D_Name,string D_Tel, string D_Address, string D_Chief, string D_Belong)
    {//执行添加动作   (E_ID,E_Name,E_Sex,E_Birth,E_Tel,E_Address) 
        Sqlcmd.CommandText = "insert into [Tb_department] values('" + D_ID + "','" + D_Name + "','" + D_Tel + "','" + D_Address + "', '" + D_Chief + "','" + D_Belong + "')";
        //Sqlcmd.Parameters.Add("@e_id", E_ID);
        //Sqlcmd.Parameters.Add("@e_name",E_Name);
        //Sqlcmd.Parameters.Add("@e_sex",E_Sex);
        //Sqlcmd.Parameters.Add("@e_birth",E_Birth);
        //Sqlcmd.Parameters.Add("@e_tel",E_Tel);
        //Sqlcmd.Parameters.Add("@e_address",E_Address);
        //Sqlcmd.Parameters.Add("@e_intro",E_Intro);
        //Sqlcmd.Parameters.Add("@e_picurl",E_Picurl);
        Sqlcmd.Connection = Sqlconn;
        Sqlconn.Open();
        Sqlcmd.ExecuteNonQuery();
    }
}
