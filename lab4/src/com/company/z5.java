package com.company;
public class z5 {
    public static void main(String[] args) {
        int ho1,min1,ho2,min2,n;
        n = 1 ;
        for (int h = 1; h <= 24; h++){
            ho1 = h/10;
            min1 = h%10;
            for (int m = 1; m <= 60; m++){
                ho2 = m/10;
                min2 = m%10;
                if(ho1==min2 & ho2==min1){
                    n++;
                }
            }
        }
        System.out.println("результат "+n);
    }
}