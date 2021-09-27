package Aula9.Ex4;

public class Ex4 {
    public static void main(String[] args){
        Produto arroz = new Produto("Arroz", 22.50f, 47);
        Produto feijao = new Produto("Feijao", 15.50f, 21);

        Pedido p1 = new Pedido(arroz, 3);
        Pedido p2 = new Pedido(feijao, 5);

        System.out.println(arroz.nome
                    + " " + arroz.preco
                    + " " + arroz.quantidade);

        System.out.println(feijao.nome
                + " " + feijao.preco
                + " " + feijao.quantidade);
    }
}
