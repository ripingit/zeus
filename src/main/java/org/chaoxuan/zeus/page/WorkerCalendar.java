package org.chaoxuan.zeus.page;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @author Yurnero
 * @data 2017/6/27
 * @description 工人日历
 */
public class WorkerCalendar {

    private Integer workerId;

    private Integer currYear;

    private Integer currMonth;

    private Integer currDay;

    private Date currDate;

    private List<List<Map<String, Object>>> list = new ArrayList<List<Map<String, Object>>>();

    private String head;

    private String nginx;

    public Integer getWorkerId() {
        return workerId;
    }

    public void setWorkerId(Integer workerId) {
        this.workerId = workerId;
    }

    public Integer getCurrYear() {
        return currYear;
    }

    public void setCurrYear(Integer currYear) {
        this.currYear = currYear;
    }

    public Integer getCurrMonth() {
        return currMonth;
    }

    public void setCurrMonth(Integer currMonth) {
        this.currMonth = currMonth;
    }

    public void setCurrDay(Integer currDay) {
        this.currDay = currDay;
    }

    public Integer getCurrDay() {
        return currDay;
    }

    public Date getCurrDate() {
        return currDate;
    }

    public void setCurrDate(Date currDate) {
        this.currDate = currDate;
    }

    public List<List<Map<String, Object>>> getList() {
        return list;
    }

    public void setList(List<List<Map<String, Object>>> list) {
        this.list = list;
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
