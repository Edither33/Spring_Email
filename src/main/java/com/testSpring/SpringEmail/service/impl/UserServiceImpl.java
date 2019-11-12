package com.testSpring.SpringEmail.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.testSpring.SpringEmail.dao.UserDao;
import com.testSpring.SpringEmail.entity.User;
import com.testSpring.SpringEmail.service.UserService;
import org.springframework.stereotype.Service;

/**
 * (User)表服务实现类
 *
 * @author makejava
 * @since 2019-11-09 16:45:07
 */
@Service("userService")
public class UserServiceImpl extends ServiceImpl<UserDao, User> implements UserService {

}