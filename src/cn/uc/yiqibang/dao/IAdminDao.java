package cn.uc.yiqibang.dao;

import cn.uc.yiqibang.bean.Admin;
import cn.uc.yiqibang.utils.Result;

public interface IAdminDao {

    // 增加管理员
	Result insertAdmin(Admin admin);
	
	// 删除管理员
	Result deleteAdmin(int adminId);
	
	// 修改管理员
	Result updateAdmin(Admin admin);
	
	//查询所有管理员
	Result queryAllAdmin();
	
	//根据id查询管理员
	Result queryById(int adminId);
}
