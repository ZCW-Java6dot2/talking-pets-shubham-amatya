package io.zipcoder.polymorphism;

public class Cat extends Pet{
    public Cat(String petName) {
        super(petName);
    }

    public Cat(){

    };

    @Override
    public String speak(){
        return "Meow meow meow!";
    }



}
