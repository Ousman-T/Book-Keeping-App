package com.development.bookkeeping.entity;


import jakarta.persistence.*;
import org.springframework.data.jpa.repository.Query;
@Entity

public class ReaderBookEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "book_id")
    private Long bookId;
    @Column(name = "reader_id")
    private Long readerId;

    public Long getBookId() {
        return bookId;
    }

    public void setBookId(Long bookId) {
        this.bookId = bookId;
    }

    public Long getReaderId() {
        return readerId;
    }

    public void setReaderId(Long readerId) {
        this.readerId = readerId;
    }
}
