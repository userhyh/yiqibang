package cn.uc.yiqibang.utils;

public class Constants {
	//��Ӧ��
		public static final int RETCODE_SUCCESS=0;
		public static final int RETCODE_FAILED=2000;
		
		//����ӳ���ļ�.xml�İ��ĸ�·��
		 public static final String root="cn.uc.yiqibang.mapper";
		 //����mapperӳ���ļ�������
		 public static final String commentMapper=".CommentMapper";
		 public static final String newsMapper=".TNewsMapper";
		 public static final String typeMapper=".TTypeMapper";
		 public static final String picMapper=".TPicMapper";
		 
		 //���������sql����id����
		 public static final String selectAll=".selectAll";
		 public static final String selectByPrimaryKey=".selectByPrimaryKey";
		 public static final String selectByLike=".selectByLike";
		 public static final String insertSelective=".insertSelective";
		 public static final String insert=".insert";
		 public static final String update=".update";
		 public static final String delete=".delete";
		 public static final String deleteByPrimaryKey=".deleteByPrimaryKey";
		 public static final String deleteByCondition=".deleteByCondition";
		 public static final String updateByPrimaryKeySelective=".updateByPrimaryKeySelective";
		 public static final String selectAllByPage=".selectAllByPage";
		 public static final String selectById=".selectById";
		 //...
		 
		 //Comment���۵Ĳ������·��
		 public static final String commentMapper_selectAll=root+commentMapper+selectAll;
		 public static final String commentMapper_insert=root+commentMapper+insert;
		 public static final String commentMapper_deleteByCondition=root+commentMapper+deleteByCondition;
		 public static final String commentMapper_selectByLike=root+commentMapper+selectByLike;
		 public static final String commentMapper_selectById=root+commentMapper+selectById;
		 public static final String commentMapper_delete=root+commentMapper+delete;
		 
		 //News���ŵĲ������·��
		 public static final int newsPageCounts=20;//����ÿҳ����ʾ����
		 public static final String newsMapper_selectAll=root+newsMapper+selectAll;
		 public static final String newsMapper_selectAllByPage=root+newsMapper+selectAllByPage;
		 public static final String newsMapper_deleteByPrimaryKey=root+newsMapper+deleteByPrimaryKey;
		 public static final String newsMapper_insertSelective=root+newsMapper+insertSelective;
		 public static final String newsMapper_selectByLike=root+newsMapper+selectByLike;
		 public static final String newsMapper_updateByPrimaryKeySelective=root+newsMapper+updateByPrimaryKeySelective;
		 public static final String newsMapper_selectByTypeId=root+newsMapper+".selectByTypeId";
		 
		 //Type���ŷ���Ĳ������·��
		 public static final String typeMapper_selectByPrimaryKey=root+typeMapper+selectByPrimaryKey;
		 public static final String typeMapper_selectAll=root+typeMapper+selectAll;

		 //PicͼƬ
		 public static final String picMapper_deleteByCondition=root+picMapper+deleteByCondition;
		 public static final String picMapper_insertSelective=root+picMapper+insertSelective;
		
		
		
		
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 

}
