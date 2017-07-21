package org.chaoxuan.zeus.service;

import org.chaoxuan.commons.pojo.PGResults;
import org.chaoxuan.zeus.model.*;

import java.util.List;

public interface FitMeassageService {
	List<FitMeassage> getMeassage(Integer status);
	List<FitMeassage> getMeassageList();
}
