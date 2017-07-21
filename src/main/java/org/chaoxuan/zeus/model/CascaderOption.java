package org.chaoxuan.zeus.model;

import java.util.List;

/**
 * Created by Administrator on 2017/7/7 0007.
 */
public class CascaderOption extends Option{
    private List<CascaderOption> children;
    public List<CascaderOption> getChildren() {
        return children;
    }

    public void setChildren(List<CascaderOption> children) {
        this.children = children;
    }
}
