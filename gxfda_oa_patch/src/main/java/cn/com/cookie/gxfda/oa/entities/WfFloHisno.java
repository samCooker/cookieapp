package cn.com.cookie.gxfda.oa.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Time;

/**
 * Created by Cookie on 2016/4/22.
 */
@Entity
@javax.persistence.Table(name = "WF_FLO_HISNO", schema = "GX_FDA_OA", catalog = "")
public class WfFloHisno {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "WfFloHisnoSequence")
    @SequenceGenerator(name = "WfFloHisnoSequence" , schema = "gx_fda_oa",sequenceName = "wf_flo_hisno_seqid")
    private Byte id;
    @javax.persistence.Column(name = "INST_ID", nullable = false, precision = 0)
    private Byte instId;

    private Byte curRole;

    /**
     * @return the curRole
     */
    @Basic
    @javax.persistence.Column(name = "CUR_ROLE", nullable = false, precision = 0)
    public Byte getCurRole() {
        return curRole;
    }

    /**
     * @param curRole the curRole to set
     */
    public void setCurRole(Byte curRole) {
        this.curRole = curRole;
    }

    private Byte curNo;

    /**
     * @return the curNo
     */
    @Basic
    @javax.persistence.Column(name = "CUR_NO", nullable = false, precision = 0)
    public Byte getCurNo() {
        return curNo;
    }

    /**
     * @param curNo the curNo to set
     */
    public void setCurNo(Byte curNo) {
        this.curNo = curNo;
    }

    private Byte curMan;

    /**
     * @return the curMan
     */
    @Basic
    @javax.persistence.Column(name = "CUR_MAN", nullable = false, precision = 0)
    public Byte getCurMan() {
        return curMan;
    }

    /**
     * @param curMan the curMan to set
     */
    public void setCurMan(Byte curMan) {
        this.curMan = curMan;
    }

    private Time arriveTime;

    /**
     * @return the arriveTime
     */
    @Basic
    @javax.persistence.Column(name = "ARRIVE_TIME", nullable = true)
    public Time getArriveTime() {
        return arriveTime;
    }

    /**
     * @param arriveTime the arriveTime to set
     */
    public void setArriveTime(Time arriveTime) {
        this.arriveTime = arriveTime;
    }

    private Time signinTime;

    /**
     * @return the signinTime
     */
    @Basic
    @javax.persistence.Column(name = "SIGNIN_TIME", nullable = true)
    public Time getSigninTime() {
        return signinTime;
    }

    /**
     * @param signinTime the signinTime to set
     */
    public void setSigninTime(Time signinTime) {
        this.signinTime = signinTime;
    }

    private Time doneTime;

    /**
     * @return the doneTime
     */
    @Basic
    @javax.persistence.Column(name = "DONE_TIME", nullable = true)
    public Time getDoneTime() {
        return doneTime;
    }

    /**
     * @param doneTime the doneTime to set
     */
    public void setDoneTime(Time doneTime) {
        this.doneTime = doneTime;
    }

    private Byte timeLimit;

    /**
     * @return the timeLimit
     */
    @Basic
    @javax.persistence.Column(name = "TIME_LIMIT", nullable = true, precision = 0)
    public Byte getTimeLimit() {
        return timeLimit;
    }

    /**
     * @param timeLimit the timeLimit to set
     */
    public void setTimeLimit(Byte timeLimit) {
        this.timeLimit = timeLimit;
    }

    private String timeOut;

    /**
     * @return the timeOut
     */
    @Basic
    @javax.persistence.Column(name = "TIME_OUT", nullable = false, length = 1)
    public String getTimeOut() {
        return timeOut;
    }

    /**
     * @param timeOut the timeOut to set
     */
    public void setTimeOut(String timeOut) {
        this.timeOut = timeOut;
    }

    private Byte curWorkshop;

    /**
     * @return the curWorkshop
     */
    @Basic
    @javax.persistence.Column(name = "CUR_WORKSHOP", nullable = false, precision = 0)
    public Byte getCurWorkshop() {
        return curWorkshop;
    }

    /**
     * @param curWorkshop the curWorkshop to set
     */
    public void setCurWorkshop(Byte curWorkshop) {
        this.curWorkshop = curWorkshop;
    }

    private String nodeType;

    /**
     * @return the nodeType
     */
    @Basic
    @javax.persistence.Column(name = "NODE_TYPE", nullable = false, length = 1)
    public String getNodeType() {
        return nodeType;
    }

    /**
     * @param nodeType the nodeType to set
     */
    public void setNodeType(String nodeType) {
        this.nodeType = nodeType;
    }

    private Byte timeConf;

    /**
     * @return the timeConf
     */
    @Basic
    @javax.persistence.Column(name = "TIME_CONF", nullable = true, precision = 0)
    public Byte getTimeConf() {
        return timeConf;
    }

    /**
     * @param timeConf the timeConf to set
     */
    public void setTimeConf(Byte timeConf) {
        this.timeConf = timeConf;
    }

    private Serializable remark;

    /**
     * @return the remark
     */
    @Basic
    @javax.persistence.Column(name = "REMARK", nullable = true, length = 200)
    public Serializable getRemark() {
        return remark;
    }

    /**
     * @param remark the remark to set
     */
    public void setRemark(Serializable remark) {
        this.remark = remark;
    }

    private Byte subFlow;

    /**
     * @return the subFlow
     */
    @Basic
    @javax.persistence.Column(name = "SUB_FLOW", nullable = true, precision = 0)
    public Byte getSubFlow() {
        return subFlow;
    }

    /**
     * @param subFlow the subFlow to set
     */
    public void setSubFlow(Byte subFlow) {
        this.subFlow = subFlow;
    }

    private Byte signMan;

    /**
     * @return the signMan
     */
    @Basic
    @javax.persistence.Column(name = "SIGN_MAN", nullable = true, precision = 0)
    public Byte getSignMan() {
        return signMan;
    }

    /**
     * @param signMan the signMan to set
     */
    public void setSignMan(Byte signMan) {
        this.signMan = signMan;
    }

    private Byte sendMan;

    /**
     * @return the sendMan
     */
    @Basic
    @javax.persistence.Column(name = "SEND_MAN", nullable = true, precision = 0)
    public Byte getSendMan() {
        return sendMan;
    }

    /**
     * @param sendMan the sendMan to set
     */
    public void setSendMan(Byte sendMan) {
        this.sendMan = sendMan;
    }

    private String timeSet;

    /**
     * @return the timeSet
     */
    @Basic
    @javax.persistence.Column(name = "TIME_SET", nullable = true, length = 1)
    public String getTimeSet() {
        return timeSet;
    }

    /**
     * @param timeSet the timeSet to set
     */
    public void setTimeSet(String timeSet) {
        this.timeSet = timeSet;
    }

    private Byte dispMan;

    /**
     * @return the dispMan
     */
    @Basic
    @javax.persistence.Column(name = "DISP_MAN", nullable = true, precision = 0)
    public Byte getDispMan() {
        return dispMan;
    }

    /**
     * @param dispMan the dispMan to set
     */
    public void setDispMan(Byte dispMan) {
        this.dispMan = dispMan;
    }

    private Byte dispId;

    /**
     * @return the dispId
     */
    @Basic
    @javax.persistence.Column(name = "DISP_ID", nullable = true, precision = 0)
    public Byte getDispId() {
        return dispId;
    }

    /**
     * @param dispId the dispId to set
     */
    public void setDispId(Byte dispId) {
        this.dispId = dispId;
    }

    private Serializable curDepName;

    /**
     * @return the curDepName
     */
    @Basic
    @javax.persistence.Column(name = "CUR_DEP_NAME", nullable = false, length = 100)
    public Serializable getCurDepName() {
        return curDepName;
    }

    /**
     * @param curDepName the curDepName to set
     */
    public void setCurDepName(Serializable curDepName) {
        this.curDepName = curDepName;
    }

    private Byte dwId;

    /**
     * @return the dwId
     */
    @Basic
    @javax.persistence.Column(name = "DW_ID", nullable = false, precision = 0)
    public Byte getDwId() {
        return dwId;
    }

    /**
     * @param dwId the dwId to set
     */
    public void setDwId(Byte dwId) {
        this.dwId = dwId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        WfFloHisno that = (WfFloHisno) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (instId != null ? !instId.equals(that.instId) : that.instId != null) return false;
        if (curRole != null ? !curRole.equals(that.curRole) : that.curRole != null) return false;
        if (curNo != null ? !curNo.equals(that.curNo) : that.curNo != null) return false;
        if (curMan != null ? !curMan.equals(that.curMan) : that.curMan != null) return false;
        if (arriveTime != null ? !arriveTime.equals(that.arriveTime) : that.arriveTime != null) return false;
        if (signinTime != null ? !signinTime.equals(that.signinTime) : that.signinTime != null) return false;
        if (doneTime != null ? !doneTime.equals(that.doneTime) : that.doneTime != null) return false;
        if (timeLimit != null ? !timeLimit.equals(that.timeLimit) : that.timeLimit != null) return false;
        if (timeOut != null ? !timeOut.equals(that.timeOut) : that.timeOut != null) return false;
        if (curWorkshop != null ? !curWorkshop.equals(that.curWorkshop) : that.curWorkshop != null) return false;
        if (nodeType != null ? !nodeType.equals(that.nodeType) : that.nodeType != null) return false;
        if (timeConf != null ? !timeConf.equals(that.timeConf) : that.timeConf != null) return false;
        if (remark != null ? !remark.equals(that.remark) : that.remark != null) return false;
        if (subFlow != null ? !subFlow.equals(that.subFlow) : that.subFlow != null) return false;
        if (signMan != null ? !signMan.equals(that.signMan) : that.signMan != null) return false;
        if (sendMan != null ? !sendMan.equals(that.sendMan) : that.sendMan != null) return false;
        if (timeSet != null ? !timeSet.equals(that.timeSet) : that.timeSet != null) return false;
        if (dispMan != null ? !dispMan.equals(that.dispMan) : that.dispMan != null) return false;
        if (dispId != null ? !dispId.equals(that.dispId) : that.dispId != null) return false;
        if (curDepName != null ? !curDepName.equals(that.curDepName) : that.curDepName != null) return false;
        if (dwId != null ? !dwId.equals(that.dwId) : that.dwId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (instId != null ? instId.hashCode() : 0);
        result = 31 * result + (curRole != null ? curRole.hashCode() : 0);
        result = 31 * result + (curNo != null ? curNo.hashCode() : 0);
        result = 31 * result + (curMan != null ? curMan.hashCode() : 0);
        result = 31 * result + (arriveTime != null ? arriveTime.hashCode() : 0);
        result = 31 * result + (signinTime != null ? signinTime.hashCode() : 0);
        result = 31 * result + (doneTime != null ? doneTime.hashCode() : 0);
        result = 31 * result + (timeLimit != null ? timeLimit.hashCode() : 0);
        result = 31 * result + (timeOut != null ? timeOut.hashCode() : 0);
        result = 31 * result + (curWorkshop != null ? curWorkshop.hashCode() : 0);
        result = 31 * result + (nodeType != null ? nodeType.hashCode() : 0);
        result = 31 * result + (timeConf != null ? timeConf.hashCode() : 0);
        result = 31 * result + (remark != null ? remark.hashCode() : 0);
        result = 31 * result + (subFlow != null ? subFlow.hashCode() : 0);
        result = 31 * result + (signMan != null ? signMan.hashCode() : 0);
        result = 31 * result + (sendMan != null ? sendMan.hashCode() : 0);
        result = 31 * result + (timeSet != null ? timeSet.hashCode() : 0);
        result = 31 * result + (dispMan != null ? dispMan.hashCode() : 0);
        result = 31 * result + (dispId != null ? dispId.hashCode() : 0);
        result = 31 * result + (curDepName != null ? curDepName.hashCode() : 0);
        result = 31 * result + (dwId != null ? dwId.hashCode() : 0);
        return result;
    }
}
