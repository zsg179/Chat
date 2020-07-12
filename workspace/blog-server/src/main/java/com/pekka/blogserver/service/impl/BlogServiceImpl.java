package com.pekka.blogserver.service.impl;

import com.pekka.blogserver.entity.Blog;
import com.pekka.blogserver.mapper.BlogMapper;
import com.pekka.blogserver.service.BlogService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * @Auther :朱树广
 * @Date :2020/6/17
 * @Description :com.pekka.blogserver.service.impl
 * @Version :1.0
 */
@Service
public class BlogServiceImpl extends ServiceImpl<BlogMapper, Blog> implements BlogService {

}
