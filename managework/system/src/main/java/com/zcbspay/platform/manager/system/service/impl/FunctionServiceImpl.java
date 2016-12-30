package com.zcbspay.platform.manager.system.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.zcbspay.platform.manager.system.bean.UserBean;
import com.zcbspay.platform.manager.system.service.FunctionService;

public class FunctionServiceImpl implements FunctionService{

	@Autowired
	private FunctionService functionService;
	
	@Override
	public List<?> findAllFuntion(UserBean loginuser){
		return functionService.findAllFuntion(loginuser);
	}
	@Override
	public List<?> findFunction(){
		return functionService.findFunction();
	}
	@Override
	public List<?> existUserAndRoleFunct(Long userId,Long fid){
		return functionService.existUserAndRoleFunct(userId, fid);
	}
	@Override
	public List<?> findLoginFuntion(UserBean loginuser) {
		return functionService.findLoginFuntion(loginuser);
	}
}
