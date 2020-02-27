<%@ Page Language="C#" AutoEventWireup="true"  CodeFile="Default.aspx.cs" Inherits="_Default" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" >
<head runat="server">
    <title>用户登陆|-</title>
    <link rel=Stylesheet type="text/css" href="CSS/Mispersonal.css" />
</head>
<body>
    <form id="form1" runat="server">
    <div>
        &nbsp;
        <div style="z-index: 101; left: 311px; width: 361px; position: absolute; top: 206px;
            height: 100px">
            <table cellpadding="0" cellspacing="0" style="height: 159px">
                <tr>
                    <td bgcolor="#66c2de" colspan="5" style="height: 24px">
                    </td>
                </tr>
                <tr>
                    <td align="center" style="width: 41px; height: 35px">
                        <asp:Image ID="Image1" runat="server" ImageUrl="~/WebFiles/Images/role.gif" /></td>
                    <td colspan="3" style="width: 155px; height: 35px">
                        用户角色:&nbsp;</td>
                    <td style="width: 250px; height: 35px">
                        <asp:RadioButton ID="rb_user" runat="server" GroupName="role" Text="普通用户" Checked="True" />
                        <asp:RadioButton ID="rb_admin" runat="server" GroupName="role" Text="管理员" /></td>
                </tr>
                <tr>
                    <td align="center" style="width: 41px; height: 35px">
                        <asp:Image ID="Image2" runat="server" ImageUrl="~/WebFiles/Images/user.gif" /></td>
                    <td colspan="3" style="width: 155px; height: 35px">
                        用户名称:</td>
                    <td style="width: 250px; height: 35px">
                        <asp:TextBox ID="TxtUser" runat="server"></asp:TextBox></td>
                </tr>
                <tr>
                    <td align="center" style="width: 41px; height: 35px">
                        <asp:Image ID="Image3" runat="server" ImageUrl="~/WebFiles/Images/password.gif" /></td>
                    <td colspan="3" style="width: 155px; height: 35px">
                        用户密码:</td>
                    <td style="width: 250px; height: 35px">
                        <asp:TextBox ID="TxtPwd" runat="server" TextMode="Password"></asp:TextBox></td>
                </tr>
                <tr>
                    <td align="center" colspan="5" style="height: 30px">
                        <asp:Button ID="Btn_Login" runat="server" Text="登陆" OnClick="Btn_Login_Click" />
                        <asp:Button ID="Btn_Cancel" runat="server" Text="重置" OnClick="Btn_Cancel_Click" /></td>
                </tr>
                <tr>
                    <td colspan="5" style="height: 21px" align="center">
                        <asp:Label ID="lbMessage" runat="server" Height="27px" Width="358px" ForeColor="Red"></asp:Label></td>
                </tr>
                <tr>
                    <td bgcolor="#66c2de" colspan="5" style="height: 5px">
                    </td>
                </tr>
            </table>
        </div>
        &nbsp;
        <div style="z-index: 102; left: 670px; width: 100px; position: absolute; top: 106px;
            height: 100px">
            <asp:Image ID="Image4" runat="server" ImageUrl="~/WebFiles/Images/login.gif" /></div>
    </div>
    </form>
</body>
</html>
