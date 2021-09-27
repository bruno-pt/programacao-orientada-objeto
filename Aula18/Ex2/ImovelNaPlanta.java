package Aula18.Ex2;

import java.util.Date;

public class ImovelNaPlanta extends Imovel{
    private float desconto;
    private String data;

    public ImovelNaPlanta(int codigo, String endereco, float preco, float desconto, String data) {
        super(codigo, endereco, preco);
        this.desconto = desconto;
        this.data = data;
    }

    public float getDesconto() {
        return desconto;
    }

    public void setDesconto(float desconto) {
        this.desconto = desconto;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nImovelNaPlanta{" +
                "desconto=" + getDesconto() +
                ", data=" + getData() +
                "}\n";
    }
}
