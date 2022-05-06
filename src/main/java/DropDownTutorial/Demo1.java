package DropDownTutorial;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\kapil\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/kapil/Downloads/HTMLCode%20New%20Student/New%20folder/dropdown.html");
		WebElement wb=driver.findElement(By.id("course"));
		Select sel=new Select(wb);
		List<WebElement>ls=sel.getOptions();
		int d= ls.size();
		System.out.println(d);
		for(WebElement abc:ls) {
			String v=abc.getText();
			//System.out.println(v);
			if(v.contains("API")) {
				sel.selectByVisibleText("API Automation");
			WebElement cb=	sel.getFirstSelectedOption();
			System.out.println(cb.getText());
			System.out.println("test cases passed");
			}
		}

	}

}
