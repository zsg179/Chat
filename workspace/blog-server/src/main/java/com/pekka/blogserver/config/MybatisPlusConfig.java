package com.pekka.blogserver.config;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @Auther :朱树广
 * @Date :2020/6/17
 * @Description :com.pekka.blogserver.config
 * @Version :1.0
 */
@Configuration
@EnableTransactionManagement
@MapperScan("com.pekka.blogserver.mapper")
public class MybatisPlusConfig {
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        PaginationInterceptor paginationInterceptor = new PaginationInterceptor();
        return paginationInterceptor;
    }
}

