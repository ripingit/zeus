package org.chaoxuan.zeus.model;

public class FitManager {
    /**
     * <pre>
     *
     * 表字段 : t_fit_manager.id
     * </pre>
     */
    private Integer id;

    /**
     * <pre>
     * 管家名字
     * 表字段 : t_fit_manager.name
     * </pre>
     */
    private String name;

    /**
     * <pre>
     * 管家电话
     * 表字段 : t_fit_manager.phone
     * </pre>
     */
    private String phone;

    private Integer status;
    private Integer statuOrder;

    private String password;

    private Integer sex;

    private String personalLabel;

    private String photo;
    private String area;

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public void setPersonalLabel(String personalLabel) {
        this.personalLabel = personalLabel;
    }

    public String getPassword() {
        return password;
    }

    public Integer getSex() {
        return sex;
    }

    public String getPersonalLabel() {
        return personalLabel;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getStatus() {
        return status;
    }

    public Integer getStatuOrder() {
        return statuOrder;
    }

    public void setStatuOrder(Integer statuOrder) {
        this.statuOrder = statuOrder;
    }

    /**
     * <pre>
     * 获取：
     * 表字段：t_fit_manager.id
     * </pre>
     *
     * @return t_fit_manager.id：
     */
    //管家地区
    private String managerArea;
    private Integer fitOrderid;

    public void setFitOrderid(Integer fitOrderid) {
        this.fitOrderid = fitOrderid;
    }

    public Integer getFitOrderid() {
        return fitOrderid;
    }

    private FitLog fitLog;

    public FitLog getFitLog() {
        return fitLog;
    }

    public void setFitLog(FitLog fitLog) {
        this.fitLog = fitLog;
    }

    public String getManagerArea() {
        return managerArea;
    }

    public void setManagerArea(String managerArea) {
        this.managerArea = managerArea;
    }

    public Integer getId() {
        return id;
    }

    /**
     * <pre>
     * 设置：
     * 表字段：t_fit_manager.id
     * </pre>
     *
     * @param id t_fit_manager.id：
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * <pre>
     * 获取：管家名字
     * 表字段：t_fit_manager.name
     * </pre>
     *
     * @return t_fit_manager.name：管家名字
     */
    public String getName() {
        return name;
    }

    /**
     * <pre>
     * 设置：管家名字
     * 表字段：t_fit_manager.name
     * </pre>
     *
     * @param name t_fit_manager.name：管家名字
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * <pre>
     * 获取：管家电话
     * 表字段：t_fit_manager.phone
     * </pre>
     *
     * @return t_fit_manager.phone：管家电话
     */
    public String getPhone() {
        return phone;
    }

    /**
     * <pre>
     * 设置：管家电话
     * 表字段：t_fit_manager.phone
     * </pre>
     *
     * @param phone t_fit_manager.phone：管家电话
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }


    public String getPhoto() {
        return photo;
    }


    public void setPhoto(String photo) {
        this.photo = photo;
    }
}
