package com.ensim.escm.plugin.ensimvdc.common;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Kisna
 * Date: 9/13/13
 * Time: 7:58 AM
 * To change this template use File | Settings | File Templates.
 */
@XmlRootElement
public class UserRoleContainer implements Serializable {

    private List<IVMUserRole> userRoleList;

    public List<IVMUserRole> getUserRoleList() {
        return userRoleList;
    }
    @XmlElement
    public void setUserRoleList(List<IVMUserRole> userRoleList) {
        this.userRoleList = userRoleList;
    }




}
