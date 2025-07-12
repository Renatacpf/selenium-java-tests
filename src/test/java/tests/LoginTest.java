package tests;

import base.BaseTest;
import org.junit.jupiter.api.Test;
import pages.LoginPage;
import utils.FakerGenerator;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LoginTest extends BaseTest {

    @Test
    public void testLoginComSucesso() {
        driver.get("https://exemplo.com/login");
        LoginPage loginPage = new LoginPage(driver);

        loginPage.fazerLogin("usuario", "senha123");

        assertTrue(driver.getTitle().contains("Dashboard"));
    }

    @Test
    public void testLoginComDadosFaker() {
        driver.get("https://exemplo.com/login");

        LoginPage loginPage = new LoginPage(driver);

        String usuario = FakerGenerator.gerarNomeUsuario();
        String senha = FakerGenerator.gerarSenha();

        loginPage.fazerLogin(usuario, senha);

        assertFalse(driver.getTitle().contains("Dashboard"));
    }
}
