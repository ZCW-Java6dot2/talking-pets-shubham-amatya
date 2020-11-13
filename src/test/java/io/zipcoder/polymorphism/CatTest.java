package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CatTest {

   Pet kitty = new Cat();

   @Test
   public void catConstructorTest(){
       String expected = "Biralo";
       kitty.setPetName(expected);
       String actual = kitty.getPetName();
      Assert.assertEquals(expected, actual);
   }


   @Test
   public void catSpeak(){
      String expected = "Meow meow meow!";
      String actual = kitty.speak();
      Assert.assertEquals(expected, actual);
   }


}