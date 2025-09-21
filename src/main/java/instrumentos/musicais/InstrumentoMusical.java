package instrumentos.musicais;

// CRIA A CLASSE ABSTRATA ANCESTRAL INSTRUMENTO MUSICAL
public abstract class InstrumentoMusical {

    // CRIA VARIAVEIS PRIVADAS
    private String nomeInstrumento;
    private String materialInstrumento;
    private int anoFabricacao;
    private double valorInstrumento;

    // CRIAÇÃO DO CONSTRUTOR COM PARÂMETROS
    public InstrumentoMusical(String nomeInstrumento, String materialInstrumento, int anoFabricacao,
    double valorInstrumento) {
        this.nomeInstrumento = nomeInstrumento;
        this.materialInstrumento = materialInstrumento;
        this.anoFabricacao = anoFabricacao;
        this.valorInstrumento = valorInstrumento;
    };

    // CRIAÇÃO DO CONSTRUTOR VAZIO
    public InstrumentoMusical() {};
    
    // CRIAÇÃO DOS GETTERS E SETTERS DE CADA VARIAVEL E METÓDOS DE CÁLCULO DE VALOR E EXIBIÇÃO(TO STRING)

    public String getNomeInstrumento() {
        return nomeInstrumento;
    }

    public String getMaterialInstrumento() {
        return materialInstrumento;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public double getValorInstrumento() {
        return valorInstrumento;
    }

    public void setNomeInstrumento(String nomeInstrumento) {
        this.nomeInstrumento = nomeInstrumento;
    }

    public void setMaterialInstrumento(String materialInstrumento) {
        this.materialInstrumento = materialInstrumento;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        if (anoFabricacao < 0) return;
        this.anoFabricacao = anoFabricacao;
    }

    public void setValorInstrumento(double valorInstrumento) {
        this.valorInstrumento = valorInstrumento;
    }

    public double calcularValor() {
        return this.getValorInstrumento();
    };

    public double calcularValor(double desconto) {
        double valorOriginal = this.getValorInstrumento();
        double valorComDesconto = valorOriginal * (1 - desconto / 100);
        return valorComDesconto;
    };

    public double calcularValor(double desconto, double taxa) {
        double valorBase = this.getValorInstrumento();
        double valorComTaxa = valorBase * (1 + taxa / 100);
        double valorFinal = valorComTaxa * (1 - desconto / 100);
        return valorFinal;
    }

    // SOBRESCREVE O MÉTODO TOSTRING PARA EXIBIÇÃO DOS DADOS
    @Override
    public String toString() {
        return "ano " + this.anoFabricacao;
    }
}