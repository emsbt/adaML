public class Bicicleta implements Veiculo{
    @Override
    public void acelerar(int velocidade) {
        System.out.println("Acelerando a bicicleta a " + velocidade + " km/h.");
    }

    @Override
    public void frear(int velocidade) {
        System.out.println("Freando a bicicleta a " + velocidade + " km/h.");
    }

    @Override
    public void ligarmotor() {
        System.out.println("Bicicleta não possui motor, não é possível ligar.");
    }
}
