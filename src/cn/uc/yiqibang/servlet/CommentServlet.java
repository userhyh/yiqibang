package cn.uc.yiqibang.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.session.SqlSession;

import cn.uc.yiqibang.dao.CommentDao;
import cn.uc.yiqibang.dao.impl.CommentDaoImpl;
import cn.uc.yiqibang.utils.Constants;
import cn.uc.yiqibang.utils.MyBatisUtils;
import cn.uc.yiqibang.utils.Result;
import cn.uc.yiqibang.utils.WriteResultToClient;
import net.sf.json.JSONObject;

/**
 * Servlet implementation class CommentServlet
 */
@WebServlet("/CommentServlet")
public class CommentServlet extends BaseServlet {
	private static final long serialVersionUID = 1L;
	
	CommentDao commentDao=new CommentDaoImpl();
    public void adminGetAllComments(HttpServletRequest request,HttpServletResponse response){
    	System.out.println("�����ȡ���е�����");
    	Result result = commentDao.getAllComment();
    	PrintWriter out=null;
    	try {
			out = response.getWriter();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	String jsonResult = JSONObject.fromObject(result).toString();
    	out.println(jsonResult);
    }

    public void insertComment(HttpServletRequest request,HttpServletResponse response){
  	  //Ҫ�����û��Ĳ������۵�������Ҫ�õ�request���������response��Ӧ����
  	  //����������ȡ���۲���
    	String comm=request.getParameter("Comment");
		System.out.println("ִ�в������۲���");
		PrintWriter out=null;
  		try {
  			out = response.getWriter();
  		} catch (IOException e) {
  			// TODO Auto-generated catch block
  			e.printStackTrace();
  		}
  		out.println("ɾ���ɹ�:"+comm);
  	}
    
    
    public void adminDeleteCommentById(HttpServletRequest request,HttpServletResponse response){
		int commentid=Integer.parseInt(request.getParameter("id"));
		Result result = commentDao.deleteByPrimaryKey(commentid);
		WriteResultToClient.writeMethod(result, response);
	}
    
    public void adminGetCommentByLike(HttpServletRequest request,HttpServletResponse response){
		String likeStr = request.getParameter("likeStr");
		Result result = commentDao.selectByLike("%"+likeStr+"%");
		WriteResultToClient.writeMethod(result, response);
	}
    
    
    //ɾ��һ������
	public void deleteComment(HttpServletRequest request,HttpServletResponse response){
	  //Ҫ�����û��Ĳ������۵�������Ҫ�õ�request���������response��Ӧ����
	  //����������ȡ���۲���
		String commId=request.getParameter("commId");//��ȡ��������
		System.out.println("ִ��ɾ�����۲�����Ҫɾ��������idΪ��"+commId);
		PrintWriter out=null;
		try {
			out = response.getWriter();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		out.println("ɾ���ɹ�:"+commId);
	}
}
