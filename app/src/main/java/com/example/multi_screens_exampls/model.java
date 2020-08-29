package com.example.multi_screens_exampls;

public class model {
    String string;
    String string2;
    int anInt;

    public model(String string, String string2, int anInt) {
        this.string = string;
        this.string2 = string2;
        this.anInt = anInt;
    }

    public String getString() {
        return string;
    }

    public String getString2() {
        return string2;
    }

    public int getAnInt() {
        return anInt;
    }
}
