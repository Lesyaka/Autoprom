package com.company;

public class Main {
    public static void main(String[] args) {

        BMW bmw = new BMW("yellow", "automatic", 4, "4 SERIES", "2012",33800.0);
        bmw.start(bmw.getTransmission());
        bmw.stop();
        bmw.insuranceType();
        System.out.println(bmw.getModel());
    }
}
