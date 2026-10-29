package Projeto_Java;

public class Corrida implements Tarifavel {
    private static final double VALOR_POR_KM = 2.5;

    private final int id;
    private String origem;
    private String destino;
    private double distanciaKm;
    private String status;
    private Passageiro passageiro;
    private Motorista motorista;

    public Corrida(int id, String origem, String destino, double distanciaKm, Passageiro passageiro) {
        this.id = id;
        this.origem = origem;
        this.destino = destino;
        this.distanciaKm = distanciaKm;
        this.passageiro = passageiro;
        this.status = "SOLICITADA";
    }

    boolean aceitar(Motorista motorista) {
        if (!status.equals("SOLICITADA")) {
            return false;
        }
        this.motorista = motorista;
        this.status = "EM_ANDAMENTO";
        return true;
    }

    public void cancelar() {
        this.status = "CANCELADA";
    }

    public void finalizarCorrida() {
        if (status.equals("EM_ANDAMENTO")) {
            this.status = "FINALIZADA";
        }
    }

    @Override
    public double calcularValor() {
        return distanciaKm * VALOR_POR_KM;
    }

    public int getId() {
        return id;
    }

    public String getOrigem() {
        return origem;
    }

    public String getDestino() {
        return destino;
    }

    public String getStatus() {
        return status;
    }

    public Passageiro getPassageiro() {
        return passageiro;
    }

    public Motorista getMotorista() {
        return motorista;
    }
}