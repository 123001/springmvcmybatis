package com.yingjun.test.dao;

import com.yingjun.test.model.Coupon;

public interface CouponMapper {
    int insert(Coupon record);

    int insertSelective(Coupon record);
}