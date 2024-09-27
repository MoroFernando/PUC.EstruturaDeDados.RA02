public class ArvoreBinariaMorse {
  private No raiz;

  public ArvoreBinariaMorse() {
    No no = new No("RAIZ");
    this.raiz = no;
  }

  public void popula(){
    this.insere(".-", "A");
    this.insere("-...", "B");
    this.insere("-.-.", "C");
    this.insere("-..", "D");
    this.insere(".", "E");
    this.insere("..-.", "F");
    this.insere("--.", "G");
    this.insere("....", "H");
    this.insere("..", "I");
    this.insere(".---", "J");
    this.insere("-.-", "K");
    this.insere(".-..", "L");
    this.insere("--", "M");
    this.insere("-.", "N");
    this.insere("---", "O");
    this.insere(".--.", "P");
    this.insere("--.-", "Q");
    this.insere(".-.", "R");
    this.insere("...", "S");
    this.insere("-", "T");
    this.insere("..-", "U");
    this.insere("...-", "V");
    this.insere(".--", "W");
    this.insere("-..-", "X");
    this.insere("-.--", "Y");
    this.insere("--..", "Z");
  }

  public void insere(String morse, String letra){
    No atual = this.raiz;

    if (letra.length() != 1) {
      System.out.println("");
      System.out.println("A letra deve ter apenas um caracter!");
      System.out.println("");
      return;
    }

    for (int c = 0; c < morse.length(); c++) {
      char caracter = morse.charAt(c);
      if (caracter == '.') {
        if (atual.getEsquerda() == null) {
          No novo = new No(null);
          atual.setEsquerda(novo);
        }
        atual = atual.getEsquerda();
      } else if (caracter == '-') {
        if (atual.getDireita() == null) {
          No novo = new No(null);
          atual.setDireita(novo);
        }
        atual = atual.getDireita();
      } else {
        System.out.println("");
        System.out.println("Caractere inválido: " + caracter);
        return;
      }
    }
    atual.setLetra(letra.toUpperCase());
    System.out.println("");
    System.out.println("Letra " + letra + " inserida com sucesso!");
  }

  public String busca(String morse) {
    No atual = this.raiz;

    for (int c = 0; c < morse.length(); c++) {
      char caracter = morse.charAt(c);
      if (caracter == '.') {
        atual = atual.getEsquerda();
      } else if (caracter == '-') {
        atual = atual.getDireita();
      } else {
        System.out.println("");
        System.out.println("Caractere inválido: " + caracter);
        return null;
      }
    }
    return atual.getLetra();
  }

  public void imprimeTabela(){
    System.out.println("");
    System.out.println("##### TABELA DE CÓDIGOS MORSE #####");
    System.out.println("A: .-");
    System.out.println("B: -...");
    System.out.println("C: -.-.");
    System.out.println("D: -..");
    System.out.println("E: .");
    System.out.println("F: ..-.");
    System.out.println("G: --.");
    System.out.println("H: ....");
    System.out.println("I: ..");
    System.out.println("J: .---");
    System.out.println("K: -.-");
    System.out.println("L: .-..");
    System.out.println("M: --");
    System.out.println("N: -.");
    System.out.println("O: ---");
    System.out.println("P: .--.");
    System.out.println("Q: --.-");
    System.out.println("R: .-.");
    System.out.println("S: ...");
    System.out.println("T: -");
    System.out.println("U: ..-");
    System.out.println("V: ...-");
    System.out.println("W: .--");
    System.out.println("X: -..-");
    System.out.println("Y: -.--");
    System.out.println("Z: --..");
    System.out.println("###################################");
    System.out.println("");
  }
}
