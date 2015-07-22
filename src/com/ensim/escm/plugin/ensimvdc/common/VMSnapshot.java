package com.ensim.escm.plugin.ensimvdc.common;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Kisna
 * Date: 8/19/13
 * Time: 6:43 PM
 * To change this template use File | Settings | File Templates.
 */
@XmlRootElement
public class VMSnapshot {

    private String Id;
    private String Name;
    private String Description;
    private Date creationDate;
    private boolean isHere;
    private List<VMSnapshot>  snapshotList;
    //private boolean Quiesce;

    public String getId() {
        return Id;
    }
    @XmlElement
    public void setId(String id) {
        this.Id = id;
    }

    public String getName() {
        return Name;
    }
    @XmlElement
    public void setName(String name) {
        Name = name;
    }

    /*public boolean isQuiesce() {
        return Quiesce;
    }

    public void setQuiesce(boolean quiesce) {
        Quiesce = quiesce;
    }*/

    public Date getCreationDate() {
        return creationDate;
    }
    @XmlElement
    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public String getDescription() {
        return Description;
    }
    @XmlElement
    public void setDescription(String description) {
        Description = description;
    }

    public boolean isHere() {
        return isHere;
    }
    @XmlElement
    public void setHere(boolean here) {
        isHere = here;
    }

    public List<VMSnapshot> getSnapshotList() {
        return snapshotList;
    }
    @XmlElement
    public void setSnapshotList(List<VMSnapshot> snapshotList) {
        this.snapshotList = snapshotList;
    }

    /**/
    // If the <quiesce> flag is 1 or true, and the virtual machine is powered on when the snapshot is taken, VMware Tools is used to quiesce the file system in the virtual machine. Quiescing a file system is a process of bringing the on-disk data of a physical or virtual computer into a state suitable for backups. This process might include such operations as flushing dirty buffers from the operating system's in-memory cache to disk, or other higher-level application-specific tasks.

}
