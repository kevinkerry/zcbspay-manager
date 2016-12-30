package com.zcbspay.platform.manager.system.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import com.zcbspay.platform.manager.system.bean.RoleBean;
import com.zcbspay.platform.manager.system.dao.RoleDAO;
import com.zcbspay.platform.manager.system.service.RoleService;

public class RoleServiceImpl implements RoleService {

	@Autowired
	private RoleDAO roleDAO;

	public Map<String, Object> findRoleByPage(Map<String, Object> variables, int page,
			int rows) {
		return roleDAO.findRoleByPage(variables, page, rows);
	}

	public long findRoleByPageCount(Map<String, Object> variables) {
		return roleDAO.findRoleByPageCount(variables);
	}

	public List<?> saveRole(RoleBean role) {
		return roleDAO.saveRole(role);
	}

	public List<?> updateRole(RoleBean role) {
		return roleDAO.updateRole(role);
	}

	public List<?> deleteRole(Long roleId) {
		return roleDAO.deleteRole(roleId);
	}

}
