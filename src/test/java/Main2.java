import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main2 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        WebElement element1 = driver.findElement(By.id(" "));
        WebElement element2 = driver.findElement(By.cssSelector(" "));
        WebElement element3 = driver.findElement(By.xpath(" "));
        WebElement element4 = driver.findElement(By.name(" "));
        WebElement element5 = driver.findElement(By.linkText(" "));
        WebElement element6 = driver.findElement(By.className(" "));

        element1.click();  // tıklama işlemi
        element1.sendKeys(" "); // elemana text gönderme
    }
}
