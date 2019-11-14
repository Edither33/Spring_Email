package com.testSpring.SpringEmail.controller;

import com.testSpring.SpringEmail.entity.User;
import com.testSpring.SpringEmail.service.UserService;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.api.R;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.Serializable;
import java.util.List;

/**
 * (User)控制层扩展类，一般初次生成，后续不再覆盖。这个类提供编写自己定义的方法。
 *
 * @author makejava
 * @since 2019-11-09 16:45:07
 */
@RestController
@RequestMapping("user")
public class UserExtendController extends UserController {
   
}