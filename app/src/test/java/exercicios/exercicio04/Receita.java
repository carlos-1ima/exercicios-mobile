package exercicios.exercicio04;

public class Receita {
    public double valor;
    public String descricao;
    public String data;

    public Receita(double valor, String descricao, String data) {
        this.valor = valor;
        this.descricao = descricao;
        this.data = data;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
