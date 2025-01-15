package com.devsuperior.demo.controllers;

import com.devsuperior.demo.dto.GithubUserDto;
import com.devsuperior.demo.feign.GithubClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GithubUserController {

    @Autowired
    private GithubClient githubClient;

    @GetMapping("/api/users")
    public List<GithubUserDto> getUsers(@RequestParam(value = "since", defaultValue = "0") int since) {
        return githubClient.getUsers(since);
    }
}
