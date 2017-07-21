package org.chaoxuan.zeus.service;

import java.util.List;

import org.chaoxuan.zeus.model.QuotaWorkerVersion;

public interface QuotaWorkerVersionService {
	
	List<QuotaWorkerVersion> list(String ids);
}
