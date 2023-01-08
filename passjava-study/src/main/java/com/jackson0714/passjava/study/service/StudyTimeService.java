package com.jackson0714.passjava.study.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jackson0714.common.utils.PageUtils;
import com.jackson0714.passjava.study.entity.StudyTimeEntity;

import java.util.Map;

/**
 * 学习-用户学习时常表
 *
 * @author sz
 * @email 2795656376@gmail.com
 * @date 2023-01-08 12:21:33
 */
public interface StudyTimeService extends IService<StudyTimeEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

