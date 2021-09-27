package Aula18.Ex2;

public class ImovelProntoNovo extends Imovel{
    private float precoAdicional;

    public ImovelProntoNovo(int codigo, String endereco, float preco, float precoAdicional) {
        super(codigo, endereco, preco);
        this.precoAdicional = precoAdicional;
    }

    public float somarPrecoAdicional(float preco){
        return precoAdicional + preco;
    }

    public float getPrecoAdicional() {
        return precoAdicional;
    }

    public void setPrecoAdicional(float precoAdicional) {
        this.precoAdicional = precoAdicional;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nImovelProntoNovo{" +
                "precoAdicional=" + somarPrecoAdicional(getPreco()) +
                "}\n";
    }
}
