package com.ensim.escm.plugin.ensimvdc.common;

import javax.xml.bind.annotation.XmlElement;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: Abhishek
 * Date: 3/13/15
 * Time: 12:41 PM
 * To change this template use File | Settings | File Templates.
 */
public class IVMNic {
    private String ID;
    private int vLanID;
    private String networkIP;
    private Date creationDate;
    private String miscXML;
    private String description;

    private String networkName;
    private String nicName;
    private boolean isPrimary;
    private String nicOperationType;
    private String vmSubnetMask;
    private String vmGateway;

    public String getVmGateway() {
        return vmGateway;
    }

    @XmlElement
    public void setVmGateway(String vmGateway) {
        this.vmGateway = vmGateway;
    }

    public String getVmSubnetMask() {
        return vmSubnetMask;
    }

    @XmlElement
    public void setVmSubnetMask(String vmSubnetMask) {
        this.vmSubnetMask = vmSubnetMask;
    }

    public String getNicOperationType() {
        return nicOperationType;
    }

    @XmlElement
    public void setNicOperationType(String nicOperationType) {
        this.nicOperationType = nicOperationType;
    }
    public String getNicName() {
        return nicName;
    }

    @XmlElement
    public void setNicName(String nicName) {
        this.nicName = nicName;
    }

    public String getNetworkName() {
        return networkName;
    }

    @XmlElement
    public void setNetworkName(String networkName) {
        this.networkName = networkName;
    }

    public boolean isPrimary() {
        return isPrimary;
    }

    @XmlElement
    public void setPrimary(boolean primary) {
        isPrimary = primary;
    }
    public Date getCreationDate() {
        return creationDate;
    }

    @XmlElement
    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public String getID() {
        return ID;
    }

    @XmlElement
    public void setID(String ID) {
        this.ID = ID;
    }

    public int getvLanID() {
        return vLanID;
    }

    @XmlElement
    public void setvLanID(int vLanID) {
        this.vLanID = vLanID;
    }

    public String getNetworkIP() {
        return networkIP;
    }

    @XmlElement
    public void setNetworkIP(String networkIP) {
        this.networkIP = networkIP;
    }

    public String getMiscXML() {
        return miscXML;
    }

    @XmlElement
    public void setMiscXML(String miscXML) {
        this.miscXML = miscXML;
    }

    public String getDescription() {
        return description;
    }

    @XmlElement
    public void setDescription(String description) {
        this.description = description;
    }

}
