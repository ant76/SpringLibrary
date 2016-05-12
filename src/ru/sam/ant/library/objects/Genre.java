package ru.sam.ant.library.objects;

import java.io.Serializable;

public class Genre implements Serializable {
    private String name;

    public Genre() {
    }

    public Genre(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
