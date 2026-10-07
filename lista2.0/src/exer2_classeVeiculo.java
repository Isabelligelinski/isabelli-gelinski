import java.util.ArrayList;
import java.util.List;

public class exer2_classeVeiculo {

   private List<exe2_veiculo> veiculos;

   public exer2_classeVeiculo(){
      veiculos = new ArrayList<exe2_veiculo>();
   }
   public void adcionarVeiculo(exe2_veiculo v) {
      veiculos.add(v);

   }

   public exe2_veiculo obterVeiculMaisbarato(){

      double menorPreco = Double.MAX_VALUE;
      exe2_veiculo veiculosMaisBarato = null;

      for (exe2_veiculo v : veiculos) {
         if (v.getPreco() < menorPreco) {
            menorPreco = v.getPreco();
            veiculosMaisBarato = v;
         }
      }
      return veiculosMaisBarato;


   }

}
