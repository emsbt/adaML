public class Carro implements Veiculo {

    @Override
    public void acelerar(int velocidade) {
        System.out.println("Acelerando o carro a " + velocidade + " km/h.");

    }

    @Override
    public void frear(int velocidade) {
        System.out.println("Freando o carro a " + velocidade + " km/h.");

    }
}
