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
	UserService as;
	@Test
	public void testFindList(){
		User res= as.select("sommer");
		System.out.println(res.getName());
		
	}
}
