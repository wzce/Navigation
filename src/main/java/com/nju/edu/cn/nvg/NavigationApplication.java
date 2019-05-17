package com.nju.edu.cn.nvg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = "com.nju.edu.cn.nvg.dao.mapper") //配置mybatis的接口路径
public class NavigationApplication {

	public static void main(String[] args) {
		SpringApplication.run(NavigationApplication.class, args);
	}

}
