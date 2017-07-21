package org.chaoxuan.zeus.model;

import  java.util.List;
/**
 * Created by Administrator on 2017/6/30.
 */
public class FitProcessFlow {
    private Integer id;
    private Integer fitStandardId;
    private String title;
    private String describe;
    private String attachs;
    private List<FitProcessSpeces> fitProcessSpeces;
    private WorkerResult workerResult;
    private Integer num;
    private Integer restatus;

    public Integer getRestatus() {
        return restatus;
    }

    public void setRestatus(Integer restatus) {
        this.restatus = restatus;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Integer getNum() {
        return num;
    }
    public void setWorkerResult(WorkerResult workerResult) {
        this.workerResult = workerResult;
    }

    public WorkerResult getWorkerResult() {
        return workerResult;
    }

    public void setFitProcessSpeces(List<FitProcessSpeces> fitProcessSpeces) {
        this.fitProcessSpeces = fitProcessSpeces;
    }

    public List<FitProcessSpeces> getFitProcessSpeces() {
        return fitProcessSpeces;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setFitStandardId(Integer fitStandardId) {
        this.fitStandardId = fitStandardId;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public void setAttachs(String attachs) {
        this.attachs = attachs;
    }

    public Integer getId() {
        return id;
    }

    public Integer getFitStandardId() {
        return fitStandardId;
    }

    public String getTitle() {
        return title;
    }

    public String getDescribe() {
        return describe;
    }

    public String getAttachs() {
        return attachs;
    }
}
