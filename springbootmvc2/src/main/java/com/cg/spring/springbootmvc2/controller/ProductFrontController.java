package com.cg.spring.springbootmvc2.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.cg.spring.springbootmvc2.beans.Merchants;

@RestController
public class ProductFrontController {

	@RequestMapping("/DisplayMerchants")
	public Merchants getMerchants(@RequestParam String id) {

		RestTemplate rt = new RestTemplate();
		Merchants p = rt.getForObject("http://localhost:9095/getMerchants?id=" + id, Merchants.class);
		return p;
	}

	@RequestMapping("/ListofAllMerchants")
	public Merchants getMerchants() {
		RestTemplate rt1 = new RestTemplate();
		Merchants p = rt1.getForObject("http://localhost:9095/Merchants", Merchants.class);
		return p;
	}

	@RequestMapping("/addmerchantsfront")

	public Merchants addMerchant(@RequestParam String id, @RequestParam String name,
			@RequestParam String organisation) {

		RestTemplate rt2 = new RestTemplate();
		Merchants p = rt2.getForObject(
				"http://localhost:9095/addMerchants?id=" + id + "&name=" + name + "&organisation=" + organisation,
				Merchants.class);
		return p;

	}

	@RequestMapping("/DeleteMerchants")

	public Merchants deleteMerchant(@RequestParam String id) {

		RestTemplate rt3 = new RestTemplate();
		Merchants p = rt3.getForObject("http://localhost:9095/deleteMerchant?id=" + id, Merchants.class);
		return p;

	}

}