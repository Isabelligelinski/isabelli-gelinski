import java.util.ArrayList;
import java.util.List;

//(lista2-exer1)
public class retanguloLista {

    private List<retangulo> retangulos;//lista de retangulos

    public retanguloLista(){
        retangulos = new ArrayList<retangulo>();}


    public void adcionarnumeros(retangulo r){//adicionar os objetos
        retangulos.add(r);
    }

    public retangulo maiorPerimetro() {
        double maiorPerimetro = Double.MIN_VALUE;
        retangulo retanguloMaiorPerimetro = null;

        for (retangulo r : retangulos) {
            if (r.calculoArea() > maiorPerimetro) {
                maiorPerimetro = r.calculoPerimetro();
                retanguloMaiorPerimetro = r;
            }
        }
        return retanguloMaiorPerimetro;
    }
    public retangulo maiorArea() {
           double maiorArea =  Double.MIN_VALUE;
            retangulo retanguloMaiorArea = null;

           for (retangulo r : retangulos) {
          if (r.calculoArea()>maiorArea) {
              maiorArea = r.calculoArea();
             retanguloMaiorArea = r;
            }
        }
           return retanguloMaiorArea;
    }

}
