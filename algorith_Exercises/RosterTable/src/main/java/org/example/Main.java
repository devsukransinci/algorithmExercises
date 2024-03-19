package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int days = 3;
        ArrayList<ArrayList <String>> roster =
                new ArrayList<ArrayList<String>>(days);
        ArrayList<String> day1 =new ArrayList<String>();
        ArrayList<String> day2 =new ArrayList<String>();
        ArrayList<String> day3 =new ArrayList<String>();
        day1.add("ali");
        day1.add("ayse");
        roster.add(day1);
        day2.add("mehmet");
        day2.add("veli");
        roster.add(day2);
        day3.add("tugce");
        day3.add("ahmet");
        roster.add(day3);
        getDays(roster,"mehmet");
        getDays(roster,"ahmet");
    }
    public static void getDays( ArrayList<ArrayList <String>> rosterTable,String name){
        for (ArrayList<String>arrList :rosterTable ){
            for (String str : arrList ){
                if (str.contentEquals(name)){
                    System.out.println(rosterTable.indexOf(arrList)+1);
                }
            }
        }
    }
}