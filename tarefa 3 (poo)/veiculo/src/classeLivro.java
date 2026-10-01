public class classeLivro {
    public static void main(String[] args) {
        livros v1 = new livros("coraline",false);
        livros v2 = new livros("rebel moon",true);

        v1.emprestar();
        System.out.println(v1);
        v2.devolver();
        System.out.println(v2);

    }
}
