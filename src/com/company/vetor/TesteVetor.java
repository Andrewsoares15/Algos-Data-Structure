package com.company.vetor;

import java.util.Random;

public class TesteVetor {
    public static void main(String[] args) {
        Vetor<Contato> vetor = new Vetor(20);
        for (int i = 0; i <=19;i++){
            Random random = new Random();
            vetor.add(new Contato("teste", random.nextInt()));
        }
        vetor.add(12, new Contato("teste12", 12));
        System.out.println(vetor);
        System.out.println(vetor.get(2));
        System.out.println(vetor.indexOf(new Contato("teste12", 12)));
    }
}
