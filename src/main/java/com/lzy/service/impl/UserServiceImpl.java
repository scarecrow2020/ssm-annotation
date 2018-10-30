package com.lzy.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lzy.mapper.UserMapper;
import com.lzy.model.User;
import com.lzy.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
    @Override
    public List<User> getUserList() {
        return baseMapper.findUsers();
    }

    @Override
    public IPage<User> findUserPage(Long page, Long size) {
        Wrapper<User> wrapper = new QueryWrapper<User>().eq("name", "aa");
        return baseMapper.selectPage(new Page(page, size), wrapper);
    }

    @Override
    public void batchInsert(List<User> users) {
        baseMapper.batchInsert(users);
    }

    @Override
    public User insertUser(User user) {
        baseMapper.insert(user);
        System.out.println("事务测试======================" + 2 / 0);
        baseMapper.insert(user);
        return user;
    }
}
