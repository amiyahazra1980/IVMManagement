package com.ensim.escm.plugin.ensimvdc.common;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.List;

@XmlRootElement
public class UserContainer implements Serializable {
    private List<IVMUser> userList;
    public List<IVMUser> getUserList() {
        return userList;
    }

    @XmlElement
    public void setUserList(List<IVMUser> userList) {
        this.userList = userList;
    }




}
