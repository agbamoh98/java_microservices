package Homework.MathPack;

import java.util.Random;

public class Numbers {

    public static double getAverage(int a, int b, int c){
        return (a+b+c)/3.0;
    }
    public static int getRandomNumber(int min, int max){
        return (int) (Math.random() *(max - min + 1) + min);
    }
    public static boolean isEven(int num){
        return num%2==0;
    }
    public static boolean isOdd(int num){
        return num%2!=0;
    }

    public static void main(String[] args) {
        System.out.println("the average of 1,3,7 is: "+getAverage(1,3,7));
        System.out.println("a random number between 5 and 15 is: "+getRandomNumber(5,15));
        System.out.println("is 4 even: "+isEven(4));
        System.out.println("is 11 even: "+isEven(11));
        System.out.println("is 7 odd: "+isOdd(7));
        System.out.println("is 204 odd: "+isOdd(204));
    }

}
