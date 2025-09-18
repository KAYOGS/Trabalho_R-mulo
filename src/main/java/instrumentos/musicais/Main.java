package instrumentos.musicais;

public class Main {
    public static void main(String[] args) {

        InstrumentoSopro trompete = new InstrumentoSopro(
            "Trompete",
            "Latão",
            2021,
            750.0,
            "Cilíndrica",
            "Pistões"
        );

        System.out.println("--- Dados do Instrumento de Sopro ---");
        System.out.println("Nome: " + trompete.getNomeInstrumento());
        System.out.println("Material: " + trompete.getMaterialInstrumento());
        System.out.println("Ano de Fabricação: " + trompete.getAnoFabricacao());
        System.out.println("Valor: R$" + trompete.getValorInstrumento());
        System.out.println("Tipo de Boquilha: " + trompete.getTipoBoquilha());
        System.out.println("Válvula de Escape: " + trompete.getValvulaEscape());

        System.out.println("\n--- Modificando o instrumento de Sopro ---");
        trompete.setValorInstrumento(800.0);
        trompete.setTipoBoquilha("Taça");

        System.out.println("Novo Valor: R$" + trompete.getValorInstrumento());
        System.out.println("Novo Tipo de Boquilha: " + trompete.getTipoBoquilha());

        System.out.println("\n--- Demonstração de Métodos (Sopro) ---");
        double valorComDescontoSopro = trompete.calcularValor(50.0);
        System.out.println("Valor com R$50 de desconto: R$" + valorComDescontoSopro);

        double valorComDescontoETaxaSopro = trompete.calcularValor(50.0, 20.0);
        System.out.println("Valor com R$50 de desconto e R$20 de taxa: R$" + valorComDescontoETaxaSopro);

        System.out.println("\n" + "=".repeat(40) + "\n");

        InstrumentoCordas guitarra = new InstrumentoCordas(
            "Guitarra Elétrica",
            "Madeira de Bordo",
            2023,
            2500.0,
            6,
            "Plano"
        );

        System.out.println("--- Dados do Instrumento de Cordas ---");
        System.out.println("Nome: " + guitarra.getNomeInstrumento());
        System.out.println("Material: " + guitarra.getMaterialInstrumento());
        System.out.println("Ano de Fabricação: " + guitarra.getAnoFabricacao());
        System.out.println("Valor: R$" + guitarra.getValorInstrumento());
        System.out.println("Número de Cordas: " + guitarra.getNumeroDeCordas());
        System.out.println("Tipo de Braço: " + guitarra.getTipoDeBraco());

        System.out.println("\n--- Modificando o instrumento de Cordas ---");
        guitarra.setValorInstrumento(2750.0);
        guitarra.setNumeroDeCordas(7);
        guitarra.setTipoDeBraco("Curvo");

        System.out.println("Novo Valor: R$" + guitarra.getValorInstrumento());
        System.out.println("Novo Número de Cordas: " + guitarra.getNumeroDeCordas());
        System.out.println("Novo Tipo de Braço: " + guitarra.getTipoDeBraco());

        System.out.println("\n--- Demonstração de Métodos (Cordas) ---");
        double valorComDescontoCordas = guitarra.calcularValor(250.0);
        System.out.println("Valor com R$250 de desconto: R$" + valorComDescontoCordas);
    }
}