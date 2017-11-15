package cn.uc.yiqibang.dao;

import cn.uc.yiqibang.bean.Admin;
import cn.uc.yiqibang.utils.Result;

public interface IAdminDao {

    // ���ӹ���Ա
	Result insertAdmin(Admin admin);
	
	// ɾ������Ա
	Result deleteAdmin(int adminId);
	
	// �޸Ĺ���Ա
	Result updateAdmin(Admin admin);
	
	//��ѯ���й���Ա
	Result queryAllAdmin();
	
	//����id��ѯ����Ա
	Result queryById(int adminId);
}
