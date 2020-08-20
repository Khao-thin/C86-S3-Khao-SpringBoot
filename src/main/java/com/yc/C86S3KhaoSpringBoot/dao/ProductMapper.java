package com.yc.C86S3KhaoSpringBoot.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.yc.C86S3KhaoSpringBoot.bean.DmProduct;

public interface ProductMapper {
	@Select("select * from dm_product")
	List<DmProduct>selectAll();
}
