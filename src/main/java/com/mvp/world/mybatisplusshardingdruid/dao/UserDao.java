package com.mvp.world.mybatisplusshardingdruid.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.mvp.world.mybatisplusshardingdruid.model.po.UserPo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserDao extends BaseMapper<UserPo> {
    @Select("select * from `user` where sex = #{sex, jdbcType=INTEGER} limit 10")
    List<UserPo> getBySexDefaultDB(@Param("sex") Integer sex);

    @Select("select * from `user` where sex = #{sex, jdbcType=INTEGER} limit 10")
    List<UserPo> getBySexCustomDB(@Param("sex") Integer sex);

    @Select("select * from `user` where type = #{type, jdbcType=INTEGER} limit 10")
    List<UserPo> getByTypeDefaultDB(@Param("type") Integer type);

    UserPo selectUserById(Long id);
}
