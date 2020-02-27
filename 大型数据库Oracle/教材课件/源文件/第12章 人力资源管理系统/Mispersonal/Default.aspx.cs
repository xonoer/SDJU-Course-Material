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
using Oracle.DataAccess.Client;
public partial class _Default : System.Web.UI.Page 
{
     #region Web 窗体设计器生成的代码
        override protected void OnInit(EventArgs e)
        {
            //
            // CODEGEN: 该调用是 ASP.NET Web 窗体设计器所必需的。
            //
            InitializeComponent();
            base.OnInit(e);
        }

        /// <summary>
        /// 设计器支持所需的方法 - 不要使用代码编辑器修改
        /// 此方法的内容。
        /// </summary>
        private void InitializeComponent()
        {
            


        }
        #endregion
    protected void Page_Load(object sender, EventArgs e)
    {

    }
    protected void Btn_Login_Click(object sender, EventArgs e)
    {

        if (TxtUser.Text.Trim() == "")
        {
            Response.Write("<script>alert('登录名不能为空')</script>");
            return;
        }
        user userLogin = new user();
        bool isok = false;
       
        if (rb_admin.Checked)
        {     
           
            string sql = "select * from Tb_User_Login where userName='" + TxtUser.Text.Trim() + "' and userPass='" + TxtPwd.Text.Trim() + "'and userRole='" + rb_admin.Text + "'";
            OracleDataReader myReader = userLogin.Login(sql);
            if (myReader.Read())
            {
                Session["Name"] = myReader["userName"].ToString().Trim();//保存用户名称
                Session["Pass"] = myReader["userPass"].ToString().Trim();//保存用户密码
                Session["Role"] = myReader["userRole"].ToString().Trim();//保存用户权限.		
                isok = true;
            }
            myReader.Close();
        }
       else
        { 
            string sql = "select * from Tb_User_Login where userName='" + TxtUser.Text.Trim() + "' and userPass='" + TxtPwd.Text.Trim() + "'and userRole='" + rb_user.Text+ "'";
            OracleDataReader myReader = userLogin.Login(sql);
            if (myReader.Read())

            {
                Session["Name"] = myReader["userName"].ToString().Trim();//保存用户名称
                Session["Pass"] = myReader["userPass"].ToString().Trim();//保存用户密码
                Session["Role"] = myReader["userRole"].ToString().Trim();//保存用户权限.		
                isok = true;
            }     
            myReader.Close();
        }



           if (!isok)
         {
             lbMessage.Text = "用户名称或密码错误，登陆失败!";
              return;
         }
           else
           {
             Response.Redirect("Index.aspx");
          }
    }
    protected void Btn_Cancel_Click(object sender, EventArgs e)
    {
        TxtUser.Text = "";
        TxtPwd.Text = "";
        lbMessage.Text = "";
    }
    
}



















