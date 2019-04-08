package exercicio3;

public class exercicio3 {
    public static void main(String[] args) {
        atleta thiago = new atleta();
        thiago.setNome("Thiago");
        thiago.setEnergia(5);
        thiago.setNivel(8);

        atleta mateus = new atleta();
        mateus.setNome("mateus");
        mateus.setEnergia(5);
        mateus.setNivel(9);

        prova prova1 = new prova();
        prova1.setDificudade(10);
        prova1.setEnergiaNecessaria(10);

        prova prova2 = new prova();
        prova1.setDificudade(12);
        prova1.setEnergiaNecessaria(11);

        prova1.podeRealizar(thiago);
        prova1.podeRealizar(mateus);

        prova2.podeRealizar(thiago);
        prova2.podeRealizar(mateus);

    }
}
