package org.chaoxuan.zeus.util;

/**
 * Created by Administrator on 2017/7/11 0011.
 */
public enum FitOrderState {
    A(5,"未发布计划(未编辑工程量)"),B(6,"施工中"),C(9,"暂停施工"),D(10,"撤销合同"),E(7,"已收房"),
    F(11,"未发布计划(已编辑工程量)");
    int value;
    String name;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static String getName(int value){
            for(FitOrderState fitOrderState:FitOrderState.values())
            {
                if(fitOrderState.value==value)
                    return fitOrderState.name;
            }
            return null;
    }

    FitOrderState(int value, String name){
        this.value=value;
        this.name=name;
    }
}
