package com.ensim.escm.plugin.ensimvdc.common;

import javax.xml.bind.annotation.XmlElement;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: Abhishek
 * Date: 3/13/15
 * Time: 12:40 PM
 * To change this template use File | Settings | File Templates.
 */
public class IVMHdd {
    private String ID;
    private String type;
    private double sizeInGB;
    private String name;
    private String path;
    private boolean isPrimary;
    private String description;
    private int unitNumber;
    private double usedInGB;
    private Date creationDate;
    private String miscXML;
    private String hddOperationType;

    public String getHddOperationType() {
        return hddOperationType;
    }

    @XmlElement
    public void setHddOperationType(String hddOperationType) {
        this.hddOperationType = hddOperationType;
    }


    public int getUnitNumber() {
        return unitNumber;
    }

    @XmlElement
    public void setUnitNumber(int unitNumber) {
        this.unitNumber = unitNumber;
    }

    public String getID() {
        return ID;
    }

    @XmlElement
    public void setID(String ID) {
        this.ID = ID;
    }

    public String getType() {
        return type;
    }

    @XmlElement
    public void setType(String type) {
        this.type = type;
    }

    public double getSizeInGB() {
        return sizeInGB;
    }

    @XmlElement
    public void setSizeInGB(double sizeInGB) {
        this.sizeInGB = sizeInGB;
    }

    public String getName() {
        return name;
    }

    @XmlElement
    public void setName(String name) {
        this.name = name;
    }

    public String getPath() {
        return path;
    }

    @XmlElement
    public void setPath(String path) {
        this.path = path;
    }

    public boolean isPrimary() {
        return isPrimary;
    }

    @XmlElement
    public void setPrimary(boolean primary) {
        isPrimary = primary;
    }

    public String getDescription() {
        return description;
    }

    @XmlElement
    public void setDescription(String description) {
        this.description = description;
    }

    public double getUsedInGB() {
        return usedInGB;
    }

    @XmlElement
    public void setUsedInGB(double usedInGB) {
        this.usedInGB = usedInGB;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    @XmlElement
    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public String getMiscXML() {
        return miscXML;
    }

    @XmlElement
    public void setMiscXML(String miscXML) {
        this.miscXML = miscXML;
    }

}
