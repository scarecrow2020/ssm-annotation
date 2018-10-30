package com.lzy.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.lzy.model.User;

import java.util.List;

public interface UserService {

    List<User> getUserList();
    IPage<User> findUserPage(Long page, Long size);

    void batchInsert(List<User> users);

    User insertUser(User user);
}
