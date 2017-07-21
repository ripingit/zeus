package org.chaoxuan.zeus.dao;

import org.chaoxuan.zeus.model.FitMeassage;
import java.util.List;
/**
 * Created by Administrator on 2017/7/3.
 */
public interface FitMeassageMapper {
    List<FitMeassage> getMeassage(Integer status);
    List<FitMeassage> getMeassageList();

}
