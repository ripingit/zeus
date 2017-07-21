package org.chaoxuan.zeus.model;

import java.util.Date;

public class RequirementProduct {
    /**
     * <pre>
     * 
     * 表字段 : t_requirement_product.id
     * </pre>
     */
    private Integer id;

    /**
     * <pre>
     * 关联的材料id
     * 表字段 : t_requirement_product.product_id
     * </pre>
     */
    private Integer productId;

    /**
     * <pre>
     * 材料数量
     * 表字段 : t_requirement_product.quantity
     * </pre>
     */
    private Float quantity;

    /**
     * <pre>
     * 生产完成时间
     * 表字段 : t_requirement_product.production_completion_time
     * </pre>
     */
    private Date productionCompletionTime;

    /**
     * <pre>
     * 最早下单时间
     * 表字段 : t_requirement_product.place_order_time
     * </pre>
     */
    private Date placeOrderTime;

    /**
     * <pre>
     * 最晚到货时间
     * 表字段 : t_requirement_product.product_arrival_time
     * </pre>
     */
    private Date productArrivalTime;

    /**
     * <pre>
     * 进度
     * 表字段 : t_requirement_product.status
     * </pre>
     */
    private Integer status;

    /**
     * <pre>
     * 关联装修任务
     * 表字段 : t_requirement_product.fit_task_id
     * </pre>
     */
    private Integer fitTaskId;

    /**
     * <pre>
     * 规格
     * 表字段 : t_requirement_product.specification
     * </pre>
     */
    private String specification;

    /**
     * <pre>
     * 工程量
     * 表字段 : t_requirement_product.workamount
     * </pre>
     */
    private String workamount;

    /**
     * <pre>
     * 预估需求量
     * 表字段 : t_requirement_product.forecast
     * </pre>
     */
    private String forecast;
    private String title;
    private String prStatus;

    public void setPrStatus(String prStatus) {
        this.prStatus = prStatus;
    }

