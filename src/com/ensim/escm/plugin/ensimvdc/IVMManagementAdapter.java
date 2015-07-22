package com.ensim.escm.plugin.ensimvdc;

import com.ensim.escm.plugin.ensimvdc.common.*;

import java.util.List;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: Amiya
 * Date: 2/17/15
 * Time: 4:04 PM
 * To change this template use File | Settings | File Templates.
 */
public class IVMManagementAdapter implements IVMManagement{
    @Override
    public VirtualMachine createVM(String orderNo, VirtualMachine virtualMachine) throws Exception {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public String removeVM(String orderNo, VirtualMachine virtualMachine) throws Exception {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }
    
    @Override
    public String removeVMByScheduler(String orderNo, VirtualMachine virtualMachine, Map removalInfoMap) throws Exception {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public String disableVM(String orderNo, VirtualMachine virtualMachine) throws Exception {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public String enableVM(String orderNo, VirtualMachine virtualMachine) throws Exception {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public String startVM(String orderNo, VirtualMachine virtualMachine) throws Exception {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public String stopVM(String orderNo, VirtualMachine virtualMachine) throws Exception {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public String updateVMResources(String orderNo, VirtualMachine virtualMachine) throws Exception {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public String resumeVM(String orderNo, VirtualMachine virtualMachine) throws Exception {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public String suspendVM(String orderNo, VirtualMachine virtualMachine) throws Exception {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public String rebootVM(String orderNo, VirtualMachine virtualMachine) throws Exception {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public VirtualMachine cloneVM(String orderNo, VirtualMachine virtualMachine) throws Exception {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public String changeVMName(String orderNo, VirtualMachine virtualMachine) throws Exception {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public String changeVMOwner(String orderNo, VirtualMachine virtualMachine, String UserName) throws Exception {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public String changeVMPassword(String orderNo, VirtualMachine virtualMachine) throws Exception {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public String createVMSnapshot(String orderNo, VirtualMachine virtualMachine, VMSnapshot vmSnapshot) throws Exception {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public VMSnapshotContainer getVMSnapshot(String orderNo, VirtualMachine virtualMachine) throws Exception {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public String revertoVMSnapshot(String orderNo, VirtualMachine virtualMachine, VMSnapshot vmSnapshot) throws Exception {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public String removeVMSnapshot(String orderNo, VirtualMachine virtualMachine, VMSnapshot vmSnapshot) throws Exception {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public VMContainer getVMList(String orderNo) throws Exception {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public VirtualMachine getVMDetails(String orderNo, String vmID) throws Exception {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public UsageCollection getOrgUsage(String orderNo) throws Exception {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public ActionLogContainer getActionLog(String orderNo, int numRecord) throws Exception {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public String getvCPUSpeed() throws Exception {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public VMContainer getUserVMs(String orderNo, String UserName) throws Exception {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public UserRoleContainer getUserRoles() throws Exception {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public IVMUserRole getUserRole(String orderNo, String UserName) throws Exception {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public String assignUserRole(String orderNo, String UserName, String roleName) throws Exception {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public String updateUserRole(String orderNo, String UserName, String roleName) throws Exception {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public UserContainer getAllUsers(String orderNo) throws Exception {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public TemplateContainer getTemplateList(String orderNo) throws Exception {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public IVMRemoteLoginInfo getVmRemoteConnection(String orderNo, VirtualMachine virtualMachine) throws Exception {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public IVMRuntimeInfo getVMRuntimeInfo(String orderNo, VirtualMachine virtualMachine) throws Exception {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public IVMRuntimeInfoContainer getOrgAllVMsRuntimeInfo(String orderNo) throws Exception {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public String getVMRCBrowserPluginDownloadLink(String orderNo) throws Exception {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public String requestExternalIp(String orderNo, VirtualMachine virtualMachine) throws Exception {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public List<IVMExternalIpRequest> getExternalIpRequestStatus(String orderId, List<IVMExternalIpRequest> externalIpRequestList) throws Exception {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public String updateExternalIpAddress(String orderId, VirtualMachine virtualMachine, String ipAddress, String instruction) throws Exception {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public String removeExternalIpAddress(String orderId, VirtualMachine virtualMachine, String ipAddress) throws Exception {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public String removeExternalIpAddressRequest(String orderId, VirtualMachine virtualMachine, String ipAddress) throws Exception {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public String getServiceName() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public String getProvisioningServiceInformation(String orderNo) throws Exception {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public IVMNetworkContainer getOrganizationNetwork(String orderNo) throws Exception {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public String removeHDD(String orderNumber,VirtualMachine virtualMachine) throws Exception {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public String removeNIC(String orderNumber,String vmGuid,IVMNic ivmNic) throws Exception{
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }
}
