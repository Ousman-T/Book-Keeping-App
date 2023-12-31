package com.development.bookkeeping.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "Reader")
public class ReaderEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name", nullable = false)
    private String name;
    @Column(name = "favoriteBook", nullable = false)
    private String favoriteBook;
    @Column(name = "currentBook")
    private String currentBook;
    @Column(name = "favoriteGenre", nullable = false)
    private String favoriteGenre;

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinTable(
            name = "reader_books",
            joinColumns = @JoinColumn(name = "reader_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "book_id", referencedColumnName = "id")
    )
    private List<BookEntity> books;

    public ReaderEntity(Long id, String name, String favoriteBook, String currentBook, String favoriteGenre) {
        this.id = id;
        this.name = name;
        this.favoriteBook = favoriteBook;
        this.currentBook = currentBook;
        this.favoriteGenre = favoriteGenre;
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

    public String getFavoriteGenre() {
        return favoriteGenre;
    }

    public void setFavoriteGenre(String favoriteGenre) {
        this.favoriteGenre = favoriteGenre;
    }


    @Override
    public String toString() {
        return "ReaderEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", favoriteBook='" + favoriteBook + '\'' +
                ", currentBook='" + currentBook + '\'' +
                ", favoriteGenre=" + favoriteGenre +
                '}';
    }


}
