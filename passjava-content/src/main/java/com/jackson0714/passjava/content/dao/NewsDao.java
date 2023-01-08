package com.jackson0714.passjava.content.dao;

import com.jackson0714.passjava.content.entity.NewsEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 内容-资讯表
 * 
 * @author sz
 * @email 2795656376@gmail.com
 * @date 2023-01-08 12:14:13
 */
@Mapper
public interface NewsDao extends BaseMapper<NewsEntity> {
	
}
