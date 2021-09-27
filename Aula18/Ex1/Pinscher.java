package Aula18.Ex1;

public final class Pinscher extends Cachorro{
    private int irritabilidade;
    private String printConstructorPinscher;

    public Pinscher(String nome, float peso, String habitos, String cor, String som, int irritabilidade) {
        super(nome, peso, habitos, cor, som);
        this.irritabilidade = irritabilidade;

        this.printConstructorPinscher = printConstructorCachorro
                + " | Irritabilidade: " + irritabilidade;

        System.out.println("Constructor Pinscher:" + printConstructorPinscher);

    }

    public int nivelIrritabilidade(){
        return this.irritabilidade;
    }
}
