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


public partial class WebFiles_Department_Add_Depart : System.Web.UI.Page
{
    protected void Page_Load(object sender, EventArgs e)
    {

    }
    protected void btn_add_Click(object sender, EventArgs e)
    {
        if (tb_id.Text.Trim() == "")
        {
            Response.Write("<script>alert('部门编号不能为空')</script>");
            return;
        }
        if (tb_name.Text.Trim() == "")
        {
            Response.Write("<script>alert('部门名称不能为空')</script>");
            return;
        }
        if (tb_tel.Text.Trim() == "")
        {
            Response.Write("<script>alert('联系电话不能为空')</script>");
            return;
        }
        if (tb_address.Text.Trim() == "")
        {
            Response.Write("<script>alert('联系地址不能为空')</script>");
            return;
        }
        if (tb_chief.Text.Trim() == "")
        {
            Response.Write("<script>alert('负责人不能为空')</script>");
            return;
        }
        if (tb_belong.Text.Trim() == "")
        {
            Response.Write("<script>alert('所属部门不能为空')</script>");
            return;
        }
        department Add_depart = new department();
        Add_depart.Insert(tb_id.Text, tb_name.Text,tb_tel.Text, tb_address.Text,tb_chief.Text,tb_belong.Text);

        Response.Redirect("~/WebFiles/Department/List_Depart.aspx");
    }
}
