package com.yc.C86S3KhaoSpringBoot.action;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yc.C86S3KhaoSpringBoot.bean.DmProduct;
import com.yc.C86S3KhaoSpringBoot.dao.DmProductMapper;

@RestController
@RequestMapping("/user")
public class ProductAction {
	@Resource
	private DmProductMapper pm;
	@RequestMapping(path="/product.do",params="op=query")
	public Map<String,Object> query(DmProduct dp){
		dp.setIsHot(1);
		Map<String,Object>m=new HashMap<String,Object>();
		m.put("list", pm.selectByObj(dp));
		return m;
	}
	
	@RequestMapping("/aaa")
	public String a() {
		return "aaa";
	}
	@RequestMapping("/toString")
	public String toString() {
		return "aaaaa";
	}
	
}
