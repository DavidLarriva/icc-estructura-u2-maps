package controllers;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Mapa {
    public Mapa() {
        hashMap();
        linkedHashMap();
        treeMap();
        
    }

    public void hashMap() {
        //HashMap Array pero no repite elementos

        HashMap<String, Integer> mapa = new HashMap<>();

        mapa.put("Manzana", 10);
        mapa.put("Pera", 11);
        mapa.put("Durazno", 5);
        mapa.put("Mango", 6);

        System.out.println(mapa);
        //sou mapa = toString 

        //mapa = CLase ; mapa.metodo1 ; mapa.containsKey("Pera"); containsKey 

        System.out.println("Hay Pera " + mapa.containsKey("Pera"));

        System.out.println("Valor de Pera " + mapa.get("Pera"));

        //Eliminar Item
        mapa.remove("Pera");

        System.out.println(mapa);



    }

    public void linkedHashMap() {
        LinkedHashMap<String, Integer> mapa = new LinkedHashMap<>();

        mapa.put("Manzana", 10);
        mapa.put("Pera", 11);
        mapa.put("Durazno", 5);
        mapa.put("Mango", 6);

        System.out.println("LinkedHashMap: " + mapa);
        System.out.println("Hay Pera: " + mapa.containsKey("Pera"));
        System.out.println("Valor de Pera: " + mapa.get("Pera"));

        // Eliminar Item
        mapa.remove("Pera");
        System.out.println("Después de eliminar Pera: " + mapa);
    }

    public void treeMap() {
        TreeMap<String, Integer> mapa = new TreeMap<>();

        mapa.put("Manzana", 10);
        mapa.put("Pera", 11);
        mapa.put("Durazno", 5);
        mapa.put("Mango", 6);

        System.out.println("TreeMap: " + mapa);
        System.out.println("Hay Pera: " + mapa.containsKey("Pera"));
        System.out.println("Valor de Pera: " + mapa.get("Pera"));

        // Eliminar Item
        mapa.remove("Pera");
        System.out.println("Después de eliminar Pera: " + mapa);
    }

}
