package com.testSpring.SpringEmail.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.testSpring.SpringEmail.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * (User)表数据库访问层
 *
 * @author makejava
 * @since 2019-11-09 16:45:07
 */
@Mapper
public interface UserDao extends BaseMapper<User> {

}