package com.company;

import static com.company.AppUtils.*;

public class Main {

    public static void main(String[] args) {


        Employee AG = new Employee();
        AG.setEmployee("giga", "shavliashvili", "2022-12-07", "kaci", 12, 4444);


        System.out.println(AG.getEmployee());


        int[] myArray = {10, 20, 30, 40, 50, 52, 66};
        int[] myArray2 = {1, 2, 3, 4, 5};
        String[] myArray3 = {"giga", "gogaa", "ggsssssssss", "sda", "asssssaaaaaaaaaaaaaaaa"};
        double middle =  middle(myArray, myArray2);
        double middleminandmax = middleminandmax(myArray);
        double multiplaye = multiplaye(myArray);
        String longest = giveString(myArray3);
        double gcd = gcd(13, 15);


        System.out.println(" middle = " + middle + " middleminandmax = "
                + middleminandmax + " multiplaye = " + multiplaye + " longest = " + longest + " gcd = " + gcd);
    }
}


