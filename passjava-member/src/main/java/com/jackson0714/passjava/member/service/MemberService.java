package com.jackson0714.passjava.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jackson0714.common.utils.PageUtils;
import com.jackson0714.passjava.member.entity.MemberEntity;

import java.util.Map;

/**
 * 会员-会员表
 *
 * @author sz
 * @email 2795656376@gmail.com
 * @date 2023-01-08 13:22:11
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

