package exercicios.exercicio02;

public abstract class Dispositivo {
    public String marca;
    public String modelo;

    public String armazenamento;

    public Dispositivo() {

    }

    public abstract void acessarInternet();

    public abstract void abrirPrograma();

    public abstract void enviarMensagem();

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

    public String getArmazenamento() {
        return armazenamento;
    }

    public void setArmazenamento(String armazenamento) {
        this.armazenamento = armazenamento;
    }
}
