public class livros {
    private String titulo;
    private boolean emprestado;

    public livros(String titulo, boolean emprestado) {
        setTitulo(titulo);
        this.emprestado = emprestado;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        if(titulo == null || titulo.isBlank()){
            throw new IllegalArgumentException("titulo invalido");
        }
        this.titulo = titulo;
    }

    public boolean isEmprestado() {
        return emprestado;
    }

    public void setEmprestado(boolean emprestado) {
        this.emprestado = emprestado;
    }
    public void emprestar(){
        if (emprestado){
            throw new IllegalArgumentException("Livro ja emprestado");
        }
        emprestado = true;
    }

    public void devolver(){
        if (emprestado){
            throw new IllegalArgumentException("Livro ja esta devolvido");
        }
        emprestado=false;
    }


    @Override
    public String toString() {
        return "O livro " + "titulo:" + titulo + '\'' + ", emprestado:" + emprestado + '}';
    }
}
