import java.util.Scanner;

import utilitarios.Delay;

public class App {
    public static void main(String[] args) throws Exception {

      ArvoreBinariaMorse arvore = new ArvoreBinariaMorse();
      arvore.popula();

      Scanner sc = new Scanner(System.in);
      boolean sair = false;
      while (!sair) {
        System.out.println("\nMENU DE OPÇÕES: \n");
        System.out.println("1 - Buscar Caracter na ÁrvoreBináriaMorse");
        System.out.println("2 - Inserir Caracter na ÁrvoreBináriaMorse");
        System.out.println("3 - Imprimir Tabela de Códigos Morse");
        System.out.println("0 - Sair");
        System.out.print("\nDigite a opção desejada: ");

        try {
          int opcaoMenu = sc.nextInt();
          System.out.println("");
          switch (opcaoMenu) {
            case 1:
              System.out.print("Digite o código Morse a ser buscado: ");
              String codigo = sc.next();
              String letra = arvore.busca(codigo);
              if (letra != null) {
                System.out.println("");
                System.out.println("Letra correspondente: " + letra);
              }
              Delay.congelar();
              break;
            case 2:
              System.out.println("Digite o código Morse e sua letra correspondente");
              System.out.println("");
              System.out.print("Código Morse: ");
              String codigoMorse = sc.next();
              System.out.print("Letra: ");
              String letraCorrespondente = sc.next();
              arvore.insere(codigoMorse, letraCorrespondente);
              Delay.congelar();
              break;
            case 3:
              arvore.imprimeTabela();
              Delay.congelar();
              break;
            case 0:
              System.out.println("\nSaindo do sistema...");
              sair = true;
              break;
            default:
              System.out.println("\nOpção inválida!");
              Delay.congelar();
              break;
          }
        } catch (Exception e) {
          System.out.println("\nOpção inválida!");
          sc.next();
        }
      }
      sc.close();
    } 
}
