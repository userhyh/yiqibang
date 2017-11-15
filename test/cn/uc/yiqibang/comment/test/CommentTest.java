package cn.uc.yiqibang.comment.test;

import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import cn.uc.yiqibang.bean.Comment;
import cn.uc.yiqibang.dao.CommentDao;
import cn.uc.yiqibang.dao.impl.CommentDaoImpl;
import cn.uc.yiqibang.utils.Result;

public class CommentTest {

	CommentDao commentDao=new CommentDaoImpl();
	
	@Test
	public void getAllComment() {
		Result result = commentDao.getAllComment();
		System.out.println(result.getRetData());
		Assert.assertNotNull(result.getRetData());
	}
	@Test
	public void getCommentById(){
		Result result = commentDao.getCommentById(14);
		System.out.println(result.getRetData());
		Assert.assertNotNull(result.getRetData());
	}
	
	@Test
	public void insertComment(){
		Comment comment = new Comment();
		comment.setT_n_id(4);
		comment.setT_u_id(1);
		comment.setC_content("������ôˬ");
		comment.setC_createtime(new Date());
		comment.setC_thumbscount(9);
		Result result = commentDao.insertComment(comment);
		System.out.println(result.getRetData());
		Assert.assertNotNull(result.getRetData());
	}
	
	//@Ignore
	@Test
	public void deleteComment(){
		Result result = commentDao.deleteComment(10);
		System.out.println(result.getRetData());
		Assert.assertNotNull(result.getRetData());
	}
}
