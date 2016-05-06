package cn.com.cookie.gxfda.oa.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Time;

/**
 * Created by Cookie on 2016/4/22.
 */
@Entity
@Table(name = "WF_FLO_INST_DATAITEM", schema = "GX_FDA_OA", catalog = "")
public class WfFloInstDataitem {
    private Byte dataId;
    private Byte instId;
    private Byte curNo;
    private Byte curDep;
    private Byte curMan;
    private Byte nodeDataId;
    private Serializable itemId;
    private Time inputDate;
    private Byte instnoId;
    private Serializable curDepName;

    /**
     * @return the dataId
     */
    @Id
    @Column(name = "DATA_ID", nullable = false, precision = 0)
    public Byte getDataId() {
        return dataId;
    }

    /**
     * @param dataId the dataId to set
     */
    public void setDataId(Byte dataId) {
        this.dataId = dataId;
    }

    /**
     * @return the instId
     */
    @Basic
    @Column(name = "INST_ID", nullable = true, precision = 0)
    public Byte getInstId() {
        return instId;
    }

    /**
     * @param instId the instId to set
     */
    public void setInstId(Byte instId) {
        this.instId = instId;
    }

    /**
     * @return the curNo
     */
    @Basic
    @Column(name = "CUR_NO", nullable = true, precision = 0)
    public Byte getCurNo() {
        return curNo;
    }

    /**
     * @param curNo the curNo to set
     */
    public void setCurNo(Byte curNo) {
        this.curNo = curNo;
    }

    /**
     * @return the curDep
     */
    @Basic
    @Column(name = "CUR_DEP", nullable = true, precision = 0)
    public Byte getCurDep() {
        return curDep;
    }

    /**
     * @param curDep the curDep to set
     */
    public void setCurDep(Byte curDep) {
        this.curDep = curDep;
    }

    /**
     * @return the curMan
     */
    @Basic
    @Column(name = "CUR_MAN", nullable = true, precision = 0)
    public Byte getCurMan() {
        return curMan;
    }

    /**
     * @param curMan the curMan to set
     */
    public void setCurMan(Byte curMan) {
        this.curMan = curMan;
    }

    /**
     * @return the nodeDataId
     */
    @Basic
    @Column(name = "NODE_DATA_ID", nullable = true, precision = 0)
    public Byte getNodeDataId() {
        return nodeDataId;
    }

    /**
     * @param nodeDataId the nodeDataId to set
     */
    public void setNodeDataId(Byte nodeDataId) {
        this.nodeDataId = nodeDataId;
    }

    /**
     * @return the itemId
     */
    @Basic
    @Column(name = "ITEM_ID", nullable = true, length = 30)
    public Serializable getItemId() {
        return itemId;
    }

    /**
     * @param itemId the itemId to set
     */
    public void setItemId(Serializable itemId) {
        this.itemId = itemId;
    }

    /**
     * @return the inputDate
     */
    @Basic
    @Column(name = "INPUT_DATE", nullable = true)
    public Time getInputDate() {
        return inputDate;
    }

    /**
     * @param inputDate the inputDate to set
     */
    public void setInputDate(Time inputDate) {
        this.inputDate = inputDate;
    }

    /**
     * @return the instnoId
     */
    @Basic
    @Column(name = "INSTNO_ID", nullable = true, precision = 0)
    public Byte getInstnoId() {
        return instnoId;
    }

    /**
     * @param instnoId the instnoId to set
     */
    public void setInstnoId(Byte instnoId) {
        this.instnoId = instnoId;
    }

    /**
     * @return the curDepName
     */
    @Basic
    @Column(name = "CUR_DEP_NAME", nullable = false, length = 100)
    public Serializable getCurDepName() {
        return curDepName;
    }

    /**
     * @param curDepName the curDepName to set
     */
    public void setCurDepName(Serializable curDepName) {
        this.curDepName = curDepName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        WfFloInstDataitem that = (WfFloInstDataitem) o;

        if (dataId != null ? !dataId.equals(that.dataId) : that.dataId != null) return false;
        if (instId != null ? !instId.equals(that.instId) : that.instId != null) return false;
        if (curNo != null ? !curNo.equals(that.curNo) : that.curNo != null) return false;
        if (curDep != null ? !curDep.equals(that.curDep) : that.curDep != null) return false;
        if (curMan != null ? !curMan.equals(that.curMan) : that.curMan != null) return false;
        if (nodeDataId != null ? !nodeDataId.equals(that.nodeDataId) : that.nodeDataId != null) return false;
        if (itemId != null ? !itemId.equals(that.itemId) : that.itemId != null) return false;
        if (inputDate != null ? !inputDate.equals(that.inputDate) : that.inputDate != null) return false;
        if (instnoId != null ? !instnoId.equals(that.instnoId) : that.instnoId != null) return false;
        if (curDepName != null ? !curDepName.equals(that.curDepName) : that.curDepName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = dataId != null ? dataId.hashCode() : 0;
        result = 31 * result + (instId != null ? instId.hashCode() : 0);
        result = 31 * result + (curNo != null ? curNo.hashCode() : 0);
        result = 31 * result + (curDep != null ? curDep.hashCode() : 0);
        result = 31 * result + (curMan != null ? curMan.hashCode() : 0);
        result = 31 * result + (nodeDataId != null ? nodeDataId.hashCode() : 0);
        result = 31 * result + (itemId != null ? itemId.hashCode() : 0);
        result = 31 * result + (inputDate != null ? inputDate.hashCode() : 0);
        result = 31 * result + (instnoId != null ? instnoId.hashCode() : 0);
        result = 31 * result + (curDepName != null ? curDepName.hashCode() : 0);
        return result;
    }
}
