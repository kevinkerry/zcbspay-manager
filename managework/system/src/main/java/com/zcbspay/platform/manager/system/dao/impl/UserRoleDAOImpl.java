package com.zcbspay.platform.manager.system.dao.impl;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.zcbspay.platform.manager.dao.impl.HibernateBaseDAOImpl;
import com.zcbspay.platform.manager.system.dao.UserRoleDAO;
import com.zcbspay.platform.manager.system.pojo.PojoUserRole;

@Repository
public class UserRoleDAOImpl extends HibernateBaseDAOImpl<PojoUserRole> implements UserRoleDAO{

	@Transactional(propagation=Propagation.REQUIRED,rollbackFor=Throwable.class)
	public void deleteOldUserRole(Long userId) {
		updateByHQL("delete from PojoUserRole u where u.userId = ?",new Object[]{userId});
	}
}
