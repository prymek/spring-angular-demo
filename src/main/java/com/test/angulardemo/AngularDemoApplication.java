package com.test.angulardemo;

import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorViewResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.web.servlet.ModelAndView;

@SpringBootApplication
public class AngularDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(AngularDemoApplication.class, args);
	}

	@Bean
	public ErrorViewResolver customErrorViewResolver() {
		final ModelAndView redirectToIndexHtml = new ModelAndView( "forward:/index.html", Collections.emptyMap(), HttpStatus.OK );
		return ( request, status, model ) -> status == HttpStatus.NOT_FOUND ? redirectToIndexHtml : null;
	}


}
