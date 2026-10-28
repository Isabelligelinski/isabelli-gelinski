import java.util.ArrayList;
import java.util.List;

/*(lista 2 - exer 4)
Na classe materiais de construção crie métodos para obter:
• O produto mais caro de uma determinada marca
• Todos os produtos de uma determinada marca cujo preço esteja entre um intervalo de X
e Y
*/
public class materiaisC {
    private List<lojaM> lojaM;
    public materiaisC(){
        lojaM = new ArrayList<>();
    }
    public void adicionarMateriais (lojaM c){
        lojaM.add(c);
    }

    public lojaM PmaisCaro(String marca){
        lojaM maisCaro = null;
        Double precoMaior = Double.MIN_VALUE;
        for (lojaM m : lojaM){
            if (marca.equals(m.getMarca()) && m.getPreco()>precoMaior) {
                maisCaro = m;
            }
        }
        return maisCaro;
    }
    public List<lojaM> buscarNoEstoque(double precoInicial,double precoFinal,String marca){
        List<lojaM> buscarNoEstoque = new ArrayList<>();

        for (lojaM m : lojaM){
            if (marca.equals(m.getMarca()) && m.getPreco() >= precoInicial && m.getPreco() <= precoFinal){
                buscarNoEstoque.add(m);
            }
        }
        return buscarNoEstoque;
    }

}
