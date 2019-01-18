package com.xcky.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
/**
 * 用户实体类
 * 
 * @author lb-chen
 * @creation 2018年11月16日
 *
 */
@Getter
@Setter
@Entity
@ToString
public class User implements Serializable {
	private static final long serialVersionUID = 4852202725905407665L;
	/**
	 * 用户编码
	 */
	@Id
	private String userCode;
	/**
	 * 用户名称
	 */
	private String userName;
	/**
	 * 邮箱
	 */
	private String email;
	/**
	 * 电话
	 */
	private String phone;
	/**
	 * 注册时间
	 */
	private Date createTime;
	/**
	 * 更新时间
	 */
	private Date updateTime;
	/**
	 * 注销时间
	 */
	private Date recoverTime;
	/**
	 * 是否删除
	 */
	private Integer isDelete;
}
