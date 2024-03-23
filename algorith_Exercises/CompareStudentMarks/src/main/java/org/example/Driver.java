package org.example;

public class Driver {
    public static void main(String[] args) {
        Student ali = new Student("Ali");
        ali.addMarks("English",63);
        ali.addMarks("math",98);
        ali.addMarks("History",79);
        Student ayse = new Student("ayse");
        ayse.addMarks("English",85);
        ayse.addMarks("math",73);
        ayse.addMarks("History",45);
        if (ali.compareTo(ayse) > 0) {
            System.out.println(ali.getName() + "daha yüksek bir toplam not aldı");
        }
        else if (ali.compareTo(ayse)< 0){
            System.out.println(ayse.getName() + "daha yüksek bir toplam not aldı");
        }
        else {
            System.out.println("Her iki öğrenci de aynı toplam puanı aldı");
        }
    }
}