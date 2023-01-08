package com.jackson0714.passjava.study.dao;

import com.jackson0714.passjava.study.entity.StudyTimeEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 学习-用户学习时常表
 * 
 * @author sz
 * @email 2795656376@gmail.com
 * @date 2023-01-08 12:21:33
 */
@Mapper
public interface StudyTimeDao extends BaseMapper<StudyTimeEntity> {
	
}
