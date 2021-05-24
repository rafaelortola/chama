package PageObjects;

import Suporte.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver navegador) {
        super(navegador);
    }

    public LoginPage informarEmailValido() throws InterruptedException {
        navegador.findElement(By.className("login")).click();
        Thread.sleep(3000);
        navegador.findElement(By.id("email")).sendKeys("rafael.ortola@gmail.com");
        return this;
    }

    public LoginPage informarEmailInvalido() throws InterruptedException {
        navegador.findElement(By.className("login")).click();
        Thread.sleep(3000);
        navegador.findElement(By.id("email")).sendKeys("dsadsa@llll.com");
        return this;
    }

    public LoginPage informarEmailInexistente() throws InterruptedException {
        navegador.findElement(By.className("login")).click();
        Thread.sleep(3000);
        navegador.findElement(By.id("email")).sendKeys("#@!#JSAD@P$M");
        return this;
    }

    public LoginPage informarLoginEmBranco() throws InterruptedException {
        navegador.findElement(By.className("login")).click();
        Thread.sleep(3000);
        navegador.findElement(By.id("email")).sendKeys("");
        return this;
    }

    public LoginPage informarSenhaValida(){
        navegador.findElement(By.id("passwd")).sendKeys("123456");
        return this;
    }

    public LoginPage informarSenhaInvalida(){
        navegador.findElement(By.id("passwd")).sendKeys("090909@#$");
        return this;
    }

    public UsuarioLogadoPage clicarNoBotãoSignIn(){
        navegador.findElement(By.cssSelector("#SubmitLogin")).click();
        return new UsuarioLogadoPage(navegador);
    }
}
