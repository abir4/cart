package com.example.abir;

public class Cart {

    int image;
    String name,descirption;

    public Cart(int image, String name, String descirption) {
        this.image = image;
        this.name = name;
        this.descirption = descirption;
    }


    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescirption() {
        return descirption;
    }

    public void setDescirption(String descirption) {
        this.descirption = descirption;
    }
}
