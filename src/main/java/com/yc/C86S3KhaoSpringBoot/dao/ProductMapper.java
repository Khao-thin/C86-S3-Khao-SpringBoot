package com.yc.C86S3KhaoSpringBoot.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.yc.C86S3KhaoSpringBoot.bean.DmProduct;

public interface ProductMapper {
	@Select("select * from dm_product")
	List<DmProduct>selectAll();
	
	@Select("select * from dm_product where is_hot=1")
	List<DmProduct>selectForHot();
	
	@Select("select * from dm_product where market_price=198")
	List<DmProduct>selectForNew();
	
	@Select("select * from dm_product where id=#{id}")
	DmProduct selectById(int id);
}
