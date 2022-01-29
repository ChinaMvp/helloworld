package com.mvp.world.mybatisplusshardingdruid;

//import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceAutoConfigure;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication(exclude = DruidDataSourceAutoConfigure.class)
@SpringBootApplication
@MapperScan("com.mvp.world.mybatisplusshardingdruid.dao")
public class MybatisPlusShardingDruidApplication {

    public static void main(String[] args) {
        SpringApplication.run(MybatisPlusShardingDruidApplication.class, args);
    }

}
