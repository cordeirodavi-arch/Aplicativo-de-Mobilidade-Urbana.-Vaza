package Projeto_Java;

public class Main {
    public static void main(String[] args) {
        Passageiro passageiro = new Passageiro(1, "Emanuelle", "emanuelle@vaza.com", "1234", "83999990001");
        Motorista motorista = new Motorista(2, "Davi", "davi@vaza.com", "abcd", "83999990002", "12345678900");
        motorista.cadastrarVeiculo(new Veiculo("ABC1D23", "Onix", "Chevrolet", 4));

        System.out.println("Login passageiro: " + passageiro.fazerLogin("emanuelle@vaza.com", "1234"));

        Corrida corrida = passageiro.solicitarCorrida(1, "Centro", "Universidade", 8.0);
        System.out.println("Corrida solicitada. Status: " + corrida.getStatus());

        boolean aceita = motorista.aceitarCorrida(corrida);
        System.out.println("Motorista aceitou: " + aceita + " | Status: " + corrida.getStatus());

        corrida.finalizarCorrida();
        System.out.println("Corrida finalizada. Status: " + corrida.getStatus());
        System.out.printf("Valor total: R$ %.2f%n", corrida.calcularValor());
    }
}