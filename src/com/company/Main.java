package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList();
        array.add("Teste");
        array.add("Teste2");
        array.add("Teste3");
        array.add("Teste4");
        array.add("Teste4");
        array.remove(2);
        array.get(15);
        array.clear();
        array.get(5);
        System.out.println(array);
    }
}
