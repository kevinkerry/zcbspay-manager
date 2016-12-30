package com.zcbspay.platform.manager.system.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zcbspay.platform.manager.system.dao.RoleFunctDAO;
import com.zcbspay.platform.manager.system.service.RoleFunctService;
@Service
public class RoleFunctServiceImpl implements RoleFunctService{

	@Autowired
	private RoleFunctDAO roleFunctDAO;
	
	public void deleteRoleFunction(Long roleId) {
		roleFunctDAO.deleteRoleFunction(roleId);
	}
}
