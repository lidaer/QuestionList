package com.jackson0714.passjava.member.controller;

import com.alibaba.nacos.api.config.annotation.NacosValue;
import com.jackson0714.common.utils.R;
import com.jackson0714.passjava.member.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author sz
 * @version 1.0
 * @date 2023/1/10
 */

@RefreshScope
@RestController
@RequestMapping("member/sample")
public class TestController {
    @Autowired
    MemberService memberService;

    @NacosValue("${member.nickname}")
    private  String nickname;

    @Value("${member.age}")
    private  Integer age;

    @RequestMapping("/test-local-config")
    public R testLocalConfig() {
        return R.ok().put("nickname", nickname).put("age", age);
    }
}
