package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;


public class DogTest {

    Pet d1 = new Dog();


    @Test

    public void dogConstructorTest() {

        String expected = "Bruno";
        d1.setPetName(expected);
        String actual = d1.getPetName();
        Assert.assertEquals(expected, actual);

    }
    @Test
    public void dogSpeakTest(){
        String expected = "Woof woof!";
        String actual = d1.speak();
        Assert.assertEquals(expected, actual);
    }











}