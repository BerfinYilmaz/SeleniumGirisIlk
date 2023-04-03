import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

    public class TestNG1 {

        WebDriver driver;
         @BeforeTest
        public void testtenOncekiAdimlar(){
             WebDriverManager.chromedriver().setup();
             driver = new ChromeDriver();
             driver.manage().window().maximize();
         }
        @Test
        public void anaSayfaBaglama() { driver.get("https://www.gooogle.com");}
        @AfterTest
        public void testSonrasiAdimlar(){ driver.quit();}
    }

