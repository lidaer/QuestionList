package com.jackson0714.passjava.channel.dao;

import com.jackson0714.passjava.channel.entity.AccessTokenEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 渠道-认证表
 * 
 * @author sz
 * @email 2795656376@gmail.com
 * @date 2023-01-08 12:05:25
 */
@Mapper
public interface AccessTokenDao extends BaseMapper<AccessTokenEntity> {
	
}
