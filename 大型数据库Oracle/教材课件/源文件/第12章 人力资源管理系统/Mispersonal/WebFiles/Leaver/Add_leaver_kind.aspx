<%@ Page Language="C#" AutoEventWireup="true" CodeFile="Add_leaver_kind.aspx.cs" Inherits="WebFiles_Leaver_Add_leaver_kind" %>

<%@ Register Src="../../UserControl/Header.ascx" TagName="Header" TagPrefix="uc1" %>
<%@ Register Src="../../UserControl/Left_Navlist.ascx" TagName="Left_Navlist" TagPrefix="uc2" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml" >
<head id="Head1" runat="server">
    <title>添加假别</title>
    <link rel="Stylesheet" type="text/css" href="../../CSS/Mispersonal.css" />
</head>
<body>
    <form id="form1" runat="server">
    <div>
        <uc1:Header ID="Header1" runat="server" />
    
    </div>
        <br />
        <div style="z-index: 101; left: 229px; width: 401px; position: absolute; top: 228px;
            height: 121px">
            <table cellpadding="0" cellspacing="0" align="center" style="width: 440px">
                <tr>
                    <td bgcolor="#66c2de" colspan="3" style="height: 25px; width: 426px;" align="center">
                        添加假别</td>
                </tr>
                <tr>
                    <td colspan="3" style="height: 77px; width: 426px;" align="center">
                        <table cellpadding="0" cellspacing="0" style="width: 446px; height: 101px">
                            <tr>
                                <td style="width: 66px" rowspan="3">
                                </td>
                                <td style="width: 213px; height: 30px;">
                                    假别编号:</td>
                                <td style="width: 43px; height: 30px;">
                                    <asp:TextBox ID="TxtID" runat="server"></asp:TextBox></td>
                                <td style="width: 296px; height: 30px;">
                                </td>
                            </tr>
                            <tr>
                                <td style="width: 213px; height: 30px;">
                                    假别名称:</td>
                                <td style="width: 43px; height: 30px;">
                                    <asp:TextBox ID="TxtName" runat="server"></asp:TextBox></td>
                                <td style="width: 296px; height: 30px;">
                                </td>
                            </tr>
                            <tr>
                                <td style="width: 213px; height: 30px;">
                                    是否带薪:</td>
                                <td style="width: 43px; height: 30px;">
                                    <asp:CheckBox ID="IsSalaryOrNot" runat="server" Text="是" /></td>
                                <td style="width: 296px; height: 30px;">
                                </td>
                            </tr>
                            <tr>
                                <td colspan="5" style="height: 18px">
                                    <asp:Label ID="lbMessage" runat="server" ForeColor="Red" Width="358px"></asp:Label></td>
                            </tr>
                            <tr>
                                <td style="width: 66px; height: 30px">
                                </td>
                                <td style="width: 213px; height: 30px">
                                    <asp:Button ID="btnAdd" runat="server" Text="添加" OnClick="btnAdd_Click" /></td>
                                <td style="width: 43px; height: 30px">
                                </td>
                                <td style="width: 296px; height: 30px">
                                </td>
                                <td style="width: 100px; height: 30px">
                                </td>
                            </tr>
                        </table>
                    </td>
                </tr>
            </table>
        </div>
        <uc2:Left_Navlist ID="Left_Navlist1" runat="server" />
    </form>
</body>
</html>