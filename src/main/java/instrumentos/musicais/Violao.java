package instrumentos.musicais;

public class Violao extends InstrumentosMusicais {
    public Violao() {
        super("Violão", "Cordas");
    }

    @Override
    public void tocar() {
        System.out.println("O violao esta tocando com acordes.");
    }

    @Override
    public void afinar() {
        System.out.println("Afinando as cordas do violao.");
    }

    @Override
    public void manutencao() {
        System.out.println("Fazendo manutenção no violao.");
    }
}
