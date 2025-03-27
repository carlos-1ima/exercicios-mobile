package exercicios.exercicio02;

import android.util.Log;

public class Telefone extends Dispositivo {
    public Telefone() {

    }

    public void acessarInternet() {
        Log.i("Telefone", "Acessando internet pelo " + marca + " " + modelo);
    }

    public void abrirPrograma() {
        Log.i("Telefone", "Abrindo programa no " + marca + " " + modelo);
    }

    public void enviarMensagem() {
        Log.i("Telefone", "Enviando mensagem no " + marca + " " + modelo);
    }
}
