package com.dicoding.javafundamental.perulangan;

public class Perulangan {
    public static void main(String[] args){
        int counter = 10;
        //perulangan biasa
        for(int i = 0; i <=counter; i++){
            System.out.println("Perulangan ke:" + i);
        }

        //perulangan bersarang

        for(int i = 0; i <= counter ; i++){
            for(int j = 0; j <= i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
