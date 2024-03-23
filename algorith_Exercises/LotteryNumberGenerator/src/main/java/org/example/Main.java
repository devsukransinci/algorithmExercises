package org.example;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        int min = 1, max=49, slots=6;
        int[] lotterArray=new int[slots];
        boolean isRepeated;
        int randomNumber=0;
        for (int indexDrawn = 0; indexDrawn < slots; indexDrawn++){
            do {
                isRepeated =false;
                // 1 to 49
                randomNumber = rand.nextInt(max + 1 - min) + min;
                for (int k=0; k<= indexDrawn; k++){
                    if (lotterArray[k]== randomNumber ){
                        isRepeated = true;
                        break;
                    }
                }

            }while (isRepeated);
            lotterArray[indexDrawn]=randomNumber;
        }
        Arrays.sort(lotterArray);
        System.out.println("The result of the lottery");
        for (int i =0; i<slots; i++) {
            System.out.println(lotterArray[i]+"");
        }

    }
}