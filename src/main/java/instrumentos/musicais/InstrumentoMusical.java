package instrumentos.musicais;

public abstract class InstrumentoMusical {
    private String nomeInstrumento;
    private String materialInstrumento;
    private int anoFabricacao;
    private double valorInstrumento;

    public InstrumentoMusical() {
    };

    public InstrumentoMusical(String nomeInstrumento, String materialInstrumento, int anoFabricacao,
            double valorInstrumento) {
        this.nomeInstrumento = nomeInstrumento;
        this.materialInstrumento = materialInstrumento;
        this.anoFabricacao = anoFabricacao;
        this.valorInstrumento = valorInstrumento;
    };

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
        this.anoFabricacao = anoFabricacao;
    }

    public void setValorInstrumento(double valorInstrumento) {
        this.valorInstrumento = valorInstrumento;
    }

    public double calcularValor() {
        return this.getValorInstrumento();
    };

    public double calcularValor(double desconto) {
        double valorDoInstrumentoComDesconto = (this.getValorInstrumento() - desconto);
        return valorDoInstrumentoComDesconto;
    };

    public double calcularValor(double desconto, double taxa) {
        double valorDoInstrumentoComDescontoETaxa = ((this.getValorInstrumento() + taxa) - desconto);
        return valorDoInstrumentoComDescontoETaxa;
    }

    @Override
    public String toString() {
        return "ano " + this.anoFabricacao;
    }
}