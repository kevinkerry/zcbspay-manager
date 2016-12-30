package com.zcbspay.platform.manager.system.dao;

import com.zcbspay.platform.manager.dao.BaseDAO;
import com.zcbspay.platform.manager.system.pojo.PojoUserRole;

public interface UserRoleDAO extends BaseDAO<PojoUserRole>{
	/**
	 * 
	 * @param userId
	 */
	public void deleteOldUserRole(Long userId);
}
