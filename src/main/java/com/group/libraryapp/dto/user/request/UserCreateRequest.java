package com.group.libraryapp.dto.user.request;

public class UserCreateRequest {

    private String name;
    private Integer age;   // int는 null안되는 기본형, Integer는 null도 가능함

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }
}
