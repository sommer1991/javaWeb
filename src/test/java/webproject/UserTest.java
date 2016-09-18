package webproject;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.weibo.dashboard.entity.User;
import com.weibo.dashboard.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:conf/spring-mybatis.xml"})
public class UserTest {
	@Resource
	UserService us;
	
	@Test
	public void testAdd(){
		User user = new User();
		user.setName("test");
		user.setPassword("testpd");
		int res= us.insert(user);
		System.out.println(res);
	}
	
	@Test
	public void testAccountValid(){
		User user = new User();
		user.setName("test");
		user.setPassword("testpd");
		boolean res = us.accountValid(user);
		System.out.println(res);
	}
	
}
