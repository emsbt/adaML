import java.util.List;

public class GeometricsMain {
    public static void main(String[] args) {

        Quadrado quadrado = new Quadrado(4);
        Circulo circulo = new Circulo(3);

        Desenho desenho = new Desenho();
        desenho.formas = List.of(quadrado, circulo);
        System.out.printf("Total Quadrado + Circulo: %.2f \n",desenho.calcularAreaTotal());
        System.out.printf("Área do quadrado: %.2f \n" , quadrado.calcularArea());
        System.out.printf("Área do círculo: %.2f " , circulo.calcularArea());
    }
}