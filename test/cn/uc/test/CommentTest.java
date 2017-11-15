package cn.uc.test;

import java.util.Date;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import cn.uc.yiqibang.bean.Comment;
import cn.uc.yiqibang.dao.CommentDao;
import cn.uc.yiqibang.dao.impl.CommentDaoImpl;
import cn.uc.yiqibang.utils.Result;

public class CommentTest {

	CommentDao commentDao=new CommentDaoImpl();
	
	@Ignore
	@Test
	public void selectAllComment() {
		Result result = commentDao.selectAllComment();
		System.out.println(result.getRetData());
		Assert.assertNotNull(result.getRetData());
	}
	@Ignore
	@Test
	public void getCommentById(){
		Result result = commentDao.getCommentById(1);
		System.out.println(result.getRetData());
		Assert.assertNotNull(result.getRetData());
	}
	
	//@Ignore
	@Test
	public void insertComment(){
		Comment comment = new Comment();
		comment.setT_n_id(3);
		comment.setT_u_id(3);
		comment.setC_content("»¹ºÃÂð");
		comment.setC_createtime(new Date());
		comment.setC_thumbscount(66);
		Result result = commentDao.insertComment(comment);
		System.out.println(result.getRetData());
		Assert.assertNotNull(result.getRetData());
	}
	@Ignore
	@Test
	public void deleteComment(){
		Result result = commentDao.deleteComment(1);
		System.out.println(result.getRetData());
		Assert.assertNotNull(result.getRetData());
	}
}
