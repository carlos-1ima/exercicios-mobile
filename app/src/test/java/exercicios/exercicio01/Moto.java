package exercicios.exercicio01;

import android.util.Log;

public class Moto extends Veiculo{
    public Moto() {

    }

    public void ligar() {
        Log.i("Moto", "Ligando " + marca + " " + modelo);
    }

    public void acelerar() {
        Log.i("Moto", "Acelerando " + marca + " " + modelo);
    }

    public void frear() {
        Log.i("Moto", "Freando " + marca + " " + modelo);
    }

    public void desligar() {
        Log.i("Moto", "Desligando " + marca + " " + modelo);
    }
}
