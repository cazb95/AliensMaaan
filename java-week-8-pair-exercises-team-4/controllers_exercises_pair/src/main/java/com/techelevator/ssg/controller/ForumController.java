package com.techelevator.ssg.controller;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Parameter;
import java.time.LocalDateTime;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.techelevator.ssg.model.forum.ForumPost;
import com.techelevator.ssg.model.forum.*;


@Controller
public class ForumController {
	@Autowired
	private ForumDao forumdao;

	@RequestMapping(path="/ssgForumInput", method=RequestMethod.POST)
	public String processNotificationSignupSubmission(@RequestParam String username,
													 @RequestParam String message,
													 @RequestParam String subject
													 ) throws IOException{
		ForumPost f = new ForumPost();
		LocalDateTime postDate = LocalDateTime.now();
		f.setDatePosted(postDate);
		f.setMessage(message);
		f.setSubject(subject);
		f.setUsername(username);
		forumdao.save(f);
		return "redirect:/ssgForumOutput";
	}
			
	@RequestMapping(path="/ssgForumOutput", method=RequestMethod.GET)
	public String viewReviews(HttpServletRequest request){
		
		request.setAttribute("forums", forumdao.getAllPosts());
		request.getParameter("forum_date");
		return "ssgForumOutput";
	}
	@RequestMapping(path="/ssgForumInput", method=RequestMethod.GET)
	public String viewPostForm(HttpServletRequest request){

		return "ssgForumInput";
	}
	
}
