package exercicios.exercicio05;

public class InvestimentoRendaFixa extends InvestimentoAbstrato{
    public double taxaDeJurosAnual;

    public InvestimentoRendaFixa(String nome, double valorInvestido, double taxaDeJurosAnual) {
        super(nome, valorInvestido);
        this.taxaDeJurosAnual = taxaDeJurosAnual;
    }

    @Override
    public double calcularRetorno() {
        return this.valorInvestido * (1 + taxaDeJurosAnual);
    }

    @Override
    public boolean precisaRevisao() {
        // Se a taxa de juros for muito baixa, considera-se revisão
        return this.taxaDeJurosAnual < 0.03;
    }
}
