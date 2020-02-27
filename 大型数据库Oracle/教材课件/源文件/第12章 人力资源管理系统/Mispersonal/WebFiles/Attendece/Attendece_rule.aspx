<%@ Page Language="C#" AutoEventWireup="true" CodeFile="Attendece_rule.aspx.cs" Inherits="WebFiles_Attendece_Attendce_rule" %>
<%@ Register Src="../../UserControl/Left_Navlist.ascx" TagName="Left_Navlist" TagPrefix="uc3" %>
<%@ Register Src="../../UserControl/Header.ascx" TagName="Header" TagPrefix="uc1" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml" >
<head runat="server">
    <title>考勤规则</title>
     <link rel="Stylesheet" type="text/css" href="../../CSS/Mispersonal.css" />
</head>
<body>
    <form id="form1" runat="server">
    <div>
        <uc1:Header ID="Header1" runat="server" />
    
    </div>
        <br />
        &nbsp;<uc3:Left_Navlist ID="Left_Navlist1" runat="server" />
        <div style="z-index: 101; left: 206px; width: 541px; position: absolute; top: 225px;
            height: 68px">
            <table cellpadding="0" cellspacing="0" align="center" style="width: 603px">
                <tr>
                    <td bgcolor="#66c2de" colspan="3" style="width: 562px; height: 23px" align="center">
                        考勤规则</td>
                </tr>
                <tr>
                    <td colspan="3" style="width: 562px" align="center">
                        <br />
                        <asp:GridView ID="list" runat="server" CellPadding="4" ForeColor="#333333" GridLines="None"
                            Width="552px">
                            <FooterStyle BackColor="#507CD1" Font-Bold="True" ForeColor="White" />
                            <RowStyle BackColor="#EFF3FB" />
                            <EditRowStyle BackColor="#2461BF" />
                            <SelectedRowStyle BackColor="#D1DDF1" Font-Bold="True" ForeColor="#333333" />
                            <PagerStyle BackColor="#2461BF" ForeColor="White" HorizontalAlign="Center" />
                            <HeaderStyle BackColor="#507CD1" Font-Bold="True" ForeColor="White" />
                            <AlternatingRowStyle BackColor="White" />
                        </asp:GridView>
                        <br />
                    </td>
                </tr>
            </table>
        </div>
    </form>
</body>
</html>
