package cn.uc.yiqibang.dao;

import cn.uc.yiqibang.bean.User;
import cn.uc.yiqibang.utils.Result;

public interface IUserDao {

    // �����û�
	Result insertUser(User user);
	
	// ɾ���û�
	Result deleteUser(int userId);
	
	// �޸��û�
	Result updateUser(User user);
	
	//��ѯ�����û�
	Result queryAllUser();
	
	//����id��ѯ�û�
	Result queryById(int userId);
}