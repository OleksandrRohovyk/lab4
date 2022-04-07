package com.company;
public class z1 {
    public static void main(String[] args) {

        int i =500;
        System.out.println("for");
        for(;i<=650;i+=10){
            System.out.println(i);
        }

        i = 500;
        System.out.println("while");
        while(i<=650){
            System.out.println(i);
            i+=10;
        }

        i =500;
        System.out.println("do");
        do {
            System.out.println(i);
            i += 10;
        }while (i<=650);
    }
}