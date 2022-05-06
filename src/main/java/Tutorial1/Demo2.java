package Tutorial1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\kapil\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/reg");
		WebElement eb =driver.findElement(By.xpath("//select[@id='month']"));
		Select sel = new Select(eb);
		sel.selectByVisibleText("Jul");
		WebElement a=sel.getFirstSelectedOption();
		String g=a.getText();
		System.out.println(g);
		List<WebElement>ls=sel.getOptions();
		int c=ls.size();
		System.out.println(c);
		for (WebElement abc:ls) {
			String b=abc.getText();
			System.out.println(b);
		}

	}

}
