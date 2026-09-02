public class ex3 {
    public static void main(String[] args) {

        produto produto1 = new produto();
        produto1.nome = "lapis";
        produto1.descricao = "lapis preto com borracha na ponta";
        produto1.precoUnitario = 1.50;
        produto1.desconto = 0;

        produto produto2 = new produto();
        produto2.nome = "cadeira";
        produto2.descricao = "macia,peluda e confortavel.com tons beges na poltrona e dourado no suporte";
        produto2.precoUnitario = 50;
        produto2.desconto = 0;

        produto produto3 = new produto();
        produto3.nome = "vestido";
        produto3.descricao = "longo,tom vilho,tomara que caia";
        produto3.precoUnitario = 100;
        produto3.desconto = 2;

        System.out.println("produto:"+produto1.nome+"\ndescricao:"+produto1.descricao+"\npreco unitario"+produto1.precoUnitario+"\ndesconto:"+produto1.desconto);
        System.out.println("produto:"+produto2.nome+"\ndescricao:"+produto1.descricao+"\npreco unitario"+produto2.precoUnitario+"\ndesconto:"+produto2.desconto);
        System.out.println("produto:"+produto3.nome+"\ndescricao:"+produto1.descricao+"\npreco unitario"+produto3.precoUnitario+"\ndesconto:"+produto3.desconto);
    }
}
