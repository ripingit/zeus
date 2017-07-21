package org.chaoxuan.zeus.model;

/**
 * Created by Administrator on 2017/5/18 0018.
 */
public class Phase {

    private int totalDays;
    private int number;
    public int getTotalDays() {
        return totalDays;
    }

    public void setTotalDays(int totalDays) {
        this.totalDays = totalDays;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Phase(int totalDays, int number) {
        this.totalDays = totalDays;
        this.number = number;
    }
}
