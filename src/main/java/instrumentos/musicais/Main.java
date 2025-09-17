package instrumentos.musicais;

public class Main {
    public static void main(String[] args) {

        System.out.println("\n");
        InstrumentosMusicais violao = new Violao();
        violao.exibirInformacao();
        violao.tocar();
        violao.afinar();

        System.out.println("\n");
        InstrumentosMusicais bateria = new Bateria();
        bateria.exibirInformacao();
        bateria.tocar();
        bateria.manutencao();

        System.out.println("\n");
        InstrumentosMusicais violino = new InstrumentosMusicais("Violino", "Madeira") {
            @Override
            public void afinar() {
                System.out.println("O violino esta sendo afinado...");
            }

            @Override
            public void tocar() {
                System.out.println("O violino esta tocando...");
            }

            @Override
            public void manutencao(){
                System.out.println("Fazendo manutenção no violino...");
            }
        };
        
        violino.exibirInformacao();
        violino.afinar();
        violino.tocar();
        violino.manutencao();

        System.out.println("\n");
        InstrumentosMusicais tambor = new InstrumentosMusicais("Tambor", "Batuque") {
            @Override
            public void afinar() {}

            @Override
            public void tocar() {
                System.out.println("O tambor está sendo tocado...");
            }

            @Override
            public void manutencao() {
                System.out.println("O tambor está em manutenção...");
            }
        };

        tambor.exibirInformacao();
        tambor.tocar();
        tambor.manutencao();
    }
}