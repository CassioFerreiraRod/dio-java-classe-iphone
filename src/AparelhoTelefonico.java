public abstract class AparelhoTelefonico {
  private String modelo;
  private String ano;

  public AparelhoTelefonico(String modelo, String ano) {
    this.modelo = modelo;
    this.ano = ano;
  }

  public String getModelo() {
    return modelo;
  }

  public String getAno() {
    return ano;
  }

  protected void fazerLigacao() {
  }

  protected void receberLigacao() {
  }

  protected void enviarSMS() {
  }

  protected void receberSMS() {
  }

}
