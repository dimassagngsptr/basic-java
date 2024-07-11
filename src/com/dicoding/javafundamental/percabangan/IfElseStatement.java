package com.dicoding.javafundamental.percabangan;

public class IfElseStatement {
    public static void main(String[] args){
        int nilaiUjian = 80;
        char indeksPrestasi = 0;

        if(nilaiUjian >= 90 && nilaiUjian <= 100){
            indeksPrestasi = 'A';
        }else if(nilaiUjian >= 80 && nilaiUjian <= 89){
            indeksPrestasi ='B';
        } else if (nilaiUjian >= 70 && nilaiUjian <= 79) {
            indeksPrestasi = 'C';
        } else if (nilaiUjian >= 60 && nilaiUjian <= 69) {
            indeksPrestasi = 'D';
        } else if (nilaiUjian >= 50 && nilaiUjian <= 59) {
            indeksPrestasi = 'E';
        }else if (nilaiUjian <50){
            indeksPrestasi ='F';
        }else{
            System.out.println("Invalid input");
        }
        System.out.println("Grade anda adalah:" + indeksPrestasi);
    }
}
