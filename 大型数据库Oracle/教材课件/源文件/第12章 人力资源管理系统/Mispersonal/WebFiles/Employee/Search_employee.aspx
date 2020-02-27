<%@ Page Language="C#" AutoEventWireup="true" CodeFile="Search_employee.aspx.cs" Inherits="WebFiles_Employee_Search_employee" %>
<%@ Register Src="../../UserControl/Left_Navlist.ascx" TagName="Left_Navlist" TagPrefix="uc3" %>
<%@ Register Src="../../UserControl/Header.ascx" TagName="Header" TagPrefix="uc1" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml" >
<head runat="server">
    <title>员工查询</title>
    <link rel=Stylesheet type="text/css" href="../../CSS/Mispersonal.css" />
</head>
<body>
    <form id="form1" runat="server">
    <div>
        <uc1:Header ID="Header1" runat="server" />
    
    </div>
        <br />
        <div style="z-index: 101; left: 202px; width: 788px; position: absolute; top: 226px;
            height: 149px">
            <table align=center cellpadding=0 cellspacing=0 style="width: 786px; height: 110px">
                <tr>
                    <td colspan="4" bgcolor="#66c2de" style="height: 22px" align=center>
                        员工信息搜索</td>
                </tr>
                <tr>
                    <td style="width: 174px; height: 20px;" align=center>
                        &nbsp; 选择搜索字段名:</td>
                    <td style="width: 58px; height: 20px;" align=center>
                        <asp:DropDownList ID="role" runat="server">
                            <asp:ListItem>员工编号</asp:ListItem>
                            <asp:ListItem>员工姓名</asp:ListItem>
                        </asp:DropDownList></td>
                        <td style="width: 58px; height: 20px;" align=center>
                            <asp:TextBox ID="TxtContent" runat="server"></asp:TextBox></td>
                    <td style="width: 100px; height: 20px;" align=center>
                        <asp:Button ID="btn_search" runat="server" Text="搜索" OnClick="btn_search_Click" /></td>
                </tr>
                <tr>
                    <td colspan="4" style="height: 20px" align=center>
                        <br />
                        <asp:GridView ID="List_employee" runat="server" Height="28px" Width="768px" CellPadding="4" ForeColor="#333333" GridLines="None">
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
