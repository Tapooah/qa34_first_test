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
        wd.findElement(By.xpath("//div"));

        wd.findElement(By.cssSelector("a"));
        wd.findElement(By.xpath("//a"));

        wd.findElement(By.cssSelector("input"));
        wd.findElement(By.xpath("//input"));

        wd.findElement(By.cssSelector("button"));
        wd.findElement(By.xpath("//button"));


        //id ---> #
        wd.findElement(By.cssSelector("#root"));
        wd.findElement(By.xpath("//*[@id='root']"));

        //class ---> .class
        wd.findElement(By.cssSelector(".container"));
        wd.findElement(By.xpath("//*[@class='container']"));

        //attribute
        wd.findElement(By.cssSelector("[href='/home']"));
        wd.findElement(By.xpath("//*[@href='/home']"));

        //start with
        wd.findElement(By.cssSelector("[placeholder='Email']"));
        wd.findElement(By.xpath("//*[@placeholder='Email']"));

        //start with "Em"
        wd.findElement(By.cssSelector("[placeholder ^='Em']"));
        wd.findElement(By.xpath("//*[starts-with(@placeholder, 'Em')]"));

        //end on "il"
        wd.findElement(By.cssSelector("[placeholder $='il']"));
        wd.findElement(By.xpath("//*[contains(@placeholder,'ail')]")); //analog is not exist.

        //contains --> "ai"
        wd.findElement(By.cssSelector("[placeholder *='ai']"));
        wd.findElement(By.xpath("//*[contains(@placeholder,'ai')]"));

    }
}
