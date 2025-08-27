//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Veiculo carro = new Carro();
        carro.acelerar(60);
        carro.frear(50);
        carro.ligarmotor();

        System.out.println("---------------------");

        Veiculo moto = new Moto();
        moto.acelerar(40);
        moto.frear(30);
        moto.ligarmotor();

        System.out.println("---------------------");

        Veiculo bicicleta = new Bicicleta();
        bicicleta.acelerar(20);
        bicicleta.frear(10);
        bicicleta.ligarmotor();
    }
}