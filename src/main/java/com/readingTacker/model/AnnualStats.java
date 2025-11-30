package com.readingTacker.model;

import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@Builder
@RequiredArgsConstructor
public class AnnualStats {
    private int year;
    private long totalBooks;
    private long totalPages;
    private double avgBooksPerMonth;
    private double avgPagesPerMonth;
}
