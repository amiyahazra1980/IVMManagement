package com.ensim.escm.plugin.ensimvdc.common;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Kisna
 * Date: 8/19/13
 * Time: 6:45 PM
 * To change this template use File | Settings | File Templates.
 */
@XmlRootElement
public class VMSnapshotContainer {

    private List<VMSnapshot> vmSnapshotList;

    public List<VMSnapshot> getVmSnapshotList() {
        return vmSnapshotList;
    }
    @XmlElement
    public void setVmSnapshotList(List<VMSnapshot> vmSnapshotList) {
        this.vmSnapshotList = vmSnapshotList;
    }



}
