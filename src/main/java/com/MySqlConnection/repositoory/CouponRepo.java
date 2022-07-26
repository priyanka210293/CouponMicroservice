package com.MySqlConnection.repositoory;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.MySqlConnection.Entity.Coupon;

public interface CouponRepo extends JpaRepository<Coupon, Long>{

	Coupon findByCode(String code);

}
