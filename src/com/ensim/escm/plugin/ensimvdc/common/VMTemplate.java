package com.ensim.escm.plugin.ensimvdc.common;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: User
 * Date: 2/8/13
 * Time: 12:05 PM
 * To change this template use File | Settings | File Templates.
 */
@XmlRootElement
public class VMTemplate implements Serializable {
    private String Id;
    private String templateName;
    private String templateCode;
    private String templateDescription;
    private String osName;
    private String osType;
    private Double memoryInGB;
    private int cpuCore;
    private Double diskSpaceInGB;
    private String miscDataXML;
    private String cpuArchitecture;
    private String organizationID;

    //------Added by AM------
    private List<IVMHdd> hddList;
    private List<IVMNic> nicList;

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



    public String getId() {
        return Id;
    }

    @XmlElement
    public void setId(String id) {
        this.Id = id;
    }

    public Double getDiskSpaceInGB() {
        return diskSpaceInGB;
    }

    @XmlElement
    public void setDiskSpaceInGB(Double diskSpaceInGB) {
        this.diskSpaceInGB = diskSpaceInGB;
    }

    public int getCpuCore() {
        return cpuCore;
    }

    @XmlElement
    public void setCpuCore(int cpuCore) {
        this.cpuCore = cpuCore;
    }

    public String getTemplateName() {
        return templateName;
    }

    @XmlElement
    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    public String getTemplateCode() {
        return templateCode;
    }

    @XmlElement
    public void setTemplateCode(String templateCode) {
        this.templateCode = templateCode;
    }

    public String getTemplateDescription() {
        return templateDescription;
    }

    @XmlElement
    public void setTemplateDescription(String templateDescription) {
        this.templateDescription = templateDescription;
    }

    public String getOsName() {
        return osName;
    }

    @XmlElement
    public void setOsName(String osName) {
        this.osName = osName;
    }

    public String getOsType() {
        return osType;
    }

    @XmlElement
    public void setOsType(String osType) {
        this.osType = osType;
    }

    public Double getMemoryInGB() {
        return memoryInGB;
    }

    @XmlElement
    public void setMemoryInGB(Double memoryInGB) {
        this.memoryInGB = memoryInGB;
    }

    public String getMiscDataXML() {
        return miscDataXML;
    }

    @XmlElement
    public void setMiscDataXML(String miscDataXML) {
        this.miscDataXML = miscDataXML;
    }

    public String getOrganizationID() {
        return organizationID;
    }

    @XmlElement
    public void setOrganizationID(String organizationID) {
        this.organizationID = organizationID;
    }
    public String getCpuArchitecture() {
        return cpuArchitecture;
    }

    @XmlElement
    public void setCpuArchitecture(String cpuArchitecture) {
        this.cpuArchitecture = cpuArchitecture;
    }
}
