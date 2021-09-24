package week3.day2;

/*Launch the browser

//Launch the URL - https://erail.in/

//Uncheck the check box - sort on date

//clear and type in the source station 

//clear and type in the destination station

//Find all the train names using xpath and store it in a list

//Use Java Collections sort to sort it and then print it
*/
import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Erailsort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
ChromeDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(10));
driver.get("https://erail.in");
//to deselect the checkbox//
boolean checkbox = driver.findElement(By.xpath("//input[@id='chkSelectDateOnly']")).isSelected();
if(checkbox==true)
	driver.findElement(By.xpath("//input[@id='chkSelectDateOnly']")).click();
	
driver.findElement(By.id("txtStationFrom")).clear();
driver.findElement(By.id("txtStationFrom")).sendKeys("NZM");
driver.findElement(By.id("txtStationTo")).clear();
driver.findElement(By.id("txtStationTo")).sendKeys("MMCT");

List<WebElement> trains = driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader']//td[1]"));
System.out.println("the number of trains are:"+trains.size());
for(WebElement train:trains)
	System.out.println("the list is:"+train.getText());

List<String> NameOfTrain=new ArrayList<String>();
for(WebElement ListOfTrain:trains)
{
	String name=ListOfTrain.getText();
	NameOfTrain.add(name);
}
Collections.sort(NameOfTrain);
System.out.println("Sorted Train Name  :");
for(String ListOfTrain:NameOfTrain)
{
	System.out.println(ListOfTrain);
}
	}

}
