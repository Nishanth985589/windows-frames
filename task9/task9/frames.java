package task9.task9;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class frames{

	public static void main(String[] args) {
		
	WebDriver driver = new ChromeDriver();
	driver.get("http://the-internet.herokuapp.com/nested_frames");
	driver.switchTo().frame("frame-top");
	driver.switchTo().frame("frame-left");
	WebElement leftframe= driver.findElement(By.xpath("//body"));
	if(leftframe.getText().contains("LEFT")) {
		System.out.println(" 'LEFT' is available in frame");
	} else {
		System.out.println("Not available");
	}
   driver.switchTo().parentFrame();
   driver.switchTo().frame("frame-middle");
   WebElement middleframe = driver.findElement(By.xpath("//body"));
   if(middleframe.getText().contains("MIDDLE")) {
		System.out.println(" 'MIDDLE' is available in frame");
	} else {
		System.out.println("Not available");
	}
   driver.switchTo().parentFrame();
   driver.switchTo().frame("frame-right");
   WebElement rightframe = driver.findElement(By.xpath("//body"));
   if(rightframe.getText().contains("RIGHT")) {
		System.out.println(" 'RIGHT' is available in frame");
	} else {
		System.out.println("Not available");
	}
   driver.switchTo().parentFrame();
   driver.switchTo().frame("frame-bottom");
   WebElement bottomframe = driver.findElement(By.xpath("//body"));
   if(middleframe.getText().contains("BOTTOM")) {
		System.out.println(" 'BOTTOM' is available in frame");
	} else {
		System.out.println("Not available");
   }
   driver.switchTo().parentFrame();
   driver.quit();
	}}