<%@ Control Language="C#" AutoEventWireup="true" CodeFile="Left_Navlist.ascx.cs" Inherits="Control_WebUserControl" %>
&nbsp;
<div style="z-index: 101; left: 1px; width: 159px; position: absolute; top: 207px;
    height: 419px">
    &nbsp;<table cellpadding="0" cellspacing="0" style="width: 201px">
        <tr>
            <td style="width: 107px" align="center" bgcolor="#66c2de">
                </td>
        </tr>
        <tr>
            <td style="width: 107px">
    <asp:TreeView ID="indexnav" runat="server" Height="448px" ImageSet="Faq" Width="162px">
        <ParentNodeStyle Font-Bold="False" />
        <HoverNodeStyle Font-Underline="True" ForeColor="Purple" />
        <SelectedNodeStyle Font-Underline="True" HorizontalPadding="0px" VerticalPadding="0px" />
        <Nodes>
            <asp:TreeNode Text="人事资源管理信息系统" Value="人事资源管理信息系统" NavigateUrl="~/Index.aspx">
                <asp:TreeNode Text="人力资源管理" Value="人力资源管理" SelectAction="None">
                    <asp:TreeNode Text="部门信息管理" Value="部门信息管理" SelectAction="None">
                        <asp:TreeNode Text="添加部门信息" Value="添加部门信息" NavigateUrl="~/WebFiles/Department/Add_Depart.aspx"></asp:TreeNode>
                        <asp:TreeNode Text="部门信息列表" Value="部门信息列表" NavigateUrl="~/WebFiles/Department/List_Depart.aspx"></asp:TreeNode>
                        <asp:TreeNode NavigateUrl="~/WebFiles/Department/Search_Depart.aspx" Text="部门信息查询"
                            Value="部门信息查询"></asp:TreeNode>
                    </asp:TreeNode>
                    <asp:TreeNode Text="员工信息管理" Value="员工信息管理" SelectAction="None">
                        <asp:TreeNode Text="添加员工信息" Value="添加员工信息" NavigateUrl="~/WebFiles/Employee/Add_employee.aspx"></asp:TreeNode>
                        <asp:TreeNode Text="员工信息列表" Value="员工信息列表" NavigateUrl="~/WebFiles/Employee/List_employee.aspx"></asp:TreeNode>
                        <asp:TreeNode NavigateUrl="~/WebFiles/Employee/Search_employee.aspx" Text="员工信息查询"
                            Value="员工信息查询"></asp:TreeNode>
                    </asp:TreeNode>
                </asp:TreeNode>
                <asp:TreeNode Text="考勤管理" Value="考勤管理" SelectAction="None">
                    <asp:TreeNode Text="考勤规则" Value="考勤规则" NavigateUrl="~/WebFiles/Attendece/Attendece_rule.aspx">
                        <asp:TreeNode NavigateUrl="~/WebFiles/Attendece/Attendece_rule_Edit.aspx" Text="编辑考勤规则"
                            Value="编辑考勤规则"></asp:TreeNode>
                    </asp:TreeNode>
                    <asp:TreeNode Text="考勤结果" Value="考勤结果" NavigateUrl="~/WebFiles/Attendece/Attendece_result.aspx">
                    </asp:TreeNode>
                    <asp:TreeNode Text="假别管理" Value="假别管理" NavigateUrl="~/WebFiles/Leaver/Leaver_kind.aspx">
                        <asp:TreeNode NavigateUrl="~/WebFiles/Leaver/Add_leaver_kind.aspx" Text="添加假别" Value="添加假别">
                        </asp:TreeNode>
                    </asp:TreeNode>
                    <asp:TreeNode Text="请假记录" Value="请假记录" NavigateUrl="~/WebFiles/Leaver/Leaver_recordset.aspx">
                        <asp:TreeNode NavigateUrl="~/WebFiles/Leaver/Add_Leaver.aspx" Text="员工考勤登记" Value="员工考勤登记">
                        </asp:TreeNode>
                    </asp:TreeNode>
                </asp:TreeNode>
                <asp:TreeNode Text="系统管理" Value="系统管理" SelectAction="None">
                    <asp:TreeNode Text="用户列表" Value="用户列表" NavigateUrl="~/WebFiles/User/User_List.aspx"></asp:TreeNode>
                    <asp:TreeNode Text="添加用户" Value="添加用户" NavigateUrl="~/WebFiles/User/User_registor.aspx"></asp:TreeNode>
                    <asp:TreeNode NavigateUrl="~/WebFiles/User/User_search.aspx" Text="用户查询" Value="用户查询">
                    </asp:TreeNode>
                    <asp:TreeNode NavigateUrl="~/Default.aspx" Text="用户注销" Value="用户注销"></asp:TreeNode>
                </asp:TreeNode>
            </asp:TreeNode>
        </Nodes>
        <NodeStyle Font-Names="Tahoma" Font-Size="8pt" ForeColor="DarkBlue" HorizontalPadding="5px"
            NodeSpacing="0px" VerticalPadding="0px" />
        <DataBindings>
            <asp:TreeNodeBinding DataMember="人事资源管理系统" Text="人事资源管理系统" Value="人事资源管理系统" />
            <asp:TreeNodeBinding />
            <asp:TreeNodeBinding />
            <asp:TreeNodeBinding />
            <asp:TreeNodeBinding />
            <asp:TreeNodeBinding />
        </DataBindings>
    </asp:TreeView>
            </td>
        </tr>
        <tr>
            <td style="width: 107px; height: 21px">
            </td>
        </tr>
    </table>
</div>
