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
  }

  public void insere(String morse, String letra){
    No atual = this.raiz;


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
        System.out.println("Caractere inválido: " + c);
        return;
      }
    }
    atual.setLetra(letra);
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
        System.out.println("Caractere inválido: " + c);
        return null;
      }
    }
    return atual.getLetra();
  }

}
