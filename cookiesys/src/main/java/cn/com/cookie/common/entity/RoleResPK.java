package cn.com.cookie.common.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by Cookie on 2016/4/10.
 */
public class RoleResPK implements Serializable {
    @Column(name = "role_id", nullable = false)
    @Id
    private long roleId;
    @Column(name = "res_id", nullable = false)
    @Id
    private long resId;

    /**
     * @return the roleId
     */
    public long getRoleId() {
        return roleId;
    }

    /**
     * @param roleId the roleId to set
     */
    public void setRoleId(long roleId) {
        this.roleId = roleId;
    }

    /**
     * @return the resId
     */
    public long getResId() {
        return resId;
    }

    /**
     * @param resId the resId to set
     */
    public void setResId(long resId) {
        this.resId = resId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RoleResPK roleResPK = (RoleResPK) o;

        if (roleId != roleResPK.roleId) return false;
        if (resId != roleResPK.resId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (roleId ^ (roleId >>> 32));
        result = 31 * result + (int) (resId ^ (resId >>> 32));
        return result;
    }
}
