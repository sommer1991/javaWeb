package com.weibo.dashboard.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.weibo.dashboard.entity.Post;
import com.weibo.dashboard.service.PostService;
import com.weibo.util.ResponseData;

@RestController
@RequestMapping(value="/post")
public class PostController {
	@Resource
	PostService postService;
	
	@ResponseBody
	@RequestMapping(value="/show",method=RequestMethod.GET)
	public ResponseData findList(){
		List<Post> list = postService.findList();
		return new ResponseData(list);
	}
	@ResponseBody
	@RequestMapping(value="/show/{userName}",method=RequestMethod.GET)
	public ResponseData findList(@PathVariable("userName") String userName){
		List<Post> list = postService.postByUser(userName);
		return new ResponseData(list);
	}
	@RequestMapping(value="/{id}",method=RequestMethod.DELETE)
	public int delete(@PathVariable("id") int id){
		int res = postService.delete(id);
		return res;
	}
	@ResponseBody
	@RequestMapping(value="/new",method=RequestMethod.POST)
	public ResponseData add(@RequestBody Post post){
		postService.insert(post);
		return new ResponseData(post);
	}
	@RequestMapping(value="/likes/{id}/{flag}",method=RequestMethod.GET)
	public void likeOrDislike(@PathVariable("id") int id,@PathVariable("flag") boolean flag){
		if(flag){
			postService.like(id);
		}else{
			postService.dislike(id);
		}
	}
}
