package com.example.abir;

public class Model {

    int image;
    String name,descirption;

    public Model(int image, String name, String description) {
        this.image = image;
        this.name = name;
        this.descirption = description;
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

    public String getDescription() {
        return descirption;
    }

    public void setDescription(String description) {
        this.descirption = description;
    }
}
