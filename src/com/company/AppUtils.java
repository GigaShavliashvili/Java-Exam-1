package com.company;

public class AppUtils {

    static double middle(int[] array1, int[] array2) {

        int max = array1[0];

        for (int i = 0; i < array1.length; i++) {
            if (array1[i] > max) {
                max = array1[i];
            }
        }

        int max2 = array2[0];
        for (int i = 0; i < array2.length; i++) {
            if (array2[i] > max) {
                max2 = array2[i];
            }
        }


        return (max + max2) / 2;

    }

    static  double gcd(int num1, int num2){
        int n1 = num1;
        int n2 = num2;
        int i = 0;
        while(n2!=0){
            n1 = n1 % n2;
            i = n1;
            n1 = n2;
            n2 = i;
        }
        return num1 * num2 / n1;
    }



    static double middleminandmax(int[] array1) {

        int max = array1[0];

        for (int i = 0; i < array1.length; i++) {
            if (array1[i] > max) {
                max = array1[i];
            }
        }

        int min = array1[0];
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] < max) {
                min = array1[i];
            }
        }


        return (max + min) / 2;

    }



    static  double multiplaye(int[] array1){

        int multiplay = 1;
        for (int i = 0; i < array1.length; i++) {
            if(array1[i] > 50)
                multiplay = multiplay * array1[i];
        }

        return multiplay;
    }


    static String giveString(String[] array3){
        String longest = array3[0];
        for (int i = 0; i < array3.length; i++) {
            if(array3[i].length() > longest.length())
                longest = array3[i];
        }
        return  longest;
    }

}


