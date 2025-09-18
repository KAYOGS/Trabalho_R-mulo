package instrumentos.musicais;

public class Clarineta extends InstrumentosMusicais {
   public Clarineta() {
      super("Clarineta", "Sopro");
   }

   @Override
   public void tocar() {
      System.out.println("A clarineta está tocando...");
   }

   @Override
   public void afinar() {
      System.out.println("A clarineta está sendo afinada...");
   }

   @Override
   public void manutencao() {
      System.out.println("A clarineta está em manutenção...");
   }
}
