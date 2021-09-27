package Aula18.Ex3;

public class Normal extends Ingresso{
    Ingresso ingresso;


    @Override
    public String toString() {
        return "\nIngresso Normal{"
                + super.toString()
                + ", Valor=" + getIngressoValor()
                + '}';
    }
}
