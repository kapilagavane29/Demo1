package DropDownTutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Orange {
	public static void fbi(WebElement wb,String a) {
		Select sel=new Select(wb);
		sel.selectByVisibleText(a);
		WebElement s=sel.getFirstSelectedOption();
		System.out.println(s.getText());
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\kapil\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		////b[text()='PIM']
		driver.findElement(By.xpath("//b[text()='PIM']")).click();////input[@value='Add']
		driver.findElement(By.xpath("//input[@value='Add']")).click();//firstName
		driver.findElement(By.id("firstName")).sendKeys("steven");
		driver.findElement(By.id("lastName")).sendKeys("smith");////input[@value='Save']
		driver.findElement(By.xpath("//input[@value='Save']")).click();
		driver.findElement(By.xpath("//input[@id='btnSave']")).click();////input[@id='btnSave']
		
		
		WebElement wb=driver.findElement(By.id("personal_cmbMarital"));
		Orange.fbi(wb,"Single");
		//Select sel = new Select(wb);
		//sel.selectByVisibleText("Single");//id="personal_cmbNation"
		WebElement cb=driver.findElement(By.id("personal_cmbNation"));
		Orange.fbi(cb,"Indian");
		//Select sell = new Select(cb);
		//sell.selectByVisibleText("Indian");//id="btnEditCustom"
		driver.findElement(By.id("btnEditCustom")).click();
		WebElement df=driver.findElement(By.name("custom1"));
		Orange.fbi(df,"O+");
		//Select selll=new Select(df);
		//selll.selectByVisibleText("O+");
		
		
	
		
		
		
		
		
		

	}

}
