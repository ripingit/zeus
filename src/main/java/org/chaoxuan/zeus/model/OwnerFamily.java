package org.chaoxuan.zeus.model;

public class OwnerFamily {
    /**
     * <pre>
     * 
     * 表字段 : t_owner_family.id
     * </pre>
     */
    private Integer id;

    /**
     * <pre>
     * 
     * 表字段 : t_owner_family.relative
     * </pre>
     */
    private String relative;

    /**
     * <pre>
     * 
     * 表字段 : t_owner_family.age
     * </pre>
     */
    private Integer age;

    /**
     * <pre>
     * 
     * 表字段 : t_owner_family.owner_id
     * </pre>
     */
    private Integer ownerId;

    /**
     * <pre>
     * 获取：
     * 表字段：t_owner_family.id
     * </pre>
     *
     * @return t_owner_family.id：
     */
    public Integer getId() {
        return id;
    }

    /**
     * <pre>
     * 设置：
     * 表字段：t_owner_family.id
     * </pre>
     *
     * @param id
     *            t_owner_family.id：
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * <pre>
     * 获取：
     * 表字段：t_owner_family.relative
     * </pre>
     *
     * @return t_owner_family.relative：
     */
    public String getRelative() {
        return relative;
    }

    /**
     * <pre>
     * 设置：
     * 表字段：t_owner_family.relative
     * </pre>
     *
     * @param relative
     *            t_owner_family.relative：
     */
    public void setRelative(String relative) {
        this.relative = relative == null ? null : relative.trim();
    }

    /**
     * <pre>
     * 获取：
     * 表字段：t_owner_family.age
     * </pre>
     *
     * @return t_owner_family.age：
     */
    public Integer getAge() {
        return age;
    }

    /**
     * <pre>
     * 设置：
     * 表字段：t_owner_family.age
     * </pre>
     *
     * @param age
     *            t_owner_family.age：
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * <pre>
     * 获取：
     * 表字段：t_owner_family.owner_id
     * </pre>
     *
     * @return t_owner_family.owner_id：
     */
    public Integer getOwnerId() {
        return ownerId;
    }

    /**
     * <pre>
     * 设置：
     * 表字段：t_owner_family.owner_id
     * </pre>
     *
     * @param ownerId
     *            t_owner_family.owner_id：
     */
    public void setOwnerId(Integer ownerId) {
        this.ownerId = ownerId;
    }
}