package com.books.manage.exception;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class ExceptionBody {

    private LocalDateTime time;

    private String Details;
    private String message;
}
