package exercicios.exercicio01;

public abstract class Veiculo {
    public String marca;
    public String modelo;
    public String cor;
    public int ano;

    public Veiculo() {

    }

    public abstract void ligar();

    public abstract void acelerar();

    public abstract void frear();

    public abstract void desligar();

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        if (marca == null || marca.trim().isEmpty()) {
            throw new IllegalArgumentException("A marca não pode ser vazia ou nula.");
        }
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        if (modelo == null || modelo.trim().isEmpty()) {
            throw new IllegalArgumentException("O modelo não pode ser vazio ou nulo.");
        }
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        if (cor == null || cor.trim().isEmpty()) {
            throw new IllegalArgumentException("A cor não pode ser vazia ou nula.");
        }
        this.cor = cor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        if (ano < 1886) { // Primeiro carro foi inventado em 1886
            throw new IllegalArgumentException("Ano inválido! O ano deve ser maior ou igual a 1886.");
        }
        this.ano = ano;
    }
}
