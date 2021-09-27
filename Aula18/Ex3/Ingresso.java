package Aula18.Ex3;

public class Ingresso {
    private static float valor;
    private static String comprador;

    public float getIngressoValor() {
        return valor;
    }

    public void setIngressoValor(float valor) {
        this.valor = valor;
    }

    public String getComprador() {
        return comprador;
    }

    public void setComprador(String comprador) {
        this.comprador = comprador;
    }

    @Override
    public String toString() {
        return "Comprador=" + getComprador();
    }
}
