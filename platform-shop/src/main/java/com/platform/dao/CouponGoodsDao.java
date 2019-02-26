package com.platform.dao;

import java.util.List;

import com.platform.entity.CouponGoodsEntity;

/**
 * 优惠券关联商品Dao
 *
 * @author lipengjun
 * @email 939961241@qq.com
 * @date 2017-08-29 21:50:17
 */
public interface CouponGoodsDao extends BaseDao<CouponGoodsEntity> {
	 public List<CouponGoodsEntity> selectCouponGoods(Integer couponId);
	   	public List<CouponGoodsEntity>  selectAllCouponGoods();
	   public  int deleteAll(Object id);
}