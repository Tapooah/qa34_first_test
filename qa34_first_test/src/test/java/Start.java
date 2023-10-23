

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Start {
    WebDriver wd;

    @Test
    public void start() {
        wd = new ChromeDriver();
        //wd.get("https://contacts-app.tobbymarshall815.vercel.app/home");//without history

        wd.navigate().to("https://contacts-app.tobbymarshall815.vercel.app/home"); //with history
//        wd.navigate().back();
//        wd.navigate().forward();
//        wd.navigate().refresh();

        //open form --> click login button
        WebElement loginTab;
        loginTab.click();

//fill valid email
        WebElement emailTextBox;
        emailTextBox.click();
        emailTextBox.clear();
        emailTextBox.sendKeys("test@gmail.com");

        //fill valid password
        WebElement passwordTextBox;
        passwordTextBox.click();
        passwordTextBox.clear();
        passwordTextBox.sendKeys("Tt12345$");

        //click login button
        WebElement loginButton;
        loginButton.click();

        //Assert


//        //wd.close();//close a tab
//        wd.quit();//close all
    }


}
