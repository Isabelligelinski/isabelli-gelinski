/* (lista 2 - exer 4)
Na classe produto crie métodos para:
Adicionar mais unidades do produto ao estoque
Vender um produto, podendo ser vendido até a mesma quantidade que tem no estoque
*/

public class produto {
    public static void main(String[] args) {
       lojaM P1 = new lojaM("votorantim","cimento",50,200);
       lojaM P2 = new lojaM("gerdau","aço",40,200);
       lojaM P3 = new lojaM("quartzolit","argamassa",45,200);
       lojaM P4 = new lojaM("coral","tinta",30,200);

       materiaisC produto = new materiaisC();
       produto.adicionarMateriais(P1);
       produto.adicionarMateriais(P2);
       produto.adicionarMateriais(P3);
       produto.adicionarMateriais(P4);

       System.out.println(produto.PmaisCaro("coral"));


    }
}
