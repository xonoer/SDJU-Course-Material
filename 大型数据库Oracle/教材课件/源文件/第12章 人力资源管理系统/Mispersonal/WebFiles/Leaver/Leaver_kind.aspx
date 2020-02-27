<%@ Page Language="C#" AutoEventWireup="true" CodeFile="Leaver_kind.aspx.cs" Inherits="WebFiles_Leaver_Leaver_kind" %>

<%@ Register Src="../../UserControl/Header.ascx" TagName="Header" TagPrefix="uc1" %>
<%@ Register Src="../../UserControl/Left_Navlist.ascx" TagName="Left_Navlist" TagPrefix="uc2" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml" >
<head runat="server">
    <title>假别管理</title>
    <link rel="Stylesheet" type="text/css" href="../../CSS/Mispersonal.css" />
</head>
<body>
    <form id="form1" runat="server">
    <div>
        <uc1:Header ID="Header1" runat="server" />
    
    </div>
        <br />
        <div style="z-index: 101; left: 251px; width: 401px; position: absolute; top: 223px;
            height: 121px">
            <table cellpadding="0" cellspacing="0" align="center" style="width: 440px">
                <tr>
                    <td bgcolor="#66c2de" colspan="3" style="height: 25px; width: 426px;" align="center">
                        请假类别</td>
                </tr>
                <tr>
                    <td colspan="3" style="height: 77px; width: 426px;" align="center">
                        <br />
                        <asp:GridView ID="ListLeaverKind" runat="server" CellPadding="4" ForeColor="#333333"
                            GridLines="None" Width="403px">
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
        <uc2:Left_Navlist ID="Left_Navlist1" runat="server" />
    </form>
</body>
</html>
