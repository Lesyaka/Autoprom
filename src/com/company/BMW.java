package com.company;

public class BMW extends Car{
    private String model;
    private String year;
    private double price;

    public BMW(String color, String transmission, int wheels, String model, String year, double price) {
        super(color, transmission, wheels);
        this.model = model;
        this.year = year;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public static void start(String transmission){
        System.out.println((transmission.equals("automatic"))?"start button": "start with key");
    }

    public static void stop(){
        System.out.println("pic pic");
    }

}
