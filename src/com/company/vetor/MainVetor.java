package com.company.vetor;

public class MainVetor {
    public static void main(String[] args) {
        Vetor<String> vetor = new Vetor(5);
        vetor.add("A");
        vetor.add("B");
        vetor.add("D");
        vetor.add("D");
        vetor.add("E");
        vetor.add("G");
        vetor.clean();
        System.out.println(vetor);
        vetor.add("KAKAKA");
        vetor.get(4);
        vetor.remove(5);
        System.out.println(vetor);

//        vetor.add(8, "numero3");
//        vetor.remove(0);
//        System.out.println(vetor);
//        vetor.add("teste4");
//        vetor.add("teste5");
//        vetor.add("teste6");
//        vetor.add("teste7");
//        vetor.add("teste8");
//        vetor.add("teste9");
//        vetor.add("teste10");
//        vetor.add("teste11");
       // String teste = vetor.get("teste2");
       // String test1 = vetor.get(3);
      //  vetor.delete(1);
        //System.out.println(vetor.get());
//        vetor.add("teste123123");
        //  vetor.addInLastPostionOfVetor("Teste");
        //System.out.println(vetor.toString());
        //System.out.println(vetor.valueExist("teste5"));
        int i=0;
    }
}
