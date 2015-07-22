package com.ensim.escm.plugin.ensimvdc.common;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;


@XmlRootElement
public class IVMRoleRight implements Serializable {
    private String RightID;
    private String RightName;
    private String RightDescription;

    public String getRightDescription() {
        return RightDescription;
    }

    @XmlElement
    public void setRightDescription(String rightDescription) {
        RightDescription = rightDescription;
    }

    public String getRightName() {
        return RightName;
    }

    @XmlElement
    public void setRightName(String rightName) {
        RightName = rightName;
    }

    public String getRightID() {
        return RightID;
    }

    @XmlElement
    public void setRightID(String rightID) {
        RightID = rightID;
    }


}
