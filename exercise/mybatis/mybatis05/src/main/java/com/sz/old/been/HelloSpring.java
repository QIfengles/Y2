package com.sz.old.been;

import java.io.Serializable;

public class HelloSpring implements Serializable {
    public static final long  serialVersionUID =-1L;
    private String  name;
    private Integer luckNum;
    private String color;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getLuckNum() {
        return luckNum;
    }

    public void setLuckNum(Integer luckNum) {
        this.luckNum = luckNum;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "HelloSpring{" +
                "name='" + name + '\'' +
                ", luckNum=" + luckNum +
                ", color='" + color + '\'' +
                '}';
    }
}

