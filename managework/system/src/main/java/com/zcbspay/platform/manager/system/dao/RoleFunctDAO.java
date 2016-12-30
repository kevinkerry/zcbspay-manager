package com.zcbspay.platform.manager.system.dao;

import com.zcbspay.platform.manager.dao.BaseDAO;
import com.zcbspay.platform.manager.system.pojo.PojoRoleFunct;

public interface RoleFunctDAO extends BaseDAO<PojoRoleFunct>{

	/**
	 * 
	 * @param roleId
	 */
	public void deleteRoleFunction(Long roleId);
}
