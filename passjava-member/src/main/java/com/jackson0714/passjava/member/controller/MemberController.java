package com.jackson0714.passjava.member.controller;

import java.util.Arrays;
import java.util.Map;

import com.jackson0714.passjava.member.feign.StudyTimeFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jackson0714.passjava.member.entity.MemberEntity;
import com.jackson0714.passjava.member.service.MemberService;
import com.jackson0714.common.utils.PageUtils;
import com.jackson0714.common.utils.R;



/**
 * 会员-会员表
 *
 * @author sz
 * @email 2795656376@gmail.com
 * @date 2023-01-08 13:22:11
 */
@RestController
@RequestMapping("member/member")
public class MemberController {
    @Autowired
    private MemberService memberService;

    @Autowired
    private StudyTimeFeignService studyTimeFeignService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("member:member:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = memberService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    //@RequiresPermissions("member:member:info")
    public R info(@PathVariable("id") Long id){
		MemberEntity member = memberService.getById(id);

        return R.ok().put("member", member);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    //@RequiresPermissions("member:member:save")
    public R save(@RequestBody MemberEntity member){
		memberService.save(member);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("member:member:update")
    public R update(@RequestBody MemberEntity member){
		memberService.updateById(member);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("member:member:delete")
    public R delete(@RequestBody Long[] ids){
		memberService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

    @RequestMapping("/studytime/list/test/{id}")
    public R getMemberStudyTimeListTest(@PathVariable("id") Long id) {
        // mock数据库查到的会员信息
        MemberEntity memberEntity = new MemberEntity();
        // 学习时长：100分钟
        memberEntity.setId(id);
        memberEntity.setNickname("sz");

        //远程调用拿到该用户的学习时长（学习时长是mock数据）
        R memberStudyTimeList = studyTimeFeignService.getMemberStudyTimeListTest(id);
        return R.ok().put("member", memberEntity).put("studytime", memberStudyTimeList.get("studytime"));
    }
}
