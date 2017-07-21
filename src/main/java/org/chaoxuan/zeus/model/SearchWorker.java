package org.chaoxuan.zeus.model;

import java.util.Date;

/**
 * Created by Administrator on 2017/7/12 0012.
 */
public class SearchWorker {
    String start;
    String end;
    String type;
    String ids;
    String requirementId;
    String fitTaskId;

    public String getRequirementId() {
        return requirementId;
    }

    public void setRequirementId(String requirementId) {
        this.requirementId = requirementId;
    }

    public String getFitTaskId() {
        return fitTaskId;
    }

    public void setFitTaskId(String fitTaskId) {
        this.fitTaskId = fitTaskId;
    }

    public String getIds() {
        return ids;
    }

    public void setIds(String ids) {
        this.ids = ids;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
