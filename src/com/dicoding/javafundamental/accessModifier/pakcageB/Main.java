package com.dicoding.javafundamental.accessModifier.pakcageB;

import com.dicoding.javafundamental.accessModifier.packageA.PackageA;

public class Main {
    public static void main(String[] args){
        PackageA packageA = new PackageA();
        PackageB packageB = new PackageB();
        packageB.methodA();
    }
}
