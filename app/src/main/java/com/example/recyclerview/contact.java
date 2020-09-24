package com.example.recyclerview;

public class contact {
    public  String name;
    public String email;
    public String Imageurl;

    public contact(String name, String email, String imageurl) {
        this.name = name;
        this.email = email;
        Imageurl = imageurl;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setImageurl(String imageurl) {
        Imageurl = imageurl;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getImageurl() {
        return Imageurl;
    }

    @Override
    public String toString() {
        return "contact{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", Imageurl='" + Imageurl + '\'' +
                '}';
    }
}
