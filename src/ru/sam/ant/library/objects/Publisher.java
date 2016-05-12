package ru.sam.ant.library.objects;

import java.io.Serializable;

public class Publisher implements Serializable {
    private String name;

    public Publisher() {
    }

    public Publisher(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
