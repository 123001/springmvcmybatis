package com.yingjun.test.model;

import java.math.BigDecimal;
import java.util.Date;

public class Coupon {
    private String couponId;

    private String couponName;

    private String departId;

    private String userRange;

    private String couponType;

    private String giveType;

    private Date startTime;

    private Date endTime;

    private BigDecimal exprDay;

    private String rsrvStr1;

    private String rsrvStr2;

    private String rsrvStr3;

    private String rsrvStr4;

    private BigDecimal minimumFee;

    public String getCouponId() {
        return couponId;
    }

    public void setCouponId(String couponId) {
        this.couponId = couponId == null ? null : couponId.trim();
    }

    public String getCouponName() {
        return couponName;
    }

    public void setCouponName(String couponName) {
        this.couponName = couponName == null ? null : couponName.trim();
    }

    public String getDepartId() {
        return departId;
    }

    public void setDepartId(String departId) {
        this.departId = departId == null ? null : departId.trim();
    }

    public String getUserRange() {
        return userRange;
    }

    public void setUserRange(String userRange) {
        this.userRange = userRange == null ? null : userRange.trim();
    }

    public String getCouponType() {
        return couponType;
    }

    public void setCouponType(String couponType) {
        this.couponType = couponType == null ? null : couponType.trim();
    }

    public String getGiveType() {
        return giveType;
    }

    public void setGiveType(String giveType) {
        this.giveType = giveType == null ? null : giveType.trim();
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public BigDecimal getExprDay() {
        return exprDay;
    }

    public void setExprDay(BigDecimal exprDay) {
        this.exprDay = exprDay;
    }

    public String getRsrvStr1() {
        return rsrvStr1;
    }

    public void setRsrvStr1(String rsrvStr1) {
        this.rsrvStr1 = rsrvStr1 == null ? null : rsrvStr1.trim();
    }

    public String getRsrvStr2() {
        return rsrvStr2;
    }

    public void setRsrvStr2(String rsrvStr2) {
        this.rsrvStr2 = rsrvStr2 == null ? null : rsrvStr2.trim();
    }

    public String getRsrvStr3() {
        return rsrvStr3;
    }

    public void setRsrvStr3(String rsrvStr3) {
        this.rsrvStr3 = rsrvStr3 == null ? null : rsrvStr3.trim();
    }

    public String getRsrvStr4() {
        return rsrvStr4;
    }

    public void setRsrvStr4(String rsrvStr4) {
        this.rsrvStr4 = rsrvStr4 == null ? null : rsrvStr4.trim();
    }

    public BigDecimal getMinimumFee() {
        return minimumFee;
    }

    public void setMinimumFee(BigDecimal minimumFee) {
        this.minimumFee = minimumFee;
    }
}