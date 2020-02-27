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

public partial class Control_WebUserControl : System.Web.UI.UserControl
{
    protected void Page_Load(object sender, EventArgs e)
    {
        lbMessage.Text = "欢迎" + (string)Session["role"] + (string)Session["name"] + "登陆本系统!";
        DateTime date = DateTime.Now;
        this.lbTime.Text = "你本次的登陆时间为:"+date.ToString("yy-MM-dd-HH:ss:mm");

    }
 
    
}
