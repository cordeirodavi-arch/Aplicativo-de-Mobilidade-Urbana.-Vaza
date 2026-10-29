package Projeto_Java;

public class Passageiro extends Usuario {
    private double pontuacao;

    public Passageiro(int id, String nome, String email, String senha, String telefone) {
        super(id, nome, email, senha, telefone);
        this.pontuacao = 5.0;
    }

    public Corrida solicitarCorrida(int idCorrida, String origem, String destino, double distanciaKm) {
        return new Corrida(idCorrida, origem, destino, distanciaKm, this);
    }

    public double getPontuacao() {
        return pontuacao;
    }
}