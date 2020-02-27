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
/// user 的摘要说明
/// </summary>
public class user
{
    //先申明一系列常用的对象
    private string connstr;
    private OracleConnection Sqlconn;
    private OracleCommand Sqlcmd;
    private OracleDataAdapter Sqladpter;
    private DataSet ds;
    private OracleDataReader Sqlreader;

    public user()
    {//初始化所有的实例
        connstr = ConfigurationManager.ConnectionStrings["Mispersonalconn"].ConnectionString;
        Sqlconn = new OracleConnection(connstr);
        Sqlcmd = new OracleCommand();
        Sqladpter = new OracleDataAdapter();
        ds = new DataSet();
    }
    public OracleDataReader Login(string sql)
    {
        Sqlcmd.CommandText =sql;
        Sqlcmd.Connection = Sqlconn;
        if (Sqlconn.State == ConnectionState.Closed) { Sqlconn.Open(); }
             Sqlreader=Sqlcmd.ExecuteReader(CommandBehavior.CloseConnection);
     
     
      
        return Sqlreader;
    }

    public DataSet Search(string sql)
    {//返回内存数据库
        
        Sqladpter.SelectCommand = new OracleCommand(sql, Sqlconn);
        Sqladpter.Fill(ds, "temp");
        
        return ds;
    }

    public void Update(string ID,string userName,string userPass,string userRole)
    {//执行更新动作 
        Sqlcmd.CommandText = "update [Tb_User_Login] set [ID]=@e_ID,[userName]=@e_userName,[userPass]=@e_userPass,[userRole]=@e_userRole";
        Sqlcmd.Parameters.Add("@e_ID",ID);
        Sqlcmd.Parameters.Add("@e_userName",userName);
        Sqlcmd.Parameters.Add("@e_userPass",userPass);
        Sqlcmd.Parameters.Add("@e_userRole",userRole);
        Sqlcmd.Connection = Sqlconn;
        Sqlconn.Open();
        Sqlcmd.ExecuteNonQuery();
    }
    public void Delete(string ID)
    {//执行删除动作
        Sqlcmd.CommandText = "delete from [Tb_User_Login] where [ID]='" +ID+ "'";
        Sqlcmd.Connection = Sqlconn;
        Sqlconn.Open();
        Sqlcmd.ExecuteNonQuery();
    }
    public void Insert(string ID, string userName, string userPass, string userRole)
    {//执行添加动作 
        Sqlcmd.CommandText = "insert into [Tb_User_Login] values('" + ID + "','" + userName + "','" + userPass + "','" + userRole + "')";
        Sqlcmd.Connection = Sqlconn;
        Sqlconn.Open();
        Sqlcmd.ExecuteNonQuery(); 
    }
}
