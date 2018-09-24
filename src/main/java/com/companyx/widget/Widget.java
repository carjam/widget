package com.companyx.widget;

import javax.persistence.*;

@Entity
public class Widget {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String name;

    public Widget() {  }

    public Widget(String name) {
        this.setName(name);
    }

    public Widget(int id, String title, String content) {
        this.setId(id);
        this.setName(title);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Blog{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}