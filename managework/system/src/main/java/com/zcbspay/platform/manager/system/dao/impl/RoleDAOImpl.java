package com.zcbspay.platform.manager.system.dao.impl;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.zcbspay.platform.manager.dao.impl.HibernateBaseDAOImpl;
import com.zcbspay.platform.manager.system.bean.RoleBean;
import com.zcbspay.platform.manager.system.dao.RoleDAO;
import com.zcbspay.platform.manager.system.pojo.PojoRole;

@Repository
public class RoleDAOImpl extends HibernateBaseDAOImpl<PojoRole> implements RoleDAO{

	public Map<String, Object> findRoleByPage(Map<String, Object> variables, int page,
			int rows) {
		String[] columns = new String[] { "v_role_name", "v_organ_id",
				"v_dept_id","i_no","i_perno" };
		Object[] paramaters = new Object[5];
		paramaters[0] = variables.containsKey("roleName") ? variables
				.get("roleName") : null;
		paramaters[1] = variables.containsKey("organId") ? variables
				.get("organId") : null;
		paramaters[2] = variables.containsKey("deptId") ? variables
				.get("deptId") : null;
		paramaters[3] = page;
		paramaters[4] = rows;
		return executePageOracleProcedure("{CALL PCK_T_ROLE.sel_t_role(?,?,?,?,?,?,?)}",columns,
				paramaters, "cursor0","v_total");
	}

	public long findRoleByPageCount(Map<String, Object> variables) {
		String[] columns = new String[] { "v_role_name", "v_organ_id",
				"v_dept_id"};
		Object[] paramaters = new Object[3];
		paramaters[0] = variables.containsKey("roleName") ? variables
				.get("roleName") : null;
		paramaters[1] = variables.containsKey("organId") ? variables
				.get("organId") : null;
		paramaters[2] = variables.containsKey("deptId") ? variables
				.get("deptId") : null;
		
		Object total = executeOracleProcedure(
				"{CALL PCK_T_ROLE.sel_t_role_num(?,?,?,?)}", columns,
				paramaters, "cursor0").get(0).get("TOTAL");
		return Long.valueOf(total.toString());
	}

	public List<?> saveRole(RoleBean role) {

		String[] columns = new String[] { "v_role_name", "v_organ_id",
				"v_dept_id", "v_creator", "v_notes", "v_remarks" };
		Object[] paramaters = new Object[] {
				"".equals(role.getRoleName()) ? null : role.getRoleName(),
				"".equals(role.getOrganId()) ? null : role.getOrganId(),
				"".equals(role.getDeptId()) ? null : role.getDeptId(),
				"".equals(role.getCreator()) ? null : role.getCreator(),
				"".equals(role.getNotes()) ? null : role.getNotes(),
				"".equals(role.getRemarks()) ? null : role.getRemarks() };
		return executeOracleProcedure(
				"{CALL PCK_T_ROLE.ins_t_role(?,?,?,?,?,?,?)}", columns,
				paramaters, "cursor0");
	}

	public List<?> updateRole(RoleBean role) {
		String[] columns = new String[] { "v_role_id", "v_role_name",
				"v_organ_id", "v_dept_id", "v_creator", "v_notes", "v_remarks" };
		Object[] paramaters = new Object[] {
				"".equals(role.getRoleId()) ? null : role.getRoleId(),
				"".equals(role.getRoleName()) ? null : role.getRoleName(),
				"".equals(role.getOrganId()) ? null : role.getOrganId(),
				"".equals(role.getDeptId()) ? null : role.getDeptId(),
				"".equals(role.getCreator()) ? null : role.getCreator(),
				"".equals(role.getNotes()) ? null : role.getNotes(),
				"".equals(role.getRemarks()) ? null : role.getRemarks() };
		return executeOracleProcedure(
				"{CALL PCK_T_ROLE.upt_t_role(?,?,?,?,?,?,?,?)}", columns,
				paramaters, "cursor0");
	}

	public List<?> deleteRole(Long roleId) {
		String[] columns = new String[] { "v_role_id"};
		Object[] paramaters = new Object[] {roleId};
		return executeOracleProcedure(
				"{CALL PCK_T_ROLE.del_t_role(?,?)}", columns,
				paramaters, "cursor0");
	}
}
