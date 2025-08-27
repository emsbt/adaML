public interface Veiculo {
    void acelerar(int velocidade);
    void frear(int velocidade);

    default void ligarmotor() {
        System.out.println("Ligando o motor do veículo.");
    }
}