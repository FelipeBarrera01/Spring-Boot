package com.bolsadeideas.springboot.app;

import java.nio.file.Paths;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MvcConfig implements WebMvcConfigurer{
	
	/*
	private final Logger log = LoggerFactory.getLogger(getClass());
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		// TODO Auto-generated method stub
		
		String resourcePath = Paths.get("uploads").toAbsolutePath().toUri().toString();
		log.info(resourcePath);
		WebMvcConfigurer.super.addResourceHandlers(registry);
		registry.addResourceHandler("/uploads/**")
		.addResourceLocations(resourcePath);
		
	}

	
		*/
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/error_403").setViewName("error_403");
	}
}
