package com.prj.catlog;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import baseClass.TestBase;

public class Categories extends TestBase{
	@Test
	public void categories() throws InterruptedException
	{	
		WebElement popUp = driver.findElement(By.xpath("//body/div[@id='elementor-popup-modal-10540']/div[1]/div[4]/i[1]"));
		popUp.click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//header/div[1]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[7]/a[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"masthead\"]/div/div/div/div/nav/ul/li[7]/ul/li[5]/a")).click();
		Thread.sleep(5000);
		WebElement loginButton =driver.findElement(By.xpath("//i[@class='fa fa-key']"));
		loginButton.click();
		Thread.sleep(3000);
		WebElement dashBoard = driver.findElement(By.xpath("//li[@id='menu-dashboard']//a[contains(text(),'Dashboard')]"));
		dashBoard.click();
		driver.findElement(By.xpath("//body/div[@id='container']/nav[@id='column-left']/ul[@id='menu']/li[@id='menu-catalog']/a[1]")).click();
		Thread.sleep(3000);
		WebElement categories=driver.findElement(By.xpath("//*[@id=\"collapse1\"]/li[1]/a"));
		categories.click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.navigate().back();
		WebElement product = driver.findElement(By.xpath("//*[@id=\"collapse1\"]/li[2]/a"));
		product.click();
		WebElement recuuringProfiles = driver.findElement(By.xpath("//*[@id=\"collapse1\"]/li[3]/a"));
		recuuringProfiles.click();
		Thread.sleep(3000);
		WebElement filter=driver.findElement(By.xpath("//*[@id=\"collapse1\"]/li[4]/a"));
		filter.click();
		driver.findElement(By.xpath("//*[@id=\"collapse1\"]/li[5]/a")).click();
		WebElement attributes = driver.findElement(By.xpath("//*[@id=\"collapse5\"]/li[1]/a"));
		attributes.click();
		driver.findElement(By.xpath("//li[@class='active']//a[contains(text(),'Attribute Groups')]")).click();
		Thread.sleep(3000);
		WebElement options =driver.findElement(By.xpath("//a[normalize-space()='Options']"));
		options.click();
		driver.findElement(By.xpath("//li[@class='active']//a[contains(text(),'Manufacturers')]")).click();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		WebElement downloads = driver.findElement(By.xpath("//*[@id=\"collapse1\"]/li[8]/a"));
		downloads.click();
		Thread.sleep(5000);
		WebElement review =driver.findElement(By.xpath("//*[@id=\"collapse1\"]/li[9]/a"));
		review.click();
		driver.findElement(By.xpath("//*[@id=\"collapse1\"]/li[10]/a")).click();
		Thread.sleep(5000);
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);






	}

}


