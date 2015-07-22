package com.ensim.escm.plugin.ensimvdc.common;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: User
 * Date: 2/8/13
 * Time: 11:17 AM
 * To change this template use File | Settings | File Templates.
 */
@XmlRootElement
public class VMContainer implements Serializable {
    private List<VirtualMachine> virtualMachineList;

    public List<VirtualMachine> getVirtualMachineList() {
        return virtualMachineList;
    }

    @XmlElement
    public void setVirtualMachineList(List<VirtualMachine> virtualMachineList) {
        this.virtualMachineList = virtualMachineList;
    }

}

