package Tutorial1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\kapil\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		String b=driver.findElement(By.xpath("//h2[contains(text(),'you connect')]")).getText();
		System.out.println(b);
		if(b.contains("Facebook")) {
			System.out.println("test cases passed");
		}
		else {
			System.out.println("test cases failed");
		}
		driver.close();
		
	}

}
