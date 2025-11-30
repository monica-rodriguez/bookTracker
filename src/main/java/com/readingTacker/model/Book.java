package com.readingTacker.model;

import lombok.*;

import java.time.LocalDate;
import java.util.List;

@Data
@Builder
@RequiredArgsConstructor
public class Book {

    private Long bookId; //null before assignment made by the service

    private String title;

    private List<String> authors; //using a list to allow for multiple authors

    private String genre;

    private int pageCount;

    //Reading Dates
    private LocalDate started;
    private LocalDate finished;

    //handling which list the book is currently on (currently reading or finished)
    //possibly could add a tbr list too
    private ReadingStatus status;
}
