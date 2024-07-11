package com.dicoding.javafundamental.fungsi;

public class CobaFunction {
    public static void main(String[] args){
    cobaFungsi();
    double total = totalHarga(2, 10000);
    System.out.println("Total harga :" + total);
    }

    public static void cobaFungsi(){
        System.out.println("Coba fungsi");
    }

    public static double totalHarga(int quantity, double price){
        return quantity * price;
    }

}
