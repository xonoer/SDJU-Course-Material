<%@ Page Language="C#" AutoEventWireup="true" CodeFile="DisplayDepart.aspx.cs" Inherits="WebFiles_Department_View_Depart" %>

<%@ Register Src="../../UserControl/Header.ascx" TagName="Header" TagPrefix="uc1" %>
<%@ Register Src="../../UserControl/Left_Navlist.ascx" TagName="Left_Navlist" TagPrefix="uc2" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml" >
<head runat="server">
    <title><%=(string)Session["D_Name"]+"的个人详细资料" %></title>
     <link rel="Stylesheet" type="text/css" href="../../CSS/Mispersonal.css" />
</head>
<body>
    <form id="form1" runat="server">
    <div>
        <uc1:Header ID="Header1" runat="server" />
        &nbsp;</div>
        <uc2:Left_Navlist ID="Left_Navlist1" runat="server" />
        <div id="DIV1" style="z-index: 101; left: 257px; width: 492px; position: absolute;
            top: 225px; height: 123px">
            <table style="width: 435px" cellpadding="0" cellspacing="0" align="center">
                <tr>
                    <td bgcolor="#66c2de" colspan="3" style="width: 545px; height: 25px;" align="center">
                        部门详细信息</td>
                </tr>
                <tr>
                    <td style="width: 115px; height: 35px">
                        &nbsp; &nbsp; &nbsp; &nbsp;&nbsp; 部门编号:</td>
                    <td style="width: 337px; height: 35px;">
                        <asp:TextBox ID="TxtID" runat="server"></asp:TextBox></td>
                </tr>
                <tr>
                    <td style="width: 115px; height: 35px">
                        &nbsp; &nbsp; &nbsp; &nbsp;&nbsp; 部门名称:</td>
                    <td style="width: 337px; height: 17px;">
                        <asp:TextBox ID="TxtName" runat="server"></asp:TextBox></td>
                </tr>
                <tr>
                    <td style="width: 115px; height: 35px">
                        &nbsp; &nbsp; &nbsp; &nbsp;&nbsp; 联系方式:</td>
                    <td style="width: 337px">
                        <asp:TextBox ID="TxtTel" runat="server"></asp:TextBox></td>
                </tr>
                <tr>
                    <td style="width: 115px; height: 35px">
                        &nbsp; &nbsp; &nbsp; &nbsp;&nbsp; 联系地址:</td>
                    <td style="width: 337px; height: 35px;">
                        <asp:TextBox ID="TxtAddress" runat="server"></asp:TextBox></td>
                </tr>
                <tr>
                    <td style="width: 115px; height: 35px">
                        &nbsp; &nbsp; &nbsp; &nbsp;&nbsp; 负责人:</td>
                    <td style="width: 337px">
                        <asp:TextBox ID="TxtChief" runat="server"></asp:TextBox></td>
                </tr>
                <tr>
                    <td style="width: 115px; height: 35px">
                        &nbsp; &nbsp; &nbsp; &nbsp;&nbsp; 所属部门:</td>
                    <td style="width: 337px">
                        <asp:TextBox ID="TxtBelong" runat="server"></asp:TextBox></td>
                </tr>
                <tr>
                    <td style="height: 35px" colspan="2">
                        &nbsp;<asp:Label ID="lbMessage" runat="server" ForeColor="Red" Height="27px" Width="476px"></asp:Label></td>
                </tr>
                <tr>
                    <td style="width: 81px; height: 24px">
                        </td>
                    <td style="width: 337px; height: 24px;">
                        &nbsp;<asp:Button ID="Edit" runat="server" Text="更新" OnClick="Edit_Click" />
                       <asp:Button ID="Delete" runat="server" Text="删除" OnClick="Delete_Click" /></td>
                </tr>
            </table>
        </div>
    </form>
</body>
</html>
