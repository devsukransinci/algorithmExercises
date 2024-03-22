package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter current hour:");
        int currentHour =scan.nextInt();
        System.out.println("Enter current minute:");
        int currentMinute=scan.nextInt();
        System.out.println("Enter current second:");
        int currentSecond=scan.nextInt();
        System.out.println("Enter hour to go forward:");
        int forwardHour =scan.nextInt();
        System.out.println("Enter minute to go forward:");
        int forwardMinute =scan.nextInt();
        System.out.println("Enter second to go forward:");
        int forwardSecond = scan.nextInt();
        int answerHour = 0,answerMinute = 0, answerSecond = 0;
        int carrySecond = 0 , carryMinute = 0;
        boolean isNextDay = false;
        answerSecond = currentSecond + forwardSecond;
        if (answerSecond >= 60) {
            answerSecond -= 60;
            carrySecond = 1;
        }
        answerMinute = currentMinute + forwardMinute + carrySecond;
        if (answerSecond >= 60) {
            answerSecond -= 60;
            carrySecond = 1;
        }
        answerHour = currentHour + forwardMinute + carryMinute;
        if (answerHour >= 24) {
            answerHour -= 24;
            isNextDay = true;
        }
        else {
            System.out.println("The answer is " + answerHour + ":" +
                    answerMinute + ":" + answerSecond );
        }
    }
}

