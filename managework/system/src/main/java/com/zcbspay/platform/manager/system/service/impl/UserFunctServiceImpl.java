package com.zcbspay.platform.manager.system.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zcbspay.platform.manager.system.dao.UserFunctDAO;
import com.zcbspay.platform.manager.system.service.UserFunctService;
@Service("userFunctService")
public class UserFunctServiceImpl implements UserFunctService{

	@Autowired
	private UserFunctDAO userFunctDAO;
	
	public void deleteOldFunc(Long userId) {
		userFunctDAO.deleteOldFunc(userId);
	}
}
