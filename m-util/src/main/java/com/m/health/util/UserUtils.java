/**
 * Copyright &copy; 2012-2013 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 */
package com.m.health.util;


import com.m.health.vo.Principal;
import com.m.health.vo.UserVo;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * 用户工具类
 * @author ThinkGem
 * @version 2013-5-29
 */
@Component
public class UserUtils {
	public static UserUtils userUtils ;


	@PostConstruct
	public void init(){
		userUtils = this ;
	}

	public static UserVo getCurrentUser(){
		UserVo userVo = new UserVo();
		try {
			Subject subject = SecurityUtils.getSubject();
			Principal principal = (Principal)subject.getPrincipal();
			if(principal!=null){
				userVo.setId(principal.getId());
				userVo.setLoginName(principal.getLoginName());
			}
			return  userVo;
		}catch (Exception e){
			e.printStackTrace();
		}
		return userVo;
	}
}
