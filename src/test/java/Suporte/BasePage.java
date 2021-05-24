package Suporte;

import org.openqa.selenium.WebDriver;

public class BasePage {
    protected static WebDriver navegador;

    public BasePage(WebDriver navegador){
        this.navegador = navegador;
    }
}
