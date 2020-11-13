package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PetTest {
    Pet p1 = new Pet();

    @Test

    public void testSetPetName(){

        String expected = "Taki";
        p1.setPetName(expected);
        String actual = p1.getPetName();
        Assert.assertEquals(expected, actual);

    }

    @Test

    public void testSpeak(){
        String expected = "Animal soundsss...";
        String actual = p1.speak();
        Assert.assertEquals(expected, actual);
    }










}