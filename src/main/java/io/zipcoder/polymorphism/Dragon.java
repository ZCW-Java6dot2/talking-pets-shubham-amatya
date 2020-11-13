package io.zipcoder.polymorphism;

public class Dragon extends Pet{
    public Dragon(String petName) {
        super(petName);
    }

    public Dragon(){

    };

    @Override
    public String speak(){
        return "fire roar!";
    }
}
