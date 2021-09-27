package Aula9.Ex4;

public class Pedido {
    Produto item;
    int quantidade;

    public Pedido(Produto item, int quantidade) {
        this.item = item;
        this.quantidade = quantidade;

        if(item.efetuarVenda(quantidade) == 0){
            throw new IllegalArgumentException();
        }
    }

    public float calcularValor(){
        return this.quantidade * item.preco;
    }
}
