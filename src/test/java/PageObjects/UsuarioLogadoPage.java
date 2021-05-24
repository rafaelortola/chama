package PageObjects;

import Suporte.BasePage;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UsuarioLogadoPage extends BasePage {

    public UsuarioLogadoPage(WebDriver navegador) {
        super(navegador);
    }

    public UsuarioLogadoPage validaUsuarioLogado() {
        String validacao = navegador.findElement(By.cssSelector("#header > div.nav > div > div > nav > div:nth-child(1) > a > span")).getText();
        Assert.assertEquals("Rafael Ortola", validacao);
        System.out.println("Usuário logado: " + validacao);


        return new UsuarioLogadoPage(navegador);
    }

    public UsuarioLogadoPage validaEmailInvalidoNaoLogado() {
        String emailInvalido = navegador.findElement(By.cssSelector("#center_column > div.alert.alert-danger > ol > li")).getText();
        if (emailInvalido.contains("Authentication failed.")){
            Assert.assertEquals("Authentication failed.",  emailInvalido);
            System.out.println("Endereço de E-mail inexistente");
        }
        else if (emailInvalido.contains("Invalid email address.")){
            Assert.assertEquals("Invalid email address.", emailInvalido);
            System.out.println("Endereço de E-mail inválido.");
        }
        else if (emailInvalido.contains("An email address required.")){
            Assert.assertEquals("An email address required.", emailInvalido);
            System.out.println("O campo email está em branco.");
        }
        else {
            Assert.fail("Erro");
        }

        return new UsuarioLogadoPage(navegador);
    }
}
