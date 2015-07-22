package com.ensim.escm.plugin.ensimvdc.common;


import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class IVMRemoteLoginInfo {
    private String acquireTicket;
    private String host;
    private String vmId;
    private String vmIP;
    private String extInfo;
    public String getAcquireTicket() {
        return acquireTicket;
    }
    @XmlElement
    public void setAcquireTicket(String acquireTicket) {
        this.acquireTicket = acquireTicket;
    }

    public String getHost() {
        return host;
    }
    @XmlElement
    public void setHost(String host) {
        this.host = host;
    }

    public String getVmId() {
        return vmId;
    }
    @XmlElement
    public void setVmId(String vmId) {
        this.vmId = vmId;
    }


    public String getVmIP() {
        return vmIP;
    }
    @XmlElement
    public void setVmIP(String vmIP) {
        this.vmIP = vmIP;
    }

    public String getExtInfo() {
        return extInfo;
    }
    @XmlElement
    public void setExtInfo(String extInfo) {
        this.extInfo = extInfo;
    }
}
