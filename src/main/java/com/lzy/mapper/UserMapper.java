package com.lzy.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lzy.model.User;

import java.util.List;

public interface UserMapper extends BaseMapper<User> {
    List<User> findUsers();

    void batchInsert(List<User> list);
}
