public class App {
    public static void main(String[] args) throws Exception {
      ArvoreBinariaMorse arvore = new ArvoreBinariaMorse();

      arvore.popula();

      System.out.println(arvore.busca(".-"));
      System.out.println(arvore.busca("-..."));
      System.out.println(arvore.busca("-.-."));
    } 
}
