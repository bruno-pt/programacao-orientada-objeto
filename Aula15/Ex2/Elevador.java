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

public class Elevador {
    private int _andarAtual;
    private int _totalAndar;
    private int _capacidade;
    private int _qntPessoas;

    public Elevador(int _capacidade, int _totalAndar) {
        this.set_andarAtual(0);
        this.set_totalAndar(_totalAndar);
        this.set_capacidade(_capacidade);
        this.set_qntPessoas(0);
        System.out.println("Elevador criado!");
    }

    public void entra(){
        if(this.get_qntPessoas() < this.get_capacidade()){
            this.set_qntPessoas(this._qntPessoas+1);
            System.out.println("Uma pessoa entrou! Pessoas no Elevador > " + this.get_qntPessoas());
        }
        else{
            System.out.println("Elevador cheio!");
        }
    }

    public void sai(){
        if(this.get_qntPessoas() > 0){
            this.set_qntPessoas(this._qntPessoas-1);
            System.out.println("Uma pessoa saiu! Pessoas no Elevador > " + this.get_qntPessoas());
        }
        else{
            System.out.println("Elevador vazio!");
        }
    }

    public void sobe(){
        if(this.get_andarAtual() < this.get_totalAndar()){
            this.set_andarAtual(this.get_andarAtual() + 1);
            System.out.println("O Elevador subiu: " + this.get_andarAtual());
        }
        else{
            System.out.println("Impossível subir, último andar!");
        }
    }

    public void desce(){
        if(this.get_andarAtual() > 0){
            this.set_andarAtual(this.get_andarAtual() - 1);
            System.out.println("O Elevador desceu: " + this.get_andarAtual());
        }
        else{
            System.out.println("Impossível descer, térreo!");
        }
    }

    public int get_andarAtual() {
        return _andarAtual;
    }

    public void set_andarAtual(int _andarAtual) {
        this._andarAtual = _andarAtual;
    }

    public int get_totalAndar() {
        return _totalAndar;
    }

    public void set_totalAndar(int _totalAndar) {
        this._totalAndar = _totalAndar;
    }

    public int get_capacidade() {
        return _capacidade;
    }

    public void set_capacidade(int _capacidade) {
        this._capacidade = _capacidade;
    }

    public int get_qntPessoas() {
        return _qntPessoas;
    }

    public void set_qntPessoas(int _qntPessoas) {
        this._qntPessoas = _qntPessoas;
    }
}
