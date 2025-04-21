package com.pluralsight;

public class CellPhone {
    public int serialNumber;
    public String model;
    public String carrier;
    public String owner;
    public String phoneNumber;

    public void displayInfo()
    {
        System.out.println( "Serial Number: " + serialNumber);
        System.out.println( "model: " + model);
    }

}