package cn.com.cookie.sysuser.entity;

import javax.persistence.*;

/**
 * Created by Cookie on 2016/4/10.
 */
@Entity
@Table(name = "role_res", schema = "demo_angular_spring")
@IdClass(RoleResPK.class)
public class RoleRes {
    @Id
    @Column(name = "role_id", nullable = false)
    private long roleId;
    @Id
    @Column(name = "res_id", nullable = false)
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

        RoleRes roleRes = (RoleRes) o;

        if (roleId != roleRes.roleId) return false;
        if (resId != roleRes.resId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (roleId ^ (roleId >>> 32));
        result = 31 * result + (int) (resId ^ (resId >>> 32));
        return result;
    }
}
