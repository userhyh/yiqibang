package cn.uc.test;

import org.junit.Assert;
import org.junit.Test;

import cn.uc.yiqibang.dao.NewsDao;
import cn.uc.yiqibang.dao.impl.NewsDaoImpl;
import cn.uc.yiqibang.utils.Result;

public class NewsTest {

	NewsDao newsDao=new NewsDaoImpl();
	@Test
	public void selectAll() {
		Result result = newsDao.selectAll();
		System.out.println(result.getRetData());
		Assert.assertNotNull(result.getRetData());
	}

}
