package StepsDefinitions;

import PageObjects.AutenticaçãoPage;
import PageObjects.CriarContaPage;
import PageObjects.LoginPage;
import PageObjects.UsuarioLogadoPage;
import Suporte.Config;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Steps {

    private WebDriver navegador;

    //Método que executa tudo antes dos testes
    @Before
    public void setUp() {
        navegador = Config.Chrome();
    }

    @Dado("informe um email válido")
    public void cadastrarUsuario() throws InterruptedException {
        new AutenticaçãoPage(navegador)
                .criarConta()
                .clicarBotaoCreateAnAccount();
    }

    @Dado("seleciono um titulo {string}")
    public void selecionarTitulo(String titulo) {
        new CriarContaPage(navegador)
                .selecionarTitulo(titulo);
    }

    @Dado("informo um nome")
    public void informarNome() {
        new CriarContaPage(navegador)
                .informarNome();
    }

    @Dado("informo um sobrenome")
    public void informarSobrenome() {
        new CriarContaPage(navegador)
                .informarSobreNome();
    }

    @Dado("informo uma senha")
    public void informarSenha() {
        new CriarContaPage(navegador)
                .informarSenha();
    }

    @Dado("informo uma data de nascimento")
    public void informarDataNascimento() {
        new CriarContaPage(navegador)
                .informarDataNascimento();
    }

    @Dado("informo um endereço")
    public void informarEndereco() {
        new CriarContaPage(navegador)
                .informarEndereco();
    }

    @Dado("informo uma cidade")
    public void informarCidade() {
        new CriarContaPage(navegador)
                .informarCidade();
    }

    @Dado("informo um estado")
    public void informarEstado() {
        new CriarContaPage(navegador)
                .selecionarEstado();
    }

    @Dado("informo um código postal")
    public void informarCodigoPostal() {
        new CriarContaPage(navegador)
                .informarCodigoPostal();
    }

    @Dado("informo um telefone")
    public void informarTelefone() {
        new CriarContaPage(navegador)
                .informarTelefone();
    }

    @Quando("submeto o cadastro")
    public void submeterCadastro() {
        new CriarContaPage(navegador)
                .clicarBotaoRegister();
    }

    @Então("sou cadastrado com sucesso")
    public void validaCadastro(){
        new UsuarioLogadoPage(navegador)
                .validaUsuarioLogado();

    }

    @Dado("que eu informe um email válido")
    public void emailValido() throws InterruptedException {
        new LoginPage(navegador)
                .informarEmailValido();
    }

    @Dado("que eu informe um email inexistente")
    public void emailInexistente() throws InterruptedException {
        new LoginPage(navegador)
                .informarEmailInexistente();
    }

    @Dado("que eu informe um email inválido")
    public void emailInvalido() throws InterruptedException {
        new LoginPage(navegador)
                .informarEmailInvalido();
    }

    @Dado("que eu informe um email em branco")
    public void emailEmBranco() throws InterruptedException {
        new LoginPage(navegador)
                .informarLoginEmBranco();
    }

    @Dado("informe uma senha válida")
    public void senhaValida(){
        new LoginPage(navegador)
                .informarSenhaValida();
    }

    @Dado("informe uma senha inválida")
    public void senhaInvalida(){
        new LoginPage(navegador)
                .informarSenhaInvalida();
    }

    @Quando("faço o login")
    public void logar(){
        new LoginPage(navegador)
                .clicarNoBotãoSignIn();
    }

    @Então("não sou autenticado")
    public void emailInvalidoNaoLogado(){
        new UsuarioLogadoPage(navegador)
                .validaEmailInvalidoNaoLogado();
    }

    @After
    public void tearDown(){
        navegador.quit();
    }

}
