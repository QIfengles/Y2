package cn.smbms.service.role;

import java.sql.Connection;
import java.util.List;
import cn.smbms.dao.role.RoleDao;
import cn.smbms.pojo.Role;
import cn.smbms.tools.myBatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service("roleService")
public class RoleServiceImpl implements RoleService{

	@Autowired
	private RoleDao roleDao;

	public RoleDao getRoleDao() {
		return roleDao;
	}

	public void setRoleDao(RoleDao roleDao) {
		this.roleDao = roleDao;
	}

	@Override
	public List<Role> getRoleList() {
		List<Role> roleList = null;
		try {
			roleList=roleDao.getRoleList();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return roleList;
	}
	
}
