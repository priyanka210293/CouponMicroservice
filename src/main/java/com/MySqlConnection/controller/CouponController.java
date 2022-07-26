package com.MySqlConnection.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.MySqlConnection.Entity.Coupon;

import com.MySqlConnection.repositoory.CouponRepo;

@RestController
@RequestMapping(path="/couponApi")
public class CouponController {

	@Autowired
	private CouponRepo couponRepo;
	
	@PostMapping("/add")
	public Coupon addCoupon(@RequestBody Coupon coupon) {
	return	couponRepo.save(coupon);
	}
	@GetMapping("/getCoupon/{code}")
	public Coupon getCoupon(@PathVariable("code") String code) {
		return couponRepo.findByCode(code);
		
	}
		
		
	}
	

