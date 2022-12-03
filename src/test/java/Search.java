import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Search {

    @Test
    public void GoogleSearch(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");

        driver.close();
}

}
