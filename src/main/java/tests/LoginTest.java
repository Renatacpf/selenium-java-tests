package tests;

import base.BaseTest;
import org.junit.jupiter.api.Test;
import pages.LoginPage;

public class LoginTest extends BaseTest {

    @Test
    public void testLoginComSucesso() {
        driver.get("https://exemplo.com/login");
        LoginPage loginPage = new LoginPage(driver);

        loginPage.preencherUsuario("usuario");
        loginPage.preencherSenha("senha123");
        loginPage.clicarLogin();
    }
}
