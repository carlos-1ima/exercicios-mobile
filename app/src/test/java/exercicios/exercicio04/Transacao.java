package exercicios.exercicio04;

public interface Transacao {
    public double getValor();
    public String getDescricao();
    public String getData();
    boolean precisaRevisao();

}
