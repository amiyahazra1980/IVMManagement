package com.ensim.escm.plugin.ensimvdc;

import com.ensim.escm.plugin.ensimvdc.common.*;

import java.util.List;
import java.util.Map;


public interface IVMManagement {
    //VM management specific methods
    public VirtualMachine createVM(String orderNo,VirtualMachine virtualMachine) throws Exception;
    public String removeVM(String orderNo,VirtualMachine virtualMachine) throws Exception;
    public String removeVMByScheduler(String orderNo,VirtualMachine virtualMachine, Map removalInfoMap) throws Exception;
    public String disableVM(String orderNo,VirtualMachine virtualMachine) throws Exception;
    public String enableVM(String orderNo,VirtualMachine virtualMachine) throws Exception;
    public String startVM(String orderNo,VirtualMachine virtualMachine) throws Exception;
    public String stopVM(String orderNo,VirtualMachine virtualMachine) throws Exception;
    public String updateVMResources(String orderNo,VirtualMachine virtualMachine) throws Exception;
    public String resumeVM(String orderNo,VirtualMachine virtualMachine) throws Exception;
    public String suspendVM (String orderNo,VirtualMachine virtualMachine) throws Exception;
    public String rebootVM(String orderNo,VirtualMachine virtualMachine) throws Exception;
    public VirtualMachine cloneVM(String orderNo,VirtualMachine virtualMachine) throws Exception;
    public String changeVMName(String orderNo,VirtualMachine virtualMachine)throws Exception;
    public String changeVMOwner(String orderNo,VirtualMachine virtualMachine,String UserName ) throws Exception;
    public String changeVMPassword(String orderNo,VirtualMachine virtualMachine ) throws Exception;
    public String createVMSnapshot(String orderNo,VirtualMachine virtualMachine,VMSnapshot vmSnapshot ) throws Exception;
    public VMSnapshotContainer getVMSnapshot(String orderNo,VirtualMachine virtualMachine ) throws Exception;
    public String revertoVMSnapshot(String orderNo,VirtualMachine virtualMachine,VMSnapshot vmSnapshot ) throws Exception;
    public String removeVMSnapshot(String orderNo,VirtualMachine virtualMachine,VMSnapshot vmSnapshot ) throws Exception;
    //public VMSnapshot getVmCurrentSnapshot(String orderNo,VirtualMachine virtualMachine )throws Exception;
    /*
    The method gets a list of all VMs under the specified VDC Organization
    @orderNo : this is the order number coming from ESCM
     */
    public VMContainer getVMList(String orderNo) throws Exception;
    public VirtualMachine getVMDetails(String orderNo,String vmID) throws Exception;
    public UsageCollection getOrgUsage(String orderNo) throws Exception;
    public ActionLogContainer getActionLog(String orderNo,int numRecord) throws Exception;
    public String getvCPUSpeed() throws Exception;
    public VMContainer getUserVMs(String orderNo,String UserName)throws Exception;
    public UserRoleContainer getUserRoles()throws Exception;
    public IVMUserRole getUserRole(String orderNo,String UserName)throws Exception;
    public String assignUserRole(String orderNo,String UserName,String roleName)throws Exception;
    public String updateUserRole(String orderNo,String UserName,String roleName)throws Exception;
    public UserContainer getAllUsers(String orderNo) throws Exception;
    //Template management specific methods
    public TemplateContainer getTemplateList(String orderNo) throws Exception;
    public IVMRemoteLoginInfo getVmRemoteConnection(String orderNo,VirtualMachine virtualMachine) throws Exception;
    public IVMRuntimeInfo getVMRuntimeInfo(String orderNo,VirtualMachine virtualMachine) throws Exception;
    public IVMRuntimeInfoContainer getOrgAllVMsRuntimeInfo(String orderNo) throws Exception;
    public String getVMRCBrowserPluginDownloadLink(String orderNo) throws Exception;
    public String requestExternalIp(String orderNo,VirtualMachine virtualMachine)throws Exception;
    public List<IVMExternalIpRequest> getExternalIpRequestStatus(String orderId,List<IVMExternalIpRequest> externalIpRequestList) throws Exception;
    public String updateExternalIpAddress(String orderId,VirtualMachine virtualMachine,String ipAddress,String instruction) throws Exception;
    public String removeExternalIpAddress(String orderId,VirtualMachine virtualMachine,String ipAddress)throws Exception;
    public String removeExternalIpAddressRequest(String orderId,VirtualMachine virtualMachine,String ipAddress)throws Exception;
    public String getServiceName();
    public String getProvisioningServiceInformation(String orderNo) throws Exception;
    public IVMNetworkContainer getOrganizationNetwork(String orderNo)throws Exception;
    //Added by AM
    public String removeHDD(String orderNumber,VirtualMachine virtualMachine) throws Exception;
    public String removeNIC(String orderNumber,String vmGuid,IVMNic ivmNic) throws Exception;
}
