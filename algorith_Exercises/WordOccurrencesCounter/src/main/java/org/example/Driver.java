package org.example;
import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        System.out.println("Enter your passage");
        Scanner scan = new Scanner(System.in);
        String content =scan.nextLine();
        scan.close();
        Content myContent =new Content(content);
        String word = "the";

        System.out.println(word + ":" + myContent.getCount(word));
    }
}
