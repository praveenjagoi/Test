package org.test;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.*;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
 
public class A {
public static void main(String[] args) throws Throwable {
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\IT\\eclipse-workspace\\Test\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.navigate().to(" https://www.techlistic.com/p/demo-selenium-practice.html");
    driver.manage().window().maximize();
  

 List<WebElement> iTable = driver.findElements(By.tagName("table"));
 for (int i = iTable.size()-1 ; i < iTable.size(); i++) {
		WebElement table = iTable.get(i);
		WebElement TBODY = table.findElement(By.tagName("tfoot"));
	    List<WebElement> iROW = TBODY.findElements(By.tagName("tr"));
 for (int j = 0; j < iROW.size(); j++) {
		WebElement row =iROW.get(j);
		List<WebElement> iData = row.findElements(By.tagName("td"));
 for (int k = 0; k < iData.size(); k++) {
		WebElement data = iData.get(k);
		String text = data.getText();
		System.out.println(text);
		

 }
 }}
}} 
  