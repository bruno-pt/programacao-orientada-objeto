package Aula18.Ex3;

public class VIP extends Ingresso{
    private float VIPValue;

    public void setVIPValor(){
        float ingressoValor = getIngressoValor();
        this.VIPValue = ingressoValor + (15 * (ingressoValor/100));
    }

    public float getVIPValor(){
        return this.VIPValue;
    }

    @Override
    public String toString() {
        return "\nIngresso VIP{"
                + super.toString()
                + ", Valor=" + (getIngressoValor() + (60 * (getIngressoValor()/100)))
                + '}';
    }
}
