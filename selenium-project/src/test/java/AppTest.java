import java.time.Duration;
import org.testng.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class AppTest {
    public static void main(String[] args) throws Exception {
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); // it works globally
        driver.get("https://demo.meropadhai.com");
        driver.findElement(By.className("css-1cvkl7w")).click();
        driver.findElement(By.id("2")).sendKeys("surajclinchtech@gmail.com");
        driver.findElement(By.id("field-3")).sendKeys("password");
        driver.findElement(By.className("css-gq8yyc")).click();
        // driver.findElement(By.name("..."))
        Thread.sleep(3000);
        driver.findElement(By.cssSelector(".css-zdihdj")).click();
        System.out.println(driver.findElement(By.cssSelector("h1.css-ttzx9q")).getText()); // Using CSS Selector
        driver.findElement(By.linkText("Courses")).click();
        driver.findElement(By.cssSelector("div.css-1344rbf")).click();
        driver.findElement(By.cssSelector(".css-zdihdj")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"menu-button-13\"]")).click();
        driver.findElement(By.xpath("//button[@data-index='3']")).click(); // #menu-button-13
        Thread.sleep(3000);
        Assert.assertEquals(driver.findElement(By.xpath("//*[@id=\"bundle-courses\"]/div[1]/div/div[1]/h1")).getText(), "Bundle Courses");
        // driver.close();

        //CSS Selectors 
        // Class name --> tagname.classname
        // ID --> tagname#id
        // tagname[attribute='value'] // It is used for all attributes
        // tagname[attribute*='value'] // Here * is used for contains           // for xpath: //tagname[contains(@attribute, 'value')]
        // tagname[attribute^='value'] // Here ^ is used for starts with 
        // tagname[attribute$='value'] // Here $ is used for ends with
        // tagname[attribute~='value'] // Here ~ is used for contains with space

        // XPath
        // How to write Xpath? 
        // Answer: //tagname[@attribut='value']

        // Customized CSS Selector
        // input[type='text']:nth-child(2) // to handle with indexes

        //Customized Xpath Selector
        // //input[@type='text'][2] // to handle with indexes

        // Customized Parent to child xpath
        // no need of attributes in this kind of customized xpath
        // Ex: //form/h2 where form is the parent and h2 is the child

        // Customized Parent to child CSS Selector
        // no need of attributes in this kind of customized CSS Selector
        // Ex: "form h2"
    }
}