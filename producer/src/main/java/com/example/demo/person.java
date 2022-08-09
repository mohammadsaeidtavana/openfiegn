package com.example.demo;

import java.io.Serializable;

public class person  implements Serializable {

    public person() {
    }

    public person(String name, String family) {
        this.name = name;
        this.family = family;
    }

    public  String name;
    public String family;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }
}
