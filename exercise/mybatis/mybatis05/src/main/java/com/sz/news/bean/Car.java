package com.sz.news.bean;

public class Car {

    private Double price;
    private String name;
    private String speed;

    public Car() {
    }

    public Car(Double price, String name) {
        this.price = price;
        this.name = name;
    }

    public Car(String name, String speed) {
        this.name = name;
        this.speed = speed;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Car{" +
                "price=" + price +
                ", name='" + name + '\'' +
                ", speed='" + speed + '\'' +
                '}';
    }
}
