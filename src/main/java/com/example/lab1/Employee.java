package com.example.lab1;

public class Employee {
    private ICar myCar;
    private IPet myPet;
    private String name;
    private int age;

    public Employee(ICar myCar){
        this.myCar = myCar;
    }

    public void setMyPet(IPet myPet){
        this.myPet = myPet;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

    public void CallMyPet(){
        System.out.println("Мой питомец говорит:");
        myPet.say();
    }

    public void GetTypeOfMyCar(){
        System.out.println("Тип машины:");
        myCar.getTypeOfCar();
    }
}
