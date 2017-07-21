package org.chaoxuan.zeus.model;

public class HouseType {
    /**
     * <pre>
     * 
     * 表字段 : t_house_type.id
     * </pre>
     */
    private Integer id;

    /**
     * <pre>
     * 室数目
     * 表字段 : t_house_type.room_number
     * </pre>
     */
    private Integer roomNumber;

    /**
     * <pre>
     * 厅数目
     * 表字段 : t_house_type.hall_number
     * </pre>
     */
    private Integer hallNumber;

    /**
     * <pre>
     * 房屋总面积
     * 表字段 : t_house_type.total_area
     * </pre>
     */
    private Integer totalArea;

    /**
     * <pre>
     * 获取：
     * 表字段：t_house_type.id
     * </pre>
     *
     * @return t_house_type.id：
     */
    public Integer getId() {
        return id;
    }

    /**
     * <pre>
     * 设置：
     * 表字段：t_house_type.id
     * </pre>
     *
     * @param id
     *            t_house_type.id：
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * <pre>
     * 获取：室数目
     * 表字段：t_house_type.room_number
     * </pre>
     *
     * @return t_house_type.room_number：室数目
     */
    public Integer getRoomNumber() {
        return roomNumber;
    }

    /**
     * <pre>
     * 设置：室数目
     * 表字段：t_house_type.room_number
     * </pre>
     *
     * @param roomNumber
     *            t_house_type.room_number：室数目
     */
    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

    /**
     * <pre>
     * 获取：厅数目
     * 表字段：t_house_type.hall_number
     * </pre>
     *
     * @return t_house_type.hall_number：厅数目
     */
    public Integer getHallNumber() {
        return hallNumber;
    }

    /**
     * <pre>
     * 设置：厅数目
     * 表字段：t_house_type.hall_number
     * </pre>
     *
     * @param hallNumber
     *            t_house_type.hall_number：厅数目
     */
    public void setHallNumber(Integer hallNumber) {
        this.hallNumber = hallNumber;
    }

    /**
     * <pre>
     * 获取：房屋总面积
     * 表字段：t_house_type.total_area
     * </pre>
     *
     * @return t_house_type.total_area：房屋总面积
     */
    public Integer getTotalArea() {
        return totalArea;
    }

    /**
     * <pre>
     * 设置：房屋总面积
     * 表字段：t_house_type.total_area
     * </pre>
     *
     * @param totalArea
     *            t_house_type.total_area：房屋总面积
     */
    public void setTotalArea(Integer totalArea) {
        this.totalArea = totalArea;
    }
}