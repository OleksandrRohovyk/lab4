package com.company;
import java.util.Scanner;
public class z4 {
    public static void main(String[] args) {

        System.out.println("введіть факторіал");
        Scanner i = new Scanner(System.in);
        int x = 1;
        int f = 1;
        int z = i.nextInt();
        for(;f<=z; f++) x*=f ;
        System.out.println(x+" for");

        while(f<=z){
            x*=f;
            f++;
        }
        System.out.println(x+" while");
    }
}