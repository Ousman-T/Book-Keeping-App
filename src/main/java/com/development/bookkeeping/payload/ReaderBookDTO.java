package com.development.bookkeeping.payload;

public class ReaderBookDTO {
    private String name;
    private String favoritegenre;
    private String currentBook;
    private String title;
    private String author;
    private String genre;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFavoritegenre() {
        return favoritegenre;
    }

    public void setFavoritegenre(String favoritegenre) {
        this.favoritegenre = favoritegenre;
    }

    public String getCurrentBook() {
        return currentBook;
    }

    public void setCurrentBook(String currentBook) {
        this.currentBook = currentBook;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
