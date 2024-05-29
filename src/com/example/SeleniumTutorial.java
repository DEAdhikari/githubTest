package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTutorial {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/lenovo/Downloads/chromedriver-win64");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://blazedemo.com/");
		System.out.println(driver.getTitle());

	}

}
