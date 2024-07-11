package com.dicoding.javafundamental.basic;

import com.dicoding.javafundamental.basic.musik.Gitar;
import org.apache.commons.lang3.time.DateUtils;

import java.util.Date;

public class Main {
    public static void main(String[] args){
        System.out.println("Hello world");
        Gitar.bunyi();
        Date today = new Date();
        System.out.println("Hari ini adalah :" + today);
        Date tomorrow = DateUtils.addDays(today, 1);
        System.out.println("dan besok adalah :" + tomorrow);

    }
}
