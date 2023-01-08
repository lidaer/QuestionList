package com.jackson0714.passjava.content.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jackson0714.common.utils.PageUtils;
import com.jackson0714.passjava.content.entity.NewsEntity;

import java.util.Map;

/**
 * 内容-资讯表
 *
 * @author sz
 * @email 2795656376@gmail.com
 * @date 2023-01-08 12:14:13
 */
public interface NewsService extends IService<NewsEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

