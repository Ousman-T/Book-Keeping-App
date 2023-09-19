package com.development.bookkeeping.entity;

import jakarta.persistence.*;

import java.util.Date;
@Entity
@Table(name = "Reader")
public class ReaderEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "reader_id")
    private Long id;
    @Column(name = "reader_name")
    private String name;
    @Column(name = "favoriteBook")
    private String favoriteBook;
    @Column(name = "currentBook")
    private String currentBook;
    @Column(name = "birthday")
    private String birthday;

    public ReaderEntity(Long id, String name, String favoriteBook, String currentBook, String birthday) {
        this.id = id;
        this.name = name;
        this.favoriteBook = favoriteBook;
        this.currentBook = currentBook;
        this.birthday = birthday;
    }

    public ReaderEntity(){};

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFavoriteBook() {
        return favoriteBook;
    }

    public void setFavoriteBook(String favoriteBook) {
        this.favoriteBook = favoriteBook;
    }

    public String getCurrentBook() {
        return currentBook;
    }

    public void setCurrentBook(String currentBook) {
        this.currentBook = currentBook;
    }

    public String  getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "ReaderEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", favoriteBook='" + favoriteBook + '\'' +
                ", currentBook='" + currentBook + '\'' +
                ", Date of Birth=" + birthday +
                '}';
    }


}
