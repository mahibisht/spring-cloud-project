package com.ecommerce;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CategoryRestController {

	@RequestMapping(value="/api/v1/category/test", method = RequestMethod.GET)
	public String test() {
		return "/api/v1/category/test";
	}
}
