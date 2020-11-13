package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;



public class DragonTest {

    Pet Dingo = new Dragon();


    @Test

    public void dragonConstructorTest(){
        String expected = "Lakhe";
        Dingo.setPetName(expected);
        String actual = Dingo.getPetName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void dragonSpeakTest(){
        String expected = "fire roar!";
        String actual = Dingo.speak();
        Assert.assertEquals(expected, actual);
    }

}