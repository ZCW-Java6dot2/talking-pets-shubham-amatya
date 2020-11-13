package io.zipcoder.polymorphism;

public class Dog extends Pet{

    public Dog(String petName){
        super(petName);
    }

    public Dog() {

    }

    @Override
    public String speak(){
        return "Woof woof!";
    }




}
