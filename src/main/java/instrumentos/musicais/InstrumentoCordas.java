package instrumentos.musicais;

// É CRIADO A CLASSE INSTRUMENTO DE CORDAS E HERDA A CLASSE ANCESTRAL INSTRUMENTO MUSICAL
public class InstrumentoCordas extends InstrumentoMusical {

    // É CRIADO DUAS VÁRIAVEIS PRIVADAS
    private int numeroDeCordas;
    private String tipoDeBraco;

    // CRIAÇÃO DO CONSTRUTOR COM PARÂMETROS E O SUPER
    public InstrumentoCordas(String nome, String material, int ano, double valor, int numeroDeCordas,
            String tipoDeBraco) {
        super(nome, material, ano, valor);
        this.numeroDeCordas = numeroDeCordas;
        this.tipoDeBraco = tipoDeBraco;
    }

    // CRIAÇÃO DO CONSTRUTOR VAZIO
    public InstrumentoCordas() {}

    // ABAIXO É FEITO OS GETTERS E SETTERS DE CADA VARIAVEL E OS MÉTODOS HERDADOS DA CLASSE ANCESTRAL

    @Override
    public void setNomeInstrumento(String nomeInstrumento) {
        super.setNomeInstrumento(nomeInstrumento);
    }

    @Override
    public void setMaterialInstrumento(String materialInstrumento) {
        super.setMaterialInstrumento(materialInstrumento);
    }

    @Override
    public void setAnoFabricacao(int anoFabricacao) {
        super.setAnoFabricacao(anoFabricacao);
    }

    @Override
    public void setValorInstrumento(double valorInstrumento) {
        super.setValorInstrumento(valorInstrumento);
    }

    public int getNumeroDeCordas() {
        return numeroDeCordas;
    }

    public void setNumeroDeCordas(int numeroDeCordas) {
        this.numeroDeCordas = numeroDeCordas;
    }

    public String getTipoDeBraco() {
        return tipoDeBraco;
    }

    public void setTipoDeBraco(String tipoDeBraco) {
        this.tipoDeBraco = tipoDeBraco;
    }

    @Override
    public String getNomeInstrumento() {
        return super.getNomeInstrumento();
    }

    @Override
    public String getMaterialInstrumento() {
        return super.getMaterialInstrumento();
    }

    @Override
    public int getAnoFabricacao() {
        return super.getAnoFabricacao();
    }

    @Override
    public double getValorInstrumento() {
        return super.getValorInstrumento();
    }

    @Override
    public String toString() {
        return "Nome: " + getNomeInstrumento()
                + "\nMaterial: " + getMaterialInstrumento()
                + "\nAno de Fabricacao: " + getAnoFabricacao()
                + "\nValor: " + String.format("%.2f", getValorInstrumento()) + " Reais" // É FEITO A FORMATAÇÃO DO VALOR PARA MONETÁRIO
                + "\nNúmero de Cordas: " + getNumeroDeCordas()
                + "\nTipo de Braco: " + getTipoDeBraco();
    }
}
