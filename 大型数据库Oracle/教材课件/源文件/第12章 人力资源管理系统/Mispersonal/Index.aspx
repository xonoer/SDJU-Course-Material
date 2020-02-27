<%@ Page Language="C#" AutoEventWireup="true" CodeFile="Index.aspx.cs" Inherits="Index" %>
<%@ Register Src="~/UserControl/Left_Navlist.ascx" TagName="Left_Navlist" TagPrefix="uc2" %>
<%@Register TagPrefix="uc1" TagName="Header" Src="~/UserControl/Header.ascx"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml" >
<head runat="server">
    <title>人事管理信息系统</title>
<link rel=Stylesheet  type="text/css" href="CSS/Mispersonal.css" media=all />
</head>
<body>
    <form id="form1" runat="server">
     <uc1:Header ID="Header1" runat="server" />
        &nbsp;&nbsp;<br />
        <uc2:Left_Navlist ID="Left_Navlist1" runat="server" />
    </form>
    
</body>
</html>
