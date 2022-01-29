package com.mvp.world.mybatisplusshardingdruid.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.mvp.world.mybatisplusshardingdruid.model.po.OrderItemPo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface OrderItemDao extends BaseMapper<OrderItemPo> {

    int insertOrderItems(@Param("orderItemInfos") List<OrderItemPo> orderItemInfos);

}
