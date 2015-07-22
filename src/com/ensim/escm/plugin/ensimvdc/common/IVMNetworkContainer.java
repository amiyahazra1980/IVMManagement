package com.ensim.escm.plugin.ensimvdc.common;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Kisna
 * Date: 3/25/14
 * Time: 3:48 PM
 * To change this template use File | Settings | File Templates.
 */
@XmlRootElement
public class IVMNetworkContainer {
    private List<IVMNetwork> networkList;

    public List<IVMNetwork> getNetworkList() {
        return networkList;
    }
    @XmlElement
    public void setNetworkList(List<IVMNetwork> networkList) {
        this.networkList = networkList;
    }
}
