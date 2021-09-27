package Aula18.Ex1;

public class Cachorro extends Animal {
    private String cor;
    private String som;
    protected String printConstructorCachorro;

    public Cachorro(String nome, float peso, String habitos, String cor, String som) {
        super(nome, peso, habitos);
        this.cor = cor;
        this.som = som;

        this.printConstructorCachorro = printConstructorAnimal
                + " | Cor: " + cor
                + " | Som: " + som;

        System.out.println(printConstructorCachorro);
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getSom() {
        return som;
    }

    public void setSom(String som) {
        this.som = som;
    }

    public void latir(){
    }
}
