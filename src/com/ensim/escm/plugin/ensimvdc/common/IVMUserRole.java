package com.ensim.escm.plugin.ensimvdc.common;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Kisna
 * Date: 9/13/13
 * Time: 7:43 AM
 * To change this template use File | Settings | File Templates.
 */
@XmlRootElement
public class IVMUserRole implements Serializable {

    private String RoleID;
    private String RoleName;
    private String Description;
    private List<IVMRoleRight> roleRightList;

    public String getRoleID() {
        return RoleID;
    }

    @XmlElement
    public void setRoleID(String roleID) {
        RoleID = roleID;
    }

    public String getRoleName() {
        return RoleName;
    }

    @XmlElement
    public void setRoleName(String roleName) {
        RoleName = roleName;
    }

    public String getDescription() {
        return Description;
    }

    @XmlElement
    public void setDescription(String description) {
        Description = description;
    }

    public List<IVMRoleRight> getRoleRightList() {
        return roleRightList;
    }

    @XmlElement
    public void setRoleRightList(List<IVMRoleRight> roleRightList) {
        this.roleRightList = roleRightList;
    }


}
