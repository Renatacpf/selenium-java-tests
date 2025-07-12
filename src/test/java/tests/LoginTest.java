package tests;

import base.BaseTest;
import org.junit.jupiter.api.Test;
import pages.LoginPage;
import utils.FakerGenerator;
import static org.junit.jupiter.api.Assertions.*;
import utils.WaitUtils;

public class LoginTest extends BaseTest {

    @Test
    public void testLoginComSucesso() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.fazerLogin("selenium.teste@testes.com.br", "teste@123456");
        WaitUtils.waitForPageLoad(driver);
        assertEquals("https://seubarriga.wcaquino.me/logar", driver.getCurrentUrl());
    }

    @Test
    public void testLoginErro() {
        LoginPage loginPage = new LoginPage(driver);
        String usuario = FakerGenerator.gerarNomeUsuario();
        String senha = FakerGenerator.gerarSenha();
        loginPage.fazerLogin(usuario, senha);
        assertTrue(loginPage.obterMensagemErro().contains("Problemas com o login do usuário"));
    }
}
