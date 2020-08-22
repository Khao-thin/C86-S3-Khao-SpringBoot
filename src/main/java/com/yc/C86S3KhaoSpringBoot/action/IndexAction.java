package com.yc.C86S3KhaoSpringBoot.action;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yc.C86S3KhaoSpringBoot.bean.DmProduct;
import com.yc.C86S3KhaoSpringBoot.dao.ProductMapper;

@Controller
public class IndexAction {
	@Resource
	ProductMapper pm;
	@RequestMapping("index.do")
	public String index(Model model) {
		//查询热销商品
		List<DmProduct>list=pm.selectForHot();
		List<DmProduct>list1=pm.selectForNew();
		Map<String,Object>attributes=new HashMap<String,Object>();
		attributes.put("list", list);
		attributes.put("list1", list1);
		//推送给页面
		model.addAllAttributes(attributes);
		return "index";
	}
	
	@RequestMapping("detail.do")
	public String detail(Model model,int id) {
		//查询热销商品
		DmProduct dp=pm.selectById(id);
		//推送给页面
		model.addAttribute("dp",dp);
		return "detail";
	}
	
	
	
	
	
	
	
	
	
	
	

}
