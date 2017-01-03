package com.zcbspay.platform.manager.system.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zcbspay.platform.manager.system.dao.UserRoleDAO;
import com.zcbspay.platform.manager.system.service.UserRoleService;

@Service("userRoleService")
public class UserRoleServiceImpl implements UserRoleService {


	@Autowired
	private UserRoleDAO userRoleDAO;

	public void deleteOldUserRole(Long userId) {
		userRoleDAO.deleteOldUserRole(userId);
		
	}

}
