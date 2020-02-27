<%@ Page Language="C#" CodePage="936" AutoEventWireup="true"  EnableEventValidation="false" CodeFile="Add_Leaver.aspx.cs" Inherits="WebFiles_Leaver_Add_Leaver" %>
<%@ Register Src="../../UserControl/Header.ascx" TagName="Header" TagPrefix="uc1" %>
<%@ Register Src="../../UserControl/Left_Navlist.ascx" TagName="Left_Navlist" TagPrefix="uc2" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" >
<head runat="server">
    <title>员工考勤登记</title>
    <link rel="Stylesheet" type="text/css" href="../../CSS/Mispersonal.css" />
    <script language="JavaScript" src="../../Js/Calendar30.js"></script>
</head>
<body>
    <form id="form1" runat="server">
    <div>
        <uc1:Header ID="Header1" runat="server" />
        <uc2:Left_Navlist ID="Left_Navlist1" runat="server" />
        <div style="z-index: 101; left: 270px; width: 487px; position: absolute; top: 229px;
            height: 163px">
            <table cellpadding="0" cellspacing="0" style="width: 470px; height: 212px;">
                <tr>
                    <td bgcolor="#66c2de" colspan="5" align="center" style="height: 27px">
                        员工考勤登记</td>
                </tr>
                <tr>
                    <td align="center" style="height: 30px; width: 1039px;">
                        考勤对象:</td>
                    <td style="width: 189px; height: 30px;">
                        <asp:DropDownList ID="Person" runat="server">
                        </asp:DropDownList></td>
                    <td colspan="3" rowspan="3">
                        <br />
                        </td>
                </tr>
                <tr>
                    <td align="center" style="height: 30px; width: 1039px;">
                        开始时间:</td>
                    <td style="width: 189px; height: 30px;">
                        <asp:TextBox ID="TxtStartTime" runat="server"></asp:TextBox></td>
                </tr>
                <tr>
                    <td align="center" style="height: 30px; width: 1039px;">
                        结束时间:</td>
                    <td style="width: 189px; height: 30px;">
                        <asp:TextBox ID="TxtEndTime" runat="server"></asp:TextBox></td>
                </tr>
                <tr>
                    <td align="center" style="height: 30px; width: 1039px;">
                        假别:</td>
                    <td style="width: 189px; height: 30px">
                        <asp:DropDownList ID="Kind" runat="server">
                        </asp:DropDownList></td>
                    <td style="width: 100px; height: 30px">
                        负责人:</td>
                    <td style="height: 30px" colspan="2">
                        <asp:DropDownList ID="Agreer" runat="server">
                        </asp:DropDownList></td>
                </tr>
                 <tr>
                    <td align="center" style="width: 1039px">
                        请假理由:</td>
                            <td colspan="4" rowspan="2">
                                <asp:TextBox ID="TxtReason" runat="server" Columns="50" Rows="5" TextMode="MultiLine"></asp:TextBox></td>
                </tr>
                <tr>
                    <td style="width: 1039px">
                    </td>
                </tr>
                <tr>
                    <td style="height: 21px" colspan="5">
                        <asp:Label ID="lbMessage" runat="server" ForeColor="Red" Height="25px" Width="574px"></asp:Label></td>
                </tr>
                <tr>
                    <td style="width: 1039px">
                    </td>
                    <td style="width: 189px">
                        <asp:Button ID="BtnOK" runat="server" Text="登记" OnClick="BtnOK_Click" /></td>
                    <td>
                    </td>
                    <td>
                        </td>
                    <td style="width: 102px">
                    </td>
                </tr>
            </table>
        </div>
    
    </div>
    </form>
</body>
</html>
