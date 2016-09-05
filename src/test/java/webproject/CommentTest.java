package webproject;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.weibo.dashboard.entity.Comment;
import com.weibo.dashboard.entity.Post;
import com.weibo.dashboard.service.CommentService;
import com.weibo.dashboard.service.PostService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:conf/spring-mybatis.xml"})
public class CommentTest {
	@Resource
	CommentService commentservice;
	/*@Test
	public void testFindList(){
		List<Post> list = commentservice.findList();
		for (Post post : list) {
			System.out.println(post.getAuthorName());
		}
	}*/
	@Test
	public void testAdd(){
		Comment comment = new Comment();
		comment.setcContent("good");
		comment.setcAuthorName("sommer");
		comment.setPostId(2);
		int res = commentservice.insert(comment);
		System.out.println(res);
		
	}
}
