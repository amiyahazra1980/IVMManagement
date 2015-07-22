package com.ensim.escm.plugin.ensimvdc.common;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Kisna
 * Date: 8/16/13
 * Time: 11:22 AM
 * To change this template use File | Settings | File Templates.
 */
@XmlRootElement
public class OSCategory implements Serializable {
    private String Name;
    private List<VMTemplate> vmTemplateList;

    public String getName() {
        return Name;
    }

    @XmlElement
    public void setName(String name) {
        Name = name;
    }
    public List<VMTemplate> getVmTemplateList() {
        return vmTemplateList;
    }
    @XmlElement
    public void setVmTemplateList(List<VMTemplate> vmTemplateList) {
        this.vmTemplateList = vmTemplateList;
    }
}
