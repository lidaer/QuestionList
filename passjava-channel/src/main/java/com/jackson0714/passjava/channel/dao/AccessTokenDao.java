package com.jackson0714.passjava.channel.dao;

import com.jackson0714.passjava.channel.entity.AccessTokenEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 渠道-认证表
 * 
 * @author chenshun
 * @email 2795656376@gmail.com
 * @date 2023-01-05 17:48:14
 */
@Mapper
public interface AccessTokenDao extends BaseMapper<AccessTokenEntity> {
	
}
