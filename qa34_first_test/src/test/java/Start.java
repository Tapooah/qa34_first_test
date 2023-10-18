import org.junit.jupiter.api.Test;

public class Start {
    WebDriver wd;

    @Test
    public void start() {
        wd = new ChromeDriver();
        wd.get("https://contacts-app.tobbymarsajj815.vercel.app/login");
    }
}
