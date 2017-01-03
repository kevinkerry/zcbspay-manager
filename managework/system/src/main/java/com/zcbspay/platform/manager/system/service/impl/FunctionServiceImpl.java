package com.zcbspay.platform.manager.system.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zcbspay.platform.manager.system.bean.UserBean;
import com.zcbspay.platform.manager.system.dao.FunctionDAO;
import com.zcbspay.platform.manager.system.service.FunctionService;
@Service("functionService")
public class FunctionServiceImpl implements FunctionService{

	@Autowired
	private FunctionDAO functionDAO;
	
	@Override
	public List<?> findAllFuntion(UserBean loginuser){
		return functionDAO.findAllFuntion(loginuser);
	}
	@Override
	public List<?> findFunction(){
		return functionDAO.findFunction();
	}
	@Override
	public List<?> existUserAndRoleFunct(Long userId,Long fid){
		return functionDAO.existUserAndRoleFunct(userId, fid);
	}
	@Override
	public List<?> findLoginFuntion(UserBean loginuser) {
		return functionDAO.findLoginFuntion(loginuser);
	}
}
