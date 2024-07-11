package com.dicoding.javafundamental.accessModifier.pakcageB;

import com.dicoding.javafundamental.accessModifier.packageA.PackageA;

public class PackageB extends PackageA {
    @Override
    protected void methodA(){
        super.methodA();
        System.out.println("Contoh pemanggilan protected dari package luar");
    }
}
