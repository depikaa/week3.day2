package week3.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ajioAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(" https://www.ajio.com/");
		/*
		 * In the search box, type as "bags" and press enter 3. To the left of the
		 * screen under " Gender" click the "Men" 4. Under "Category" click
		 * "Fashion Bags" 5. Print the count of the items Found. 6. Get the list of
		 * brand of the products displayed in the page and print the list. 7. Get the
		 * list of names of the bags and print it
		 */
		WebElement box = driver.findElement(By.xpath("//input[@role='combobox']"));
		box.sendKeys("bags");
		driver.findElement(By.className("rilrtl-button")).click();
		driver.findElement(By.xpath("//label[@for='Men']")).click();
	
		driver.findElement(By.xpath("//label[@class='facet-linkname facet-linkname-l1l3nestedcategory facet-linkname-Men - Fashion Bags']")).click();
		
		WebElement num = driver.findElement(By.className("length"));
		System.out.println(num.getText());
		
    List <WebElement>brandList= driver.findElements(By.className("brand"));
      System.out.println("The Brand List is:"+brandList.size());
      
      for(WebElement brand:brandList)
      {
    	  System.out.println("the List is:"+brand.getText());
    	  
      }
     List <WebElement> listofBags = driver.findElements(By.className("name"));
     System.out.println("the bags list is:"+listofBags.size());
     for(WebElement bags:listofBags)
     {
    	 System.out.println("the bags list is:"+bags.getText());
	}
	}
}



