package com.mvp.world.mybatisplusshardingdruid.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.mvp.world.mybatisplusshardingdruid.model.po.OrderItemPo;

import java.util.List;


public interface OrderItemService extends IService<OrderItemPo> {


    List<OrderItemPo> getOrderPoByUserId(Long userId, Long id);

    List<OrderItemPo> getOrderPoById(Long id);

    boolean saveBatchItems(List<OrderItemPo> orderItemPoList);

    Long saveOne(OrderItemPo orderItemPo);

}
