package org.chaoxuan.zeus.model;

public class FitRule {
    /**
     * <pre>
     * 
     * 表字段 : t_fit_rule.id
     * </pre>
     */
    private Integer id;

    /**
     * <pre>
     * 模板标题
     * 表字段 : t_fit_rule.title
     * </pre>
     */
    private String title;

    /**
     * <pre>
     * 版本号
     * 表字段 : t_fit_rule.version
     * </pre>
     */
    private String version;

    /**
     * <pre>
     * 所属城市
     * 表字段 : t_fit_rule.city
     * </pre>
     */
    private String city;

    /**
     * <pre>
     * 描述
     * 表字段 : t_fit_rule.description
     * </pre>
     */
    private String description;
    private String task;
    

    public String getTask() {
		return task;
	}

	public void setTask(String task) {
		this.task = task;
	}

	/**
     * <pre>
     * 获取：
     * 表字段：t_fit_rule.id
     * </pre>
     *
     * @return t_fit_rule.id：
     */
    public Integer getId() {
        return id;
    }

    /**
     * <pre>
     * 设置：
     * 表字段：t_fit_rule.id
     * </pre>
     *
     * @param id
     *            t_fit_rule.id：
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * <pre>
     * 获取：模板标题
     * 表字段：t_fit_rule.title
     * </pre>
     *
     * @return t_fit_rule.title：模板标题
     */
    public String getTitle() {
        return title;
    }

    /**
     * <pre>
     * 设置：模板标题
     * 表字段：t_fit_rule.title
     * </pre>
     *
     * @param title
     *            t_fit_rule.title：模板标题
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * <pre>
     * 获取：版本号
     * 表字段：t_fit_rule.version
     * </pre>
     *
     * @return t_fit_rule.version：版本号
     */
    public String getVersion() {
        return version;
    }

    /**
     * <pre>
     * 设置：版本号
     * 表字段：t_fit_rule.version
     * </pre>
     *
     * @param version
     *            t_fit_rule.version：版本号
     */
    public void setVersion(String version) {
        this.version = version == null ? null : version.trim();
    }

    /**
     * <pre>
     * 获取：所属城市
     * 表字段：t_fit_rule.city
     * </pre>
     *
     * @return t_fit_rule.city：所属城市
     */
    public String getCity() {
        return city;
    }

    /**
     * <pre>
     * 设置：所属城市
     * 表字段：t_fit_rule.city
     * </pre>
     *
     * @param city
     *            t_fit_rule.city：所属城市
     */
    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    /**
     * <pre>
     * 获取：描述
     * 表字段：t_fit_rule.description
     * </pre>
     *
     * @return t_fit_rule.description：描述
     */
    public String getDescription() {
        return description;
    }

    /**
     * <pre>
     * 设置：描述
     * 表字段：t_fit_rule.description
     * </pre>
     *
     * @param description
     *            t_fit_rule.description：描述
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

	@Override
	public String toString() {
		return "FitRule [id=" + id + ", title=" + title + ", version="
				+ version + ", city=" + city + ", description=" + description
				+",task="+task+"]";
	}
    
}