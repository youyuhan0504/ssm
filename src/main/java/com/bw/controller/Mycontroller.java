package com.bw.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Mycontroller {
	
	
	@RequestMapping("list")
	@ResponseBody
	public Object list() {
		return true;
	}
	

}
