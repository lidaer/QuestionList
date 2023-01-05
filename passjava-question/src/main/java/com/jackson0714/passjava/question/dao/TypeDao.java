package com.jackson0714.passjava.question.dao;

import com.jackson0714.passjava.question.entity.TypeEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 题目-题目类型表
 * 
 * @author sz
 * @email 2795656376@gmail.com
 * @date 2023-01-05 21:18:42
 */
@Mapper
public interface TypeDao extends BaseMapper<TypeEntity> {
	
}
