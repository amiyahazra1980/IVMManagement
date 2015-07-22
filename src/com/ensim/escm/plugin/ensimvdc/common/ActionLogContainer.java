package com.ensim.escm.plugin.ensimvdc.common;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.List;

@XmlRootElement
public class ActionLogContainer implements Serializable {
    private List<VMActionLog> vmActionLogs;

    public List<VMActionLog> getVmActionLogs() {
        return vmActionLogs;
    }
    @XmlElement
    public void setVmActionLogs(List<VMActionLog> vmActionLogs) {
        this.vmActionLogs = vmActionLogs;
    }


}
