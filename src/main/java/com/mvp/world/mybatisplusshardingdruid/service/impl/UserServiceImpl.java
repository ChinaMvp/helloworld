package com.mvp.world.mybatisplusshardingdruid.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mvp.world.mybatisplusshardingdruid.dao.UserDao;
import com.mvp.world.mybatisplusshardingdruid.model.po.UserPo;
import com.mvp.world.mybatisplusshardingdruid.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl extends ServiceImpl<UserDao, UserPo> implements UserService {

    @Resource
    private UserDao userDao;

    @Override
    public UserPo selectDefaultDaoById(Long id) {
        QueryWrapper<UserPo> wrapper = Wrappers.query();
        wrapper.eq("id", id);
        return userDao.selectOne(wrapper);
    }

    @Override
    public UserPo selectDefaultById(Long id) {
        QueryWrapper<UserPo> wrapper = Wrappers.query();
        wrapper.eq("id", id);
        return this.getOne(wrapper);
    }

    @Override
    public List<UserPo> selectFromDefaultDB() {
        QueryWrapper<UserPo> wrapper = Wrappers.query();
        wrapper.eq("sex", 1);
        wrapper.last("limit 10");
        return userDao.selectList(wrapper);
    }

    @Override
    public List<UserPo> selectFromCustomDB() {
        QueryWrapper<UserPo> wrapper = Wrappers.query();
        wrapper.eq("type", 1);
        wrapper.last("limit 10");
        return userDao.selectList(wrapper);
    }

    @Override
    public List<UserPo> queryFromDefaultDB() {
        QueryWrapper<UserPo> wrapper = Wrappers.query();
        wrapper.eq("type", 1);
        wrapper.last("limit 10");
        return this.list(wrapper);
    }

    @Override
    public List<UserPo> queryFromCustomDB() {
        QueryWrapper<UserPo> wrapper = Wrappers.query();
        wrapper.eq("sex", 1);
        wrapper.last("limit 10");
        return this.list(wrapper);
    }

    @Override
    public Integer insertUserDefaultDB(UserPo user) {
        return userDao.insert(user);
    }

    @Override
    public Integer insertUserCustomDB(UserPo user) {
        return userDao.insert(user);
    }
}
