package com.jackson0714.passjava.question.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jackson0714.common.utils.PageUtils;
import com.jackson0714.passjava.question.entity.QuestionEntity;

import java.util.Map;

/**
 * 
 *
 * @author sz
 * @email 2795656376@gmail.com
 * @date 2023-01-05 21:18:42
 */
public interface QuestionService extends IService<QuestionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

