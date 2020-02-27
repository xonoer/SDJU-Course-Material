<%@ Page Language="C#" CodePage="936" AutoEventWireup="true"  EnableEventValidation="false" CodeFile="Add_employee.aspx.cs" Inherits="WebFiles_Employee_Add_employee" %>
<%@ Register Src="../../UserControl/Left_Navlist.ascx" TagName="Left_Navlist" TagPrefix="uc3" %>
<%@ Register Src="../../UserControl/Header.ascx" TagName="Header" TagPrefix="uc1" %>
<html xmlns="http://www.w3.org/1999/xhtml" >
<head runat="server">
    <title>添加员工信息</title>
    <link rel=Stylesheet type="text/css" href="../../CSS/Mispersonal.css" />
    <script language="JavaScript" src="../../Js/Calendar30.js"></script>
</head>
<body>
    <form id="form1" runat="server">
    <div>
        <uc1:Header ID="Header1" runat="server" />
        &nbsp; &nbsp; &nbsp;
        &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;
        <div style="z-index: 101; left: 236px; width: 531px; position: absolute; top: 225px;
            height: 212px">
            <table cellpadding="0" cellspacing="0" align="center" style="width: 558px" id="TABLE1" runat="server">
                <tr>
                    <td colspan="3" style="height: 21px" bgcolor="#66c2de" align="center">
                        添加员工信息</td>
                </tr>
                <tr>
                    <td style="width: 363px; height: 35px;">
                        &nbsp; &nbsp; &nbsp;
                        员工编号:</td>
                    <td style="width: 201px; height: 35px;">
        <asp:TextBox ID="tb_id" runat="server"></asp:TextBox></td>
                    <td style="width: 177px; height: 35px;">
                    </td>
                </tr>
                <tr>
                    <td style="width: 363px; height: 35px;">
                        &nbsp; &nbsp; &nbsp;
                        员工姓名:</td>
                    <td style="width: 201px; height: 35px;">
                        <asp:TextBox ID="tb_name" runat="server"></asp:TextBox></td>
                    <td style="width: 177px; height: 35px;">
                    </td>
                </tr>
                <tr>
                    <td style="width: 363px; height: 35px;">
                        &nbsp; &nbsp; &nbsp;
                        员工性别:</td>
                    <td style="width: 201px; height: 35px;">
                    <asp:DropDownList ID="sex" runat="server">
                        <asp:ListItem>男</asp:ListItem>
                        <asp:ListItem>女</asp:ListItem>
        </asp:DropDownList></td>
                    <td style="width: 177px; height: 35px;">
                    </td>
                </tr>
                <tr>
                    <td style="width: 363px; height: 35px;">
                        &nbsp; &nbsp; &nbsp;
                        出生年月:</td>
                    <td style="width: 201px; height: 35px;">
                        <asp:TextBox ID="tb_birth" runat="server"></asp:TextBox></td>
                    <td style="width: 177px;" rowspan="4" align="center">
                        &nbsp; &nbsp; &nbsp;&nbsp;
                        <asp:Image ID="Image1" runat="server" Height="108px" Width="123px" /></td>
                </tr>
                <tr>
                    <td style="width: 363px; height: 35px;">
                        &nbsp; &nbsp; &nbsp;
                        联系电话:</td>
                    <td style="width: 201px; height: 35px;">
        <asp:TextBox ID="tb_tel" runat="server"></asp:TextBox></td>
                </tr>
                <tr>
                    <td style="width: 363px; height: 35px;">
                        &nbsp; &nbsp; &nbsp;
                        联系地址:</td>
                    <td style="width: 201px; height: 35px;">
        <asp:TextBox ID="tb_address" runat="server"></asp:TextBox></td>
                </tr>
                 <tr>
                    <td style="width: 363px; height: 35px;">
                        &nbsp; &nbsp; &nbsp; 员工头像:</td>
                    <td style="width: 201px; height: 35px;">
                        <asp:DropDownList ID="picurl" runat="server">
                            <asp:ListItem>1</asp:ListItem>
                            <asp:ListItem>2</asp:ListItem>
                            <asp:ListItem>3</asp:ListItem>
                            <asp:ListItem>4</asp:ListItem>
                            <asp:ListItem>5</asp:ListItem>
                        </asp:DropDownList></td>
                </tr>
                <tr>
                    <td style="width: 363px; height: 35px;">
                        &nbsp; &nbsp; &nbsp; &nbsp; 所属部门:</td>
                    <td style="width: 201px; height: 35px;">
                        <asp:DropDownList ID="Agreer" runat="server">
                        </asp:DropDownList></td>
                    <td style="width: 177px; height: 35px;">
                    </td>
                </tr>
                 <tr>
                    <td style="width: 363px; height: 60px;" align="center">
                        &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; 个人简介:</td>
                    <td colspan="2" style="height: 60px">
        <asp:TextBox ID="tb_intro" runat="server" Columns="50" Rows="5" TextMode="MultiLine" ></asp:TextBox></td>
                </tr>
                <tr>
                    <td colspan="3" style="height: 35px">
                        &nbsp; &nbsp; &nbsp;
        <asp:Button ID="add" runat="server" Text="添加" OnClick="add_Click" />
                        &nbsp; &nbsp;&nbsp;&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;
                        &nbsp; &nbsp; &nbsp;<asp:Button ID="cancel" runat="server" Text="重置" OnClick="cancel_Click" /></td>
                </tr>
            </table>
        </div>
        <uc3:Left_Navlist ID="Left_Navlist1" runat="server" />
    
    </div>
    </form>
</body>
</html>
