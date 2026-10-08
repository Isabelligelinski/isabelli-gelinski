//exer2
import java.util.ArrayList;
import java.util.List;

public class classeVeiculo {

   private List<veiculo> veiculos;

   public classeVeiculo(){
      veiculos = new ArrayList<veiculo>();
   }

   public void adcionarVeiculo(veiculo v) {
      veiculos.add(v);
   }

   public veiculo obterVeiculMaisbarato(){

      double menorPreco = Double.MAX_VALUE;
      veiculo veiculosMaisBarato = null;

      for (veiculo v : veiculos) {
         if (v.getPreco() < menorPreco) {
            menorPreco = v.getPreco();
            veiculosMaisBarato = v;
         }
      }
      return veiculosMaisBarato;


   }

}
