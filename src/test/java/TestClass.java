import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.net.MalformedURLException;

public class TestClass {

    @Test
    public void test() throws MalformedURLException, InterruptedException {
        WebDriver driver;

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriverManager.chromedriver().setup();

        options.addArguments("--headless");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--incognito");
         // driver=new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),options);
        driver=new ChromeDriver(options);
        driver.get("https://www.google.com");
        driver.quit();
    }
}
