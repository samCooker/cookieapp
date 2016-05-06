package cn.com.cookie.gxfda.oa.entities;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.sql.Time;

/**
 * Created by Cookie on 2016/4/22.
 */
@Entity
@javax.persistence.Table(name = "WF_FLO_INST_SON", schema = "GX_FDA_OA", catalog = "")
public class WfFloInstSon {
    private Byte instId;

    /**
     * @return the instId
     */
    @Id
    @javax.persistence.Column(name = "INST_ID", nullable = false, precision = 0)
    public Byte getInstId() {
        return instId;
    }

    /**
     * @param instId the instId to set
     */
    public void setInstId(Byte instId) {
        this.instId = instId;
    }

    private Byte instSla;

    /**
     * @return the instSla
     */
    @Basic
    @javax.persistence.Column(name = "INST_SLA", nullable = true, precision = 0)
    public Byte getInstSla() {
        return instSla;
    }

    /**
     * @param instSla the instSla to set
     */
    public void setInstSla(Byte instSla) {
        this.instSla = instSla;
    }

    private Byte status;

    /**
     * @return the status
     */
    @Basic
    @javax.persistence.Column(name = "STATUS", nullable = false, precision = 0)
    public Byte getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(Byte status) {
        this.status = status;
    }

    private String pubFlag;

    /**
     * @return the pubFlag
     */
    @Basic
    @javax.persistence.Column(name = "PUB_FLAG", nullable = true, length = 1)
    public String getPubFlag() {
        return pubFlag;
    }

