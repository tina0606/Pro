package com.capg.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.capg.bean.Merchants;
import com.capg.service.MerchantService;

@RestController
public class MerchantController {

	@Autowired
	MerchantService service;

	@RequestMapping("/getMerchants")
	public Optional<Merchants> getMerchantById(@RequestParam String id) {
		return service.getMerchantById(Integer.parseInt(id));
	}

	@RequestMapping(value = "/Merchants")
	public List<Merchants> getMerchants() {

		Iterable<Merchants> merchants = service.findAll();
		return (List<Merchants>) merchants;

	}

	@RequestMapping(value = "/addMerchants{id}{name}{organisation}")
	void addMerchant(@RequestParam String id, @RequestParam String name, @RequestParam String organisation) {

		service.addMerchant(Integer.parseInt(id), name, organisation);

	}

	@RequestMapping("/deleteMerchant")
	public void deleteMerchantById(@RequestParam String id) {
		service.deleteMerchantById(Integer.parseInt(id));
	}

}
