package com.devsecops.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClient;

import com.devsecops.dto.Post;

@RestController
public class PostController {
    @GetMapping("/mypost/{id}")
	public Post postById(@PathVariable("id") String id) {
		
    	 String url = "https://jsonplaceholder.typicode.com/posts/"+id;
    	
    	 // Create REST CLIENT
    	 
    	 RestClient client = RestClient.create();
    	Post post =  client.get().uri(url).retrieve().body(Post.class);
    	return post;
		
	}
    
    
	

}
