package org.chaoxuan.zeus.model;

import java.util.List;

public class QuotaMaterial {
    /**
     * <pre>
     * 主键ID
     * 表字段 : t_quota_material.id
     * </pre>
     */
    private Integer id;

    /**
     * <pre>
     * 分类ID
     * 表字段 : t_quota_material.category_id
     * </pre>
     */
    private Integer categoryId;

    /**
     * <pre>
     * 分类名称
     * 表字段 : t_quota_material.category_name
     * </pre>
     */
    private String categoryName;

    /**
     * <pre>
     * 单位
     * 表字段 : t_quota_material.unit
     * </pre>
     */
    private String unit;

    /**
     * <pre>
     * 
     * 表字段 : t_quota_material.title
     * </pre>
     */
    private String title;

    private List<QuotaMaterialVersion> materialVersions;
    
    public List<QuotaMaterialVersion> getMaterialVersions() {
		return materialVersions;
	}

	public void setMaterialVersions(List<QuotaMaterialVersion> materialVersions) {
		this.materialVersions = materialVersions;
	}

	/**
     * <pre>
     * 获取：主键ID
     * 表字段：t_quota_material.id
     * </pre>
     *
     * @return t_quota_material.id：主键ID
     */
    public Integer getId() {
        return id;
    }

    /**
     * <pre>
     * 设置：主键ID
     * 表字段：t_quota_material.id
     * </pre>
     *
     * @param id
     *            t_quota_material.id：主键ID
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * <pre>
     * 获取：分类ID
     * 表字段：t_quota_material.category_id
     * </pre>
     *
     * @return t_quota_material.category_id：分类ID
     */
    public Integer getCategoryId() {
        return categoryId;
    }

    /**
     * <pre>
     * 设置：分类ID
     * 表字段：t_quota_material.category_id
     * </pre>
     *
     * @param categoryId
     *            t_quota_material.category_id：分类ID
     */
    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    /**
     * <pre>
     * 获取：分类名称
     * 表字段：t_quota_material.category_name
     * </pre>
     *
     * @return t_quota_material.category_name：分类名称
     */
    public String getCategoryName() {
        return categoryName;
    }

    /**
     * <pre>
     * 设置：分类名称
     * 表字段：t_quota_material.category_name
     * </pre>
     *
     * @param categoryName
     *            t_quota_material.category_name：分类名称
     */
    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName == null ? null : categoryName.trim();
    }

    /**
     * <pre>
     * 获取：单位
     * 表字段：t_quota_material.unit
     * </pre>
     *
     * @return t_quota_material.unit：单位
     */
    public String getUnit() {
        return unit;
    }

    /**
     * <pre>
     * 设置：单位
     * 表字段：t_quota_material.unit
     * </pre>
     *
     * @param unit
     *            t_quota_material.unit：单位
     */
    public void setUnit(String unit) {
        this.unit = unit == null ? null : unit.trim();
    }

    /**
     * <pre>
     * 获取：
     * 表字段：t_quota_material.title
     * </pre>
     *
     * @return t_quota_material.title：
     */
    public String getTitle() {
        return title;
    }

    /**
     * <pre>
     * 设置：
     * 表字段：t_quota_material.title
     * </pre>
     *
     * @param title
     *            t_quota_material.title：
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

	@Override
	public String toString() {
		return "QuotaMaterial [id=" + id + ", categoryId=" + categoryId
				+ ", categoryName=" + categoryName + ", unit=" + unit
				+ ", title=" + title + ", materialVersions=" + materialVersions
				+ "]";
	}
    
    
}