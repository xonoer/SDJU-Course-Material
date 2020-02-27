<%@ Page Language="C#" AutoEventWireup="true" CodeFile="User_List.aspx.cs" Inherits="WebFiles_User_User_List" %>
<%@ Register Src="../../UserControl/Left_Navlist.ascx" TagName="Left_Navlist" TagPrefix="uc3" %>
<%@ Register Src="../../UserControl/Header.ascx" TagName="Header" TagPrefix="uc1" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml" >
<head runat="server">
    <title>用户列表</title>
    <link rel=Stylesheet type="text/css" href="../../CSS/Mispersonal.css" />
</head>
<body>
    <form id="form1" runat="server">
    <div>
        <uc1:Header ID="Header1" runat="server" />
        &nbsp;
        <div style="z-index: 101; left: 319px; width: 260px; position: absolute; top: 228px;
            height: 119px">
            <table align=center cellpadding=0 cellspacing=0 style="width: 494px; height: 116px">
                <tr>
                    <td colspan="3" bgcolor="#66c2de" align=center style="height: 26px">
                        用户列表</td>
                </tr>
                <tr>
                    <td style="height: 14px;" colspan="3" align=center>
                        <br />
                        <asp:GridView ID="List" runat="server"
                            Width="465px" CellPadding="4" ForeColor="#333333" GridLines="None" PageSize="100" OnPageIndexChanging="List_PageIndexChanging">
                            
                            <FooterStyle BackColor="#507CD1" Font-Bold="True" ForeColor="White" />
                            <RowStyle BackColor="#EFF3FB" />
                            <EditRowStyle BackColor="#2461BF" />
                            <SelectedRowStyle BackColor="#D1DDF1" Font-Bold="True" ForeColor="#333333" />
                            <PagerStyle BackColor="#2461BF" ForeColor="White" HorizontalAlign="Center" />
                            <HeaderStyle BackColor="#507CD1" Font-Bold="True" ForeColor="White" />
                            <AlternatingRowStyle BackColor="White" />
                            <Columns>
                                <asp:HyperLinkField HeaderText="详细资料"
                                    Text="查看" DataNavigateUrlFields="用户编号,用户姓名" DataNavigateUrlFormatString="~/WebFiles/User/DisplayUser.aspx?ID={0}&amp;userName={1}" DataTextField="用户姓名" HeaderImageUrl="~/WebFiles/Images/user.gif" />
                            </Columns>

                        </asp:GridView>
                    </td>
                </tr>
            </table>
        </div>
        <uc3:Left_Navlist ID="Left_Navlist1" runat="server" />
    
    </div>
    </form>
</body>
</html>
