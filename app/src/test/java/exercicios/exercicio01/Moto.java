package exercicios.exercicio01;

import android.util.Log;

public class Moto extends Veiculo{
    public Moto() {

    }

    public void ligar() {
        try {
            if (getMarca() == null || getModelo() == null) {
                throw new IllegalStateException("A marca e o modelo devem estar definidos antes de ligar.");
            }
            Log.i("Moto", "Ligando " + getMarca() + " " + getModelo());
        } catch (Exception e) {
            Log.e("Moto", "Erro ao ligar a moto: " + e.getMessage());
        }
    }

    public void acelerar() {
        try {
            Log.i("Moto", "Acelerando " + getMarca() + " " + getModelo());
        } catch (Exception e) {
            Log.e("Moto", "Erro ao acelerar: " + e.getMessage());
        }
    }

    public void frear() {
        try {
            Log.i("Moto", "Freando " + getMarca() + " " + getModelo());
        } catch (Exception e) {
            Log.e("Moto", "Erro ao frear: " + e.getMessage());
        }
    }

    public void desligar() {
        try {
            Log.i("Moto", "Desligando " + getMarca() + " " + getModelo());
        } catch (Exception e) {
            Log.e("Moto", "Erro ao desligar: " + e.getMessage());
        }
    }
}
