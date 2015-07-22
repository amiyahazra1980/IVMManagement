package com.ensim.escm.plugin.ensimvdc.common;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;
import java.util.List;

@XmlRootElement
public class IVMRuntimeInfo {
    private String powerState;
    private Double maxCpuUsage;
    private Double maxMemoryUsage;
    private Double memoryOverhead;
    private Double maxCupAssigned;
    private Double maxMemoryAssignedGB;
    private Double maxHddAssignedGB;
    private Double maxHddUsage;
    private int  numMksConnection;
    private Boolean onlineStandby;
    private long suspendInterval;
    private Date suspendedTime;
    private Date bootTime;
    private String connectionState;
    private String vmId;
    private String vmName;
    private String vmHostName;
    private List<String> internalIp;
    private List<String> externalIp;

    public Double getMaxHddAssignedGB() {
        return maxHddAssignedGB;
    }

    @XmlElement
    public void setMaxHddAssignedGB(Double maxHddAssignedGB) {
        this.maxHddAssignedGB = maxHddAssignedGB;
    }

    public String getPowerState() {
        return powerState;
    }

    @XmlElement
    public void setPowerState(String powerState) {
        this.powerState = powerState;
    }

    public Double getMaxCpuUsage() {
        return maxCpuUsage;
    }

    @XmlElement
    public void setMaxCpuUsage(Double maxCpuUsage) {
        this.maxCpuUsage = maxCpuUsage;
    }

    public Double getMaxMemoryUsage() {
        return maxMemoryUsage;
    }

    @XmlElement
    public void setMaxMemoryUsage(Double maxMemoryUsage) {
        this.maxMemoryUsage = maxMemoryUsage;
    }

    public Double getMemoryOverhead() {
        return memoryOverhead;
    }

    @XmlElement
    public void setMemoryOverhead(Double memoryOverhead) {
        this.memoryOverhead = memoryOverhead;
    }

    public Double getMaxCupAssigned() {
        return maxCupAssigned;
    }

    @XmlElement
    public void setMaxCupAssigned(Double maxCupAssigned) {
        this.maxCupAssigned = maxCupAssigned;
    }

    public Double getMaxMemoryAssignedGB() {
        return maxMemoryAssignedGB;
    }

    @XmlElement
    public void setMaxMemoryAssignedGB(Double maxMemoryAssignedGB) {
        this.maxMemoryAssignedGB = maxMemoryAssignedGB;
    }

    public int getNumMksConnection() {
        return numMksConnection;
    }

    @XmlElement
    public void setNumMksConnection(int numMksConnection) {
        this.numMksConnection = numMksConnection;
    }

    public Boolean getOnlineStandby() {
        return onlineStandby;
    }

    @XmlElement
    public void setOnlineStandby(Boolean onlineStandby) {
        this.onlineStandby = onlineStandby;
    }

    public long getSuspendInterval() {
        return suspendInterval;
    }

    @XmlElement
    public void setSuspendInterval(long suspendInterval) {
        this.suspendInterval = suspendInterval;
    }

    public Date getSuspendedTime() {
        return suspendedTime;
    }

    @XmlElement
    public void setSuspendedTime(Date suspendedTime) {
        this.suspendedTime = suspendedTime;
    }

    public Date getBootTime() {
        return bootTime;
    }

    @XmlElement
    public void setBootTime(Date bootTime) {
        this.bootTime = bootTime;
    }

    public String getConnectionState() {
        return connectionState;
    }

    @XmlElement
    public void setConnectionState(String connectionState) {
        this.connectionState = connectionState;
    }
    public String getVmHostName() {
        return vmHostName;
    }
    @XmlElement
    public void setVmHostName(String vmHostName) {
        this.vmHostName = vmHostName;
    }

    public String getVmId() {
        return vmId;
    }
    @XmlElement
    public void setVmId(String vmId) {
        this.vmId = vmId;
    }

    public String getVmName() {
        return vmName;
    }
    @XmlElement
    public void setVmName(String vmName) {
        this.vmName = vmName;
    }
    public List<String> getInternalIp() {
        return internalIp;
    }
    @XmlElement
    public void setInternalIp(List<String> internalIp) {
        this.internalIp = internalIp;
    }

    public List<String> getExternalIp() {
        return externalIp;
    }
    @XmlElement
    public void setExternalIp(List<String> externalIp) {
        this.externalIp = externalIp;
    }


    public Double getMaxHddUsage() {
        return maxHddUsage;
    }
    @XmlElement
    public void setMaxHddUsage(Double maxHddUsage) {
        this.maxHddUsage = maxHddUsage;
    }
}
