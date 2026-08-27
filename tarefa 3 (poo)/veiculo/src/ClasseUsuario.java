public class ClasseUsuario {
    public static void main(String[] args) {

        usuario v1 = new usuario();
        v1.nome = "isa";
        v1.sexo = "F";
        v1.dataDeNacimento = "15/09/2007";
        v1.estadoCivil = "solteira";

        usuario v2 = new usuario();
        v2.nome = "dani";
        v2.sexo = "F";
        v2.dataDeNacimento = "25/01/1989";
        v2.estadoCivil = "casada";

        usuario v3 = new usuario();
        v3.nome = "rafael";
        v3.sexo = "M";
        v3.dataDeNacimento = "29/07/2005";
        v3.estadoCivil = "solteiro";

        usuario v4 = new usuario();
        v4.nome = "hercoles";
        v4.sexo = "M";
        v4.dataDeNacimento = "10/02/2008";
        v4.estadoCivil = "solteiro";

        usuario v5 = new usuario();
        v5.nome = "caio";
        v5.sexo = "M";
        v5.dataDeNacimento = "21/11/2007";

        System.out.println(v1.nome+" "+v1.dataDeNacimento);
        System.out.println(v2.nome+" "+v2.dataDeNacimento);
        System.out.println(v3.nome+" "+v3.dataDeNacimento);
        System.out.println(v4.nome+" "+v4.dataDeNacimento);
        System.out.println(v5.nome+" "+v5.dataDeNacimento);



    }
}
