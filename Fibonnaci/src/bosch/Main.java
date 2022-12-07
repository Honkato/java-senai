package bosch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Fibonnaci fi = new Fibonnaci();
        System.out.println(Arrays.toString(fi.thanos()));

        /*
        FuncoesUsuais f = new FuncoesUsuais();

        Random r = new Random();
        ArrayList<String> thanificacao = new ArrayList<>();
        while (true){
            String tahnos = f.pegarStr("Digite o nome de um amigo, ou 0 para Thanifica-los");
            if (tahnos.equals("0")){
                if (thanificacao.size() > 2) {
                    System.out.println(thanificacao);
                    System.out.println("*Click");
                    break;
                } else {
                    System.out.println("Você precisa de pelo menos 2 friends");
                }
            }
            thanificacao.add(tahnos);
        }
        int metade = thanificacao.size() / 2;
        if (thanificacao.size() % 2 != 0){
            metade += 1;
        }
        for (int i = 0; i < metade; i++) {
            thanificacao.remove(r.nextInt(thanificacao.size()));
        }
        System.out.println(thanificacao);

*/
        /*
        Scanner scan = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("""
                        ========SEJA BEM-VINDO[A]========
                        [X] - Sequencia de Fibonnaci
                        [0] - Sair
                        """);
                int qnt = scan.nextInt();
                if (qnt == 0){
                    System.out.println("Bye :(");
                    break;
                }else if (qnt < 0){
                    qnt *= -1;
                    System.out.println("***Numero convertido para POSITIVO***");
                }
                System.out.println(fi.getFibbonaci(qnt));
            }catch (Exception e){
                System.out.println("Por favor digite um Numero Natural");
            }
        }
        */

    }
}
