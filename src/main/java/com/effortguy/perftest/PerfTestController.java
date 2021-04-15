package com.effortguy.perftest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PerfTestController {

    @GetMapping("posts/{postsId}")
    public String getPosts(@PathVariable Long postsId) {
        return "perfTest postsId : " + postsId;
    }
}
