package com.gg117722461.oneappg.Model;

/*All below code from https://www.youtube.com/watch?v=5VPEvKhShK8&list=PLKETiCsEsH0qoTj0-ZAO-knfhNPRUJzVx&index=1 (https://github.com/developersamuelakram/MyChatApp)*/

public class Chats {
    String sender, reciever, message;
    boolean isseen;


    public Chats(String sender, String reciever, String message,boolean isseen) {
        this.sender = sender;
        this.reciever = reciever;
        this.message = message;
        this.isseen = isseen;
    }


    public Chats() {
    }


    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getReciever() {
        return reciever;
    }

    public void setReciever(String reciever) {
        this.reciever = reciever;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isIsseen() {
        return isseen;
    }

    public void setIsseen(boolean isseen) {
        this.isseen = isseen;
    }
}


