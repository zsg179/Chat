package com.pekka.blogserver.service.impl;

import com.pekka.blogserver.entity.User;
import com.pekka.blogserver.mapper.UserMapper;
import com.pekka.blogserver.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * @Auther :朱树广
 * @Date :2020/6/17
 * @Description :com.pekka.blogserver.service.impl
 * @Version :1.0
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
