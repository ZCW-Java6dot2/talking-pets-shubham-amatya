package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class DriverTest {

    Driver d= new Driver();

    @Test
    public void TestGetNumOfPets(){
        Integer expected = 4;
        d.setNumOfPets(expected);
        Integer actual = d.getNumOfPets();
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void TestAskUser(){
        
    }



}