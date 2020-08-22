package com.yc.C86S3KhaoSpringBoot;

import javax.annotation.Resource;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;
import com.yc.C86S3KhaoSpringBoot.biz.MailService;
import com.yc.C86S3KhaoSpringBoot.dao.ProductMapper;

@SpringBootTest
class C86S3KhaoSpringBootApplicationTests {

	@Resource
	ProductMapper pm;
	
	@Resource
	MailService ms;
	
	@Test
	void contextLoads() {
		Assert.isTrue(pm.selectAll().size()>0,"没有数据");
	}
	
	@Test
	void testMail() {
		ms.sendSimpleMail("2528088211@qq.com", "验证码", "我日你大坝");
	}

}
