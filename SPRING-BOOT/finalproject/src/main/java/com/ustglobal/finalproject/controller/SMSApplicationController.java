package com.ustglobal.finalproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ustglobal.finalproject.dto.ProductInfoBean;
import com.ustglobal.finalproject.service.SMSApplicationService;

@CrossOrigin(origins = "*",allowedHeaders = "*",allowCredentials = "true")
@RestController
public class SMSApplicationController {
	@Autowired
	SMSApplicationService service;
	@PostMapping(path = "/add-product",consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
	boolean addProduct(@RequestBody ProductInfoBean bean) {
		System.out.println(bean.getCategory());
		boolean check=service.addProduct(bean);
		return check;
	}

}
