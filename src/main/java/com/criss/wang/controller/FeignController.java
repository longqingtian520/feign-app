package com.criss.wang.controller;

import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.criss.wang.api.FeignApi;

@RestController
public class FeignController implements FeignApi{

	@Override
	@RequestMapping(value = "/fegin", method = RequestMethod.GET)
	public String feginTest(@RequestParam(value = "name", required = false) String name){
		try{
			Thread.sleep(3000);
		}catch (Exception e){
			e.printStackTrace();
		}

		if (!StringUtils.isEmpty(name))
			return name;
		return "wangqiubao";
	}

	@Override
	@RequestMapping(value = "/fallback", method = RequestMethod.GET)
	public String fallBackTest(@RequestParam(value = "name", required = false) String name){
		if(!StringUtils.isEmpty(name)){
			return name;
		}
		return "wangqiubao test one program";
	}
}
