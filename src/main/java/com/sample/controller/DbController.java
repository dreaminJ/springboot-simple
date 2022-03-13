package com.sample.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sample.service.DbService;

@Controller
public class DbController {
	@Autowired
	DbService dbService;

	@GetMapping("/")
	public @ResponseBody String now() throws Exception {
		return dbService.getDual();
	}

	@ExceptionHandler
	public @ResponseBody Map<String, Object> serverException(Exception e) {
		Map<String, Object> er = new HashMap<String, Object>();
		er.put("message", "Server error");
		er.put("status", HttpStatus.INTERNAL_SERVER_ERROR);
		return er;
	}
}
