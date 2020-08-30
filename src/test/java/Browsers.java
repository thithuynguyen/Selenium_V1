import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Browsers {

    public static WebDriver driver;

    public static WebDriver getDriver() {
        return driver;
    }

    public static void openBrowser(String name) throws IllegalStateException {
        switch (name.toLowerCase()) {
            case "ie":
                driver = new InternetExplorerDriver();
                break;
            case "edge":
                driver = new EdgeDriver();
                break;
            case "firefox":
                driver = new FirefoxDriver();
                break;
            case "chrome":
                System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
                driver = new ChromeDriver();
                break;
            case "safari":
                driver = new SafariDriver();
                break;
            default:
                throw new IllegalStateException("Undefine browser : " + name);
        }
    }

    public static void main(String [] args){
        openBrowser("chrome");
    }

}
