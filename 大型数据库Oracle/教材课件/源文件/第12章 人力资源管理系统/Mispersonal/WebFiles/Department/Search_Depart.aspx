<%@ Page Language="C#" AutoEventWireup="true" CodeFile="Search_Depart.aspx.cs" Inherits="WebFiles_Department_Search_Depart" %>
<%@ Register Src="../../UserControl/Left_Navlist.ascx" TagName="Left_Navlist" TagPrefix="uc3" %>
<%@ Register Src="../../UserControl/Header.ascx" TagName="Header" TagPrefix="uc1" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml" >
<head runat="server">
    <title>部门信息查询</title>
    <link rel="Stylesheet" type="text/css" href="../../CSS/Mispersonal.css" />
</head>
<body>
    <form id="form1" runat="server">
    <div>
        <uc1:Header ID="Header1" runat="server" />
    
    </div>
        <br />
        <div style="z-index: 101; left: 215px; width: 664px; position: absolute; top: 223px;
            height: 127px">
            <table id="TABLE1" runat="server" style="width: 686px" cellpadding="0" cellspacing="0">
                <tr>
                    <td bgcolor="#66c2de" colspan="4" align="center" style="height: 24px">
                        部门信息搜索</td>
                </tr>
                <tr>
                    <td style="width: 233px; height: 1px" >
                        &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; 选择搜索字段名：</td>
                    <td style="width: 234px; height: 1px" align="center">
                        <asp:DropDownList ID="role" runat="server" Width="135px">
                            <asp:ListItem>部门编号</asp:ListItem>
                            <asp:ListItem>部门名称</asp:ListItem>
                            <asp:ListItem>负责人</asp:ListItem>
                        </asp:DropDownList></td>
                        <td style="width: 100px; height: 1px">
                      
                            <asp:TextBox ID="TxtContent" runat="server"></asp:TextBox>
                         
                        </td>
                    <td style="width: 131px; height: 1px">
                        &nbsp; &nbsp; &nbsp; &nbsp;
                   
                        <asp:Button ID="brn_search" runat="server" Text="查询" OnClick="brn_search_Click" /></td>
                </tr>
                <tr>
                    <td colspan="4" style="height: 82px">
                        <br />
                        <asp:GridView ID="List_employee" runat="server" CellPadding="4" ForeColor="#333333" GridLines="None"
                            Width="684px">
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
