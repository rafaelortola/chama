package PageObjects;

import Suporte.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Random;

public class AutenticaçãoPage extends BasePage {
    public AutenticaçãoPage(WebDriver navegador) {
        super(navegador);
    }

    public AutenticaçãoPage criarConta() throws InterruptedException {
        //clica no menu Sign In
        navegador.findElement(By.className("login")).click();
        Thread.sleep(3000);

        String vogal[] = {"a", "e", "i", "o", "u",}, vc = "", nome = "", consoante[] = {"b", "c", "d", "f", "g", "h", "j", "k", "l", "m", "n", "p", "q", "r", "s", "t", "w", "x", "y", "z"};

        Random random = new Random();
        int i;
        for (i = 0; i <= 0; i++) {
            int nrAleatorioVogal = 0 + random.nextInt(4);//escolhe uma pos de 0 a 4
            int nrAleatorioConsoante = 0 + random.nextInt(19);//escolhe pos de 0 a 19

            vc = vogal[nrAleatorioVogal] + consoante[nrAleatorioConsoante] + consoante[nrAleatorioConsoante] +
                    vogal[nrAleatorioVogal] + vogal[nrAleatorioVogal] + vogal[nrAleatorioVogal];

            nome = vc + "@gmail.com";

            //preenche o campo "Email Adress" com um e-mail válido
            navegador.findElement(By.id("email_create")).sendKeys(nome);

        }
        return this;
    }


        public CriarContaPage clicarBotaoCreateAnAccount () throws InterruptedException {
            //Clicar no botão Create an account
            navegador.findElement(By.id("SubmitCreate")).click();
            Thread.sleep(2000);

            return new CriarContaPage(navegador);
        }
    }

