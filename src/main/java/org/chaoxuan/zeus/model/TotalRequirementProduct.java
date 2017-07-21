package org.chaoxuan.zeus.model;

public class TotalRequirementProduct {
    /**
     * <pre>
     * 主键 ID
     * 表字段 : t_total_requirement_product.id
     * </pre>
     */
    private Integer id;

    /**
     * <pre>
     * 材料 ID
     * 表字段 : t_total_requirement_product.category_id
     * </pre>
     */
    private Integer categoryId;

    /**
     * <pre>
     * 材料名称
     * 表字段 : t_total_requirement_product.category_name
     * </pre>
     */
    private String categoryName;

    /**
     * <pre>
     * 名称
     * 表字段 : t_total_requirement_product.title
     * </pre>
     */
    private String title;

    /**
     * <pre>
     * 品牌
     * 表字段 : t_total_requirement_product.brand
     * </pre>
     */
    private String brand;

    /**
     * <pre>
     * 规格
     * 表字段 : t_total_requirement_product.version
     * </pre>
     */
    private String version;

    /**
     * <pre>
     * 数量
     * 表字段 : t_total_requirement_product.amount
     * </pre>
     */
    private Integer amount;

    /**
     * <pre>
     * 订单 ID
     * 表字段 : t_total_requirement_product.fit_order_id
     * </pre>
     */
    private Integer fitOrderId;

    /**
     * <pre>
     * 获取：主键 ID
     * 表字段：t_total_requirement_product.id
     * </pre>
     *
     * @return t_total_requirement_product.id：主键 ID
     */
    public Integer getId() {
        return id;
    }

    /**
     * <pre>
     * 设置：主键 ID
     * 表字段：t_total_requirement_product.id
     * </pre>
     *
     * @param id
     *            t_total_requirement_product.id：主键 ID
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * <pre>
     * 获取：材料 ID
     * 表字段：t_total_requirement_product.category_id
     * </pre>
     *
     * @return t_total_requirement_product.category_id：材料 ID
     */
    public Integer getCategoryId() {
        return categoryId;
    }

    /**
     * <pre>
     * 设置：材料 ID
     * 表字段：t_total_requirement_product.category_id
     * </pre>
     *
     * @param categoryId
     *            t_total_requirement_product.category_id：材料 ID
     */
    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    /**
     * <pre>
     * 获取：材料名称
     * 表字段：t_total_requirement_product.category_name
     * </pre>
     *
     * @return t_total_requirement_product.category_name：材料名称
     */
    public String getCategoryName() {
        return categoryName;
    }

    /**
     * <pre>
     * 设置：材料名称
     * 表字段：t_total_requirement_product.category_name
     * </pre>
     *
     * @param categoryName
     *            t_total_requirement_product.category_name：材料名称
     */
    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName == null ? null : categoryName.trim();
    }

    /**
     * <pre>
     * 获取：名称
     * 表字段：t_total_requirement_product.title
     * </pre>
     *
     * @return t_total_requirement_product.title：名称
     */
    public String getTitle() {
        return title;
    }

    /**
     * <pre>
     * 设置：名称
     * 表字段：t_total_requirement_product.title
     * </pre>
     *
     * @param title
     *            t_total_requirement_product.title：名称
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * <pre>
     * 获取：品牌
     * 表字段：t_total_requirement_product.brand
     * </pre>
     *
     * @return t_total_requirement_product.brand：品牌
     */
    public String getBrand() {
        return brand;
    }

    /**
     * <pre>
     * 设置：品牌
     * 表字段：t_total_requirement_product.brand
     * </pre>
     *
     * @param brand
     *            t_total_requirement_product.brand：品牌
     */
    public void setBrand(String brand) {
        this.brand = brand == null ? null : brand.trim();
    }

    /**
     * <pre>
     * 获取：规格
     * 表字段：t_total_requirement_product.version
     * </pre>
     *
     * @return t_total_requirement_product.version：规格
     */
    public String getVersion() {
        return version;
    }

    /**
     * <pre>
     * 设置：规格
     * 表字段：t_total_requirement_product.version
     * </pre>
     *
     * @param version
     *            t_total_requirement_product.version：规格
     */
    public void setVersion(String version) {
        this.version = version == null ? null : version.trim();
    }

    /**
     * <pre>
     * 获取：数量
     * 表字段：t_total_requirement_product.amount
     * </pre>
     *
     * @return t_total_requirement_product.amount：数量
     */
    public Integer getAmount() {
        return amount;
    }

    /**
     * <pre>
     * 设置：数量
     * 表字段：t_total_requirement_product.amount
     * </pre>
     *
     * @param amount
     *            t_total_requirement_product.amount：数量
     */
    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    /**
     * <pre>
     * 获取：订单 ID
     * 表字段：t_total_requirement_product.fit_order_id
     * </pre>
     *
     * @return t_total_requirement_product.fit_order_id：订单 ID
     */
    public Integer getFitOrderId() {
        return fitOrderId;
    }

    /**
     * <pre>
     * 设置：订单 ID
     * 表字段：t_total_requirement_product.fit_order_id
     * </pre>
     *
     * @param fitOrderId
     *            t_total_requirement_product.fit_order_id：订单 ID
     */
    public void setFitOrderId(Integer fitOrderId) {
        this.fitOrderId = fitOrderId;
    }
}