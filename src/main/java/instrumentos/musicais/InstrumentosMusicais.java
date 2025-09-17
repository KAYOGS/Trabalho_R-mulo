package instrumentos.musicais;

public abstract class InstrumentosMusicais {
    private String nome;
    private String tipo;

    public InstrumentosMusicais() {}
    public InstrumentosMusicais(String nome, String tipo) {
        this.nome = nome;
        this.tipo = tipo;
    }

    public void exibirInformacao() {
        System.out.println("Nome: " + nome + ", tipo: " + tipo);
    }
    
    public abstract void tocar();
    public abstract void afinar();
}
