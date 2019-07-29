package com.mytaskapp;


import java.io.Serializable;

public class Task implements Serializable {
   String title;
   String desc;

    public Task(String title, String desc) {
        this.title = title;
        this.desc = desc;
    }
}
