package com.ensim.escm.plugin.ensimvdc.common;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@XmlRootElement
public class VirtualMachine implements Serializable {

    private String installedOS;
    private String osTYPE;
    private String extIdentifier;
    private String hostName;
    private String vmDisplayName;
    private String vmOwner;
    private Double memoryInGB;
    private int noOfCPUCore;
    private Double diskSpaceInGB;
    private List<String> internalIPAddress;
    private List<String> externalIPAddress;
    private String vmTemplate;
    private String vmTemplateId;
    private Boolean bootVM;
    private String vmStatus;
    private Date creationDate;
    private Date lastModificationDate;
    private String organizationID;
    private String miscDataXML;
    private String vmDescription;
    private String accessInformation;

    private List<IVMHdd> hddList;
    private List<IVMNic> nicList;
    private boolean isVappVM;
    private List<String> ipRequestNotes;


    public List<String> getIpRequestNotes() {
        return ipRequestNotes;
    }
    @XmlElement
    public void setIpRequestNotes(List<String> ipRequestNotes) {
        this.ipRequestNotes = ipRequestNotes;
    }


    public boolean isVappVM() {
        return isVappVM;
    }

    @XmlElement
    public void setVappVM(boolean vappVM) {
        isVappVM = vappVM;
    }

    public List<IVMHdd> getHddList() {
        return hddList;
    }

    @XmlElement
    public void setHddList(List<IVMHdd> hddList) {
        this.hddList = hddList;
    }

    public List<IVMNic> getNicList() {
        return nicList;
    }

    @XmlElement
    public void setNicList(List<IVMNic> nicList) {
        this.nicList = nicList;
    }

    public String getExtIdentifier() {
        return extIdentifier;
    }

    @XmlElement
    public void setExtIdentifier(String extIdentifier) {
        this.extIdentifier = extIdentifier;
    }

    public String getHostName() {
        return hostName;
    }

    @XmlElement
    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public String getVmOwner() {
        return vmOwner;
    }

    @XmlElement
    public void setVmOwner(String vmOwner) {
        this.vmOwner = vmOwner;
    }

    public String getVmTemplate() {
        return vmTemplate;
    }

    @XmlElement
    public void setVmTemplate(String vmTemplate) {
        this.vmTemplate = vmTemplate;
    }
    public List<String> getExternalIPAddress() {
        return externalIPAddress;
    }
    @XmlElement
    public void setExternalIPAddress(List<String> externalIPAddress) {
        this.externalIPAddress = externalIPAddress;
    }

    public String getVmTemplateId() {
        return vmTemplateId;
    }

    @XmlElement
    public void setVmTemplateId(String vmTemplateId) {
        this.vmTemplateId = vmTemplateId;
    }
    public Boolean getBootVM() {
        return bootVM;
    }

    @XmlElement
    public void setBootVM(Boolean bootVM) {
        this.bootVM = bootVM;
    }

    public String getVmDisplayName() {
        return vmDisplayName;
    }

    @XmlElement
    public void setVmDisplayName(String vmDisplayName) {
        this.vmDisplayName = vmDisplayName;
    }

    public Double getMemoryInGB() {
        return memoryInGB;
    }

    @XmlElement
    public void setMemoryInGB(Double memoryInGB) {
        this.memoryInGB = memoryInGB;
    }

    public int getnoOfCPUCore() {
        return noOfCPUCore;
    }

    @XmlElement
    public void setnoOfCPUCore(int noOfCpuCore) {
        this.noOfCPUCore = noOfCpuCore;
    }

    public Double getDiskSpaceInGB() {
        return diskSpaceInGB;
    }

    @XmlElement
    public void setDiskSpaceInGB(Double diskSpaceInGB) {
        this.diskSpaceInGB = diskSpaceInGB;
    }

    public List<String> getInternalIPAddress() {
        return internalIPAddress;
    }

    @XmlElement
    public void setInternalIPAddress(List<String> strIPAddress) {
        this.internalIPAddress = strIPAddress;
    }

    public String getVmStatus() {
        return vmStatus;
    }

    @XmlElement
    public void setVmStatus(String vmStatus) {
        this.vmStatus = vmStatus;
    }

    public String getInstalledOS() {
        return installedOS;
    }

    @XmlElement
    public void setInstalledOS(String installedOS) {
        this.installedOS = installedOS;
    }

    public String getOsTYPE() {
        return osTYPE;
    }

    @XmlElement
    public void setOsTYPE(String osTYPE) {
        this.osTYPE = osTYPE;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    @XmlElement
    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Date getLastModificationDate() {
        return lastModificationDate;
    }

    @XmlElement
    public void setLastModificationDate(Date lastModificationDate) {
        this.lastModificationDate = lastModificationDate;
    }

    public String getOrganizationID() {
        return organizationID;
    }

    @XmlElement
    public void setOrganizationID(String organizationID) {
        this.organizationID = organizationID;
    }

    public String getMiscDataXML() {
        return miscDataXML;
    }

    @XmlElement
    public void setMiscDataXML(String miscDataXML) {
        this.miscDataXML = miscDataXML;
    }

    public String getVmDescription() {
        return vmDescription;
    }

    @XmlElement
    public void setVmDescription(String vmDescription) {
        this.vmDescription = vmDescription;
    }

    public String getAccessInformation() {
        return accessInformation;
    }

    @XmlElement
    public void setAccessInformation(String accessInformation) {
        this.accessInformation = accessInformation;
    }
}
