package br.com.tentativa;

public class exercicio1 {
    public static void main(String[] args) {
        cliente thiago = new cliente();
                thiago.setNome("thiago");
        thiago.setSobrenome("bissoli");
        conta contaThiago = new conta();
                contaThiago.setSaldo(800);
        contaThiago.setNumeroConta(1546379601);

        cliente brenda = new cliente();
        brenda.setNome("Brenda");
        brenda.setSobrenome("Marques");
        conta contaBrenda = new conta();
        contaBrenda.setSaldo(200);
        contaBrenda.setNumeroConta(8925513);



        contaThiago.saque(900);

    }
}
