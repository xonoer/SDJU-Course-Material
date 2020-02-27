<%@ Page Language="C#" AutoEventWireup="true" CodeFile="DisplayUser.aspx.cs" Inherits="WebFiles_User_User_view" %>
<%@ Register Src="../../UserControl/Left_Navlist.ascx" TagName="Left_Navlist" TagPrefix="uc3" %>
<%@ Register Src="../../UserControl/Header.ascx" TagName="Header" TagPrefix="uc1" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml" >
<head runat="server">
    <title><%=(string)Session["userName"]+"的个人详细资料" %></title>
    <link rel="Stylesheet" type="text/css" href="../../CSS/Mispersonal.css" />
</head>
<body>
    <form id="form1" runat="server">
    <div>
        <uc1:Header ID="Header1" runat="server" />
    
    </div>
        <br />
        &nbsp;
        <div style="z-index: 101; left: 285px; width: 304px; position: absolute; top: 228px;
            height: 246px">
            <table align="center" cellpadding="0" cellspacing="0">
                <tr>
                    <td align="center" bgcolor="#66c2de" colspan="5" style="height: 24px">
                        用户详细资料</td>
                </tr>
                <tr>
                    <td align="center" style="width: 145px; height: 33px">
                        用户编号:</td>
                    <td colspan="3" style="height: 33px; width: 243px;">
                        <asp:TextBox ID="TxtUserID" runat="server" ReadOnly="True"></asp:TextBox></td>
                    <td style="width: 100px; height: 33px">
                    </td>
                </tr>
                <tr>
                    <td align="center" style="width: 145px; height: 33px">
                        用户名称:</td>
                    <td colspan="3" style="height: 33px; width: 243px;">
                        <asp:TextBox ID="TxtUser" runat="server"></asp:TextBox></td>
                    <td style="width: 100px; height: 33px">
                    </td>
                </tr>
                <tr>
                    <td align="center" style="width: 145px; height: 32px">
                        用户密码:</td>
                    <td colspan="3" style="height: 32px; width: 243px;">
                        <asp:TextBox ID="TxtPass" runat="server" TextMode="Password"></asp:TextBox></td>
                    <td style="width: 100px; height: 32px">
                    </td>
                </tr>
                <tr>
                    <td align="center" style="width: 145px; height: 29px">
                        确认密码:</td>
                    <td colspan="3" style="height: 29px; width: 243px;">
                        <asp:TextBox ID="TxtPass1" runat="server" TextMode="Password"></asp:TextBox></td>
                    <td style="width: 100px; height: 29px">
                    </td>
                </tr>
                <tr>
                    <td align="center" style="width: 145px; height: 31px">
                        用户角色:</td>
                    <td colspan="3" style="height: 31px; width: 243px;">
                        &nbsp;<asp:DropDownList ID="role" runat="server" OnSelectedIndexChanged="role_SelectedIndexChanged">
                            <asp:ListItem Selected="True">普通用户</asp:ListItem>
                            <asp:ListItem>管理员</asp:ListItem>
                        </asp:DropDownList></td>
                    <td style="width: 100px; height: 31px">
                    </td>
                </tr>
                <tr>
                    <td align="center" style="height: 29px" colspan="5">
                        <asp:Label ID="lbMessage" runat="server" ForeColor="Red" Width="396px"></asp:Label></td>
                </tr>
                <tr>
                    <td style="width: 145px; height: 35px">
                        &nbsp;<asp:Button ID="Edit" runat="server" OnClick="Edit_Click" Text="修改" /></td>
                    <td colspan="3" style="height: 35px; width: 243px;">
                        &nbsp; &nbsp;<asp:Button ID="Delete" runat="server"
                            OnClick="Delete_Click" Text="删除" /></td>
                    <td style="width: 100px; height: 35px">
                    </td>
                </tr>
            </table>
        </div>
        <uc3:Left_Navlist ID="Left_Navlist1" runat="server" />
    </form>
</body>
</html>
