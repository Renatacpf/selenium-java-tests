package factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory {

    public static WebDriver createDriver(String browser) {
        if (browser == null) {
            throw new IllegalArgumentException("O navegador não pode ser nulo.");
        }

        switch (browser.toLowerCase()) {
            case "chrome":
                return new ChromeDriver();
            default:
                throw new IllegalArgumentException("Navegador não suportado: " + browser);
        }
    }
}
