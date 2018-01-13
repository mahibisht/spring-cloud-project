package com.ecommerce;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductRestController {

	@RequestMapping(value="/api/v1/product/test-service", method = RequestMethod.GET)
	public String test() {
		return "product-test-method-called";
	}
}
