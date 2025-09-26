package instrumentos.musicais;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Metodos {

   private List<InstrumentoCordas> listaCordas = new ArrayList<>();
   private List<InstrumentoSopro> listaSopro = new ArrayList<>();
   private Scanner scan;

   public Metodos(Scanner scan) {
      this.scan = scan;
   }

   // ADICIONAR INSTRUMENTOS DE CORDA
   public void adicionarInstrumentoCordas() {
      try {
         InstrumentoCordas instrumentoCordas = new InstrumentoCordas();

         System.out.println("Digite o nome do instrumento de cordas: ");
         instrumentoCordas.setNomeInstrumento(scan.nextLine());

         System.out.println("Digite o material do instrumento de cordas: ");
         instrumentoCordas.setMaterialInstrumento(scan.nextLine());

         System.out.println("Digite o ano de fabricacao do instrumento de cordas: ");
         instrumentoCordas.setAnoFabricacao(scan.nextInt());
         scan.nextLine();

         System.out.println("Digite o valor do instrumento de cordas: ");
         instrumentoCordas.setValorInstrumento(scan.nextDouble());
         scan.nextLine();

         System.out.println("Deseja adicionar uma taxa e desconto juntos? (S/N)");
         char adicionarTaxa = scan.nextLine().toUpperCase().charAt(0);

         // AQUI É REALIZADO A CONDICIONAL DE TAXA E DESCONTO
         // SE O USUÁRIO NÃO QUISER INSERIR UMA TAXA E DESCONTO JUNTOS, ELE PODERÁ
         // INSERIR SOMENTE O DESCONTO
         // SE O USUÁRIO NÃO QUISER INSERIR NENHUMA DAS OPÇÕES, O SISTEMA CONTINUARÁ SEM
         // AFETAR O FUNCIONAMENTO
         if (adicionarTaxa == 'S') {
            System.out.println("Digite o valor da taxa (%): ");
            double taxa = Double.parseDouble(scan.nextLine());

            System.out.println("Digite o valor do desconto (%): ");
            double desconto = Double.parseDouble(scan.nextLine());

            double valorFinal = instrumentoCordas.calcularValor(desconto, taxa);
            instrumentoCordas.setValorInstrumento(valorFinal);
         } else {
            System.out.println("Deseja adicionar somente um desconto? (S/N)");
            char adicionarDesconto = scan.nextLine().toUpperCase().charAt(0);

            if (adicionarDesconto == 'S') {
               System.out.println("Digite a porcentagem do desconto: ");
               double desconto = Double.parseDouble(scan.nextLine());

               double valorFinal = instrumentoCordas.calcularValor(desconto);
               instrumentoCordas.setValorInstrumento(valorFinal);
            }
         }

         System.out.println("Digite o numero de cordas: ");
         instrumentoCordas.setNumeroDeCordas(scan.nextInt());
         scan.nextLine();

         System.out.println("Digite o tipo de braco (reto ou curvo): ");
         instrumentoCordas.setTipoDeBraco(scan.nextLine());

         listaCordas.add(instrumentoCordas);

         System.out.println("\nInstrumento de cordas adicionado com sucesso!\n");
         System.out.println(instrumentoCordas);

      } catch (Exception e) {
         System.out.println("\nErro ao adicionar instrumento de cordas: " + e.getMessage());
      }
   }

   // ADICIONAR INSTRUMENTOS DE SOPRO
   public void adicionarInstrumentoSopro() {
      try {
         InstrumentoSopro instrumentoSopro = new InstrumentoSopro();

         System.out.println("Digite o nome do instrumento de sopro: ");
         instrumentoSopro.setNomeInstrumento(scan.nextLine());

         System.out.println("Digite o material do instrumento de sopro: ");
         instrumentoSopro.setMaterialInstrumento(scan.nextLine());

         System.out.println("Digite o ano de fabricacao do instrumento de sopro: ");
         instrumentoSopro.setAnoFabricacao(scan.nextInt());
         scan.nextLine();

         System.out.println("Digite o valor do instrumento de sopro: ");
         instrumentoSopro.setValorInstrumento(scan.nextDouble());
         scan.nextLine();

         System.out.println("Deseja adicionar uma taxa e desconto juntos? (S/N)");
         char adicionarTaxa = scan.nextLine().toUpperCase().charAt(0);

         // AQUI É REALIZADO A CONDICIONAL DE TAXA E DESCONTO
         // SE O USUÁRIO NÃO QUISER INSERIR UMA TAXA E DESCONTO JUNTOS, ELE PODERÁ
         // INSERIR SOMENTE O DESCONTO
         // SE O USUÁRIO NÃO QUISER INSERIR NENHUMA DAS OPÇÕES, O SISTEMA CONTINUARÁ SEM
         // AFETAR O FUNCIONAMENTO
         if (adicionarTaxa == 'S') {
            System.out.println("Digite o valor da taxa (%): ");
            double taxa = Double.parseDouble(scan.nextLine());

            System.out.println("Digite o valor do desconto (%): ");
            double desconto = Double.parseDouble(scan.nextLine());

            double valorFinal = instrumentoSopro.calcularValor(desconto, taxa);
            instrumentoSopro.setValorInstrumento(valorFinal);
         } else {
            System.out.println("Deseja adicionar somente um desconto? (S/N)");
            char adicionarDesconto = scan.nextLine().toUpperCase().charAt(0);

            if (adicionarDesconto == 'S') {
               System.out.println("Digite a porcentagem do desconto: ");
               double desconto = Double.parseDouble(scan.nextLine());

               double valorFinal = instrumentoSopro.calcularValor(desconto);
               instrumentoSopro.setValorInstrumento(valorFinal);
            }
         }

         System.out.println("Digite o tipo de boquilha: ");
         instrumentoSopro.setTipoBoquilha(scan.nextLine());

         System.out.println("Digite o número de válvulas/escapes: ");
         instrumentoSopro.setValvulaEscape(scan.nextLine());

         listaSopro.add(instrumentoSopro);

         System.out.println("\nInstrumento de sopro adicionado com sucesso!\n");
         System.out.println(instrumentoSopro);

      } catch (Exception e) {
         System.out.println("\nErro ao adicionar instrumento de sopro: " + e.getMessage());
      }
   }

   // LISTAR
   public void listarCordas() {
      if (listaCordas.isEmpty()) {
         System.out.println("\nNenhum instrumento de cordas cadastrado.\n");
      } else {
         System.out.println("\n=== Lista de Instrumentos de Cordas ===\n");
         for (int i = 0; i < listaCordas.size(); i++) {
            System.out.println(i + " - " + listaCordas.get(i));
            System.out.println("\n");
         }
      }
   }

   public void listarSopro() {
      if (listaSopro.isEmpty()) {
         System.out.println("\nNenhum instrumento de sopro cadastrado.\n");
      } else {
         System.out.println("\n=== Lista de Instrumentos de Sopro ===\n");
         for (int i = 0; i < listaSopro.size(); i++) {
            System.out.println(i + " - " + listaSopro.get(i));
         }
      }
   }

   // ATUALIZAR
   public void atualizarCordas() {
      try {
         listarCordas();
         if (listaCordas.isEmpty())
            return;

         System.out.println("\nDigite o índice do instrumento para atualizar: ");
         int indice = Integer.parseInt(scan.nextLine());

         if (indice >= 0 && indice < listaCordas.size()) {
            InstrumentoCordas instrumento = listaCordas.get(indice);

            System.out.println("Novo nome (" + instrumento.getNomeInstrumento() + "): ");
            String novoNome = scan.nextLine();
            if (!novoNome.isEmpty()) {
               instrumento.setNomeInstrumento(novoNome);
            }

            System.out.println("Novo material (" + instrumento.getMaterialInstrumento() + "): ");
            String novoMaterial = scan.nextLine();
            if (!novoMaterial.isEmpty()) {
               instrumento.setMaterialInstrumento(novoMaterial);
            }

            System.out.println("Novo ano (" + instrumento.getAnoFabricacao() + "): ");
            String novoAnoFabricacao = scan.nextLine();
            if (!novoAnoFabricacao.isEmpty()) {
               instrumento.setAnoFabricacao(Integer.parseInt(novoAnoFabricacao));
            }

            System.out.println("Novo valor (" + instrumento.getValorInstrumento() + "): ");
            String novoValor = scan.nextLine();
            if (!novoValor.isEmpty()) {
               instrumento.setValorInstrumento(Double.parseDouble(novoValor));
            }

            // AQUI É REALIZADO A CONDICIONAL DE TAXA E DESCONTO
            // SE O USUÁRIO NÃO QUISER INSERIR UMA TAXA E DESCONTO JUNTOS, ELE PODERÁ
            // INSERIR SOMENTE O DESCONTO
            // SE O USUÁRIO NÃO QUISER INSERIR NENHUMA DAS OPÇÕES, O SISTEMA CONTINUARÁ SEM
            // AFETAR O FUNCIONAMENTO
            System.out.println("Deseja adicionar uma taxa e desconto juntos? (S/N)");
            char adicionarTaxa = scan.nextLine().toUpperCase().charAt(0);

            if (adicionarTaxa == 'S') {
               System.out.println("Digite o valor da taxa (%): ");
               double taxa = Double.parseDouble(scan.nextLine());

               System.out.println("Digite o valor do desconto (%): ");
               double desconto = Double.parseDouble(scan.nextLine());

               double valorFinal = instrumento.calcularValor(desconto, taxa);
               instrumento.setValorInstrumento(valorFinal);

            } else {
               System.out.println("Deseja adicionar somente um desconto? (S/N)");
               char adicionarDesconto = scan.nextLine().toUpperCase().charAt(0);

               if (adicionarDesconto == 'S') {
                  System.out.println("Digite a porcentagem do desconto: ");
                  double desconto = Double.parseDouble(scan.nextLine());

                  double valorFinal = instrumento.calcularValor(desconto);
                  instrumento.setValorInstrumento(valorFinal);
               }
            }

            System.out.println("Novo número de cordas (" + instrumento.getNumeroDeCordas() + "): ");
            String novoNumCordas = scan.nextLine();
            if (!novoNumCordas.isEmpty()) {
               instrumento.setNumeroDeCordas(Integer.parseInt(novoNumCordas));
            }

            System.out.println("Novo tipo de braço (" + instrumento.getTipoDeBraco() + "): ");
            String novoTipoBraco = scan.nextLine();
            if (!novoTipoBraco.isEmpty()) {
               instrumento.setTipoDeBraco(novoTipoBraco);
            }

            System.out.println("\nInstrumento atualizado com sucesso!\n");
         } else {
            System.out.println("\nÍndice inválido!\n");
         }
      } catch (Exception e) {
         System.out.println("\nHouve um problema ao atualizar: " + e.getMessage());
      }
   }

   public void atualizarSopro() {
      try {
         listarSopro();
         if (listaSopro.isEmpty())
            return;

         System.out.println("\nDigite o índice do instrumento para atualizar: ");
         int indice = Integer.parseInt(scan.nextLine());

         if (indice >= 0 && indice < listaSopro.size()) {
            InstrumentoSopro instrumento = listaSopro.get(indice);

            System.out.println("Novo nome (" + instrumento.getNomeInstrumento() + "): ");
            String novoNome = scan.nextLine();
            if (!novoNome.isEmpty()) {
               instrumento.setNomeInstrumento(novoNome);
            }

            System.out.println("Novo material (" + instrumento.getMaterialInstrumento() + "): ");
            String novoMaterial = scan.nextLine();
            if (!novoMaterial.isEmpty()) {
               instrumento.setMaterialInstrumento(novoMaterial);
            }

            System.out.println("Novo ano (" + instrumento.getAnoFabricacao() + "): ");
            String novoAnoFabricacao = scan.nextLine();
            if (!novoAnoFabricacao.isEmpty()) {
               instrumento.setAnoFabricacao(Integer.parseInt(novoAnoFabricacao));
            }

            System.out.println("Novo valor (" + instrumento.getValorInstrumento() + "): ");
            String novoValor = scan.nextLine();
            if (!novoValor.isEmpty()) {
               instrumento.setValorInstrumento(Double.parseDouble(novoValor));
            }

            // AQUI É REALIZADO A CONDICIONAL DE TAXA E DESCONTO
            // SE O USUÁRIO NÃO QUISER INSERIR UMA TAXA E DESCONTO JUNTOS, ELE PODERÁ
            // INSERIR SOMENTE O DESCONTO
            // SE O USUÁRIO NÃO QUISER INSERIR NENHUMA DAS OPÇÕES, O SISTEMA CONTINUARÁ SEM
            // AFETAR O FUNCIONAMENTO
            System.out.println("Deseja adicionar uma taxa e desconto juntos? (S/N)");
            char adicionarTaxa = scan.nextLine().toUpperCase().charAt(0);

            if (adicionarTaxa == 'S') {
               System.out.println("Digite o valor da taxa (%): ");
               double taxa = Double.parseDouble(scan.nextLine());

               System.out.println("Digite o valor do desconto (%): ");
               double desconto = Double.parseDouble(scan.nextLine());

               double valorFinal = instrumento.calcularValor(desconto, taxa);
               instrumento.setValorInstrumento(valorFinal);

            } else {
               System.out.println("Deseja adicionar somente um desconto? (S/N)");
               char adicionarDesconto = scan.nextLine().toUpperCase().charAt(0);

               if (adicionarDesconto == 'S') {
                  System.out.println("Digite a porcentagem do desconto: ");
                  double desconto = Double.parseDouble(scan.nextLine());

                  double valorFinal = instrumento.calcularValor(desconto);
                  instrumento.setValorInstrumento(valorFinal);
               }
            }

            System.out.println("Novo tipo de boquilha (" + instrumento.getTipoBoquilha() + "): ");
            String novoTipoBoquilha = scan.nextLine();
            if (!novoTipoBoquilha.isEmpty()) {
               instrumento.setTipoBoquilha(novoTipoBoquilha);
            }

            System.out.println("Novo número de válvulas/escapes (" + instrumento.getValvulaEscape() + "): ");
            String novoNumValvulaEscape = scan.nextLine();
            if (!novoNumValvulaEscape.isEmpty()) {
               instrumento.setValvulaEscape(novoNumValvulaEscape);
            }

            System.out.println("\nInstrumento atualizado com sucesso!\n");
         } else {
            System.out.println("\nÍndice inválido!\n");
         }
      } catch (Exception e) {
         System.out.println("\nHouve um problema ao atualizar: " + e.getMessage());
      }
   }

   // DELETAR
   public void deletarCordas() {
      try {
         listarCordas();
         if (listaCordas.isEmpty())
            return;

         System.out.println("\nDigite o índice para deletar: ");
         int indice = scan.nextInt();

         if (indice >= 0 && indice < listaCordas.size()) {
            listaCordas.remove(indice);
            System.out.println("\nInstrumento deletado com sucesso!\n");
         } else {
            System.out.println("\nÍndice inválido!\n");
         }
      } catch (Exception e) {
         System.out.println("\nHouve um problema ao deletar: " + e.getMessage());
      }
   }

   public void deletarSopro() {
      try {
         listarSopro();
         if (listaSopro.isEmpty())
            return;

         System.out.println("\nDigite o índice para deletar: ");
         int indice = scan.nextInt();

         if (indice >= 0 && indice < listaSopro.size()) {
            listaSopro.remove(indice);
            System.out.println("\nInstrumento deletado com sucesso!\n");
         } else {
            System.out.println("\nÍndice inválido!\n");
         }
      } catch (Exception e) {
         System.out.println("\nHouve um problema ao deletar: " + e.getMessage());
      }
   }

   // MENU
   public void menu() {
      int opcao;
      do {
         System.out.println("\n===== MENU =====\n");
         System.out.println("0 - Sair");
         System.out.println("1 - Adicionar cordas");
         System.out.println("2 - Listar cordas");
         System.out.println("3 - Atualizar cordas");
         System.out.println("4 - Deletar cordas");
         System.out.println("\n");
         System.out.println("5 - Adicionar sopro");
         System.out.println("6 - Listar sopro");
         System.out.println("7 - Atualizar sopro");
         System.out.println("8 - Deletar sopro");
         System.out.println("\n");
         System.out.print("Escolha: ");

         opcao = scan.nextInt();
         scan.nextLine();

         switch (opcao) {
            case 0 -> System.out.println("\nSaindo...\n");
            case 1 -> adicionarInstrumentoCordas();
            case 2 -> listarCordas();
            case 3 -> atualizarCordas();
            case 4 -> deletarCordas();
            case 5 -> adicionarInstrumentoSopro();
            case 6 -> listarSopro();
            case 7 -> atualizarSopro();
            case 8 -> deletarSopro();
            default -> System.out.println("\nOpção inválida!\n");
         }
      } while (opcao != 0);

   }
}
