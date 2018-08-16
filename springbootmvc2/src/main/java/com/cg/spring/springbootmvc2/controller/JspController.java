package com.cg.spring.springbootmvc2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class JspController {




	@RequestMapping("/ManageMerchants")
	public String showMerchant() {
		return "ManageMerchants";
	}
	@RequestMapping("/ThirdPartyMerchants2")
	public String showThirdParty() {
		return "ThirdPartyMerchants2";
	}
	@RequestMapping("/index")
	public String addMerchants(){
		return "index";
	}
	@RequestMapping("/Delete")
	public String deleteMerchant (){
		return "Delete";
	}
	@RequestMapping("/DirectMerchants")
	public String showDirectMerchant() {
		return "DirectMerchants";
	}
	@RequestMapping("/Display")
	public String displayMerchant (){
		return "Display";
	}
	}


