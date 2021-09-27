package Aula18.Ex3;

import java.io.IOException;
import java.util.Scanner;

public class Cliente {

    public void escolhaIngresso(Scanner sc){

        System.out.println("Qual tipo de ingresso deseja comprar?");

        try{
            System.out.println("1 - Ingresso Normal");
            System.out.println("2 - Ingresso VIP");
            System.out.print("> ");
            int escolha = sc.nextInt();

            if(escolha < 1 || escolha > 2){
                throw new IOException("Opcao Invalida!");
            }

            if(escolha == 1){
                Normal ingressoNormal = new Normal();
                System.out.println(ingressoNormal);
            }
            else {
                VIP ingressoVIP = new VIP();
                System.out.println(ingressoVIP);
            }

        } catch (IOException e){
            System.err.println("Erro: " + e.getMessage());
        };
    }
}
