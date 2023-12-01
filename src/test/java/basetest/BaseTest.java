package basetest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.HomePage;
import reader.ReadDataFromJason;

import java.io.FileNotFoundException;

public class BaseTest { WebDriver driver;
    protected ReadDataFromJason readDataFromJson;
    protected HomePage homePage;

    @BeforeClass
    public void setUp() throws FileNotFoundException {
        readDataFromJson = new ReadDataFromJason();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(readDataFromJson.readJsonFile().URL);
        homePage = new HomePage(driver);

    }
    @AfterClass
    public void tearDown(){
        driver.quit();
    }
}
