package com.ensim.escm.plugin.ensimvdc.common;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: User
 * Date: 2/8/13
 * Time: 12:14 PM
 * To change this template use File | Settings | File Templates.
 */
@XmlRootElement
public class TemplateContainer implements Serializable {

    private List<OSCategory> osCategoryList;
    public List<OSCategory> getOsCategoryList() {
        return osCategoryList;
    }

    @XmlElement
    public void setOsCategoryList(List<OSCategory> osCategoryList) {
        this.osCategoryList = osCategoryList;
    }

}


