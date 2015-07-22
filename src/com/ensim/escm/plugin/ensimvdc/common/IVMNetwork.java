package com.ensim.escm.plugin.ensimvdc.common;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;


@XmlRootElement
public class IVMNetwork {
   private String name;
   private String description;
   private IVMEnums.NetworkType type;
   private Date  createdDate;
   private boolean isActive;
   private String gatewayAddress;
   private String networkMask;
   private String DNS1;
   private String DNS2;
   private String ipRange;
    private String id;
    public String getName() {
        return name;
    }
    @XmlElement
    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }
    @XmlElement
    public void setDescription(String description) {
        this.description = description;
    }

    public IVMEnums.NetworkType getType() {
        return type;
    }
    @XmlElement
    public void setType(IVMEnums.NetworkType type) {
        this.type = type;
    }

    public Date getCreatedDate() {
        return createdDate;
    }
    @XmlElement
    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public boolean isActive() {
        return isActive;
    }
    @XmlElement
    public void setActive(boolean active) {
        isActive = active;
    }

    public String getGatewayAddress() {
        return gatewayAddress;
    }
    @XmlElement
    public void setGatewayAddress(String gatewayAddress) {
        this.gatewayAddress = gatewayAddress;
    }

    public String getNetworkMask() {
        return networkMask;
    }
    @XmlElement
    public void setNetworkMask(String networkMask) {
        this.networkMask = networkMask;
    }

    public String getDNS1() {
        return DNS1;
    }
    @XmlElement
    public void setDNS1(String DNS1) {
        this.DNS1 = DNS1;
    }

    public String getDNS2() {
        return DNS2;
    }
    @XmlElement
    public void setDNS2(String DNS2) {
        this.DNS2 = DNS2;
    }

    public String getIpRange() {
        return ipRange;
    }
    @XmlElement
    public void setIpRange(String ipRange) {
        this.ipRange = ipRange;
    }

    public String getId() {
        return id;
    }
    @XmlElement
    public void setId(String id) {
        this.id = id;
    }
}
