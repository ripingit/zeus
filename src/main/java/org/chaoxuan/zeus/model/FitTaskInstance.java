package org.chaoxuan.zeus.model;

import java.util.Date;
import java.util.List;
import java.util.Map;

public class FitTaskInstance {
    /**
     * <pre>
     *
     * 表字段 : t_fit_task_instance.id
     * </pre>
     */
    private Integer id;

    /**
     * <pre>
     * 关联装修订单id
     * 表字段 : t_fit_task_instance.fit_order_id
     * </pre>
     */
    private Integer fitOrderId;

    /**
     * <pre>
     * 关联装修任务id
     * 表字段 : t_fit_task_instance.fit_task_id
     * </pre>
     */
    private Integer fitTaskId;

    /**
     * <pre>
     * 任务开始时间
     * 表字段 : t_fit_task_instance.task_start_time
     * </pre>
     */
    private Date taskStartTime;

    /**
     * <pre>
     * 任务验收时间
     * 表字段 : t_fit_task_instance.task_check_time
     * </pre>
     */
    private Date taskCheckTime;

    /**
     * <pre>
     * 任务最大天数
     * 表字段 : t_fit_task_instance.task_max_day
     * </pre>
     */
    private Integer taskMaxDay;

    /**
     * <pre>
     * 任务最小天数
     * 表字段 : t_fit_task_instance.task_min_day
     * </pre>
     */
    private Integer taskMinDay;

    /**
     * <pre>
     * 任务实际天数
     * 表字段 : t_fit_task_instance.task_actual_day
     * </pre>
     */
    private Integer taskActualDay;

    /**
     * <pre>
     * 机械需求清单
     * 表字段 : t_fit_task_instance.requirement_machine_id
     * </pre>
     */
    private Integer requirementMachineId;
    private List<RequirementMachine> RequirementMachineList;
    /**
     * <pre>
     * 材料需求清单
     * 表字段 : t_fit_task_instance.requirement_product_id
     * </pre>
     */
    private Integer requirementProductId;
    private List<RequirementProduct> requirementProductList;
    /**
     * <pre>
     * 工人需求清单
     * 表字段 : t_fit_task_instance.requirement_worker_id
     * </pre>
     */
    private Integer requirementWorkerId;
    private List<RequirementWorker> requirementWorkerList;
    private Map requirementList;

    private Boolean currTask = false;
    private FitStandard fitStandard;
    private FitMoney fitMoney;
    private List<FitProcessFlow> fitProcessFlows;
    private FitOrder fitOrder;
    private String status;
    private String userName;
    private String role;
    private String userId;
    private String street;
    private String community;

    private Integer taskSum;

    public void setTaskSum(Integer taskSum) {
        this.taskSum = taskSum;
    }

    public Integer getTaskSum() {
        return taskSum;
    }

    public String getUserName() {
        return userName;
    }

    public String getRole() {
        return role;
    }

    public String getUserId() {
        return userId;
    }

    public String getStreet() {
        return street;
    }

