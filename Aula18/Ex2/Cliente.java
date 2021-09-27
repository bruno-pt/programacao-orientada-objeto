package Aula18.Ex2;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Cliente {
    private String proprietario;
    private String comprador;

    public Cliente(String proprietario, String comprador) {
        this.proprietario = proprietario;
        this.comprador = comprador;
    }

    ImovelNaPlanta imovelNaPlanta = new ImovelNaPlanta(
            1,
            "Rua Vitoria",
            150000,
            10,
            "18/10/2021"
            );

    ImovelProntoNovo imovelProntoNovo = new ImovelProntoNovo(
            2,
            "Rua Tangamandapio",
            150000,
            250000
            );

    @Override
    public String toString() {
        return "Cliente{" +
                "proprietario='" + proprietario + '\'' +
                ", comprador='" + comprador + '\'' +
                imovelNaPlanta +
                imovelProntoNovo +
                '}';
    }
}