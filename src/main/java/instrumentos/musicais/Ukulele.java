package instrumentos.musicais;

public class Ukulele extends InstrumentosMusicais {
    public Ukulele() {
        super("Ukulele", "Cordas");
    }

    @Override
    public void tocar() {
        System.out.println("O ukulele está tocando com acordes alegres.");
    }

    @Override
    public void afinar() {
        System.out.println("Afinando as cordas do ukulele.");
    }

    @Override
    public void manutencao() {
        System.out.println("Fazendo manutenção no ukulele.");
    }       
    
}