    /**
     * @param pubFlag the pubFlag to set
     */
    public void setPubFlag(String pubFlag) {
        this.pubFlag = pubFlag;
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

    private Serializable flowType;

    /**
     * @return the flowType
     */
    @Basic
    @javax.persistence.Column(name = "FLOW_TYPE", nullable = true, length = 10)
    public Serializable getFlowType() {
        return flowType;
    }

    /**
     * @param flowType the flowType to set
     */
    public void setFlowType(Serializable flowType) {
        this.flowType = flowType;
    }

    private Serializable gwTitle;

    /**
     * @return the gwTitle
     */
    @Basic
    @javax.persistence.Column(name = "GW_TITLE", nullable = true, length = 250)
    public Serializable getGwTitle() {
        return gwTitle;
    }

    /**
     * @param gwTitle the gwTitle to set
     */
    public void setGwTitle(Serializable gwTitle) {
        this.gwTitle = gwTitle;
    }

    private Serializable gwWh;

    /**
     * @return the gwWh
     */
    @Basic
    @javax.persistence.Column(name = "GW_WH", nullable = true, length = 250)
    public Serializable getGwWh() {
        return gwWh;
    }

    /**
     * @param gwWh the gwWh to set
     */
    public void setGwWh(Serializable gwWh) {
        this.gwWh = gwWh;
    }

    private Serializable lwLwzh;

    /**
     * @return the lwLwzh
     */
    @Basic
    @javax.persistence.Column(name = "LW_LWZH", nullable = true, length = 250)
    public Serializable getLwLwzh() {
        return lwLwzh;
    }

    /**
     * @param lwLwzh the lwLwzh to set
     */
    public void setLwLwzh(Serializable lwLwzh) {
        this.lwLwzh = lwLwzh;
    }

    private Time ngDate;

    /**
     * @return the ngDate
     */
    @Basic
    @javax.persistence.Column(name = "NG_DATE", nullable = true)
    public Time getNgDate() {
        return ngDate;
    }

    /**
     * @param ngDate the ngDate to set
     */
    public void setNgDate(Time ngDate) {
        this.ngDate = ngDate;
    }

    private Serializable lwSwbh;

    /**
     * @return the lwSwbh
     */
    @Basic
    @javax.persistence.Column(name = "LW_SWBH", nullable = true, length = 250)
    public Serializable getLwSwbh() {
        return lwSwbh;
    }

    /**
     * @param lwSwbh the lwSwbh to set
     */
    public void setLwSwbh(Serializable lwSwbh) {
        this.lwSwbh = lwSwbh;
    }

    private Serializable ngNgr;

    /**
     * @return the ngNgr
     */
    @Basic
    @javax.persistence.Column(name = "NG_NGR", nullable = true, length = 250)
    public Serializable getNgNgr() {
        return ngNgr;
    }

    /**
     * @param ngNgr the ngNgr to set
     */
    public void setNgNgr(Serializable ngNgr) {
        this.ngNgr = ngNgr;
    }

    private Serializable ngZbcs;

    /**
     * @return the ngZbcs
     */
    @Basic
    @javax.persistence.Column(name = "NG_ZBCS", nullable = true, length = 250)
    public Serializable getNgZbcs() {
        return ngZbcs;
    }

    /**
     * @param ngZbcs the ngZbcs to set
     */
    public void setNgZbcs(Serializable ngZbcs) {
        this.ngZbcs = ngZbcs;
    }

    private Serializable whType;

    /**
     * @return the whType
     */
    @Basic
    @javax.persistence.Column(name = "WH_TYPE", nullable = true, length = 250)
    public Serializable getWhType() {
        return whType;
    }

    /**
     * @param whType the whType to set
     */
    public void setWhType(Serializable whType) {
        this.whType = whType;
    }

    private Serializable flowId;

    /**
     * @return the flowId
     */
    @Basic
    @javax.persistence.Column(name = "FLOW_ID", nullable = true, length = 18)
    public Serializable getFlowId() {
        return flowId;
    }

    /**
     * @param flowId the flowId to set
     */
    public void setFlowId(Serializable flowId) {
        this.flowId = flowId;
    }

    private Serializable dwZs;

    /**
     * @return the dwZs
     */
    @Basic
    @javax.persistence.Column(name = "DW_ZS", nullable = true, length = 4000)
    public Serializable getDwZs() {
        return dwZs;
    }

    /**
     * @param dwZs the dwZs to set
     */
    public void setDwZs(Serializable dwZs) {
        this.dwZs = dwZs;
    }

    private Serializable lwLwdw;

    /**
     * @return the lwLwdw
     */
    @Basic
    @javax.persistence.Column(name = "LW_LWDW", nullable = true, length = 250)
    public Serializable getLwLwdw() {
        return lwLwdw;
    }

    /**
     * @param lwLwdw the lwLwdw to set
     */
    public void setLwLwdw(Serializable lwLwdw) {
        this.lwLwdw = lwLwdw;
    }

    private Serializable clqId;

    /**
     * @return the clqId
     */
    @Basic
    @javax.persistence.Column(name = "CLQ_ID", nullable = true, length = 10)
    public Serializable getClqId() {
        return clqId;
    }

    /**
     * @param clqId the clqId to set
     */
    public void setClqId(Serializable clqId) {
        this.clqId = clqId;
    }

    private Serializable gwQfr;

    /**
     * @return the gwQfr
     */
    @Basic
    @javax.persistence.Column(name = "GW_QFR", nullable = true, length = 250)
    public Serializable getGwQfr() {
        return gwQfr;
    }

    /**
     * @param gwQfr the gwQfr to set
     */
    public void setGwQfr(Serializable gwQfr) {
        this.gwQfr = gwQfr;
    }

    private Time qfDate;

    /**
     * @return the qfDate
     */
    @Basic
    @javax.persistence.Column(name = "QF_DATE", nullable = true)
    public Time getQfDate() {
        return qfDate;
    }

    /**
     * @param qfDate the qfDate to set
     */
    public void setQfDate(Time qfDate) {
        this.qfDate = qfDate;
    }

    private Serializable gwTopicW;

    /**
     * @return the gwTopicW
     */
    @Basic
    @javax.persistence.Column(name = "GW_TOPIC_W", nullable = true, length = 250)
    public Serializable getGwTopicW() {
        return gwTopicW;
    }

    /**
     * @param gwTopicW the gwTopicW to set
     */
    public void setGwTopicW(Serializable gwTopicW) {
        this.gwTopicW = gwTopicW;
    }

    private Serializable gwJjcd;

    /**
     * @return the gwJjcd
     */
    @Basic
    @javax.persistence.Column(name = "GW_JJCD", nullable = true, length = 250)
    public Serializable getGwJjcd() {
        return gwJjcd;
    }

    /**
     * @param gwJjcd the gwJjcd to set
     */
    public void setGwJjcd(Serializable gwJjcd) {
        this.gwJjcd = gwJjcd;
    }

    private Serializable gwBmdj;

    /**
     * @return the gwBmdj
     */
    @Basic
    @javax.persistence.Column(name = "GW_BMDJ", nullable = true, length = 250)
    public Serializable getGwBmdj() {
        return gwBmdj;
    }

    /**
     * @param gwBmdj the gwBmdj to set
     */
    public void setGwBmdj(Serializable gwBmdj) {
        this.gwBmdj = gwBmdj;
    }

    private String gwGdnx;

    /**
     * @return the gwGdnx
     */
    @Basic
    @javax.persistence.Column(name = "GW_GDNX", nullable = true, length = 1)
    public String getGwGdnx() {
        return gwGdnx;
    }

    /**
     * @param gwGdnx the gwGdnx to set
     */
    public void setGwGdnx(String gwGdnx) {
        this.gwGdnx = gwGdnx;
    }

    private Serializable gwZsdw;

    /**
     * @return the gwZsdw
     */
    @Basic
    @javax.persistence.Column(name = "GW_ZSDW", nullable = true, length = 250)
    public Serializable getGwZsdw() {
        return gwZsdw;
    }

    /**
     * @param gwZsdw the gwZsdw to set
     */
    public void setGwZsdw(Serializable gwZsdw) {
        this.gwZsdw = gwZsdw;
    }

    private Serializable gdZbcs;

    /**
     * @return the gdZbcs
     */
    @Basic
    @javax.persistence.Column(name = "GD_ZBCS", nullable = true, length = 250)
    public Serializable getGdZbcs() {
        return gdZbcs;
    }

    /**
     * @param gdZbcs the gdZbcs to set
     */
    public void setGdZbcs(Serializable gdZbcs) {
        this.gdZbcs = gdZbcs;
    }

    private Serializable gwGdnf;

    /**
     * @return the gwGdnf
     */
    @Basic
    @javax.persistence.Column(name = "GW_GDNF", nullable = true, length = 250)
    public Serializable getGwGdnf() {
        return gwGdnf;
    }

    /**
     * @param gwGdnf the gwGdnf to set
     */
    public void setGwGdnf(Serializable gwGdnf) {
        this.gwGdnf = gwGdnf;
    }

    private Byte gdJh;

    /**
     * @return the gdJh
     */
    @Basic
    @javax.persistence.Column(name = "GD_JH", nullable = true, precision = 0)
    public Byte getGdJh() {
        return gdJh;
    }

    /**
     * @param gdJh the gdJh to set
     */
    public void setGdJh(Byte gdJh) {
        this.gdJh = gdJh;
    }

    private Byte ngZbcsId;

    /**
     * @return the ngZbcsId
     */
    @Basic
    @javax.persistence.Column(name = "NG_ZBCS_ID", nullable = true, precision = 0)
    public Byte getNgZbcsId() {
        return ngZbcsId;
    }

    /**
     * @param ngZbcsId the ngZbcsId to set
     */
    public void setNgZbcsId(Byte ngZbcsId) {
        this.ngZbcsId = ngZbcsId;
    }

    private String zwGkfs;

    /**
     * @return the zwGkfs
     */
    @Basic
    @javax.persistence.Column(name = "ZW_GKFS", nullable = true, length = 1)
    public String getZwGkfs() {
        return zwGkfs;
    }

    /**
     * @param zwGkfs the zwGkfs to set
     */
    public void setZwGkfs(String zwGkfs) {
        this.zwGkfs = zwGkfs;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        WfFloInstSon that = (WfFloInstSon) o;

        if (instId != null ? !instId.equals(that.instId) : that.instId != null) return false;
        if (instSla != null ? !instSla.equals(that.instSla) : that.instSla != null) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;
        if (pubFlag != null ? !pubFlag.equals(that.pubFlag) : that.pubFlag != null) return false;
        if (dwId != null ? !dwId.equals(that.dwId) : that.dwId != null) return false;
        if (flowType != null ? !flowType.equals(that.flowType) : that.flowType != null) return false;
        if (gwTitle != null ? !gwTitle.equals(that.gwTitle) : that.gwTitle != null) return false;
        if (gwWh != null ? !gwWh.equals(that.gwWh) : that.gwWh != null) return false;
        if (lwLwzh != null ? !lwLwzh.equals(that.lwLwzh) : that.lwLwzh != null) return false;
        if (ngDate != null ? !ngDate.equals(that.ngDate) : that.ngDate != null) return false;
        if (lwSwbh != null ? !lwSwbh.equals(that.lwSwbh) : that.lwSwbh != null) return false;
        if (ngNgr != null ? !ngNgr.equals(that.ngNgr) : that.ngNgr != null) return false;
        if (ngZbcs != null ? !ngZbcs.equals(that.ngZbcs) : that.ngZbcs != null) return false;
        if (whType != null ? !whType.equals(that.whType) : that.whType != null) return false;
        if (flowId != null ? !flowId.equals(that.flowId) : that.flowId != null) return false;
        if (dwZs != null ? !dwZs.equals(that.dwZs) : that.dwZs != null) return false;
        if (lwLwdw != null ? !lwLwdw.equals(that.lwLwdw) : that.lwLwdw != null) return false;
        if (clqId != null ? !clqId.equals(that.clqId) : that.clqId != null) return false;
        if (gwQfr != null ? !gwQfr.equals(that.gwQfr) : that.gwQfr != null) return false;
        if (qfDate != null ? !qfDate.equals(that.qfDate) : that.qfDate != null) return false;
        if (gwTopicW != null ? !gwTopicW.equals(that.gwTopicW) : that.gwTopicW != null) return false;
        if (gwJjcd != null ? !gwJjcd.equals(that.gwJjcd) : that.gwJjcd != null) return false;
        if (gwBmdj != null ? !gwBmdj.equals(that.gwBmdj) : that.gwBmdj != null) return false;
        if (gwGdnx != null ? !gwGdnx.equals(that.gwGdnx) : that.gwGdnx != null) return false;
        if (gwZsdw != null ? !gwZsdw.equals(that.gwZsdw) : that.gwZsdw != null) return false;
        if (gdZbcs != null ? !gdZbcs.equals(that.gdZbcs) : that.gdZbcs != null) return false;
        if (gwGdnf != null ? !gwGdnf.equals(that.gwGdnf) : that.gwGdnf != null) return false;
        if (gdJh != null ? !gdJh.equals(that.gdJh) : that.gdJh != null) return false;
        if (ngZbcsId != null ? !ngZbcsId.equals(that.ngZbcsId) : that.ngZbcsId != null) return false;
        if (zwGkfs != null ? !zwGkfs.equals(that.zwGkfs) : that.zwGkfs != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = instId != null ? instId.hashCode() : 0;
        result = 31 * result + (instSla != null ? instSla.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (pubFlag != null ? pubFlag.hashCode() : 0);
        result = 31 * result + (dwId != null ? dwId.hashCode() : 0);
        result = 31 * result + (flowType != null ? flowType.hashCode() : 0);
        result = 31 * result + (gwTitle != null ? gwTitle.hashCode() : 0);
        result = 31 * result + (gwWh != null ? gwWh.hashCode() : 0);
        result = 31 * result + (lwLwzh != null ? lwLwzh.hashCode() : 0);
        result = 31 * result + (ngDate != null ? ngDate.hashCode() : 0);
        result = 31 * result + (lwSwbh != null ? lwSwbh.hashCode() : 0);
        result = 31 * result + (ngNgr != null ? ngNgr.hashCode() : 0);
        result = 31 * result + (ngZbcs != null ? ngZbcs.hashCode() : 0);
        result = 31 * result + (whType != null ? whType.hashCode() : 0);
        result = 31 * result + (flowId != null ? flowId.hashCode() : 0);
        result = 31 * result + (dwZs != null ? dwZs.hashCode() : 0);
        result = 31 * result + (lwLwdw != null ? lwLwdw.hashCode() : 0);
        result = 31 * result + (clqId != null ? clqId.hashCode() : 0);
        result = 31 * result + (gwQfr != null ? gwQfr.hashCode() : 0);
        result = 31 * result + (qfDate != null ? qfDate.hashCode() : 0);
        result = 31 * result + (gwTopicW != null ? gwTopicW.hashCode() : 0);
        result = 31 * result + (gwJjcd != null ? gwJjcd.hashCode() : 0);
        result = 31 * result + (gwBmdj != null ? gwBmdj.hashCode() : 0);
        result = 31 * result + (gwGdnx != null ? gwGdnx.hashCode() : 0);
        result = 31 * result + (gwZsdw != null ? gwZsdw.hashCode() : 0);
        result = 31 * result + (gdZbcs != null ? gdZbcs.hashCode() : 0);
        result = 31 * result + (gwGdnf != null ? gwGdnf.hashCode() : 0);
        result = 31 * result + (gdJh != null ? gdJh.hashCode() : 0);
        result = 31 * result + (ngZbcsId != null ? ngZbcsId.hashCode() : 0);
        result = 31 * result + (zwGkfs != null ? zwGkfs.hashCode() : 0);
        return result;
    }
}
