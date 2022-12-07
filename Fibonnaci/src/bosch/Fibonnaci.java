package bosch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Fibonnaci {
    Random r = new Random();
    public ArrayList<Integer> getFibbonaci(int qnt){
        ArrayList<Integer> fibonnaci = new ArrayList<>(Arrays.asList(1,1));
        for (int i = 1; i < qnt; i++) {
            int num  = fibonnaci.get(i) + fibonnaci.get(i-1);
            fibonnaci.add(num);
        }
        return fibonnaci;
/*
        while (true){

            if (qnt > 0 ){
                num1 += num2;
                fibonnaci.add(num1);
                qnt -= 1;
            }
            if (qnt > 0){
                num2 += num1;
                fibonnaci.add(num2);
                qnt -= 1;
            }else{
                return fibonnaci;
            }
*/



    }
    public String[] thanos (){
        String[] nomes = {"Batista", "Tejero", "Alex", "Gustavo", "Michael", "Emilly", "Naelly", "Luiza", "Grazielly", "Adhayne", "Guilherme", "Beatriz", "Tayssa", "Macharete", "Raissa", "Radija", "Capovila", "Livia"};
        String[] nomesAux;
        String nome;
        System.out.println(Arrays.toString(nomes));
        int indexNome = 0;
        for (int x = 0; x < 9; x++) {
            nomesAux = new String[]{};
            nome = nomes[r.nextInt(nomes.length)];
            for (int i = 0; i < nomes.length; i++) {
                if (nomes[i].equals(nome)) {
                    indexNome = i;
                }
            }
//            System.out.println(indexNome);
            for (int i = 0; i < nomes.length; i++) {
                if (i != indexNome)
                    nomesAux = new String[]{Arrays.toString(nomesAux), nomes[i]};
            }
//            System.out.println(Arrays.toString(nomesAux));
            nome = Arrays.toString(nomesAux);
            nomes = nome.replace("[], ", "").replace("[", "").replace("]", "").replace(",", "").split(" ");
        }
        System.out.println("*Click!");
        return nomes;
    }

    public String[] thanos (String[] name){
        String[] nomes = name;
        String[] nomesAux;
        String nome;
        System.out.println(Arrays.toString(nomes));
        int indexNome = 0;
        int metade = nomes.length / 2;
        if (nomes.length % 2 != 0){
            metade +=1;
        }

        for (int x = 0; x < metade; x++) {
            nomesAux = new String[]{};
            nome = nomes[r.nextInt(nomes.length)];
            for (int i = 0; i < nomes.length; i++) {
                if (nomes[i].equals(nome)) {
                    indexNome = i;
                }
            }
//            System.out.println(indexNome);
            for (int i = 0; i < nomes.length; i++) {
                if (i != indexNome)
                    nomesAux = new String[]{Arrays.toString(nomesAux), nomes[i]};
            }
//            System.out.println(Arrays.toString(nomesAux));
            nome = Arrays.toString(nomesAux);
            nomes = nome.replace("[], ", "").replace("[", "").replace("]", "").replace(",", "").split(" ");
        }
        System.out.println("*Click!");
        return nomes;
    }

}
