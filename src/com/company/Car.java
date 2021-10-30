package com.company;

public class Car {
    private String color;
    private String transmission;
    private int wheels;

    public Car(String color, String type, int wheels) {
        this.color = color;
        this.transmission = type;
        this.wheels = wheels;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public static void start(String transmission){
        System.out.println((transmission.equals("mechanic"))?"start with key": "dont move");
    }

    public static void stop(){
        System.out.println("stop a car");
    }

    public final void insuranceType(){
        System.out.println("car insurance");
    }
}
