package com.marttech.mysalesrecyclerviews;


public class Product {

    private int id;
    private String title,shortDesc;
    private double price,rating;
    private int image;

    public Product(int id, String title, String shortDesc, double price, double rating, int image) {
        this.id = id;
        this.title = title;
        this.shortDesc = shortDesc;
        this.price = price;
        this.rating = rating;
        this.image = image;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getShortDesc() {
        return shortDesc;
    }

    public double getPrice() {
        return price;
    }

    public double getRating() {
        return rating;
    }

    public int getImage() {
        return image;
    }
}
