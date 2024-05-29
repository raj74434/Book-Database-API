package com.books.manage.dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class UpdateBookDTO {

    private String title;
    private String author;
    private String ISBN;
    private LocalDate publication_date;
}
