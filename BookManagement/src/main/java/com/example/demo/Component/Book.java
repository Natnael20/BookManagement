package com.example.demo.Component;

import org.springframework.stereotype.Component;

@Component
public class Book {
	
	private String title;
    private String author;
    private String ISBN;
    private int publicationYear;
    private String genre;
    private double price;
    private boolean available;

    // Default constructor
    public Book() {
    }

    // Parameterized constructor
    public Book(String title, String author, String ISBN, int publicationYear, String genre, double price, boolean available) {
    	this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.publicationYear = publicationYear;
        this.genre = genre;
        this.price = price;
        this.available = available;
    }

    // Getters and setters for attributes
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

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
    
    @Override
    public String toString() {
        return "Book Title: " + title +
               "\nAuthor: " + author +
               "\nISBN: " + ISBN +
               "\nPublication Year: " + publicationYear +
               "\nGenre: " + genre +
               "\nPrice: " + price +
               "\nAvailability: " + available;
    }

}
