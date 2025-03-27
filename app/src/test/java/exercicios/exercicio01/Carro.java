package exercicios.exercicio01;

import android.util.Log;

public class Carro extends Veiculo{
    public Carro() {

    }

    public void ligar() {
        try {
            if (getMarca() == null || getModelo() == null) {
                throw new IllegalStateException("A marca e o modelo devem estar definidos antes de ligar.");
            }
            Log.i("Carro", "Ligando " + getMarca() + " " + getModelo());
        } catch (Exception e) {
            Log.e("Carro", "Erro ao ligar o carro: " + e.getMessage());
        }
    }

    public void acelerar() {
        try {
            Log.i("Carro", "Acelerando " + getMarca() + " " + getModelo());
        } catch (Exception e) {
            Log.e("Carro", "Erro ao acelerar: " + e.getMessage());
        }
    }

    public void frear() {
        try {
            Log.i("Carro", "Freando " + getMarca() + " " + getModelo());
        } catch (Exception e) {
            Log.e("Carro", "Erro ao frear: " + e.getMessage());
        }
    }

    public void desligar() {
        try {
            Log.i("Carro", "Desligando " + getMarca() + " " + getModelo());
        } catch (Exception e) {
            Log.e("Carro", "Erro ao desligar: " + e.getMessage());
        }
    }
}
