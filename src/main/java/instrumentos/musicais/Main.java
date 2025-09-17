package instrumentos.musicais;

public class Main {
    public static void main(String[] args) {
        InstrumentosMusicais violao = new Violao();
        violao.exibirInformacao();
        violao.tocar();
        violao.afinar();
        InstrumentosMusicais violino = new InstrumentosMusicais("Violino", "Madeira") {
            @Override
            public void afinar() {
                System.out.println("O violino esta sendo afinado...");
            }

            @Override
            public void tocar() {
                System.out.println("O violino esta tocando...");
            }
        };
        violao.afinar();
        violao.tocar();
    }
}