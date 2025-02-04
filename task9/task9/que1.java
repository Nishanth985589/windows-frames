package task9.task9;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedCondition;
import java.util.Set;
public class que1 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
			try {
			driver.get("https://the-internet.herokuapp.com/windows");
			WebElement clickLink = driver.findElement(By.linkText("Click Here"));
			clickLink.click();
			String FirstWindow = driver.getWindowHandle();
			driver.wait(10000);
			Set<String> windowHandles = driver.getWindowHandles();
			for(String handle : windowHandles) {
				if(!handle.equals(windowHandles)) {
				driver.switchTo().window(handle);
				break;
				}}
			String secondWindow = driver.getTitle();
		    System.out.println("Second window title: " + secondWindow);
		    if (secondWindow.equals("New Window")) {
		    System.out.println("New window is present & verified");
		    }else {
		    	System.out.println("New window failed");
		    }
		    driver.close();
		    String Window = driver.getTitle();
		    System.out.println("First window title:" + Window);
		    if(Window.equals("The Internet")) {
		    	System.out.println("The first window is present");
		    } else {
		    	System.out.println("Test faied");
		    }}
		    catch (Exception e) {
		    	e.printStackTrace();
		    } {
		    driver.quit();
		    }}}
		 
			
			
					
		

	
