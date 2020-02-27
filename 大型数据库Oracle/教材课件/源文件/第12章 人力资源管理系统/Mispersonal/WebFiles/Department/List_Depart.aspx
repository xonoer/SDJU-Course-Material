<%@ Page Language="C#" AutoEventWireup="true" CodeFile="List_Depart.aspx.cs" Inherits="WebFiles_Department_List_Depart" %>
<%@ Register Src="../../UserControl/Left_Navlist.ascx" TagName="Left_Navlist" TagPrefix="uc3" %>
<%@ Register Src="../../UserControl/Header.ascx" TagName="Header" TagPrefix="uc1" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml" >
<head runat="server">
    <title>部门信息列表</title>
    <link rel="Stylesheet" type="text/css" href="../../CSS/Mispersonal.css" />
</head>
<body>
    <form id="form1" runat="server">
    <div>
        <uc1:Header ID="Header1" runat="server" />
    
    </div>
        <br />
        <div style="z-index: 101; left: 231px; width: 620px; position: absolute; top: 222px;
            height: 167px">
            <table cellpadding="0" cellspacing="0" align="center" style="width: 636px; height: 119px;">
                <tr>
                    <td bgcolor="#66c2de" colspan="3" align="center" style="height: 24px">
                        部门信息列表</td>
                </tr>
                <tr>
                    <td colspan="3" style="height: 120px" align="center">
                        <br />
                        <asp:GridView ID="ListDepart" runat="server" CellPadding="4" ForeColor="#333333" GridLines="None"
                            Width="618px" Height="1px" PageSize="100">
                            <FooterStyle BackColor="#507CD1" Font-Bold="True" ForeColor="White" />
                            <RowStyle BackColor="#EFF3FB" />
                            <EditRowStyle BackColor="#2461BF" />
                            <SelectedRowStyle BackColor="#D1DDF1" Font-Bold="True" ForeColor="#333333" />
                            <PagerStyle BackColor="#2461BF" ForeColor="White" HorizontalAlign="Center" />
                            <HeaderStyle BackColor="#507CD1" Font-Bold="True" ForeColor="White" />
                            <AlternatingRowStyle BackColor="White" />
                            <Columns>
                                <asp:HyperLinkField DataNavigateUrlFields="部门编号,部门名称" DataNavigateUrlFormatString="~/WebFiles/Department/DisplayDepart.aspx?D_ID={0}&amp;D_Name={1}"
                                    DataTextField="部门名称" HeaderImageUrl="~/WebFiles/Images/user.gif" />
                            </Columns>
                        </asp:GridView>
                        <br />
                    </td>
                </tr>
            </table>
        </div>
        <uc3:Left_Navlist ID="Left_Navlist1" runat="server" />
    </form>
</body>
</html>
