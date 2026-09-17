/*Calcule:
a) Qual aeronave leva o maior número de passageiros?
b) Qual das aeronaves pode ficar mais tempo no ar?
c) Considerando que os aviões estão em velocidade máxima, qual deles consegue voar mais long*/
public class classeAeronave2 {
    public static void main(String[] args) {

        aeronave2 modelo1 = new aeronave2("Airbus_A320neo", 194, 1000, 26730, 41);
        aeronave2 modelo2 = new aeronave2("Boeing_737_800", 189, 988, 26020, 47);
        aeronave2 modelo3 = new aeronave2("Embraer_E195_E2", 146, 1000, 17050, 31);
        aeronave2 modelo4 = new aeronave2("Airbus_A350_900", 440, 1090, 166488, 88);

        modelo1.setPassageiros(-50);
        modelo1.setModelo("        ");
        modelo1.setVelocidadeMaxima(0);
        System.out.println("----------------------");

        aeronave2[] aeronaves = {modelo1, modelo2, modelo3, modelo4};

        double maiorPassageiros = 0;
        aeronave2 aeronaveMaiorPassageiros = null;

        for (int i = 0; i < aeronaves.length; i++) {
            if (aeronaves[i].getPassageiros() > maiorPassageiros) {
                maiorPassageiros = aeronaves[i].getPassageiros();
                aeronaveMaiorPassageiros = aeronaves[i];
            }
        }
        System.out.println(aeronaveMaiorPassageiros);

        double maiorDistancia = 0;
        aeronave2 aeronaveMaiorDistancia = null;

        for (int i = 0; i < aeronaves.length; i++) {
            if (aeronaves[i].calcularDistancia() > maiorDistancia) {
                maiorDistancia = aeronaves[i].calcularDistancia();
                aeronaveMaiorDistancia = aeronaves[i];
            }
        }
        System.out.println(aeronaveMaiorDistancia);
    }
}


