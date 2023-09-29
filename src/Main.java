public class Main {
  public static void main(String[] args) {
    Iphone iphone = new Iphone("Iphone 1", "2007", 1.0);

    iphone.fazerLigacao();
    iphone.receberLigacao();
    iphone.enviarSMS();
    iphone.receberSMS();

    iphone.abrirNavegador();
    iphone.abrirSite("www.google.com");
    iphone.atualizarPagina();
    iphone.fecharNavegador();

    iphone.selecionarMusica();
    iphone.tocarMusica();
    iphone.proximaMusica();
    iphone.musicaAnterior();
    iphone.pausarMusica();

    iphone.exibeInformacaoAparelho();

  }
}
