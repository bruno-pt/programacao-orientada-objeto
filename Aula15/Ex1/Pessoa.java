package Aula15.Ex1;

/*
1. Crie uma classe pessoa que deve armazenar nome, ano de nascimento, estado onde a pessoa nasceu.
        Você deve encapsular todos os atributos da classe criando os métodos getters e setters e ainda criar:
            um método construtor que preencha os atributos (os dados devem vir de entradas do usuário na classe onde ocorre o instanciamento);
            um método para calcular a idade; um método para especificar em qual região do país a pessoa nasceu; um método para mostrar todos os dados na tela
*/

import java.util.Calendar;

public class Pessoa {
    private String _nome;
    private int _anoNascimento;
    private String _estado;

    public Pessoa(String _nome, int _anoNascimento, String _estado) {
        this._nome = _nome;
        this._anoNascimento = _anoNascimento;
        this._estado = _estado;
    }

    public int getIdade(int _anoNascimento){
        int actualYear = Calendar.getInstance().get(Calendar.YEAR);

        return (actualYear - _anoNascimento);
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "Nome='" + _nome + '\'' +
                ", Idade='" + getIdade(_anoNascimento) + '\'' +
                ", Ano Nascimento=" + _anoNascimento +
                ", Estado='" + _estado + '\'' +
                ", Região='" + getRegiao(_estado) + '\'' +
                '}';
    }

    public String getRegiao(String _estado){

        //Norte
        if  (  _estado.equals("AC")
                || _estado.equals("RO")
                || _estado.equals("AM")
                || _estado.equals("RR")
                || _estado.equals("PA")
                || _estado.equals("AP")
                || _estado.equals("TO"))
        {
            return "Norte";
        }

        //Nordeste
        else if (  _estado.equals("MA")
                || _estado.equals("PI")
                || _estado.equals("BA")
                || _estado.equals("CE")
                || _estado.equals("RN")
                || _estado.equals("PB")
                || _estado.equals("PE")
                || _estado.equals("AL")
                || _estado.equals("SE"))
        {
            return "Nordeste";
        }

        //Centro-Oeste
        else if (  _estado.equals("MT")
                || _estado.equals("GO")
                || _estado.equals("MS"))
        {
            return "Centro-Oeste";
        }

        //Sudeste
        else if (  _estado.equals("SP")
                || _estado.equals("MG")
                || _estado.equals("ES")
                || _estado.equals("RJ"))
        {
            return "Sudeste";
        }

        //Sul
        else if (  _estado.equals("PR")
                || _estado.equals("SC")
                || _estado.equals("RS"))
        {
            return "Sul";
        }
        else
            return "Região Inexistente";
    }

    public String get_nome() {
        return _nome;
    }

    public void set_nome(String _nome) {
        this._nome = _nome;
    }

    public int get_anoNascimento() {
        return _anoNascimento;
    }

    public void set_anoNascimento(int _anoNascimento) {
        this._anoNascimento = _anoNascimento;
    }

    public String get_estado() {
        return _estado;
    }

    public void set_estado(String _estado) {
        this._estado = _estado;
    }

}
