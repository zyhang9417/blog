package com.zyhang.service;

import com.zyhang.po.User;

public interface UserService {

    User checkUser(String username, String password);
}
