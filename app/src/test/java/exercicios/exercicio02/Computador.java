package exercicios.exercicio02;

import android.util.Log;

public class Computador extends Dispositivo {
    public Computador() {

    }

    public void acessarInternet() {
        Log.i("Computador", "Acessando internet pelo " + marca + " " + modelo);
    }

    public void abrirPrograma() {
        Log.i("Computador", "Abrindo programa no " + marca + " " + modelo);
    }

    public void enviarMensagem() {
        Log.i("Computador", "Enviando mensagem no " + marca + " " + modelo);
    }
}
