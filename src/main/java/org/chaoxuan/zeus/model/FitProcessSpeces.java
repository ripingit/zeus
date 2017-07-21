package org.chaoxuan.zeus.model;

/**
 * Created by Administrator on 2017/6/30.
 */
public class FitProcessSpeces {
    private Integer id;
    private Integer tProcessFlowId;
    private String title;
    private String desc;
    private String attachs;
    public void setId(Integer id) {
        this.id = id;
    }

    public void settProcessFlowId(Integer tProcessFlowId) {
        this.tProcessFlowId = tProcessFlowId;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public void setAttachs(String attachs) {
        this.attachs = attachs;
    }

    public Integer getId() {
        return id;
    }

    public Integer gettProcessFlowId() {
        return tProcessFlowId;
    }

    public String getTitle() {
        return title;
    }

    public String getDesc() {
        return desc;
    }

    public String getAttachs() {
        return attachs;
    }
}
