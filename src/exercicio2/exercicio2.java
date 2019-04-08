package exercicio2;

public class exercicio2 {
    public static void main(String[] args) {
        jogadorDeFutebol thiago = new jogadorDeFutebol();
        thiago.setNome("Thiago");
        thiago.setAlegria(50);
        thiago.setEnergia(50);
        thiago.setExperiencia(20);

        jogadorDeFutebol mateus = new jogadorDeFutebol();
        mateus.setNome("mateus");
        mateus.setExperiencia(40);
        mateus.setEnergia(60);
        mateus.setAlegria(50);

        SessaoDeTreino treino1 = new SessaoDeTreino();
        treino1.treinarA(thiago);
        treino1.treinarA(mateus);
    }
}
