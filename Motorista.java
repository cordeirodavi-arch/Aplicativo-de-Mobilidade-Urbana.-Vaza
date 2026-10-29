package Projeto_Java;

public class Motorista extends Usuario {
    private String cnh;
    private double pontuacao;
    private Veiculo veiculo;

    public Motorista(int id, String nome, String email, String senha, String telefone, String cnh) {
        super(id, nome, email, senha, telefone);
        this.cnh = cnh;
        this.pontuacao = 5.0;
    }

    public void cadastrarVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public boolean aceitarCorrida(Corrida corrida) {
        if (veiculo == null || !veiculo.validarCapacidade(1)) {
            return false;
        }
        return corrida.aceitar(this);
    }

    public void cancelarCorrida(Corrida corrida) {
        corrida.cancelar();
    }

    public String getCnh() {
        return cnh;
    }

    public double getPontuacao() {
        return pontuacao;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }
}