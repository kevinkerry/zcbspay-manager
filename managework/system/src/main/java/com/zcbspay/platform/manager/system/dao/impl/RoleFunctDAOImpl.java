package com.zcbspay.platform.manager.system.dao.impl;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.zcbspay.platform.manager.dao.impl.HibernateBaseDAOImpl;
import com.zcbspay.platform.manager.system.dao.RoleFunctDAO;
import com.zcbspay.platform.manager.system.pojo.PojoRoleFunct;

@Repository
public class RoleFunctDAOImpl extends HibernateBaseDAOImpl<PojoRoleFunct> implements RoleFunctDAO{
	
	
	@Transactional(propagation=Propagation.REQUIRED,rollbackFor=Throwable.class)
	public void deleteRoleFunction(Long roleId) {
		updateByHQL("delete from PojoRoleFunct rf where rf.roleId = ?",new Object[]{roleId});
	}
}
