<%@ Page Language="C#" AutoEventWireup="true" CodeFile="Attendece_result.aspx.cs" Inherits="WebFiles_Attendece_Attendece_result" %>
<%@ Register Src="../../UserControl/Left_Navlist.ascx" TagName="Left_Navlist" TagPrefix="uc3" %>
<%@ Register Src="../../UserControl/Header.ascx" TagName="Header" TagPrefix="uc1" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml" >
<head runat="server">
    <title>考勤结果</title>
    <link rel="Stylesheet" type="text/css" href="../../CSS/Mispersonal.css" />
</head>
<body>
    <form id="form1" runat="server">
    <div>
        <uc1:Header ID="Header1" runat="server" />
    
    </div>
        <br />
        <div style="z-index: 101; left: 202px; width: 795px; position: absolute; top: 223px;
            height: 143px">
            <table cellpadding="0" cellspacing="0" align="center" style="width: 784px; height: 113px;">
                <tr>
                    <td colspan="3" bgcolor="#66c2de" align="center" style="height: 24px">
                        考勤结果</td>
                </tr>
                <tr>
                    <td style="height: 17px;" colspan="3" align="center">
                        <br />
                        <asp:GridView ID="ListAttendece" runat="server" CellPadding="4"
                            ForeColor="#333333" GridLines="None" Width="793px">
                            <FooterStyle BackColor="#507CD1" Font-Bold="True" ForeColor="White" />
                            <RowStyle BackColor="#EFF3FB" />
                            <EditRowStyle BackColor="#2461BF" />
                            <SelectedRowStyle BackColor="#D1DDF1" Font-Bold="True" ForeColor="#333333" />
                            <PagerStyle BackColor="#2461BF" ForeColor="White" HorizontalAlign="Center" />
                            <HeaderStyle BackColor="#507CD1" Font-Bold="True" ForeColor="White" />
                            <AlternatingRowStyle BackColor="White" />
                        </asp:GridView>
                        &nbsp; &nbsp;&nbsp;
                    </td>
                </tr>
            </table>
        </div>
        <uc3:Left_Navlist ID="Left_Navlist1" runat="server" />
    </form>
</body>
</html>
