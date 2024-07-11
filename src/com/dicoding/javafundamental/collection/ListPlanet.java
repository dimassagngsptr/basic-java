package com.dicoding.javafundamental.collection;

import java.util.ArrayList;
import java.util.List;

public class ListPlanet {
    public static void main(String[] args){
        List<String> planets = new ArrayList<>();
        planets.add("Merkurius");
        planets.add("Venus");
        planets.add("Bumi");

        for(int i = 0; i < planets.size(); i++){
            System.out.println("\t index-" + i + "=" + planets.get(i));
        }

//        planets.remove("Venus");
    }
}
