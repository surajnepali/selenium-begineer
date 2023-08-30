import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorTutorial {
    
    public static void main(String[] args){
        
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.meropadhai.com");

        // "//*[@placeholder='email']" * indicates any tagname but here @placeholder='email' should be unique

        // "//button[text()='Log Out']" button name is only applicable in xpath

    }
}
