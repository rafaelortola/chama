package PageObjects;

import Suporte.BasePage;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CriarContaPage extends BasePage {
    public CriarContaPage(WebDriver navegador) {
        super(navegador);
    }

    public CriarContaPage selecionarTitulo(String titulo){
        if (titulo.contains("Mr.")) {
            navegador.findElement(By.id("id_gender1")).click();
        }
        else if (titulo.contains("Mrs.")){
            navegador.findElement(By.id("id_gender2")).click();
        }
        else {
            Assert.fail("Título inválido");
        }
        return this;
    }

    public CriarContaPage informarNome(){
        navegador.findElement(By.id("customer_firstname")).sendKeys("Rafael");
        return this;
    }

    public CriarContaPage informarSobreNome(){
        navegador.findElement(By.id("customer_lastname")).sendKeys("Ortola");
        return this;
    }

    public CriarContaPage informarSenha(){
        navegador.findElement(By.id("passwd")).sendKeys("123987");
        return this;
    }

    public CriarContaPage informarDataNascimento(){
        navegador.findElement(By.id("days")).sendKeys("3");
        navegador.findElement(By.id("months")).sendKeys("April");
        navegador.findElement(By.id("years")).sendKeys("1990");
        return this;
    }

    public CriarContaPage informarEndereco(){
        navegador.findElement(By.id("address1")).sendKeys("Rua Teste do Teste");
        return this;
    }

    public CriarContaPage informarCidade(){
        navegador.findElement(By.id("city")).sendKeys("cidade teste");
        return this;
    }

    public CriarContaPage selecionarEstado(){
        navegador.findElement(By.id("id_state")).sendKeys("Alaska");
        return this;
    }

    public CriarContaPage informarCodigoPostal(){
        navegador.findElement(By.id("postcode")).sendKeys("98767");
        return this;
    }

    public CriarContaPage informarTelefone(){
        navegador.findElement(By.id("phone_mobile")).sendKeys("999999999");
        return this;
    }

    public UsuarioLogadoPage clicarBotaoRegister(){
        navegador.findElement(By.cssSelector("#submitAccount")).click();
        return new UsuarioLogadoPage(navegador);
    }
}
