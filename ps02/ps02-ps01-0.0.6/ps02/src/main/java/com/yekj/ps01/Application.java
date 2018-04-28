package com.yekj.ps01;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.context.WebApplicationContext;


//Servlet自动加载，不然快捷启动时不会加载druid的servlet
@ServletComponentScan

//开启自动注解
@EnableAutoConfiguration
//启动注解
@SpringBootApplication
@MapperScan("com.yekj.ps01.mapper")
//启动定时任务
@EnableScheduling
//开启Swagger2接口文档
//@EnableSwagger2
public class Application extends SpringBootServletInitializer{

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		System.out.println("2--进入配置页，可写入自定义内容加载");
		return super.configure(builder);
	}
	
	
	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		System.out.println("1--onStartup:::");
		super.onStartup(servletContext);
	}


	@Override
	protected WebApplicationContext run(SpringApplication application) {
		System.out.println("3--run:::::");
		return super.run(application);
	}


	public static void main(String[] args) {
		
		SpringApplication.run(Application.class, args) ;
	}
	
}
