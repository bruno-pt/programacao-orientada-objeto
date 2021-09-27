package Aula18.Ex3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Ingresso ingresso = new Ingresso();
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um valor para o Ingresso > ");
        ingresso.setIngressoValor(sc.nextFloat());
        System.out.println();

        clearBuffer(sc);

        System.out.print("Nome do comprador > ");
        ingresso.setComprador(sc.nextLine());
        System.out.println();

        Cliente cliente = new Cliente();

        cliente.escolhaIngresso(sc);

        sc.close();
    }

    private static void clearBuffer(Scanner scanner) {
        if (scanner.hasNextLine()) {
            scanner.nextLine();
        }
    }
}
