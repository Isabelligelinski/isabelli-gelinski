public class classeContribuinte {
    public static void main(String[] args) {

        contribuinte P1 = new contribuinte("Joao","12345678910","SC",5000);
        contribuinte P2 = new contribuinte("isa","12345678915","SC",6000);
        contribuinte P3 = new contribuinte("lucas","12345678914","SP",2600);
        contribuinte P4 = new contribuinte("carlos","12345678911","PR",1700);
        contribuinte P5 = new contribuinte("jorge","12345678912","RS",1000);

        contribuinte[] contribuintes = {P1,P2,P3,P4,P5};

        double maiorImposto = 0;
        contribuinte maiorAliquota = null;

        for (int i = 0;i< contribuintes.length;i++){
            if (contribuintes[i].calcularAliquota()>maiorImposto) {
                maiorImposto = contribuintes[i].calcularImposto();
                maiorAliquota = contribuintes[i];
            }
        }

        System.out.println(maiorImposto);
        double impostoTotal = 0;
        for (int i =0;i<contribuintes.length;i++){
            impostoTotal += contribuintes[i].calcularAliquota();
        }
        System.out.println("total:"+impostoTotal);
    }

    }

