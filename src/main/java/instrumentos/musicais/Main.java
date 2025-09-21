package instrumentos.musicais;

import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {

    // CRIAÇÃO DE DOIS INSTRUMENTOS DE CORDAS
    InstrumentoCordas[] instrumentosCordas = {
        new InstrumentoCordas("violao", "Madeira", 1985, 185, 6, "reto"),
        new InstrumentoCordas("Violino", "Madeira", 1714, 895.99, 3, "Curvo"),
    };

    // CRIAÇÃO DE DOIS INSTRUMENTOS DE SOPRO
    InstrumentoSopro[] instrumentosSopro = {
        new InstrumentoSopro("Flauta", "plastico e metal", 2007, 143.87, "Sopro", "4 valvulas"),
        new InstrumentoSopro("Gaita", "Aluminio", 1999, 100.0, "Sopro", "12")
    };

    // ARRAY LIST PARA LISTAR OS INSTRUMENTOS
    // RESPONSÁVEL POR ARMAZENAR OS INSTRUMENTOS E UNIFICAR OS VETORES DO CONTRUTOR
    ArrayList<InstrumentoMusical> instrumentos = new ArrayList<>();

    // LAÇO DE REPETIÇÃO PARA ADICIONAR VARIAÇÕES DE PREÇOS AOS INSTRUMENTOS
    for (InstrumentoCordas cordas : instrumentosCordas) {

      // NESTE CONTRUTOR, OS DADOS SÃO COLETADOS E É FEITO O REAJUSTE DO VALOR DO INSTRUMENTO COM O DESCONTO E TAXA
      InstrumentoCordas comTaxa = new InstrumentoCordas(
          cordas.getNomeInstrumento(),
          cordas.getMaterialInstrumento(),
          cordas.getAnoFabricacao(),
          cordas.getValorInstrumento(),
          cordas.getNumeroDeCordas(),
          cordas.getTipoDeBraco());
      comTaxa.setValorInstrumento(comTaxa.calcularValor(5, 20));
      instrumentos.add(comTaxa);

      // NESTE CONTRUTOR, OS DADOS SÃO COLETADOS E É FEITO O REAJUSTE DO VALOR DO INSTRUMENTO SOMENTE COM O DESCONTO
      InstrumentoCordas comDesconto = new InstrumentoCordas(
          cordas.getNomeInstrumento(),
          cordas.getMaterialInstrumento(),
          cordas.getAnoFabricacao(),
          cordas.getValorInstrumento(),
          cordas.getNumeroDeCordas(),
          cordas.getTipoDeBraco());
      comDesconto.setValorInstrumento(comDesconto.calcularValor(10));
      instrumentos.add(comDesconto);
    }

    // LAÇO DE REPETIÇÃO PARA ADICIONAR VARIAÇÕES DE PREÇOS AOS INSTRUMENTOS
    for (InstrumentoSopro sopro : instrumentosSopro) {

      // NESTE CONTRUTOR, OS DADOS SÃO COLETADOS E É FEITO O REAJUSTE DO VALOR DO INSTRUMENTO COM O DESCONTO E TAXA
      InstrumentoSopro comTaxa = new InstrumentoSopro(
          sopro.getNomeInstrumento(),
          sopro.getMaterialInstrumento(),
          sopro.getAnoFabricacao(),
          sopro.getValorInstrumento(),
          sopro.getTipoBoquilha(),
          sopro.getValvulaEscape());
      comTaxa.setValorInstrumento(comTaxa.calcularValor(26, 11));
      instrumentos.add(comTaxa);

      // NESTE CONTRUTOR, OS DADOS SÃO COLETADOS E É FEITO O REAJUSTE DO VALOR DO INSTRUMENTO SOMENTE COM O DESCONTO
      InstrumentoSopro comDesconto = new InstrumentoSopro(
          sopro.getNomeInstrumento(),
          sopro.getMaterialInstrumento(),
          sopro.getAnoFabricacao(),
          sopro.getValorInstrumento(),
          sopro.getTipoBoquilha(),
          sopro.getValvulaEscape());
      comDesconto.setValorInstrumento(comDesconto.calcularValor(41));
      instrumentos.add(comDesconto);
    }

    // EXIBIÇÃO DOS INSTRUMENTOS COM AS VARIAÇÕES DE PREÇO
    System.out.println("Lista de instrumentos musicais com variacoes de preco: ");
    for (InstrumentoMusical instrumento : instrumentos) {
      System.out.println("-------------------------------");
      System.out.println(instrumento);
      System.out.println("-------------------------------");
      System.out.println("\n");
    }
  }
}