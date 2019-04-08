package exercicio2;

public class SessaoDeTreino {

    private int experiencia;

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    public void treinarA(jogadorDeFutebol jogadorUm){
        jogadorUm.correr();
        jogadorUm.fazerGol();
        jogadorUm.correr();
        System.out.println("Experiencia antes" + jogadorUm.getExperiencia());

    }
}
