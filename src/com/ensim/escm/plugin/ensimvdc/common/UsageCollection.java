package com.ensim.escm.plugin.ensimvdc.common;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;
import java.util.Map;

@XmlRootElement
public class UsageCollection {
    private int totalVmsAllocated;
    private double totalMemoryAllocated ;
    private int totalCPUCoreAllocated;
    private double totalHardDiskAllocated ;
    private int totalNetworkAllocated ;
    private int totalVmsUsed;
    private double totalMemoryUsed;
    private int totalCPUCoreUsed;
    private double totalHardDiskUsed;
    private int totalNetworkUsed;
    private int totalIPAllocated ;
    private int totalIPUsed ;
    private Map<String,Integer> tieredStorageUsageData;
    //------Added by AAG-------
    private List<String> vlanList;
    //----------End------------


    public List<String> getVlanList() {
        return vlanList;
    }

    @XmlElement
    public void setVlanList(List<String> vlanList) {
        this.vlanList = vlanList;
    }


    public int getTotalIPAllocated() {
        return totalIPAllocated;
    }

    @XmlElement
    public void setTotalIPAllocated(int totalIPAllocated) {
        this.totalIPAllocated = totalIPAllocated;
    }

    public int getTotalIPUsed() {
        return totalIPUsed;
    }

    @XmlElement
    public void setTotalIPUsed(int totalIPUsed) {
        this.totalIPUsed = totalIPUsed;
    }


    public int getTotalVmsAllocated() {
        return totalVmsAllocated;
    }

    @XmlElement
    public void setTotalVmsAllocated(int totalVmsAllocated) {
        this.totalVmsAllocated = totalVmsAllocated;
    }

    public double getTotalMemoryAllocated() {
        return totalMemoryAllocated;
    }

    @XmlElement
    public void setTotalMemoryAllocated(double totalMemoryAllocated) {
        this.totalMemoryAllocated = totalMemoryAllocated;
    }

    public double getTotalCPUCoreAllocated() {
        return totalCPUCoreAllocated;
    }

    @XmlElement
    public void setTotalCPUCoreAllocated(int totalCPUCoreAllocated) {
        this.totalCPUCoreAllocated = totalCPUCoreAllocated;
    }

    public double getTotalHardDiskAllocated() {
        return totalHardDiskAllocated;
    }

    @XmlElement
    public void setTotalHardDiskAllocated(double totalHardDiskAllocated) {
        this.totalHardDiskAllocated = totalHardDiskAllocated;
    }

    public int getTotalNetworkAllocated() {
        return totalNetworkAllocated;
    }

    @XmlElement
    public void setTotalNetworkAllocated(int totalNetworkAllocated) {
        this.totalNetworkAllocated = totalNetworkAllocated;
    }

    public int getTotalVmsUsed() {
        return totalVmsUsed;
    }

    @XmlElement
    public void setTotalVmsUsed(int totalVmsUsed) {
        this.totalVmsUsed = totalVmsUsed;
    }

    public double getTotalMemoryUsed() {
        return totalMemoryUsed;
    }

    @XmlElement
    public void setTotalMemoryUsed(double totalMemoryUsed) {
        this.totalMemoryUsed = totalMemoryUsed;
    }

    public double getTotalCPUCoreUsed() {
        return totalCPUCoreUsed;
    }

    @XmlElement
    public void setTotalCPUCoreUsed(int totalCPUCoreUsed) {
        this.totalCPUCoreUsed = totalCPUCoreUsed;
    }

    public double getTotalHardDiskUsed() {
        return totalHardDiskUsed;
    }

    @XmlElement
    public void setTotalHardDiskUsed(double totalHardDiskUsed) {
        this.totalHardDiskUsed = totalHardDiskUsed;
    }

    public int getTotalNetworkUsed() {
        return totalNetworkUsed;
    }

    @XmlElement
    public void setTotalNetworkUsed(int totalNetworkUsed) {
        this.totalNetworkUsed = totalNetworkUsed;
    }


    public Map<String, Integer> getTieredStorageUsageData() {
        return tieredStorageUsageData;
    }

    @XmlElement
    public void setTieredStorageUsageData(Map<String, Integer> tieredStorageUsageData) {
        this.tieredStorageUsageData = tieredStorageUsageData;
    }




}
