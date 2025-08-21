import java.util.List;

public class Desenho {
    List<Forma> formas;

   public double calcularAreaTotal(){
         double soma = 0;
         for (Forma forma : formas) {
              soma += forma.calcularArea();
         }
         return soma;
   }

}
