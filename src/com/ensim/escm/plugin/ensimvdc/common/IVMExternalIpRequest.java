package com.ensim.escm.plugin.ensimvdc.common;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class IVMExternalIpRequest {

    private String IpAddress;
    private String VmId;
    private String RequestStatus;
    private String Instruction;

    public String getIpAddress() {
        return IpAddress;
    }
    @XmlElement
    public void setIpAddress(String ipAddress) {
        IpAddress = ipAddress;
    }

    public String getVmId() {
        return VmId;
    }
    @XmlElement
    public void setVmId(String vmId) {
        VmId = vmId;
    }

    public String getRequestStatus() {
        return RequestStatus;
    }
    @XmlElement
    public void setRequestStatus(String requestStatus) {
        RequestStatus = requestStatus;
    }

    public String getInstruction() {
        return Instruction;
    }
    @XmlElement
    public void setInstruction(String instruction) {
        Instruction = instruction;
    }

}
