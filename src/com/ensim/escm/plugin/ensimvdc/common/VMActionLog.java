package com.ensim.escm.plugin.ensimvdc.common;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;

@XmlRootElement
public class VMActionLog {
    private String ActionName;
    private String ActionType;
    private String Owner;
    private Date StartDate;
    private Date EndDate;
    private String Status;
    private String Description;
    private String Message;

    public String getActionName() {
        return ActionName;
    }

    @XmlElement
    public void setActionName(String actionName) {
        ActionName = actionName;
    }

    public String getActionType() {
        return ActionType;
    }

    @XmlElement
    public void setActionType(String actionType) {
        ActionType = actionType;
    }

    public String getOwner() {
        return Owner;
    }

    @XmlElement
    public void setOwner(String owner) {
        Owner = owner;
    }

    public Date getStartDate() {
        return StartDate;
    }

    @XmlElement
    public void setStartDate(Date startDate) {
        StartDate = startDate;
    }

    public Date getEndDate() {
        return EndDate;
    }

    @XmlElement
    public void setEndDate(Date endDate) {
        EndDate = endDate;
    }

    public String getStatus() {
        return Status;
    }

    @XmlElement
    public void setStatus(String status) {
        Status = status;
    }

    public String getDescription() {
        return Description;
    }

    @XmlElement
    public void setDescription(String description) {
        this.Description = description;
    }

    public String getMessage() {
        return Message;
    }

    @XmlElement
    public void setMessage(String message) {
        Message = message;
    }

}
