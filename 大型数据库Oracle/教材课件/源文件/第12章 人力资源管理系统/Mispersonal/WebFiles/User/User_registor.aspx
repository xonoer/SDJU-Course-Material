<%@ Page Language="C#" AutoEventWireup="true" CodeFile="User_registor.aspx.cs" Inherits="WebFiles_User_User_registor" %>
<%@ Register Src="../../UserControl/Left_Navlist.ascx" TagName="Left_Navlist" TagPrefix="uc4" %>
<%@ Register Src="../../UserControl/Header.ascx" TagName="Header" TagPrefix="uc1" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml" >
<head runat="server">
    <title>用户注册</title>
    <link rel=Stylesheet type="text/css" href="../../CSS/Mispersonal.css" />
</head>
<body>
    <form id="form1" runat="server">
    <div>
        <uc1:Header ID="Header1" runat="server" />
    
    </div>
        <br />
        &nbsp;
        <div style="z-index: 101; left: 248px; width: 403px; position: absolute; top: 229px;
            height: 206px">
            <table align=center cellpadding=0 cellspacing=0>
                <tr>
                    <td bgcolor="#66c2de" colspan="5" align=center style="height: 24px">
                        用户注册</td>
                </tr>
                <tr>
                    <td style="width: 145px; height: 33px;" align="center">
                     
                        用户编号:</td>
                    <td colspan="3" style="height: 33px">
                        <asp:TextBox ID="TxtUserID" runat="server"></asp:TextBox></td>
                    <td style="width: 100px; height: 33px;">
                    </td>
                </tr>
                <tr>
                    <td style="width: 145px; height: 33px;" align="center">
                    
                        用户名称:</td>
                    <td colspan="3" style="height: 33px">
                        <asp:TextBox ID="TxtUser" runat="server"></asp:TextBox></td>
                    <td style="width: 100px; height: 33px;">
                    </td>
                </tr>
                <tr>
                    <td style="width: 145px; height: 32px;" align="center">
                    
                        用户密码:</td>
                    <td colspan="3" style="height: 32px">
                        <asp:TextBox ID="TxtPass" runat="server" TextMode="Password"></asp:TextBox></td>
                    <td style="width: 100px; height: 32px;">
                    </td>
                </tr>
                <tr>
                    <td style="width: 145px; height: 29px;" align="center">
                        确认密码:</td>
                    <td colspan="3" style="height: 29px">
                        <asp:TextBox ID="TxtPass1" runat="server" TextMode="Password"></asp:TextBox></td>
                    <td style="width: 100px; height: 29px;">
                    </td>
                </tr>
                <tr>
                    <td style="width: 145px; height: 31px;" align="center">
                        用户角色:</td>
                    <td colspan="3" style="height: 31px">
                        &nbsp;<asp:DropDownList ID="role" runat="server">
                            <asp:ListItem Selected="True">普通用户</asp:ListItem>
                            <asp:ListItem>管理员</asp:ListItem>
                        </asp:DropDownList></td>
                    <td style="width: 100px; height: 31px;">
                    </td>
                </tr>
                <tr>
                    <td style="width: 145px; height: 35px;">
                    </td>
                    <td style="height: 35px;" colspan="3">
                        <asp:Button ID="bt_add" runat="server" OnClick="bt_add_Click" Text="注册" /></td>
                    <td style="width: 100px; height: 35px;">
                    </td>
                </tr>
            </table>
        </div>
        <uc4:Left_Navlist ID="Left_Navlist1" runat="server" />
    </form>
</body>
</html>
