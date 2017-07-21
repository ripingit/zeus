package org.chaoxuan.zeus.model;

/**
 * Created by Administrator on 2017/5/24 0024.
 */
public enum State{
    UNSTART("未启动",0),
    STARTED("已启动",1),
    COMPLETED("已完成",2);
    private String title;
    private int index;
    State(String title,int index){
       this.index=index;
       this.title=title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
}
