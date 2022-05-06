package DropDownTutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo5 {
	public static void dropDown(WebElement wb,String a) {
		Select sel= new Select(wb);
		sel.selectByVisibleText(a);
		System.out.println(sel.getFirstSelectedOption().getText());
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\kapil\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();////b[text()='PIM']
		driver.findElement(By.xpath("//b[text()='PIM']")).click();////input[@name='btnAdd']
		driver.findElement(By.xpath("//input[@name='btnAdd']")).click();////input[@id='lastName']/preceding::input[12]
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("kartik");
		
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Dinesh");////input[@value='Save']
		
		driver.findElement(By.xpath("//input[@value='Save']")).click();////input[@id='btnSave']

		driver.findElement(By.xpath("//input[@id='btnSave']")).click();
		WebElement wb=driver.findElement(By.id("personal_cmbMarital"));
		Demo5.dropDown(wb,"Single");
		
//		Select sel= new Select(wb);
//		sel.selectByVisibleText("Single");
//		WebElement abc=sel.getFirstSelectedOption();
		//System.out.println(abc.getText());//id="personal_cmbNation"
		

		WebElement cb=driver.findElement(By.id("personal_cmbNation"));
		Demo5.dropDown(cb,"Indian");
		//Select sel1= new Select(cb);
		//sel1.selectByVisibleText("Indian");
		//WebElement xyz=sel1.getFirstSelectedOption();
		//System.out.println(xyz.getText());//id="btnEditCustom"
		
		driver.findElement(By.id("btnEditCustom")).click();//name="custom1"
	

		WebElement ab=driver.findElement(By.name("custom1"));
		Demo5.dropDown(ab,"O+");
		//Select sel2= new Select(ab);
		//sel2.selectByVisibleText("O+");
		//WebElement pqr=sel2.getFirstSelectedOption();
		//System.out.println(pqr.getText());
		

	}

}
