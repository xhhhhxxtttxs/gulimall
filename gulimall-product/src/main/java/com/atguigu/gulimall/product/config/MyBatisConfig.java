package com.atguigu.gulimall.product.config;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement//开启事务
@MapperScan("com.atguigu.gulimall.product.dao")
public class MyBatisConfig {
    @Bean
    public PaginationInterceptor paginationInterceptor(){
        //设置请求的页面大于最大页后的操作，true调回首页，false继续请求，默认为false
        PaginationInterceptor paginationInterceptor = new PaginationInterceptor();
        //设置最大单页限制数量，默认是500条，-1不受限制
        paginationInterceptor.setOverflow(true);
        paginationInterceptor.setLimit(1000);
        return paginationInterceptor;
    }
}
