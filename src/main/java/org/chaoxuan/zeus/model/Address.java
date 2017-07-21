package org.chaoxuan.zeus.model;

import java.io.Serializable;

public class Address implements Serializable{
    /**
     * <pre>
     * 
     * 表字段 : t_address.id
     * </pre>
     */
    private Integer id;

    /**
     * <pre>
     * 
     * 表字段 : t_address.name
     * </pre>
     */
    private String name;

    /**
     * <pre>
     * 
     * 表字段 : t_address.pid
     * </pre>
     */
    private Integer pid;

    /**
     * <pre>
     * 获取：
     * 表字段：t_address.id
     * </pre>
     *
     * @return t_address.id：
     */
    public Integer getId() {
        return id;
    }

    /**
     * <pre>
     * 设置：
     * 表字段：t_address.id
     * </pre>
     *
     * @param id
     *            t_address.id：
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * <pre>
     * 获取：
     * 表字段：t_address.name
     * </pre>
     *
     * @return t_address.name：
     */
    public String getName() {
        return name;
    }

    /**
     * <pre>
     * 设置：
     * 表字段：t_address.name
     * </pre>
     *
     * @param name
     *            t_address.name：
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * <pre>
     * 获取：
     * 表字段：t_address.pid
     * </pre>
     *
     * @return t_address.pid：
     */
    public Integer getPid() {
        return pid;
    }

    /**
     * <pre>
     * 设置：
     * 表字段：t_address.pid
     * </pre>
     *
     * @param pid
     *            t_address.pid：
     */
    public void setPid(Integer pid) {
        this.pid = pid;
    }
}