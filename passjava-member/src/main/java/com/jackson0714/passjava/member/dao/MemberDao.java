package com.jackson0714.passjava.member.dao;

import com.jackson0714.passjava.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员-会员表
 * 
 * @author sz
 * @email 2795656376@gmail.com
 * @date 2023-01-08 13:22:11
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
