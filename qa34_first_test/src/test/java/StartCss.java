import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class StartCss {
    WebDriver wd;


    @Test
    public void startCssLocators() {
        wd = new ChromeDriver();
        wd.navigate().to("https://telranedu.web.app/");

        WebElement elem1 = wd.findElement(By.id("root"));
        WebElement elem2 = wd.findElement(By.tagName("a"));

        List<WebElement> list = wd.findElements(By.tagName("a")); //all elements by tagname a (sum 3)

        wd.findElement(By.className("container"));

        //I don't use it as it is a very old and slow strategy, but if needed...
        wd.findElement(By.linkText("LOGIN"));
        wd.findElement(By.partialLinkText("LOG"));

        //////////////////////////////////////////////////////////////////////////////////////////////////

        //tagName
        wd.findElement(By.cssSelector("div"));
        wd.findElement(By.cssSelector("a"));
        wd.findElement(By.cssSelector("input"));
        wd.findElement(By.cssSelector("button"));
//        wd.findElement(By.xpath(""));

        //id ---> #
        wd.findElement(By.cssSelector("#root"));

        //class ---> .class
        wd.findElement(By.cssSelector(".container"));
        wd.findElement(By.cssSelector("[href='/home']"));


    }
}
