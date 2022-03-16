package com.example.lab4b;

public class Product {
    private int img;
    private String name;
    private float rating;
    private String sumVote;
    private double price;
    private String discount;

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public String getSumVote() {
        return sumVote;
    }

    public void setSumVote(String sumVote) {
        this.sumVote = sumVote;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDiscount() {
        return discount;
    }

    public void setDiscount(String discount) {
        this.discount = discount;
    }

    public Product(int img, String name, float rating, String sumVote, double price, String discount) {
        this.img = img;
        this.name = name;
        this.rating = rating;
        this.sumVote = sumVote;
        this.price = price;
        this.discount = discount;
    }
}
