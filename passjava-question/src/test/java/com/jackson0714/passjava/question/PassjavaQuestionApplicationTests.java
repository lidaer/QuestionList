package com.jackson0714.passjava.question;

import com.jackson0714.passjava.question.entity.TypeEntity;
import com.jackson0714.passjava.question.service.TypeService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class PassjavaQuestionApplicationTests {

	@Test
	void contextLoads() {
	}

	@Autowired
	TypeService typeService;

	// 创建题目类型
	@Test
	void testCreateType() {
		TypeEntity typeEntity = new TypeEntity();
		typeEntity.setType("javaBasic");
		typeService.save(typeEntity);
		System.out.println("创建成功");
	}

	// 更新type=jvm
	@Test
	void testUpdateType() {
		TypeEntity typeEntity = new TypeEntity();
		typeEntity.setId(1L);
		typeEntity.setType("jvm");
		typeService.updateById(typeEntity);
		System.out.println("修改成功");
	}


}
