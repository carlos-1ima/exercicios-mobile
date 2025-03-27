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
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
}
