package com.zcoox.ddd.cqrs.service;

import com.zcoox.ddd.cqrs.model.entity.CreateOrderModel;
import org.springframework.stereotype.Service;

/**
 * 创建订单命令处理类
 */
@Service
public class CreateOrderCommand implements Command<CreateOrderModel> {

    @Override
    public Object execute(CreateOrderModel commandModel) {
        // 具体的逻辑
        return null;
    }
    
}
