package com.test.angulardemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping( "/" )
public class HomeController {


	String getMainPage() {
		return "index.html";
	}
}
