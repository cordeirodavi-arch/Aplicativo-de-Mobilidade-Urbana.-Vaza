package Projeto_Java;

public class Veiculo {
    private String placa;
    private String modelo;
    private String marca;
    private int capacidadePassageiros;

    public Veiculo(String placa, String modelo, String marca, int capacidadePassageiros) {
        this.placa = placa;
        this.modelo = modelo;
        this.marca = marca;
        this.capacidadePassageiros = capacidadePassageiros;
    }

    public boolean validarCapacidade(int numPassageiros) {
        return numPassageiros <= capacidadePassageiros;
    }

    public String getPlaca() {
        return placa;
    }

    public String getModelo() {
        return modelo;
    }

    public String getMarca() {
        return marca;
    }

    public int getCapacidadePassageiros() {
        return capacidadePassageiros;
    }
}