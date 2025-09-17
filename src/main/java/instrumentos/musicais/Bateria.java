package instrumentos.musicais;

public class Bateria extends InstrumentosMusicais {
   public Bateria() {
      super("Bateria", "Batuque");
   }

   @Override
   public void tocar() {
      System.out.println("A bateria está tocando...");
   }

   @Override
   public void afinar() {}

   @Override
   public void manutencao() {
      System.out.println("A bateria está em manutenção...");
   }
}
