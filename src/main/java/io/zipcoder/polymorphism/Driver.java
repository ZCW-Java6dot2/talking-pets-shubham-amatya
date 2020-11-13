package io.zipcoder.polymorphism;

import java.util.ArrayList;
import java.util.Scanner;

public class Driver {

    ArrayList<Pet> pets = new ArrayList<Pet>();
    //String petName;
    Scanner scanner = new Scanner(System.in);
    Integer numOfPets = 0;
    Scanner myScanner = new Scanner(System.in);



    public Driver(){

    }

    public void setNumOfPets(Integer numOfPets) {
        this.numOfPets = numOfPets;
    }

    public Integer getNumOfPets(){
        return numOfPets;
    }


    public void askUser() {
        System.out.println("Please enter the number of pets you have:");
        int userInputHasAPet = myScanner.nextInt();
        numOfPets = userInputHasAPet;
    }

        public void petDetails() {

            System.out.println("What type of pet do you have? \n Press 1 for dog\n " +
                    "Press 2 for cat and\n 3 for dragon");
            //enter an exception handler if they enter an incorrect number above 3 or a char/string
            // if/else statement...

            int userInputPetNum = myScanner.nextInt();
            myScanner.nextLine();

                switch (userInputPetNum) {
                    case 1:

                        System.out.println("What is the name of your dog?");
                        String petName = myScanner.nextLine();
                        Dog dog1 = new Dog();
                        dog1.setPetName(petName);
                        this.pets.add(dog1);
                        break;

                    case 2:

                        System.out.println("What is the name of your cat?");
                        petName = myScanner.nextLine();
                        Cat cat1 = new Cat(petName);
                        cat1.setPetName(petName);
                        this.pets.add(cat1);
                        break;

                    case 3:

                        System.out.println("What is the name of your dragon?");
                        petName = myScanner.nextLine();
                        Dragon d1 = new Dragon(petName);
                        d1.setPetName(petName);
                        this.pets.add(d1);

                    default:
                        System.out.println("Please enter a valid number");

                }
            }

            public void printOutput(){

            String console ="";
            for (Pet p: pets){
                console += p.getPetName() + " speaks "+ p.speak() + "\n";
            }
                System.out.println(console);


            }

        }















