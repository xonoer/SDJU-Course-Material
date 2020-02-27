using System;
using System.Data;
using System.Web;
using System.Web.Security;
using System.Web.UI;
using System.Web.UI.WebControls;
using System.Web.UI.WebControls.WebParts;
using System.Web.UI.HtmlControls;
using Oracle.DataAccess.Client;

namespace Tree
{
    /// <summary>
    /// tree 的摘要说明。
    /// </summary>

    public class tree : System.Web.UI.Page
    {
        private string tablename = "Tb_Tree";
        int current = 0;
        int len = 0;
        string[] arrPowerName;
        string ConnectionString;
        public tree()
        {
            ConnectionString = System.Configuration.ConfigurationSettings.AppSettings["Mispersonalconn"];
            len = GetRecordCount();
            arrPowerName = new string[len];
        }
        private void Page_Load(object sender, System.EventArgs e)
        {

            GetPowerName(0);
            //CloseDbConnection();
            //ResponseArray();
            // 在此处放置用户代码以初始化页面
        }
        private void GetPowerName(int _ParentId)
        {
            int Id;
            string PowerName;
            string sql = "select Id,PowerName,Layer from " + tablename + " where ParentId=" + _ParentId;
            try
            {
                OracleConnection conn = new OracleConnection(ConnectionString);
                conn.Open();
                OracleCommand cmd = new OracleCommand(sql, conn);
                OracleDataReader dr = cmd.ExecuteReader();
                while (dr.Read())
                {
                    for (int j = 0; j < int.Parse(dr["Layer"].ToString()); j++)
                    {
                        Response.Write("&nbsp;&nbsp;&nbsp;&nbsp;");
                    }
                    PowerName = dr["PowerName"].ToString();
                    Response.Write(PowerName + "<br>");
                    arrPowerName[current++] = PowerName;
                    Id = int.Parse(dr["Id"].ToString());
                    GetPowerName(Id);
                }
                dr.Close();
                conn.Close();
            }
            catch (Exception ex)
            {
                Response.Write(ex.ToString());
            }
        }
        private void ResponseArray()
        {
            int i;
            for (i = 0; i < len; i++)
            {
                Response.Write(arrPowerName[i] + "<br>");
            }
        }
        private void CloseDbConnection()
        {
            //conn.Close();
        }
        private int GetRecordCount()
        {
            OracleConnection conn = new OracleConnection(ConnectionString);
            string sql = "select count(id) from " + tablename;
            conn.Open();
            OracleCommand cmd = new OracleCommand(sql, conn);
            int count = int.Parse(cmd.ExecuteScalar().ToString());
            conn.Close();
            return count;
        }

  
    }
}
