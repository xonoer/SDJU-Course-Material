<%@ Page Language="C#" AutoEventWireup="true" CodeFile="Attendece_rule_Edit.aspx.cs" Inherits="WebFiles_Attendece_Edit_Attendece_rule" %>

<%@ Register Src="../../UserControl/Header.ascx" TagName="Header" TagPrefix="uc1" %>
<%@ Register Src="../../UserControl/Left_Navlist.ascx" TagName="Left_Navlist" TagPrefix="uc2" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml" >
<head runat="server">
    <title>设置考勤规则</title>
    <link rel="Stylesheet" type="text/css" href="../../CSS/Mispersonal.css" />
</head>
<body>
    <form id="form1" runat="server">
    <div>
        <uc1:Header ID="Header1" runat="server" />
        <uc2:Left_Navlist ID="Left_Navlist1" runat="server" />
        <div style="z-index: 101; left: 270px; width: 348px; position: absolute; top: 229px;
            height: 163px">
            <table cellpadding="0" cellspacing="0" align="center" style="width: 360px">
                <tr>
                    <td bgcolor="#66c2de" colspan="5" align="center" style="height: 27px">
                        考勤时间设置</td>
                </tr>
                <tr>
                    <td align="center" style="height: 30px; width: 163px;">
                        上班时间:</td>
                    <td style="width: 104px; height: 30px;">
                        <asp:TextBox ID="TextBox1" runat="server" Columns="2" MaxLength="2"></asp:TextBox>时</td>
                    <td style="width: 115px; height: 30px;">
                        <asp:TextBox ID="TextBox2" runat="server" Columns="2" MaxLength="2"></asp:TextBox>分</td>
                    <td style="width: 121px; height: 30px;">
                        <asp:TextBox ID="TextBox3" runat="server" Columns="2" MaxLength="2"></asp:TextBox>秒</td>
                </tr>
                <tr>
                    <td align="center" style="width: 163px">
                        下班时间:</td>
                    <td style="width: 104px; height: 30px;">
                        <asp:TextBox ID="TextBox4" runat="server" Columns="2" MaxLength="2"></asp:TextBox>时</td>
                    <td style="width: 115px; height: 30px;">
                        <asp:TextBox ID="TextBox5" runat="server" Columns="2" MaxLength="2"></asp:TextBox>分</td>
                    <td style="width: 121px; height: 30px;">
                        <asp:TextBox ID="TextBox6" runat="server" Columns="2" MaxLength="2"></asp:TextBox>秒</td>
                </tr>
                <tr>
                    <td align="center" style="width: 163px">
                        上班时间:</td>
                    <td style="width: 104px; height: 30px;">
                        <asp:TextBox ID="TextBox7" runat="server" Columns="2" MaxLength="2"></asp:TextBox>时</td>
                    <td style="width: 115px; height: 30px;">
                        <asp:TextBox ID="TextBox8" runat="server" Columns="2" MaxLength="2"></asp:TextBox>分</td>
                    <td style="width: 121px; height: 30px;">
                        <asp:TextBox ID="TextBox9" runat="server" Columns="2" MaxLength="2"></asp:TextBox>秒</td>
                </tr>
                <tr>
                    <td align="center" style="width: 163px">
                        下班时间:</td>
                    <td style="width: 104px; height: 17px">
                        <asp:TextBox ID="TextBox10" runat="server" Columns="2" MaxLength="2"></asp:TextBox>时</td>
                    <td style="width: 115px; height: 17px">
                        <asp:TextBox ID="TextBox11" runat="server" Columns="2" MaxLength="2"></asp:TextBox>分</td>
                    <td style="width: 121px; height: 17px">
                        <asp:TextBox ID="TextBox12" runat="server" Columns="2" MaxLength="2"></asp:TextBox>秒</td>
                </tr>
                <tr>
                    <td style="height: 25px" colspan="5"  align="center">
                        <asp:Label ID="lbMessage" runat="server" ForeColor="Red" Height="25px" Width="373px"></asp:Label></td>
                </tr>
                <tr>
                    <td style="width: 163px; height: 21px">
                    </td>
                    <td style="width: 104px; height: 21px">
                        <asp:Button ID="BtnOK" runat="server" Text="设置" OnClick="BtnOK_Click" /></td>
                    <td style="width: 115px; height: 21px">
                        </td>
                    <td style="width: 121px; height: 21px">
                        </td>
                    <td style="width: 100px; height: 21px">
                    </td>
                </tr>
                <tr>
                    <td style="height: 25px" colspan="5" align="center">
                        <asp:Label ID="Label1" runat="server" ForeColor="Red" Height="25px" Width="373px">注意:时间必须为数字</asp:Label></td>
                </tr>
            </table>
        </div>
    
    </div>
    </form>
</body>
</html>
