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

    public void fazerLogin(String usuario, String senha) {
        driver.findElement(inputUsername).sendKeys(usuario);
        driver.findElement(inputPassword).sendKeys(senha);
        driver.findElement(btnLogin).click();
    }
}
