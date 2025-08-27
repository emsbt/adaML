public class Moto implements Veiculo {

    @Override
    public void acelerar(int velocidade) {
        System.out.println("Acelerando a moto a " + velocidade + " km/h.");
    }

    @Override
    public void frear(int velocidade) {
        System.out.println("Freando a moto a " + velocidade + " km/h.");
    }
}
