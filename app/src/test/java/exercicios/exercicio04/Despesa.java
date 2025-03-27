package exercicios.exercicio04;

public class Despesa implements Transacao {
    public double valor;
    public String descricao;
    public String data;
    public boolean precisaRevisao;


    public Despesa(double valor, String descricao, String data, boolean precisaRevisao) {
        this.valor = valor;
        this.descricao = descricao;
        this.data = data;
        this.precisaRevisao = precisaRevisao;
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

    public boolean precisaRevisao() {
        return precisaRevisao;
    }
}
