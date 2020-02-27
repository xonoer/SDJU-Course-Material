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
public partial class WebFiles_User_User_registor : System.Web.UI.Page
{
    protected void Page_Load(object sender, EventArgs e)
    {

    }
    protected void bt_add_Click(object sender, EventArgs e)
    {
        if(TxtUser.Text.Trim()=="")
        {
              Response.Write("<script>alert('用户名不能为空')</script>");
              return;
        }
        if (TxtPass.Text.Trim()=="")
         {
              Response.Write("<script>alert('用户密码不能为空')</script>");
              return;
         }
         if (TxtPass1.Text.Trim()=="")
         {
              Response.Write("<script>alert('确认密码不能为空')</script>");
              return;
         }
         if (TxtPass.Text.Trim()!=""&&TxtPass1.Text.Trim()!="")
         {
             if ((TxtPass.Text.Trim()) != (TxtPass1.Text.Trim()))
             {
                 Response.Write("<script>alert('两次密码不一致!')</script>");
                 return;
             }
             else
             { 
             user Registor=new user();
             Registor.Insert(TxtUserID.Text,TxtUser.Text,TxtPass.Text,role.SelectedValue);
             }
         }
         Response.Redirect("~/WebFiles/User/User_List.aspx");
        
    }
}
