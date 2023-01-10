package com.jackson0714.passjava.member.feign;

import com.jackson0714.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author sz
 * @version 1.0
 * @date 2023/1/10
 */
@FeignClient("passjava-study")
public interface StudyTimeFeignService {

    @RequestMapping("study/studytime/member/list/test/{id}")
    public R getMemberStudyTimeListTest(@PathVariable("id") Long id);

}
