package exercicios.exercicio05;

public class InvestimentoRendaVariavel extends InvestimentoAbstrato{
    public double retornoVariavel;

    public InvestimentoRendaVariavel(String nome, double valorInvestido, double retornoVariavel) {
        super(nome, valorInvestido);
        this.retornoVariavel = retornoVariavel;
    }

    @Override
    public double calcularRetorno() {
        return this.valorInvestido * (1 + retornoVariavel);
    }

    @Override
    public boolean precisaRevisao() {
        return this.retornoVariavel < 0;
    }
}
