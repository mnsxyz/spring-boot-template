package com.example.springboottemplate.base;

import lombok.Setter;

@Setter
public class ResponseData<T> {

    private String message;
    private T data;

}
