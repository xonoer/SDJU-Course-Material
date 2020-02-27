<%@ Page Language="C#" AutoEventWireup="true" CodeFile="List_employee.aspx.cs" Inherits="WebFiles_Employee_List_employee" %>
<%@ Register Src="../../UserControl/Left_Navlist.ascx" TagName="Left_Navlist" TagPrefix="uc3" %>
<%@ Register Src="../../UserControl/Header.ascx" TagName="Header" TagPrefix="uc1" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml" >
<head runat="server">
    <title>员工列表</title>
    <link rel="Stylesheet" type="text/css" href="../../CSS/Mispersonal.css" />
</head>
<body>
    <form id="form1" runat="server">
    <div>
        <uc1:Header ID="Header1" runat="server" />
        &nbsp;</div>
        <br />
        &nbsp;&nbsp;
        <div style="z-index: 101; left: 207px; width: 784px; position: absolute; top: 223px;
            height: 143px">
            <table cellpadding="0" cellspacing="0" style="width: 783px">
                <tr>
                    <td bgcolor="#66c2de" colspan="3" style="width: 764px; height: 20px" align="center">
                        员工信息列表</td>
                </tr>
                <tr>
                    <td colspan="3" style="width: 764px; height: 96px;" align="center">
                        <br />
                        <asp:GridView ID="list1" runat="server" Height="48px" Width="779px" CellPadding="4" ForeColor="#333333" GridLines="None" OnPageIndexChanging="list1_PageIndexChanging" >
                            <FooterStyle BackColor="#507CD1" Font-Bold="True" ForeColor="White" />
                            <RowStyle BackColor="#EFF3FB" />
                            <EditRowStyle BackColor="#2461BF" />
                            <SelectedRowStyle BackColor="#D1DDF1" Font-Bold="True" ForeColor="#333333" />
                            <PagerStyle BackColor="#2461BF" ForeColor="White" HorizontalAlign="Center" />
                            <HeaderStyle BackColor="#507CD1" Font-Bold="True" ForeColor="White" />
                            <AlternatingRowStyle BackColor="White" />
                            <Columns>
                            <asp:HyperLinkField DataNavigateUrlFields="员工编号,员工姓名" DataNavigateUrlFormatString="~/WebFiles/Employee/DisplayEmployee.aspx?E_ID={0}&amp;E_Name={1}"
                                    DataTextField="员工姓名" HeaderImageUrl="~/WebFiles/Images/user.gif" />
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
