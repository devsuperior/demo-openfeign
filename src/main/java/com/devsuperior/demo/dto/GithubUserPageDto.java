package com.devsuperior.demo.dto;

import java.util.List;

public class GithubUserPageDto {

    private List<GithubUserDto> page;
    private String next;

    public List<GithubUserDto> getPage() {
        return page;
    }

    public void setPage(List<GithubUserDto> page) {
        this.page = page;
    }

    public String getNext() {
        return next;
    }

    public void setNext(String next) {
        this.next = next;
    }
}
