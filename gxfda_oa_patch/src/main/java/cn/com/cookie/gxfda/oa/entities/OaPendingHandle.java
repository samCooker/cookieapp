package cn.com.cookie.gxfda.oa.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Time;
import java.util.Date;

/**
 * Created by Cookie on 2016/4/22.
 */
@Entity
@Table(name = "OA_PENDING_HANDLE", schema = "GX_FDA_OA")
public class OaPendingHandle {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "oaPendingHandleSequence")
    @SequenceGenerator(name = "oaPendingHandleSequence" , schema = "gx_fda_oa",sequenceName = "oa_pending_handle_id")
    @Column(name = "OA_PENDING_HANDLE_ID", nullable = false)
    private Long oaPendingHandleId;
    @Column(name = "TYPE", nullable = true, length = 40)
    private String type;
    @Column(name = "TITLE", nullable = true, length = 255)
    private String title;
    @Column(name = "PENDING_MODULE", nullable = true, length = 40)
    private String pendingModule;
    @Column(name = "FLAG_ID", nullable = true, length = 80)
    private String flagId;
    @Column(name = "URL", nullable = true, length = 400)
    private String url;
    @Column(name = "SENDER_ID", nullable = true)
    private Long senderId;
    @Column(name = "SENDER_NAME", nullable = true, length = 20)
    private String senderName;
    @Column(name = "SENDER_DEP_ID", nullable = true)
    private Long senderDepId;
    @Column(name = "SENDER_DEP_NAME", nullable = true, length = 100)
    private String senderDepName;
    @Column(name = "SEND_TIME", nullable = true)
    private Date sendTime;
    @Column(name = "STATUS", nullable = true, length = 30)
    private String status;
    @Column(name = "EMERGENCY_FLAG", nullable = true, length = 1)
    private String emergencyFlag;
    @Column(name = "INST_ID", nullable = true)
    private Long instId;

    /**
     * @return the emergencyFlag
     */
    public String getEmergencyFlag() {
        return emergencyFlag;
    }

    /**
     * @param emergencyFlag the emergencyFlag to set
     */
    public void setEmergencyFlag(String emergencyFlag) {
        this.emergencyFlag = emergencyFlag;
    }

    /**
     * @return the flagId
     */
    public String getFlagId() {
        return flagId;
    }

    /**
     * @param flagId the flagId to set
     */
    public void setFlagId(String flagId) {
        this.flagId = flagId;
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
     * @return the oaPendingHandleId
     */
    public Long getOaPendingHandleId() {
        return oaPendingHandleId;
    }

    /**
     * @param oaPendingHandleId the oaPendingHandleId to set
     */
    public void setOaPendingHandleId(Long oaPendingHandleId) {
        this.oaPendingHandleId = oaPendingHandleId;
    }

    /**
     * @return the pendingModule
     */
    public String getPendingModule() {
        return pendingModule;
    }

    /**
     * @param pendingModule the pendingModule to set
     */
    public void setPendingModule(String pendingModule) {
        this.pendingModule = pendingModule;
    }

    /**
     * @return the senderDepId
     */
    public Long getSenderDepId() {
        return senderDepId;
    }

    /**
     * @param senderDepId the senderDepId to set
     */
    public void setSenderDepId(Long senderDepId) {
        this.senderDepId = senderDepId;
    }

    /**
     * @return the senderDepName
     */
    public String getSenderDepName() {
        return senderDepName;
    }

    /**
     * @param senderDepName the senderDepName to set
     */
    public void setSenderDepName(String senderDepName) {
        this.senderDepName = senderDepName;
    }

    /**
     * @return the senderId
     */
    public Long getSenderId() {
        return senderId;
    }

    /**
     * @param senderId the senderId to set
     */
    public void setSenderId(Long senderId) {
        this.senderId = senderId;
    }

    /**
     * @return the senderName
     */
    public String getSenderName() {
        return senderName;
    }

    /**
     * @param senderName the senderName to set
     */
    public void setSenderName(String senderName) {
        this.senderName = senderName;
    }

    /**
     * @return the sendTime
     */
    public Date getSendTime() {
        return sendTime;
    }

    /**
     * @param sendTime the sendTime to set
     */
    public void setSendTime(Date sendTime) {
        this.sendTime = sendTime;
    }

    /**
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return the url
     */
    public String getUrl() {
        return url;
    }

    /**
     * @param url the url to set
     */
    public void setUrl(String url) {
        this.url = url;
    }
}
