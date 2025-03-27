package exercicios.exercicio03;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
    public List<Contato> contatos;

    public Agenda() {
        this.contatos = new ArrayList<>();
    }

    public void adicionarContato(Contato contato) {
        contatos.add(contato);
    }

    public void removerContato(Contato contato) {
        contatos.remove(contato);
    }

    public List<Contato> listarContatos() {
        return contatos;
    }
}
