package org.chaoxuan.zeus.model;

public class Worker {
    /**
     * <pre>
     * 主键 ID
     * 表字段 : t_worker.id
     * </pre>
     */
    private Integer id;

    /**
     * <pre>
     * 姓名
     * 表字段 : t_worker.name
     * </pre>
     */
    private String name;

    /**
     * <pre>
     * 手机号
     * 表字段 : t_worker.mobile
     * </pre>
     */
    private String mobile;

    /**
     * <pre>
     * 密码
     * 表字段 : t_worker.password
     * </pre>
     */
    private String password;

    /**
     * <pre>
     * 性别 0 女 1 男
     * 表字段 : t_worker.sex
     * </pre>
     */
    private Integer sex;

    /**
     * <pre>
     * 工种 ID
     * 表字段 : t_worker.type_ids
     * </pre>
     */
    private String typeIds;

    /**
     * <pre>
     * 工种名称
     * 表字段 : t_worker.type_names
     * </pre>
     */
    private String typeNames;

    /**
     * <pre>
     * 从业年限
     * 表字段 : t_worker.work_years
     * </pre>
     */
    private String workYears;

    /**
     * <pre>
     * 资格证书
     * 表字段 : t_worker.cert
     * </pre>
     */
    private String cert;

    /**
     * <pre>
     * 个人标签
     * 表字段 : t_worker.personal_label
     * </pre>
     */
    private String personalLabel;
   private Integer taskId;

    public Integer getTaskId() {
        return taskId;
    }

    public void setTaskId(Integer taskId) {
        this.taskId = taskId;
    }

    private String head;

    private String nginx;
    /**
     * <pre>
     * 获取：主键 ID
     * 表字段：t_worker.id
     * </pre>
     *
     * @return t_worker.id：主键 ID
     */
    public Integer getId() {
        return id;
    }

    /**
     * <pre>
     * 设置：主键 ID
     * 表字段：t_worker.id
     * </pre>
     *
     * @param id t_worker.id：主键 ID
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * <pre>
     * 获取：姓名
     * 表字段：t_worker.name
     * </pre>
     *
     * @return t_worker.name：姓名
     */
    public String getName() {
        return name;
    }

    /**
     * <pre>
     * 设置：姓名
     * 表字段：t_worker.name
     * </pre>
     *
     * @param name t_worker.name：姓名
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * <pre>
     * 获取：手机号
     * 表字段：t_worker.mobile
     * </pre>
     *
     * @return t_worker.mobile：手机号
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * <pre>
     * 设置：手机号
     * 表字段：t_worker.mobile
     * </pre>
     *
     * @param mobile t_worker.mobile：手机号
     */
    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    /**
     * <pre>
     * 获取：密码
     * 表字段：t_worker.password
     * </pre>
     *
     * @return t_worker.password：密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * <pre>
     * 设置：密码
     * 表字段：t_worker.password
     * </pre>
     *
     * @param password t_worker.password：密码
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * <pre>
     * 获取：性别 0 女 1 男
     * 表字段：t_worker.sex
     * </pre>
     *
     * @return t_worker.sex：性别 0 女 1 男
     */
    public Integer getSex() {
        return sex;
    }

    /**
     * <pre>
     * 设置：性别 0 女 1 男
     * 表字段：t_worker.sex
     * </pre>
     *
     * @param sex t_worker.sex：性别 0 女 1 男
     */
    public void setSex(Integer sex) {
        this.sex = sex;
    }

    /**
     * <pre>
     * 获取：工种 ID
     * 表字段：t_worker.type_ids
     * </pre>
     *
     * @return t_worker.type_ids：工种 ID
     */
    public String getTypeIds() {
        return typeIds;
    }

    /**
     * <pre>
     * 设置：工种 ID
     * 表字段：t_worker.type_ids
     * </pre>
     *
     * @param typeIds t_worker.type_ids：工种 ID
     */
    public void setTypeIds(String typeIds) {
        this.typeIds = typeIds == null ? null : typeIds.trim();
    }

    /**
     * <pre>
     * 获取：工种名称
     * 表字段：t_worker.type_names
     * </pre>
     *
     * @return t_worker.type_names：工种名称
     */
    public String getTypeNames() {
        return typeNames;
    }

    /**
     * <pre>
     * 设置：工种名称
     * 表字段：t_worker.type_names
     * </pre>
     *
     * @param typeNames t_worker.type_names：工种名称
     */
    public void setTypeNames(String typeNames) {
        this.typeNames = typeNames == null ? null : typeNames.trim();
    }

    /**
     * <pre>
     * 获取：从业年限
     * 表字段：t_worker.work_years
     * </pre>
     *
     * @return t_worker.work_years：从业年限
     */
    public String getWorkYears() {
        return workYears;
    }

    /**
     * <pre>
     * 设置：从业年限
     * 表字段：t_worker.work_years
     * </pre>
     *
     * @param workYears t_worker.work_years：从业年限
     */
    public void setWorkYears(String workYears) {
        this.workYears = workYears == null ? null : workYears.trim();
    }

    /**
     * <pre>
     * 获取：资格证书
     * 表字段：t_worker.cert
     * </pre>
     *
     * @return t_worker.cert：资格证书
     */
    public String getCert() {
        return cert;
    }

    /**
     * <pre>
     * 设置：资格证书
     * 表字段：t_worker.cert
     * </pre>
     *
     * @param cert t_worker.cert：资格证书
     */
    public void setCert(String cert) {
        this.cert = cert == null ? null : cert.trim();
    }

    /**
     * <pre>
     * 获取：个人标签
     * 表字段：t_worker.personal_label
     * </pre>
     *
     * @return t_worker.personal_label：个人标签
     */
    public String getPersonalLabel() {
        return personalLabel;
    }

    /**
     * <pre>
     * 设置：个人标签
     * 表字段：t_worker.personal_label
     * </pre>
     *
     * @param personalLabel t_worker.personal_label：个人标签
     */
    public void setPersonalLabel(String personalLabel) {
        this.personalLabel = personalLabel == null ? null : personalLabel.trim();
    }

    public String getHead() {
        return head;
    }

    public void setHead(String head) {
        this.head = head;
    }

    public String getNginx() {
        return nginx;
    }

    public void setNginx(String nginx) {
        this.nginx = nginx;
    }
}