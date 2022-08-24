package com.example.demo.dto.beans;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@NoArgsConstructor
@Getter
@Setter
public class DefaultResponseBean {
    private String message;
    private Date date;
}
