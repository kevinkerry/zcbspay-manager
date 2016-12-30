package com.zcbspay.platform.manager.system.dao;

import com.zcbspay.platform.manager.dao.BaseDAO;
import com.zcbspay.platform.manager.system.pojo.PojoUserFunct;

public interface UserFunctDAO extends BaseDAO<PojoUserFunct>{
	/**
	 * 
	 * @param userId
	 */
	public void deleteOldFunc(Long userId);
}
