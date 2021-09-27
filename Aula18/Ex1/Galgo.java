package Aula18.Ex1;

public final class Galgo extends Cachorro{
    private float velocidade;
    private String printConstructorGalgo;

    public Galgo(String nome, float peso, String habitos, String cor, String som, float velocidade) {
        super(nome, peso, habitos, cor, som);
        this.velocidade = velocidade;

        this.printConstructorGalgo = printConstructorCachorro
                + " | Velocidade: " + velocidade;

        System.out.println(printConstructorGalgo);
    }

    public void correr(){
    }
}
