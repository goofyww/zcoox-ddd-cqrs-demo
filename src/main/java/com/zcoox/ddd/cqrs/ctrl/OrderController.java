package com.zcoox.ddd.cqrs.ctrl;

import com.zcoox.ddd.cqrs.model.entity.CreateOrderModel;
import com.zcoox.ddd.cqrs.model.entity.GetOrderInfoModel;
import com.zcoox.ddd.cqrs.service.CommandBus;
import com.zcoox.ddd.cqrs.service.CreateOrderCommand;
import com.zcoox.ddd.cqrs.service.GetOrderInfoService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class OrderController {

    @Resource
    private GetOrderInfoService getOrderInfoService;

    @Resource
    private CreateOrderCommand createOrderCommand;

    @Resource
    private CommandBus commandBus;

    @PostMapping("/order/getInfo")
    public Object getOrderInfo(GetOrderInfoModel model) {
        return getOrderInfoService.getOrderInfos(model);
    }

    @PostMapping("/order/creat")
    public Object createOrderInfo(CreateOrderModel model) {
        return commandBus.dispatch(createOrderCommand, model);
    }

}
