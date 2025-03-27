package exercicios.exercicio01;

import android.util.Log;

public class Carro extends Veiculo{
    public Carro() {

    }

    public void ligar() {
        Log.i("Carro", "Ligando " + marca + " " + modelo);
    }

    public void acelerar() {
        Log.i("Carro", "Acelerando " + marca + " " + modelo);
    }

    public void frear() {
        Log.i("Carro", "Freando " + marca + " " + modelo);
    }

    public void desligar() {
        Log.i("Carro", "Desligando " + marca + " " + modelo);
    }
}
