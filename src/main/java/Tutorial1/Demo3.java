package Tutorial1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo3 {
	//check Specific value present or not

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\kapil\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/reg");
		WebElement wb=driver.findElement(By.xpath("//select[@id='month']"));
		Select sel = new Select(wb);
		List<WebElement>ls=sel.getOptions();
		for(WebElement abc:ls) {
			String b=abc.getText();
		
			if(b.contains("Jul")) {
				System.out.println("test cases is present");
			}
		
		}
		

	}

}
