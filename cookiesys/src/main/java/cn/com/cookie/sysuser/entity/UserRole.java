package cn.com.cookie.sysuser.entity;

import javax.persistence.*;

/**
 * Created by Cookie on 2016/4/10.
 */
@Entity
@Table(name = "user_role", schema = "demo_angular_spring", catalog = "")
@IdClass(UserRolePK.class)
public class UserRole {
    @Id
    @Column(name = "user_id", nullable = false)
    private long userId;
    @Id
    @Column(name = "role_id", nullable = false)
    private long roleId;

    /**
     * @return the userId
     */
    public long getUserId() {
        return userId;
    }

    /**
     * @param userId the userId to set
     */
    public void setUserId(long userId) {
        this.userId = userId;
    }

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserRole userRole = (UserRole) o;

        if (userId != userRole.userId) return false;
        if (roleId != userRole.roleId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (userId ^ (userId >>> 32));
        result = 31 * result + (int) (roleId ^ (roleId >>> 32));
        return result;
    }
}
