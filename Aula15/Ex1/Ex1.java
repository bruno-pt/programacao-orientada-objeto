package Aula15.Ex1;

/*
1. Crie uma classe pessoa que deve armazenar nome, ano de nascimento, estado onde a pessoa nasceu.
        Você deve encapsular todos os atributos da classe criando os métodos getters e setters e ainda criar:
        um método construtor que preencha os atributos (os dados devem vir de entradas do usuário na classe onde ocorre o instanciamento);
        um método para calcular a idade; um método para especificar em qual região do país a pessoa nasceu; um método para mostrar todos os dados na tela
*/

public class Ex1 {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Bruno", 2001, "PR");
        Pessoa p2 = new Pessoa("Yuri", 69, "PR");
        Pessoa p3 = new Pessoa("Nay", 666, "PR");
        Pessoa p4 = new Pessoa("Gigi", 4, "PR");
        Pessoa p5 = new Pessoa("John", 2020, "PR");
        Pessoa p6 = new Pessoa("Valentas", 2011, "PR");

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
        System.out.println(p5);
        System.out.println(p6);
    }
}
