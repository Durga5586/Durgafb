package SeleniumProject.programs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;

public class dropdown {

		public static void main(String[] args) throws InterruptedException {
			
			// TODO Auto-generated method stub
			WebDriverManager.chromedriver().setup();
			ChromeDriver driver=new ChromeDriver();
			
			driver.navigate().to("https://demo.guru99.com/test/newtours/register.php");
			driver.manage().window().maximize();
			
			Thread.sleep(5000);
			
			
			Select dropdown= new Select(driver.findElement(By.xpath("//select[@name='country']")));
			
			// dropdown.selectByValue("INDIA");
			
			List<WebElement>alldropdown=dropdown.getOptions();
			
			for(int i=0;i<alldropdown.size();i++)
			{
				
				//System.out.println("Country===>" +alldropdown.get(i).getText());
				
				if("INDIA".equals(alldropdown.get(i).getText())) 
				{ 
					dropdown.selectByValue("INDIA"); 
				System.out.println("Country===>" +alldropdown.get(i).getText());
			}
			}
			
			
		}

	}


