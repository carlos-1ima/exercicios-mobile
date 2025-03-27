package exercicios.exercicio05;

public abstract class InvestimentoAbstrato implements Investimento {
    public String nome;
    public double valorInvestido;

    public InvestimentoAbstrato(String nome, double valorInvestido) {
        this.nome = nome;
        this.valorInvestido = valorInvestido;
    }

    public abstract double calcularRetorno();

    public abstract boolean precisaRevisao();
}
