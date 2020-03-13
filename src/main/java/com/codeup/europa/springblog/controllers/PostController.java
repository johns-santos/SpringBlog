package com.codeup.europa.springblog.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

public class PostController {

    @GetMapping("/posts")
    @ResponseBody
    public String getPosts() {
        return "post index page";
    }

//    @GetMapping("/post/{id}")
//    @ResponseBody
//    public String getPost(@PathVariable int id) {
//        return "view individual post" + id;
//    }
//
//    @GetMapping("/post/create")
//    @ResponseBody
//    public String getCreatePostForm() {
//        return "view the form for creating a post";
//    }

    @PostMapping("/posts/create")
    @ResponseBody
    public String createPost() {
        return "Create a new post";
    }
}