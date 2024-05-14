package com.example.app;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class Item implements Serializable {
    public enum PostType {
        @SerializedName("Lost")
        LOST,
        @SerializedName("Found")
        FOUND
    }

    @SerializedName("PostType")
    private PostType postType;

    @SerializedName("Name")
    private String name;

    @SerializedName("Phone")
    private String phone;

    @SerializedName("Description")
    private String description;

    @SerializedName("Date")
    private String date;

    @SerializedName("Location")
    private String location;

    public Item(PostType postType, String name, String phone, String description, String date, String location) {
        this.postType = postType;
        this.name = name;
        this.phone = phone;
        this.description = description;
        this.date = date;
        this.location = location;
    }

    public PostType getPostType() {
        return postType;
    }

    public void setPostType(PostType postType) {
        this.postType = postType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return Objects.equals(name, item.name) &&
                Objects.equals(date, item.date) &&
                Objects.equals(phone, item.phone) &&
                Objects.equals(location, item.location) &&
                Objects.equals(description, item.description) &&
                postType == item.postType;
    }


}
