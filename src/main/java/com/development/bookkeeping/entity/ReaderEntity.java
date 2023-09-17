package com.development.bookkeeping.entity;

import jakarta.persistence.*;

import java.util.Date;
@Entity
@Table(name = "Reader")
public class ReaderEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Reader_ID")
    private Long id;
    @Column(name = "Reader_Name")
    private String name;
    @Column(name = "Fav_Book")
    private String favoriteBook;
    @Column(name = "Curr_Book")
    private String currentBook;
    @Column(name = "Birthday")
    private Date dateOfBirth;

    public ReaderEntity(Long id, String name, String favoriteBook, String currentBook, Date birthday) {
        this.id = id;
        this.name = name;
        this.favoriteBook = favoriteBook;
        this.currentBook = currentBook;
        this.dateOfBirth = birthday;
    }

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

    public Date getBirthday() {
        return dateOfBirth;
    }

    public void setBirthday(Date birthday) {
        this.dateOfBirth = birthday;
    }

    @Override
    public String toString() {
        return "ReaderEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", favoriteBook='" + favoriteBook + '\'' +
                ", currentBook='" + currentBook + '\'' +
                ", Date of Birth=" + dateOfBirth +
                '}';
    }


}
