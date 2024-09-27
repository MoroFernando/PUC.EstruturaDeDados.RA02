public class No {
  private String codigo;
  private String letra;
  private No esquerda;
  private No direita;

  public No(String codigo) {
    this.codigo = codigo;
    this.esquerda = null;
    this.direita = null;
  }

  public String getCodigo() {
    return this.codigo;
  }

  public String getLetra() {
    return this.letra;
  }

  public No getEsquerda() {
    return this.esquerda;
  }

  public No getDireita() {
    return this.direita;
  }

  public void setEsquerda(No esquerda) {
    this.esquerda = esquerda;
  }

  public void setDireita(No direita) {
    this.direita = direita;
  }

  public void setCodigo(String codigo) {
    this.codigo = codigo;
  }

  public void setLetra(String letra) {
    this.letra = letra;
  }
}