    public String getCommunity() {
        return community;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setCommunity(String community) {
        this.community = community;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setFitOrder(FitOrder fitOrder) {
        this.fitOrder = fitOrder;
    }

    public FitOrder getFitOrder() {
        return fitOrder;
    }

    public void setFitProcessFlows(List<FitProcessFlow> fitProcessFlows) {
        this.fitProcessFlows = fitProcessFlows;
    }

    public List<FitProcessFlow> getFitProcessFlows() {
        return fitProcessFlows;
    }

    public void setFitMoney(FitMoney fitMoney) {
        this.fitMoney = fitMoney;
    }

    public FitMoney getFitMoney() {
        return fitMoney;
    }

    public void setFitStandard(FitStandard fitStandard) {
        this.fitStandard = fitStandard;
    }

    public FitStandard getFitStandard() {
        return fitStandard;
    }

    /**
     * <pre>
     * 0未启动 1已完成 2施工中
     * 表字段 : t_fit_task_instance.complete_flag
     * </pre>
     */
    private Integer completeFlag;

    private Integer currTaskIndex;

    public Integer getCurrTaskIndex() {
        return currTaskIndex;
    }

    public void setCurrTaskIndex(Integer currTaskIndex) {
        this.currTaskIndex = currTaskIndex;
    }

    public Integer getCompleteFlag() {
        return completeFlag;
    }

    public void setCompleteFlag(Integer completeFlag) {
        this.completeFlag = completeFlag;
    }

    public Boolean getCurrTask() {
        return currTask;
    }

    public void setCurrTask(Boolean currTask) {
        this.currTask = currTask;
    }

    public Map getRequirementList() {
        return requirementList;
    }

    public void setRequirementList(Map requirementList) {
        this.requirementList = requirementList;
    }

    public List<RequirementMachine> getRequirementMachineList() {
        return RequirementMachineList;
    }

    public void setRequirementMachineList(List<RequirementMachine> requirementMachineList) {
        RequirementMachineList = requirementMachineList;
    }

    public List<RequirementProduct> getRequirementProductList() {
        return requirementProductList;
    }

    public void setRequirementProductList(List<RequirementProduct> requirementProductList) {
        this.requirementProductList = requirementProductList;
    }

    public List<RequirementWorker> getRequirementWorkerList() {
        return requirementWorkerList;
    }

    public void setRequirementWorkerList(List<RequirementWorker> requirementWorkerList) {
        this.requirementWorkerList = requirementWorkerList;
    }

    /**
     * <pre>
     * 工程定额
     * 表字段 : t_fit_task_instance.work_amount
     * </pre>
     */
    private Integer workAmount;

    /**
     * <pre>
     * 任务名称
     * 表字段 : t_fit_task_instance.title
     * </pre>
     */
    private String title;

    /**
     * <pre>
     *
     * 表字段 : t_fit_task_instance.category
     * </pre>
     */
    private Integer category;

    /**
     * <pre>
     *
     * 表字段 : t_fit_task_instance.fit_standard_id
     * </pre>
     */
    private Integer fitStandardId;

    /**
     * <pre>
     *
     * 表字段 : t_fit_task_instance.phase
     * </pre>
     */
    private Integer phase;

    /**
     * <pre>
     *
     * 表字段 : t_fit_task_instance.version
     * </pre>
     */
    private String version;

    /**
     * <pre>
     *
     * 表字段 : t_fit_task_instance.sequence
     * </pre>
     */
    private Integer sequence;

    /**
     * <pre>
     *
     * 表字段 : t_fit_task_instance.unit
     * </pre>
     */
    private String unit;
    private String quotaArea;

    private String processFlow;

    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getProcessFlow() {
        return processFlow;
    }

    public void setProcessFlow(String processFlow) {
        this.processFlow = processFlow;
    }

    public String getQuotaArea() {
        return quotaArea;
    }

    public void setQuotaArea(String quotaArea) {
        this.quotaArea = quotaArea;
    }

    /**
     * <pre>
     * 获取：
     * 表字段：t_fit_task_instance.id
     * </pre>
     *
     * @return t_fit_task_instance.id：
     */
    public Integer getId() {
        return id;
    }

    /**
     * <pre>
     * 设置：
     * 表字段：t_fit_task_instance.id
     * </pre>
     *
     * @param id t_fit_task_instance.id：
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * <pre>
     * 获取：关联装修订单id
     * 表字段：t_fit_task_instance.fit_order_id
     * </pre>
     *
     * @return t_fit_task_instance.fit_order_id：关联装修订单id
     */
    public Integer getFitOrderId() {
        return fitOrderId;
    }

    /**
     * <pre>
     * 设置：关联装修订单id
     * 表字段：t_fit_task_instance.fit_order_id
     * </pre>
     *
     * @param fitOrderId t_fit_task_instance.fit_order_id：关联装修订单id
     */
    public void setFitOrderId(Integer fitOrderId) {
        this.fitOrderId = fitOrderId;
    }

    /**
     * <pre>
     * 获取：关联装修任务id
     * 表字段：t_fit_task_instance.fit_task_id
     * </pre>
     *
     * @return t_fit_task_instance.fit_task_id：关联装修任务id
     */
    public Integer getFitTaskId() {
        return fitTaskId;
    }

    /**
     * <pre>
     * 设置：关联装修任务id
     * 表字段：t_fit_task_instance.fit_task_id
     * </pre>
     *
     * @param fitTaskId t_fit_task_instance.fit_task_id：关联装修任务id
     */
    public void setFitTaskId(Integer fitTaskId) {
        this.fitTaskId = fitTaskId;
    }

    /**
     * <pre>
     * 获取：任务开始时间
     * 表字段：t_fit_task_instance.task_start_time
     * </pre>
     *
     * @return t_fit_task_instance.task_start_time：任务开始时间
     */
    public Date getTaskStartTime() {
        return taskStartTime;
    }

    /**
     * <pre>
     * 设置：任务开始时间
     * 表字段：t_fit_task_instance.task_start_time
     * </pre>
     *
     * @param taskStartTime t_fit_task_instance.task_start_time：任务开始时间
     */
    public void setTaskStartTime(Date taskStartTime) {
        this.taskStartTime = taskStartTime;
    }

    /**
     * <pre>
     * 获取：任务验收时间
     * 表字段：t_fit_task_instance.task_check_time
     * </pre>
     *
     * @return t_fit_task_instance.task_check_time：任务验收时间
     */
    public Date getTaskCheckTime() {
        return taskCheckTime;
    }

    /**
     * <pre>
     * 设置：任务验收时间
     * 表字段：t_fit_task_instance.task_check_time
     * </pre>
     *
     * @param taskCheckTime t_fit_task_instance.task_check_time：任务验收时间
     */
    public void setTaskCheckTime(Date taskCheckTime) {
        this.taskCheckTime = taskCheckTime;
    }

    /**
     * <pre>
     * 获取：任务最大天数
     * 表字段：t_fit_task_instance.task_max_day
     * </pre>
     *
     * @return t_fit_task_instance.task_max_day：任务最大天数
     */
    public Integer getTaskMaxDay() {
        return taskMaxDay;
    }

    /**
     * <pre>
     * 设置：任务最大天数
     * 表字段：t_fit_task_instance.task_max_day
     * </pre>
     *
     * @param taskMaxDay t_fit_task_instance.task_max_day：任务最大天数
     */
    public void setTaskMaxDay(Integer taskMaxDay) {
        this.taskMaxDay = taskMaxDay;
    }

    /**
     * <pre>
     * 获取：任务最小天数
     * 表字段：t_fit_task_instance.task_min_day
     * </pre>
     *
     * @return t_fit_task_instance.task_min_day：任务最小天数
     */
    public Integer getTaskMinDay() {
        return taskMinDay;
    }

    /**
     * <pre>
     * 设置：任务最小天数
     * 表字段：t_fit_task_instance.task_min_day
     * </pre>
     *
     * @param taskMinDay t_fit_task_instance.task_min_day：任务最小天数
     */
    public void setTaskMinDay(Integer taskMinDay) {
        this.taskMinDay = taskMinDay;
    }

    /**
     * <pre>
     * 获取：任务实际天数
     * 表字段：t_fit_task_instance.task_actual_day
     * </pre>
     *
     * @return t_fit_task_instance.task_actual_day：任务实际天数
     */
    public Integer getTaskActualDay() {
        return taskActualDay;
    }

    /**
     * <pre>
     * 设置：任务实际天数
     * 表字段：t_fit_task_instance.task_actual_day
     * </pre>
     *
     * @param taskActualDay t_fit_task_instance.task_actual_day：任务实际天数
     */
    public void setTaskActualDay(Integer taskActualDay) {
        this.taskActualDay = taskActualDay;
    }

    /**
     * <pre>
     * 获取：机械需求清单
     * 表字段：t_fit_task_instance.requirement_machine_id
     * </pre>
     *
     * @return t_fit_task_instance.requirement_machine_id：机械需求清单
     */
    public Integer getRequirementMachineId() {
        return requirementMachineId;
    }

    /**
     * <pre>
     * 设置：机械需求清单
     * 表字段：t_fit_task_instance.requirement_machine_id
     * </pre>
     *
     * @param requirementMachineId t_fit_task_instance.requirement_machine_id：机械需求清单
     */
    public void setRequirementMachineId(Integer requirementMachineId) {
        this.requirementMachineId = requirementMachineId;
    }

    /**
     * <pre>
     * 获取：材料需求清单
     * 表字段：t_fit_task_instance.requirement_product_id
     * </pre>
     *
     * @return t_fit_task_instance.requirement_product_id：材料需求清单
     */
    public Integer getRequirementProductId() {
        return requirementProductId;
    }

    /**
     * <pre>
     * 设置：材料需求清单
     * 表字段：t_fit_task_instance.requirement_product_id
     * </pre>
     *
     * @param requirementProductId t_fit_task_instance.requirement_product_id：材料需求清单
     */
    public void setRequirementProductId(Integer requirementProductId) {
        this.requirementProductId = requirementProductId;
    }

    /**
     * <pre>
     * 获取：工人需求清单
     * 表字段：t_fit_task_instance.requirement_worker_id
     * </pre>
     *
     * @return t_fit_task_instance.requirement_worker_id：工人需求清单
     */
    public Integer getRequirementWorkerId() {
        return requirementWorkerId;
    }

    /**
     * <pre>
     * 设置：工人需求清单
     * 表字段：t_fit_task_instance.requirement_worker_id
     * </pre>
     *
     * @param requirementWorkerId t_fit_task_instance.requirement_worker_id：工人需求清单
     */
    public void setRequirementWorkerId(Integer requirementWorkerId) {
        this.requirementWorkerId = requirementWorkerId;
    }

    /**
     * <pre>
     * 获取：工程定额
     * 表字段：t_fit_task_instance.work_amount
     * </pre>
     *
     * @return t_fit_task_instance.work_amount：工程定额
     */
    public Integer getWorkAmount() {
        return workAmount;
    }

    /**
     * <pre>
     * 设置：工程定额
     * 表字段：t_fit_task_instance.work_amount
     * </pre>
     *
     * @param workAmount t_fit_task_instance.work_amount：工程定额
     */
    public void setWorkAmount(Integer workAmount) {
        this.workAmount = workAmount;
    }

    /**
     * <pre>
     * 获取：任务名称
     * 表字段：t_fit_task_instance.title
     * </pre>
     *
     * @return t_fit_task_instance.title：任务名称
     */
    public String getTitle() {
        return title;
    }

    /**
     * <pre>
     * 设置：任务名称
     * 表字段：t_fit_task_instance.title
     * </pre>
     *
     * @param title t_fit_task_instance.title：任务名称
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * <pre>
     * 获取：
     * 表字段：t_fit_task_instance.category
     * </pre>
     *
     * @return t_fit_task_instance.category：
     */
    public Integer getCategory() {
        return category;
    }

    /**
     * <pre>
     * 设置：
     * 表字段：t_fit_task_instance.category
     * </pre>
     *
     * @param category t_fit_task_instance.category：
     */
    public void setCategory(Integer category) {
        this.category = category;
    }

    /**
     * <pre>
     * 获取：
     * 表字段：t_fit_task_instance.fit_standard_id
     * </pre>
     *
     * @return t_fit_task_instance.fit_standard_id：
     */
    public Integer getFitStandardId() {
        return fitStandardId;
    }

    /**
     * <pre>
     * 设置：
     * 表字段：t_fit_task_instance.fit_standard_id
     * </pre>
     *
     * @param fitStandardId t_fit_task_instance.fit_standard_id：
     */
    public void setFitStandardId(Integer fitStandardId) {
        this.fitStandardId = fitStandardId;
    }

    /**
     * <pre>
     * 获取：
     * 表字段：t_fit_task_instance.phase
     * </pre>
     *
     * @return t_fit_task_instance.phase：
     */
    public Integer getPhase() {
        return phase;
    }

    /**
     * <pre>
     * 设置：
     * 表字段：t_fit_task_instance.phase
     * </pre>
     *
     * @param phase t_fit_task_instance.phase：
     */
    public void setPhase(Integer phase) {
        this.phase = phase;
    }

    /**
     * <pre>
     * 获取：
     * 表字段：t_fit_task_instance.version
     * </pre>
     *
     * @return t_fit_task_instance.version：
     */
    public String getVersion() {
        return version;
    }

    /**
     * <pre>
     * 设置：
     * 表字段：t_fit_task_instance.version
     * </pre>
     *
     * @param version t_fit_task_instance.version：
     */
    public void setVersion(String version) {
        this.version = version == null ? null : version.trim();
    }

    /**
     * <pre>
     * 获取：
     * 表字段：t_fit_task_instance.sequence
     * </pre>
     *
     * @return t_fit_task_instance.sequence：
     */
    public Integer getSequence() {
        return sequence;
    }

    /**
     * <pre>
     * 设置：
     * 表字段：t_fit_task_instance.sequence
     * </pre>
     *
     * @param sequence t_fit_task_instance.sequence：
     */
    public void setSequence(Integer sequence) {
        this.sequence = sequence;
    }

    /**
     * <pre>
     * 获取：
     * 表字段：t_fit_task_instance.unit
     * </pre>
     *
     * @return t_fit_task_instance.unit：
     */
    public String getUnit() {
        return unit;
    }

    /**
     * <pre>
     * 设置：
     * 表字段：t_fit_task_instance.unit
     * </pre>
     *
     * @param unit t_fit_task_instance.unit：
     */
    public void setUnit(String unit) {
        this.unit = unit == null ? null : unit.trim();
    }
}
