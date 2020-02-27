<%@ Page Language="C#" AutoEventWireup="true" CodeFile="User_search.aspx.cs" Inherits="WebFiles_User_User_search" %>
<%@ Register Src="../../UserControl/Left_Navlist.ascx" TagName="Left_Navlist" TagPrefix="uc3" %>
<%@ Register Src="../../UserControl/Header.ascx" TagName="Header" TagPrefix="uc1" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml" >
<head runat="server">
    <title>用户搜索</title>
    <link rel=Stylesheet type="text/css" href="../../CSS/Mispersonal.css" />
</head>
<body>
    <form id="form1" runat="server">
    <div>
        <uc1:Header ID="Header1" runat="server" />
    
    </div>
        <br />
        &nbsp;
        <div style="z-index: 101; left: 257px; width: 358px; position: absolute; top: 229px;
            height: 140px">
            <table align=center cellpadding=0 cellspacing=0 style="width: 451px">
                <tr>
                    <td style="height: 21px;" bgcolor="#66c2de" colspan="6" align=center>
                        用户查询</td>
                </tr>
                <tr>
                    <td style="width: 118px; height: 19px;">
                        选择搜索字段名:</td>
                    <td style="width: 89px; height: 19px;">
                        <asp:DropDownList ID="role" runat="server">
                            <asp:ListItem>用户编号</asp:ListItem>
                            <asp:ListItem>用户名称</asp:ListItem>
                        </asp:DropDownList></td>
                        <td style="width: 100px; height: 19px;">
                        <asp:TextBox ID="TxtContent" runat="server"></asp:TextBox></td>
                    <td style="width: 62px; height: 19px;">
                        <asp:Button ID="Btn_Search" runat="server" OnClick="Btn_Search_Click" Text="查询" /></td>
                </tr>
                <tr>
                    <td style="height: 102px;" colspan="6" align=center>
                        <br />
                        <asp:GridView ID="User_List" runat="server" Height="60px" Width="403px" CellPadding="4" ForeColor="#333333" GridLines="None">
                            <Columns>
                                <asp:BoundField>
                                </asp:BoundField>
                            </Columns>
                            <FooterStyle BackColor="#507CD1" Font-Bold="True" ForeColor="White" />
                            <RowStyle BackColor="#EFF3FB" />
                            <EditRowStyle BackColor="#2461BF" />
                            <SelectedRowStyle BackColor="#D1DDF1" Font-Bold="True" ForeColor="#333333" />
                            <PagerStyle BackColor="#2461BF" ForeColor="White" HorizontalAlign="Center" />
                            <HeaderStyle BackColor="#507CD1" Font-Bold="True" ForeColor="White" />
                            <AlternatingRowStyle BackColor="White" />
                        </asp:GridView>
                    </td>
                </tr>
            </table>
        </div>
        <uc3:Left_Navlist ID="Left_Navlist1" runat="server" />
    </form>
</body>
</html>
