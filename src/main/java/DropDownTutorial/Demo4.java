package DropDownTutorial;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\kapil\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/reg");
		WebElement eb=driver.findElement(By.xpath("//select[@id='year']"));
		Select sel=new Select(eb);
		List<WebElement>ls=sel.getOptions();
		int a=ls.size();
		System.out.println(a);
		for (WebElement abc:ls) {
			String c=abc.getText();
			//System.out.println(c);
			if(c.contains("2010")) {
			System.out.println("test cases passed");
			sel.selectByVisibleText("2010");
			WebElement d=sel.getFirstSelectedOption();
			String h=d.getText();
			System.out.println(h);
			}
		}

	}

}
