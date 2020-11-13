package io.zipcoder.polymorphism;


import java.util.Scanner;

public class MainApplication {

    public static void main(String[] args) {

        Driver dr = new Driver();
        dr.askUser();

        for (int i = 1; i <= dr.getNumOfPets(); i++) {
            dr.petDetails();

        }


        dr.printOutput();



    }
























}
