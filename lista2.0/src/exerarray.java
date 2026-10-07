import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class exerarray {
    public static void main(String[] args) {

        List<Integer> idades = new ArrayList<Integer>();
        idades.add(22);
        idades.add(13);
        idades.add(25);
        idades.add(18);
        idades.add(29);


        System.out.println(idades);//mostra todas as idades
        System.out.println(idades.contains(29));//(true)se o numero que estiverem nas aspas estarem no add,senao (false).
        System.out.println(idades.indexOf(18));//mostra a localizacao(vetor)
        System.out.println(idades.size());//quantidade
        System.out.println(idades.getLast());//ultimo
        System.out.println(idades.getFirst());//primeiro
        Collections.sort(idades);//classe,um monte de metodos
    }
}