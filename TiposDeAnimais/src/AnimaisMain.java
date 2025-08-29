import java.util.ArrayList;
import java.util.List;
public class AnimaisMain {
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