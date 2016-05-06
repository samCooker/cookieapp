package cn.com.cookie.gxfda.oa.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Time;

/**
 * Created by Cookie on 2016/4/22.
 */
@Entity
@javax.persistence.Table(name = "WF_FLO_CURNO", schema = "GX_FDA_OA")
public class WfFloCurno {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "WfFloInstnoSequence")
    @SequenceGenerator(name = "WfFloInstnoSequence" , schema = "gx_fda_oa",sequenceName = "wf_flo_instno_seqid")
    private Long id;
    @javax.persistence.Column(name = "INST_ID", nullable = false )
    private Long instId;
    @javax.persistence.Column(name = "CUR_ROLE", nullable = false )
    private Long curRole;
    @javax.persistence.Column(name = "CUR_NO", nullable = false )
    private Long curNo;
    @javax.persistence.Column(name = "CUR_MAN", nullable = false )
    private Long curMan;
    @javax.persistence.Column(name = "ARRIVE_TIME", nullable = true)
    private Time arriveTime;
    @javax.persistence.Column(name = "SIGNIN_TIME", nullable = true)
    private Time signinTime;
    @javax.persistence.Column(name = "DONE_TIME", nullable = true)
    private Time doneTime;
    @javax.persistence.Column(name = "TIME_LIMIT", nullable = true )
    private Long timeLimit;
    @javax.persistence.Column(name = "TIME_OUT", nullable = false, length = 1)
    private String timeOut;
    @javax.persistence.Column(name = "CUR_WORKSHOP", nullable = false )
    private Long curWorkshop;
    @javax.persistence.Column(name = "NODE_TYPE", nullable = false, length = 1)
    private String nodeType;
    @javax.persistence.Column(name = "TIME_CONF", nullable = true )
    private Long timeConf;
    @javax.persistence.Column(name = "REMARK", nullable = true, length = 200)
    private Serializable remark;
    @javax.persistence.Column(name = "SUB_FLOW", nullable = true )
    private Long subFlow;
    @javax.persistence.Column(name = "SIGN_MAN", nullable = true )
    private Long signMan;
    @javax.persistence.Column(name = "SEND_MAN", nullable = true )
    private Long sendMan;
    @javax.persistence.Column(name = "TIME_SET", nullable = true, length = 1)
    private String timeSet;
    @javax.persistence.Column(name = "DISP_MAN", nullable = true)
    private Long dispMan;
    @javax.persistence.Column(name = "DISP_ID", nullable = true )
    private Long dispId;
    @javax.persistence.Column(name = "PRE_NO", nullable = true )
    private Long preNo;
    @javax.persistence.Column(name = "LAST_NO", nullable = true )
    private Long lastNo;
    @javax.persistence.Column(name = "DW_ID", nullable = false )
    private Long dwId;

    /**
     * @return the arriveTime
     */
    public Time getArriveTime() {
        return arriveTime;
    }

    /**
     * @param arriveTime the arriveTime to set
     */
    public void setArriveTime(Time arriveTime) {
        this.arriveTime = arriveTime;
    }

    /**
     * @return the curMan
     */
    public Long getCurMan() {
        return curMan;
    }

    /**
     * @param curMan the curMan to set
     */
    public void setCurMan(Long curMan) {
        this.curMan = curMan;
    }

    /**
     * @return the curNo
     */
    public Long getCurNo() {
        return curNo;
    }

    /**
     * @param curNo the curNo to set
     */
    public void setCurNo(Long curNo) {
        this.curNo = curNo;
    }

    /**
     * @return the curRole
     */
    public Long getCurRole() {
        return curRole;
    }

    /**
     * @param curRole the curRole to set
     */
    public void setCurRole(Long curRole) {
        this.curRole = curRole;
    }

    /**
     * @return the curWorkshop
     */
    public Long getCurWorkshop() {
        return curWorkshop;
    }

    /**
     * @param curWorkshop the curWorkshop to set
     */
    public void setCurWorkshop(Long curWorkshop) {
        this.curWorkshop = curWorkshop;
    }

    /**
     * @return the dispId
     */
    public Long getDispId() {
        return dispId;
    }

    /**
     * @param dispId the dispId to set
     */
    public void setDispId(Long dispId) {
        this.dispId = dispId;
    }

    /**
     * @return the dispMan
     */
    public Long getDispMan() {
        return dispMan;
    }

    /**
     * @param dispMan the dispMan to set
     */
    public void setDispMan(Long dispMan) {
        this.dispMan = dispMan;
    }

    /**
     * @return the doneTime
     */
    public Time getDoneTime() {
        return doneTime;
    }

    /**
     * @param doneTime the doneTime to set
     */
    public void setDoneTime(Time doneTime) {
        this.doneTime = doneTime;
    }

    /**
     * @return the dwId
     */
    public Long getDwId() {
        return dwId;
    }

    /**
     * @param dwId the dwId to set
     */
    public void setDwId(Long dwId) {
        this.dwId = dwId;
    }

    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return the instId
     */
    public Long getInstId() {
        return instId;
    }

    /**
     * @param instId the instId to set
     */
    public void setInstId(Long instId) {
        this.instId = instId;
    }

    /**
     * @return the lastNo
     */
    public Long getLastNo() {
        return lastNo;
    }

    /**
     * @param lastNo the lastNo to set
     */
    public void setLastNo(Long lastNo) {
        this.lastNo = lastNo;
    }

    /**
     * @return the nodeType
     */
    public String getNodeType() {
        return nodeType;
    }

    /**
     * @param nodeType the nodeType to set
     */
    public void setNodeType(String nodeType) {
        this.nodeType = nodeType;
    }

    /**
     * @return the preNo
     */
    public Long getPreNo() {
        return preNo;
    }

    /**
     * @param preNo the preNo to set
     */
    public void setPreNo(Long preNo) {
        this.preNo = preNo;
    }

    /**
     * @return the remark
     */
    public Serializable getRemark() {
        return remark;
    }

    /**
     * @param remark the remark to set
     */
    public void setRemark(Serializable remark) {
        this.remark = remark;
    }

    /**
     * @return the sendMan
     */
    public Long getSendMan() {
        return sendMan;
    }

    /**
     * @param sendMan the sendMan to set
     */
    public void setSendMan(Long sendMan) {
        this.sendMan = sendMan;
    }

    /**
     * @return the signinTime
     */
    public Time getSigninTime() {
        return signinTime;
    }

    /**
     * @param signinTime the signinTime to set
     */
    public void setSigninTime(Time signinTime) {
        this.signinTime = signinTime;
    }

    /**
     * @return the signMan
     */
    public Long getSignMan() {
        return signMan;
    }

    /**
     * @param signMan the signMan to set
     */
    public void setSignMan(Long signMan) {
        this.signMan = signMan;
    }

    /**
     * @return the subFlow
     */
    public Long getSubFlow() {
        return subFlow;
    }

    /**
     * @param subFlow the subFlow to set
     */
    public void setSubFlow(Long subFlow) {
        this.subFlow = subFlow;
    }

    /**
     * @return the timeConf
     */
    public Long getTimeConf() {
        return timeConf;
    }

    /**
     * @param timeConf the timeConf to set
     */
    public void setTimeConf(Long timeConf) {
        this.timeConf = timeConf;
    }

    /**
     * @return the timeLimit
     */
    public Long getTimeLimit() {
        return timeLimit;
    }

    /**
     * @param timeLimit the timeLimit to set
     */
    public void setTimeLimit(Long timeLimit) {
        this.timeLimit = timeLimit;
    }

    /**
     * @return the timeOut
     */
    public String getTimeOut() {
        return timeOut;
    }

    /**
     * @param timeOut the timeOut to set
     */
    public void setTimeOut(String timeOut) {
        this.timeOut = timeOut;
    }

    /**
     * @return the timeSet
     */
    public String getTimeSet() {
        return timeSet;
    }

    /**
     * @param timeSet the timeSet to set
     */
    public void setTimeSet(String timeSet) {
        this.timeSet = timeSet;
    }
}
