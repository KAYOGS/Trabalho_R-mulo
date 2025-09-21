package instrumentos.musicais;

// É CRIADO A CLASSE INSTRUMENTO DE SOPRO E HERDA A CLASSE ANCESTRAL INSTRUMENTO MUSICAL
public class InstrumentoSopro extends InstrumentoMusical {

    // É CRIADO DUAS VÁRIAVEIS PRIVADAS
    private String tipoBoquilha;
    private String valvulaEscape;

    // CRIAÇÃO DO CONSTRUTOR COM PARÂMETROS E O SUPER
    public InstrumentoSopro(String nome, String material, int ano, double valor, String tipoBoquilha, String valvulaEscape) {
        super(nome, material, ano, valor);
        this.tipoBoquilha = tipoBoquilha;
        this.valvulaEscape = valvulaEscape;
    }

    // CRIAÇÃO DO CONSTRUTOR VAZIO
    public InstrumentoSopro() {}

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

    public void setTipoBoquilha(String tipoBoquilha) {
        this.tipoBoquilha = tipoBoquilha;
    }

    public void setValvulaEscape(String valvulaEscape) {
        this.valvulaEscape = valvulaEscape;
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

    public String getTipoBoquilha() {
        return tipoBoquilha;
    }

    public String getValvulaEscape() {
        return valvulaEscape;
    }

    @Override
    public String toString() {
                return "Nome: " + getNomeInstrumento()
                + "\nMaterial: " + getMaterialInstrumento()
                + "\nAno de Fabricacao: " + getAnoFabricacao()
                + "\nValor: " + String.format("%.2f", getValorInstrumento()) + " Reais" // É FEITO A FORMATAÇÃO DO VALOR PARA MONETÁRIO
                + "\nTipo de Boquilha: " + getTipoBoquilha()
                + "\nValcula de Escape: " + getValvulaEscape();
    }
}