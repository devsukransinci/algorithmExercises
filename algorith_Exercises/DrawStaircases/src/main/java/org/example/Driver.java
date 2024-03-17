package org.example;

public class Driver {
    public static void main(String[] args) {
        int numSteps =5;
        int stepWidth =3;
        String variable="*".repeat(stepWidth);
        for (int i=0;i<numSteps;i++) {
            System.out.println(variable+"*".repeat(i*stepWidth));
        }

        System.out.println();
    }
}