package exercicios.exercicio04;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorFinancas {
    public List<Transacao> transacoes;

    public GerenciadorFinancas() {
        this.transacoes = new ArrayList<>();
    }

    public void adicionarTransacao(Transacao transacao) {
        transacoes.add(transacao);
    }

    public double calcularSaldo() {
        double saldo = 0;
        for (Transacao t : transacoes) {
            saldo += t.getValor();
        }
        return saldo;
    }

    public List<Transacao> listarTransacoesParaRevisao() {
        List<Transacao> revisoes = new ArrayList<>();
        for (Transacao t : transacoes) {
            if (t.precisaRevisao()) {
                revisoes.add(t);
            }
        }
        return revisoes;
    }

    public void exibirTransacoes() {
        for (Transacao t : transacoes) {
            System.out.println(t.getData() + " - " + t.getDescricao() + ": R$ " + t.getValor());
        }
    }
}
