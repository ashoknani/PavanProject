package com.prj.extension;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import baseClass.TestBase;

public class Marketplace extends TestBase {
	@Test
	public void marketplace() throws InterruptedException {
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
		driver.findElement(By.xpath("//*[@id=\"menu-extension\"]/a")).click();
		WebElement marketPlace = driver.findElement(By.xpath("//*[@id=\"collapse14\"]/li[1]/a"));
		marketPlace.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"collapse14\"]/li[2]/a")).click();
		WebElement extension = driver.findElement(By.xpath("//*[@id=\"collapse14\"]/li[3]/a"));
		extension.click();
		driver.findElement(By.xpath("//*[@id=\"collapse14\"]/li[4]/a")).click();
		WebElement events =driver.findElement(By.xpath("//*[@id=\"collapse14\"]/li[5]/a"));
		events.click();
		Thread.sleep(5000);
	}

}
