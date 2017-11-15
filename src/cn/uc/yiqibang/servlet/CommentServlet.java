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
    	System.out.println("请求获取所有的评论");
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
  	  //要处理用户的插入评论的请求，需要用到request请求参数和response响应参数
  	  //从请求对象获取评论参数
    	String comm=request.getParameter("Comment");
		System.out.println("执行插入评论操作");
		PrintWriter out=null;
  		try {
  			out = response.getWriter();
  		} catch (IOException e) {
  			// TODO Auto-generated catch block
  			e.printStackTrace();
  		}
  		out.println("删除成功:"+comm);
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
    
    
    //删除一条评论
	public void deleteComment(HttpServletRequest request,HttpServletResponse response){
	  //要处理用户的插入评论的请求，需要用到request请求参数和response响应参数
	  //从请求对象获取评论参数
		String commId=request.getParameter("commId");//获取评论内容
		System.out.println("执行删除评论操作，要删除的评论id为："+commId);
		PrintWriter out=null;
		try {
			out = response.getWriter();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		out.println("删除成功:"+commId);
	}
}