    public String getPrStatus() {
        return prStatus;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * <pre>
     * 获取：
     * 表字段：t_requirement_product.id
     * </pre>
     *
     * @return t_requirement_product.id：
     */
    public Integer getId() {
        return id;
    }

    /**
     * <pre>
     * 设置：
     * 表字段：t_requirement_product.id
     * </pre>
     *
     * @param id
     *            t_requirement_product.id：
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * <pre>
     * 获取：关联的材料id
     * 表字段：t_requirement_product.product_id
     * </pre>
     *
     * @return t_requirement_product.product_id：关联的材料id
     */
    public Integer getProductId() {
        return productId;
    }

    /**
     * <pre>
     * 设置：关联的材料id
     * 表字段：t_requirement_product.product_id
     * </pre>
     *
     * @param productId
     *            t_requirement_product.product_id：关联的材料id
     */
    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    /**
     * <pre>
     * 获取：材料数量
     * 表字段：t_requirement_product.quantity
     * </pre>
     *
     * @return t_requirement_product.quantity：材料数量
     */
    public Float getQuantity() {
        return quantity;
    }

    /**
     * <pre>
     * 设置：材料数量
     * 表字段：t_requirement_product.quantity
     * </pre>
     *
     * @param quantity
     *            t_requirement_product.quantity：材料数量
     */
    public void setQuantity(Float quantity) {
        this.quantity = quantity;
    }

    /**
     * <pre>
     * 获取：生产完成时间
     * 表字段：t_requirement_product.production_completion_time
     * </pre>
     *
     * @return t_requirement_product.production_completion_time：生产完成时间
     */
    public Date getProductionCompletionTime() {
        return productionCompletionTime;
    }

    /**
     * <pre>
     * 设置：生产完成时间
     * 表字段：t_requirement_product.production_completion_time
     * </pre>
     *
     * @param productionCompletionTime
     *            t_requirement_product.production_completion_time：生产完成时间
     */
    public void setProductionCompletionTime(Date productionCompletionTime) {
        this.productionCompletionTime = productionCompletionTime;
    }

    /**
     * <pre>
     * 获取：最早下单时间
     * 表字段：t_requirement_product.place_order_time
     * </pre>
     *
     * @return t_requirement_product.place_order_time：最早下单时间
     */
    public Date getPlaceOrderTime() {
        return placeOrderTime;
    }

    /**
     * <pre>
     * 设置：最早下单时间
     * 表字段：t_requirement_product.place_order_time
     * </pre>
     *
     * @param placeOrderTime
     *            t_requirement_product.place_order_time：最早下单时间
     */
    public void setPlaceOrderTime(Date placeOrderTime) {
        this.placeOrderTime = placeOrderTime;
    }

    /**
     * <pre>
     * 获取：最晚到货时间
     * 表字段：t_requirement_product.product_arrival_time
     * </pre>
     *
     * @return t_requirement_product.product_arrival_time：最晚到货时间
     */
    public Date getProductArrivalTime() {
        return productArrivalTime;
    }

    /**
     * <pre>
     * 设置：最晚到货时间
     * 表字段：t_requirement_product.product_arrival_time
     * </pre>
     *
     * @param productArrivalTime
     *            t_requirement_product.product_arrival_time：最晚到货时间
     */
    public void setProductArrivalTime(Date productArrivalTime) {
        this.productArrivalTime = productArrivalTime;
    }

    /**
     * <pre>
     * 获取：进度
     * 表字段：t_requirement_product.status
     * </pre>
     *
     * @return t_requirement_product.status：进度
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * <pre>
     * 设置：进度
     * 表字段：t_requirement_product.status
     * </pre>
     *
     * @param status
     *            t_requirement_product.status：进度
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * <pre>
     * 获取：关联装修任务
     * 表字段：t_requirement_product.fit_task_id
     * </pre>
     *
     * @return t_requirement_product.fit_task_id：关联装修任务
     */
    public Integer getFitTaskId() {
        return fitTaskId;
    }

    /**
     * <pre>
     * 设置：关联装修任务
     * 表字段：t_requirement_product.fit_task_id
     * </pre>
     *
     * @param fitTaskId
     *            t_requirement_product.fit_task_id：关联装修任务
     */
    public void setFitTaskId(Integer fitTaskId) {
        this.fitTaskId = fitTaskId;
    }

    /**
     * <pre>
     * 获取：规格
     * 表字段：t_requirement_product.specification
     * </pre>
     *
     * @return t_requirement_product.specification：规格
     */
    public String getSpecification() {
        return specification;
    }

    /**
     * <pre>
     * 设置：规格
     * 表字段：t_requirement_product.specification
     * </pre>
     *
     * @param specification
     *            t_requirement_product.specification：规格
     */
    public void setSpecification(String specification) {
        this.specification = specification == null ? null : specification.trim();
    }

    /**
     * <pre>
     * 获取：工程量
     * 表字段：t_requirement_product.workamount
     * </pre>
     *
     * @return t_requirement_product.workamount：工程量
     */
    public String getWorkamount() {
        return workamount;
    }

    /**
     * <pre>
     * 设置：工程量
     * 表字段：t_requirement_product.workamount
     * </pre>
     *
     * @param workamount
     *            t_requirement_product.workamount：工程量
     */
    public void setWorkamount(String workamount) {
        this.workamount = workamount == null ? null : workamount.trim();
    }

    /**
     * <pre>
     * 获取：预估需求量
     * 表字段：t_requirement_product.forecast
     * </pre>
     *
     * @return t_requirement_product.forecast：预估需求量
     */
    public String getForecast() {
        return forecast;
    }

    /**
     * <pre>
     * 设置：预估需求量
     * 表字段：t_requirement_product.forecast
     * </pre>
     *
     * @param forecast
     *            t_requirement_product.forecast：预估需求量
     */
    public void setForecast(String forecast) {
        this.forecast = forecast == null ? null : forecast.trim();
    }
}