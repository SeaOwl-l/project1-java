package com.example.lab1;

public class Truck implements ICar{
    @Override
    public void getTypeOfCar() {
        System.out.println("Машина является грузовиком");
    }
}
