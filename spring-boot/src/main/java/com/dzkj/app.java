package com.dzkj;

import javax.servlet.Servlet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.web.context.annotation.ApplicationScope;

import servlet.second;

@SpringBootApplication
@ServletComponentScan
public class app {
		public static void main(String[] args) {
			SpringApplication.run(app.class, args);
		}
		@Bean
		public ServletRegistrationBean<Servlet> get(){
			ServletRegistrationBean<Servlet> bean=new ServletRegistrationBean<Servlet>(new second());
			bean.addUrlMappings("/second");
			return bean;
		}
}
