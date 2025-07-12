package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;

    private By inputUsername = By.id("username");
    private By inputPassword = By.id("password");
    private By btnLogin = By.id("loginButton");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void preencherUsuario(String usuario) {
        driver.findElement(inputUsername).sendKeys(usuario);
    }

    public void preencherSenha(String senha) {
        driver.findElement(inputPassword).sendKeys(senha);
    }

    public void clicarLogin() {
        driver.findElement(btnLogin).click();
    }
}
