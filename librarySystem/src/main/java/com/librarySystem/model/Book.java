package com.librarySystem.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.time.LocalDate;

@Getter
@Setter
@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String author;
    private String publisher;
    private LocalDate publicationDate;
    private String category;
    private String language;
    private String description;
    private boolean stockAvailability;

    public Book() {
    }


}
