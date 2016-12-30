package com.zcbspay.platform.manager.system.dao.impl;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.zcbspay.platform.manager.dao.impl.HibernateBaseDAOImpl;
import com.zcbspay.platform.manager.system.dao.UserFunctDAO;
import com.zcbspay.platform.manager.system.pojo.PojoUserFunct;

@Repository
public class UserFunctDAOImpl extends HibernateBaseDAOImpl<PojoUserFunct> implements UserFunctDAO{
	
	@Transactional(propagation=Propagation.REQUIRED,rollbackFor=Throwable.class)
	public void deleteOldFunc(Long userId) {
		updateByHQL("delete from UserFunctModel u where u.userId = ?",new Object[]{userId});
	}
}
