package Aula15.Ex2;
//correção commit passado > Aula 15 - Ex2 Finalizado

/*
2. Crie uma classe denominada Elevador para armazenar as informações de um elevador em um prédio.
A classe deve armazenar
    o andar atual, considerando o térreo como 0,
    o total de andares no prédio (85),
    a capacidade do elevador (2 pessoas)
    e a quantidade de pessoas que estão utilizando ele no momento.

Os seguintes métodos são devem ser implementados a partir de uma interface:

    Construtor: deve receber como parâmetros a capacidade do elevador e o total de andares no prédio (considere que os elevadores sempre começam no térreo e vazios);
    Entra: para acrescentar uma pessoa no elevador verificando e permitindo apenas se ainda houver espaço;
    Sai: para remover uma pessoa do elevador, verificando se há alguém nele para poder haver remoção;
    Sobe: para subir um andar, verificando se não está no último andar e se pode subir;
    Desce: para descer um andar, verificando se não está no térreo e se pode descer;
    Getters e Setters: você deve encapsular todos os atributos da classe criando os métodos;
*/

public class Ex2 {
    public static void main(String[] args) {
        Elevador elevador = new Elevador(2,85);

        elevador.entra();
        elevador.entra();

        for(int i=0; i<elevador.get_totalAndar()+1; i++){
            elevador.sobe();
        }

        for(int i= elevador.get_totalAndar(); i>-1; i--){
            elevador.desce();
        }

        elevador.sai();
        elevador.sai();
    }
}
