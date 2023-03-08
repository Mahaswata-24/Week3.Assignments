package week3.day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnMultiple {
 public static void main(String[] args) {
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Mobiles",Keys.ENTER);
	
	List<WebElement> prices = driver.findElements(By.className("a-price-whole"));
     int allPrice = prices.size();
     System.out.println(allPrice);
     
     for (WebElement webele : prices) {
		String eachMobilePrice = webele.getText();
		String replace = eachMobilePrice.replaceAll(",", "");
		System.out.println(replace);
		
		int parseInt = Integer.parseInt(replace);
	}
	
}
}
