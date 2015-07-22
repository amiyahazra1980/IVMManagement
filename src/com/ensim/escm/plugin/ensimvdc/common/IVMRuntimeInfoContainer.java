package com.ensim.escm.plugin.ensimvdc.common;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Kisna
 * Date: 3/13/14
 * Time: 10:24 AM
 * To change this template use File | Settings | File Templates.
 */
@XmlRootElement
public class IVMRuntimeInfoContainer {

    private List<IVMRuntimeInfo> runtimeInfoList;

    public List<IVMRuntimeInfo> getRuntimeInfoList() {
        return runtimeInfoList;
    }
    @XmlElement
    public void setRuntimeInfoList(List<IVMRuntimeInfo> runtimeInfoList) {
        this.runtimeInfoList = runtimeInfoList;
    }
}
