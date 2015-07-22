package com.ensim.escm.plugin.ensimvdc.common;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.List;

@XmlRootElement
public class IVMUser implements Serializable {
    private String Id;
    private String UserName;
    private String UserFullName;
    private IVMUserRole Role;
    //private String RoleDescription;
    private String EmailAddress;

    private List<String> vmNames;

    private String escmCustomerUserId;


    //Added by AM
    private String userUPN;
    public String getUserUPN() {
        return userUPN;
    }

    @XmlElement
    public void setUserUPN(String userUPN) {
        this.userUPN = userUPN;
    }


    public String getId() {
        return Id;
    }

    @XmlElement
    public void setId(String id) {
        Id = id;
    }

    public String getUserName() {
        return UserName;
    }

    @XmlElement
    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getUserFullName() {
        return UserFullName;
    }

    @XmlElement
    public void setUserFullName(String userFullName) {
        UserFullName = userFullName;
    }

    public IVMUserRole getRole() {
        return Role;
    }

    @XmlElement
    public void setRole(IVMUserRole role) {
        Role = role;
    }

    /*public String getRoleDescription() {
        return RoleDescription;
    }

    public void setRoleDescription(String roleDescription) {
        RoleDescription = roleDescription;
    }*/

    public String getEmailAddress() {
        return EmailAddress;
    }

    @XmlElement
    public void setEmailAddress(String emailAddress) {
        EmailAddress = emailAddress;
    }

    public List<String> getVmNames() {
        return vmNames;
    }

    @XmlElement
    public void setVmNames(List<String> vmNames) {
        this.vmNames = vmNames;
    }
    public String getEscmCustomerUserId() {
        return escmCustomerUserId;
    }

    @XmlElement
    public void setEscmCustomerUserId(String escmCustomerUserId) {
        this.escmCustomerUserId = escmCustomerUserId;
    }
}
