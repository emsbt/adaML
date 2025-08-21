import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Animal gato = new Gato();
        Animal cachorro = new Cachorro();

        List<Animal> animais = new ArrayList<>();
        animais.add(gato);
        animais.add(cachorro);

        for (Animal animal : animais) {
            animal.emitirSom();
        }

    }
}