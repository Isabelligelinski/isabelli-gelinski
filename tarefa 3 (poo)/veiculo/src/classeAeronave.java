/*Calcule:
a) Qual aeronave leva o maior número de passageiros?
b) Qual das aeronaves pode ficar mais tempo no ar?
c) Considerando que os aviões estão em velocidade máxima, qual deles consegue voar mais long*/
public class classeAeronave {
   public static void main(String[] args) {

      aeronave modelo1 = new aeronave("Airbus_A320neo", 194, 1000, 26730, 41);
      aeronave modelo2 = new aeronave("Boeing_737_800", 189, 988, 26020, 47);
      aeronave modelo3 = new aeronave("Embraer_E195_E2", 146, 1000, 17050, 31);
      aeronave modelo4 = new aeronave("Airbus_A350_900", 440, 1090, 166488, 88);

      aeronave[] aeronaves = {modelo1, modelo2, modelo3, modelo4};

      double maiorPassageiros = 0;
      aeronave aeronaveMaiorPassageiros = null;

      for (int i = 0; i < aeronaves.length; i++) {
         if (aeronaves[i].passageiros > maiorPassageiros) {
            maiorPassageiros = aeronaves[i].passageiros;
            aeronaveMaiorPassageiros = aeronaves[i];
         }
      }
      System.out.println(aeronaveMaiorPassageiros);

      double maiorDistancia = 0;
      aeronave aeronaveMaiorDistancia = null;

      for (int i = 0; i < aeronaves.length; i++) {
         if (aeronaves[i].calcularDistancia() > maiorDistancia) {
            maiorDistancia = aeronaves[i].calcularDistancia();
            aeronaveMaiorDistancia = aeronaves[i];
         }
      }
      System.out.println(aeronaveMaiorDistancia);
   }
}

