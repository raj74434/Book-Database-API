package com.books.manage.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @JsonIgnore
    private Integer bookId;

    @NotNull
    @NotBlank(message = "Title is mandatory")
     private String title;

    @NotNull
    @NotBlank(message = "Author is mandatory")
     private String author;

    @NotNull
    @NotBlank(message = "ISBN is mandatory")
     private String ISBN;

    @NotNull
    @NotNull(message = "Publication date is mandatory")
     private LocalDate publication_date;

}
