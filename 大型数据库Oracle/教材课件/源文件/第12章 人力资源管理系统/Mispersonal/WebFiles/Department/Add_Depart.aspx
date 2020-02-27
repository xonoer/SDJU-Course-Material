<%@ Page Language="C#" AutoEventWireup="true" CodeFile="Add_Depart.aspx.cs" Inherits="WebFiles_Department_Add_Depart" %>
<%@ Register Src="../../UserControl/Left_Navlist.ascx" TagName="Left_Navlist" TagPrefix="uc3" %>
<%@ Register Src="../../UserControl/Header.ascx" TagName="Header" TagPrefix="uc1" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml" >
<head runat="server">
    <title>添加部门信息</title>
    <link rel="Stylesheet" type="text/css" href="../../CSS/Mispersonal.css" />
</head>
<body>
    <form id="form1" runat="server">
    <div>
        <uc1:Header ID="Header1" runat="server" />
    
    </div>
        <br />
        &nbsp;
        <div style="z-index: 101; left: 260px; width: 458px; position: absolute; top: 225px;
            height: 257px">
            <table id="TABLE1" runat="server" cellpadding="0" cellspacing="0" align="center" style="width: 485px">
                <tr>
                    <td colspan="3" align="center" bgcolor="#66c2de" style="height: 25px">
                        添加部门信息</td>
                </tr>
                <tr>
                    <td style="width: 115px; height: 35px" align="center">
                  
                        部门编号:</td>
                    <td style="width: 140px; height: 35px;">
                        <asp:TextBox ID="tb_id" runat="server"></asp:TextBox></td>
                    <td style="width: 55px; height: 35px">
                    </td>
                </tr>
                <tr>
                    <td style="width: 115px; height: 35px" align="center">
                     
                        部门名称:</td>
                    <td style="width: 140px; height: 35px;">
                        <asp:TextBox ID="tb_name" runat="server"></asp:TextBox></td>
                    <td style="width: 55px; height: 35px">
                    </td>
                </tr>
                <tr>
                    <td style="width: 115px; height: 35px" align="center">
                     
                        联系方式:</td>
                    <td style="width: 140px; height: 35px">
                        <asp:TextBox ID="tb_tel" runat="server"></asp:TextBox></td>
                    <td style="height: 35px; width: 55px;">
                    </td>
                </tr>
                <tr>
                    <td style="width: 115px; height: 35px" align="center">
                   
                        联系地址:</td>
                    <td style="width: 140px; height: 35px;">
                        <asp:TextBox ID="tb_address" runat="server"></asp:TextBox></td>
                    <td style="width: 55px; height: 35px">
                    </td>
                </tr>
                <tr>
                    <td style="width: 115px; height: 35px" align="center">
                      
                        负责人:</td>
                    <td style="width: 140px; height: 35px;">
                        <asp:TextBox ID="tb_chief" runat="server"></asp:TextBox></td>
                    <td style="width: 55px; height: 35px">
                    </td>
                </tr>
                <tr>
                    <td style="width: 115px; height: 35px" align="center">
                  
                        所属部门:</td>
                    <td style="width: 140px; height: 35px;">
                        <asp:TextBox ID="tb_belong" runat="server"></asp:TextBox></td>
                    <td style="width: 55px; height: 35px">
                    </td>
                </tr>
                <tr>
                    <td style="height: 21px" colspan="2" align="center">
                      
                        <asp:Button ID="btn_add" runat="server" OnClick="btn_add_Click" Text="添加" />
                  
                        <asp:Button ID="btn_cancel" runat="server" Text="重置" /></td>
                    <td style="height: 21px; width: 55px;">
                    </td>
                </tr>
            </table>
        </div>
        <uc3:Left_Navlist ID="Left_Navlist1" runat="server" />
    </form>
</body>
</html>
