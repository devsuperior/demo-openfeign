package com.devsuperior.demo.feign;

import com.devsuperior.demo.dto.GithubUserDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(name = "github", url = "${github.client.url}")
public interface GithubClient {

    @GetMapping("/users")
    List<GithubUserDto> getUsers(@RequestParam("since") int since);
}
