package exercicio3;

public class prova {

    private int dificudade;
    private int energiaNecessaria;

    public int getDificudade() {
        return dificudade;
    }

    public void setDificudade(int dificuldade) {
        this.dificudade = dificuldade;
    }

    public int getEnergiaNecessaria() {
        return energiaNecessaria;
    }

    public void setEnergiaNecessaria(int energiaNecessaria) {
        this.energiaNecessaria = energiaNecessaria;
    }

    public boolean podeRealizar (atleta atleta ){
        return atleta.getNivel() >= this.dificudade && atleta.getEnergia() > this.energiaNecessaria;

    }
}
