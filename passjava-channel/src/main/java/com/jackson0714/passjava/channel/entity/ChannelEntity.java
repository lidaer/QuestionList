package com.jackson0714.passjava.channel.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 渠道-渠道表
 * 
 * @author chenshun
 * @email 2795656376@gmail.com
 * @date 2023-01-05 17:48:14
 */
@Data
@TableName("chms_channel")
public class ChannelEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;
	/**
	 * 渠道名称
	 */
	private String name;
	/**
	 * 渠道appid
	 */
	private String appid;
	/**
	 * 渠道appsecret
	 */
	private String appsecret;
	/**
	 * 删除标记（0-正常，1-删除）
	 */
	private Integer delFlag;
	/**
	 * 创建时间
	 */
	private Date createTime;
	/**
	 * 更新时间
	 */
	private Date updateTime;

}
