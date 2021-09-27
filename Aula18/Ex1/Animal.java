package Aula18.Ex1;

public class Animal {
    private String nome;
    private float peso;
    private String habitos;
    protected String printConstructorAnimal;

    public Animal(String nome, float peso, String habitos) {
        this.nome = nome;
        this.peso = peso;
        this.habitos = habitos;

        this.printConstructorAnimal =
                " Nome: " + nome
                + " | Peso: " + peso
                + " | Habitos: " + habitos;

        System.out.println("Constructor Animal:" + printConstructorAnimal);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public String getHabitos() {
        return habitos;
    }

    public void setHabitos(String habitos) {
        this.habitos = habitos;
    }
}
