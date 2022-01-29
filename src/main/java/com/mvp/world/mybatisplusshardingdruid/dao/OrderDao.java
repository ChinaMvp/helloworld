package com.mvp.world.mybatisplusshardingdruid.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.mvp.world.mybatisplusshardingdruid.model.po.OrderPo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Mapper
@Repository
public interface OrderDao extends BaseMapper<OrderPo> {

    List<Map<String, String>> getUserOrder(@Param("user_id") Long userId, @Param("order_id") Long orderId);

    int insertOrders(@Param("orderInfos") List<OrderPo> orderInfos);

}
