package Tutorial1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {


	

	public static void kapil(WebElement wb,String a) {
		Select sel = new Select(wb);
		sel.selectByVisibleText(a);
		WebElement v=sel.getFirstSelectedOption();
		String p=v.getText();
		System.out.println(p);
		
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\kapil\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/reg");
		WebElement z=driver.findElement(By.xpath("//select[@id='day']"));//xpath("//select[@id='day']"
		DropDown.kapil(z,"29");
		//Thread.sleep(5000);
		//Select sel = new Select(wb);
		//sel.selectByVisibleText("29");
		//WebElement abc=sel.getFirstSelectedOption();
	//	String a=abc.getText();
		//System.out.println(a);
		
		WebElement pqr=driver.findElement(By.xpath("//select[@id='month']"));
		DropDown.kapil(pqr,"Jul");
		//Select sel1 =new Select (pqr);
		//sel1.selectByVisibleText("Jul");
		//WebElement hhh=sel1.getFirstSelectedOption();
		//String b=hhh.getText();
		//System.out.println(b);
		
		WebElement xyz=driver.findElement(By.xpath("//select[@id='year']"));
		DropDown.kapil(xyz,"1995");
		//Select selll =new Select(xyz);
		//selll.selectByVisibleText("1995");
	//	WebElement ntr= selll.getFirstSelectedOption();
		//String c=ntr.getText();
		//System.out.println(c);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
