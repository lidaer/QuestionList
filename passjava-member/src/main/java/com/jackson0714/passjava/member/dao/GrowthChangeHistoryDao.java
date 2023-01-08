package com.jackson0714.passjava.member.dao;

import com.jackson0714.passjava.member.entity.GrowthChangeHistoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员-积分值变化历史记录表
 * 
 * @author sz
 * @email 2795656376@gmail.com
 * @date 2023-01-08 13:22:11
 */
@Mapper
public interface GrowthChangeHistoryDao extends BaseMapper<GrowthChangeHistoryEntity> {
	
}
