package com.zcoox.ddd.cqrs.service;

import com.zcoox.ddd.cqrs.model.entity.GetOrderInfoModel;

public interface GetOrderInfoService {

    Object getOrderInfos(GetOrderInfoModel model);

}
