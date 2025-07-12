package tests;

import base.BaseTest;
import org.junit.jupiter.api.Test;
import pages.LoginPage;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LoginTest extends BaseTest {

    @Test
    public void testLoginComSucesso() {
        driver.get("https://exemplo.com/login");
        LoginPage loginPage = new LoginPage(driver);
        loginPage.fazerLogin("usuario", "senha123");

        assertTrue(driver.getTitle().contains("Dashboard"));
    }
}
