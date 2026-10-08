//exer2
public class concessionaria {
    public static void main(String[] args) {
        veiculo v1 = new veiculo("honda","civic","xx1xx1",2010,450000);
        veiculo v2 = new veiculo("mazda","mx3","x2xx1x",2013,200000);
        veiculo v3 = new veiculo("fusca","volkswagens","xx2x1x2",1999,150000000);
        veiculo v4 = new veiculo("chevrolet","gol","x1xx2xx",1890,3000000);
        veiculo v5 = new veiculo("ford","maverick","x22xx2",2026,5000000);


        classeVeiculo c1 = new classeVeiculo();

        c1.adcionarVeiculo(v1);
        c1.adcionarVeiculo(v2);

        System.out.println(c1.obterVeiculMaisbarato());

        classeVeiculo c2 = new classeVeiculo();

        c2.adcionarVeiculo(v3);
        c2.adcionarVeiculo(v4);
        c2.adcionarVeiculo(v5);

        System.out.println(c2.obterVeiculMaisbarato());
    }
}
