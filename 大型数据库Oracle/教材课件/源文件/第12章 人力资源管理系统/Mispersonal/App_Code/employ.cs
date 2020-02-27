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
/// Employ 的摘要说明
/// </summary>
/// 
    public class Employ
    {

        //先申明一系列常用的对象
        private string connstr;
        private OracleConnection Sqlconn;
        private OracleCommand Sqlcmd;
        private OracleDataAdapter Sqladpter;
        private DataSet ds;
        private OracleDataReader Sqlreader;

        public Employ()
        {//初始化所有的实例
            connstr = ConfigurationManager.ConnectionStrings["Mispersonalconn"].ConnectionString;
            Sqlconn = new OracleConnection(connstr);
            Sqlcmd = new OracleCommand();
            Sqladpter = new OracleDataAdapter();
            ds = new DataSet();
        }

        public DataSet TdataSet(string sql)
        {//返回内存数据库
            Sqladpter.SelectCommand = new OracleCommand(sql, Sqlconn);
            Sqladpter.Fill(ds, "temp");
            return ds;
        }
        public OracleDataReader Employee_list()
        {//返回一个只读,向前的轻量级数据源,注意:它不支持服务端的分页,而且数据连接一直打开
            Sqlcmd.CommandText = "select * from Tb_employee";
            Sqlcmd.Connection = Sqlconn;
            if (Sqlconn.State == ConnectionState.Closed) { Sqlconn.Open(); }
            Sqlreader = Sqlcmd.ExecuteReader(CommandBehavior.CloseConnection);
            return Sqlreader;
        }

        public void Update(string 员工号, string 姓名, string 性别, DateTime 出生日期, string 联系电话, string 联系地址)
        {//执行更新动作 
            Sqlcmd.CommandText = "update [Tb_employee] set [姓名]=@e_name,[性别]=@e_sex,[出生日期]=@e_birth,[联系电话]=@e_tel,[联系地址]=@e_address where [员工号]=@e_id";
            Sqlcmd.Parameters.Add("@e_name", 姓名);
            Sqlcmd.Parameters.Add("@e_sex", 性别);
            Sqlcmd.Parameters.Add("@e_birth", 出生日期);
            Sqlcmd.Parameters.Add("@e_tel", 联系电话);
            Sqlcmd.Parameters.Add("@e_address", 联系地址);
            Sqlcmd.Parameters.Add("@e_id", 员工号);
            Sqlcmd.Connection = Sqlconn;
            Sqlconn.Open();
            Sqlcmd.ExecuteNonQuery();
        }


        public void Delete(string ID)
        {//执行删除动作
            Sqlcmd.CommandText = "delete from [Tb_employee] where [员工号]='" + ID+ "'";
            Sqlcmd.Connection = Sqlconn;
            Sqlconn.Open();
            Sqlcmd.ExecuteNonQuery();
        }
        public void Insert(string E_ID, string E_Name, string E_Sex, string E_Birth, string E_Tel, string E_Address,string D_Name, string E_Intro, string E_Picurl)
        {//执行添加动作    
            Sqlcmd.CommandText = "insert into [Tb_employee] values('" + E_ID + "','" + E_Name + "','" + E_Sex + "','" + E_Birth + "','" + E_Tel + "','" + E_Address + "','" +D_Name+ "', '" + E_Intro + "','" + E_Picurl + "')";
            Sqlcmd.Connection = Sqlconn;
            Sqlconn.Open();
            Sqlcmd.ExecuteNonQuery();
        }



    }
