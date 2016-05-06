package cn.com.cookie.gxfda.oa.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Time;
import java.util.Date;

/**
 * Created by Cookie on 2016/4/22.
 */
@Entity
@Table(name = "OA_PENDING_HANDLE_DTS", schema = "GX_FDA_OA")
public class OaPendingHandleDts {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "oaPendingHandleDtsSequence")
    @SequenceGenerator(name = "oaPendingHandleDtsSequence" , schema = "gx_fda_oa",sequenceName = "oa_pending_handle_dts_id")
    private Long oaPendingHandleDtsId;
    @Column(name = "OA_PENDING_HANDLE_ID", nullable = true)
    private Long oaPendingHandleId;
    @Column(name = "RECEIVE_MAN_ID", nullable = false)
    private Long receiveManId;
    @Column(name = "RECEIVE_MAN_NAME", nullable = true, length = 20)
    private String receiveManName;
    @Column(name = "RECEIVE_MAN_DEP_ID", nullable = true)
    private Long receiveManDepId;
    @Column(name = "RECEIVE_MAN_DEP_NAME", nullable = true, length = 100)
    private String receiveManDepName;
    @Column(name = "READ_TIME", nullable = true)
    private Date readTime;
    @Column(name = "STATUS", nullable = true, length = 30)
    private String status;

    /**
     * @return the oaPendingHandleDtsId
     */
    public Long getOaPendingHandleDtsId() {
        return oaPendingHandleDtsId;
    }

    /**
     * @param oaPendingHandleDtsId the oaPendingHandleDtsId to set
     */
    public void setOaPendingHandleDtsId(Long oaPendingHandleDtsId) {
        this.oaPendingHandleDtsId = oaPendingHandleDtsId;
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
     * @return the readTime
     */
    public Date getReadTime() {
        return readTime;
    }

    /**
     * @param readTime the readTime to set
     */
    public void setReadTime(Date readTime) {
        this.readTime = readTime;
    }

    /**
     * @return the receiveManDepId
     */
    public Long getReceiveManDepId() {
        return receiveManDepId;
    }

    /**
     * @param receiveManDepId the receiveManDepId to set
     */
    public void setReceiveManDepId(Long receiveManDepId) {
        this.receiveManDepId = receiveManDepId;
    }

    /**
     * @return the receiveManDepName
     */
    public String getReceiveManDepName() {
        return receiveManDepName;
    }

    /**
     * @param receiveManDepName the receiveManDepName to set
     */
    public void setReceiveManDepName(String receiveManDepName) {
        this.receiveManDepName = receiveManDepName;
    }

    /**
     * @return the receiveManId
     */
    public Long getReceiveManId() {
        return receiveManId;
    }

    /**
     * @param receiveManId the receiveManId to set
     */
    public void setReceiveManId(Long receiveManId) {
        this.receiveManId = receiveManId;
    }

    /**
     * @return the receiveManName
     */
    public String getReceiveManName() {
        return receiveManName;
    }

    /**
     * @param receiveManName the receiveManName to set
     */
    public void setReceiveManName(String receiveManName) {
        this.receiveManName = receiveManName;
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
}
