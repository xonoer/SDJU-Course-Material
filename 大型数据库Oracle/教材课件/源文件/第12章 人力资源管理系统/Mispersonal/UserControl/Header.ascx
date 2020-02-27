<%@ Control Language="C#" AutoEventWireup="true" CodeFile="Header.ascx.cs" Inherits="Control_WebUserControl" %>
<table>
    <tr>
        <td style="width: 1013px; height: 86px">
            <asp:Image ID="Image1" runat="server" Height="200px" ImageUrl="~/WebFiles/Images/header.gif"
                Width="100%" />&nbsp;
        </td>
    </tr>
</table>
<div style="z-index: 101; left: 15px; width: 100px; position: absolute; top: 185px;
    height: 28px">
    <asp:Label ID="lbMessage" runat="server" ForeColor="Red" Width="279px"></asp:Label>
            <asp:Label ID="lbTime" runat="server" Width="281px"></asp:Label></div>
