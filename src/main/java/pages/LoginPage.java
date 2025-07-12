package pages;

import utils.WaitUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;
    private By inputUsername = By.id("email");
    private By inputPassword = By.id("senha");
    private By btnLogin = By.xpath("//button[text()='Entrar']");
    private By msgErro = By.xpath("//div[@role='alert']");
 
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void fazerLogin(String usuario, String senha) {
        WaitUtils.waitForVisibility(driver, inputUsername);
        driver.findElement(inputUsername).sendKeys(usuario);
        driver.findElement(inputPassword).sendKeys(senha);
        driver.findElement(btnLogin).click();
    }

    public String obterMensagemErro() {
        return driver.findElement(msgErro).getText();
    }
}
