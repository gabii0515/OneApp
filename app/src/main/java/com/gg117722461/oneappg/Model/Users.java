package com.gg117722461.oneappg.Model;

/*All below code from https://www.youtube.com/watch?v=5VPEvKhShK8&list=PLKETiCsEsH0qoTj0-ZAO-knfhNPRUJzVx&index=1 (https://github.com/developersamuelakram/MyChatApp)*/

public class Users {

    String username, imageURL, id, status;

    public Users(String username, String imageURL, String id, String status) {
        this.username = username;
        this.imageURL = imageURL;
        this.id = id;
        this.status = status;

    }

    public Users() {
    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
