
public class Iphone extends AparelhoTelefonico implements RepordutorDeMusica, NavegadorDeInternet {
  private double versaoSistema;

  public Iphone(String modelo, String ano, double versaoSistema) {
    super(modelo, ano);
    this.versaoSistema = versaoSistema;
  }

  public double getVersaoSistema() {
    return versaoSistema;
  }

  @Override
  protected void enviarSMS() {
    verificaSinalTelefone();
    System.out.println("Enviando SMS.");
  }

  @Override
  protected void fazerLigacao() {
    verificaSinalTelefone();
    System.out.println("Chamando.");
    System.out.println("Fazendo ligação.");
  }

  @Override
  protected void receberLigacao() {
    verificaSinalTelefone();
    System.out.println("Tocando...");
    System.out.println("Atendendo ligação.");
  }

  @Override
  protected void receberSMS() {
    verificaSinalTelefone();
    System.out.println("SMS recebido");
  }

  @Override
  public void pausarMusica() {
    System.out.println("Pausando música.");
  }

  @Override
  public void musicaAnterior() {
    System.out.println("Passando para a música anterior");
  }

  @Override
  public void proximaMusica() {
    System.out.println("Passando para a próxima música");
  }

  @Override
  public void selecionarMusica() {
    System.out.println("Musica selecionada.");
  }

  @Override
  public void tocarMusica() {
    System.out.println("Tocando música.");
  }

  @Override
  public void abrirNavegador() {
    System.out.println("Abrindo Navegador.");
  }

  @Override
  public void abrirSite(String url) {
    verificaConexaoComInternet();
    System.out.println("Abrindo o site: " + url);
  }

  @Override
  public void atualizarPagina() {
    System.out.println("Atualizando página.");
  }

  @Override
  public void fecharNavegador() {
    System.out.println("Fechando navegador.");
  }

  private void verificaConexaoComInternet() {
    System.out.println("Verificando conexão com internet.");
  }

  private void verificaSinalTelefone() {
    System.out.println("Verificando sinal de telefone.");
  }

  public void exibeInformacaoAparelho() {
    System.out.println("Modelo do iphone: " + getModelo());
    System.out.println("Ano do iphone: " + getAno());
    System.out.println("Versão do sistema do iphone: " + getVersaoSistema());
  }

}
