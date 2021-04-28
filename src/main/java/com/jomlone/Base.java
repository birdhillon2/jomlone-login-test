package com.jomlone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://52.60.159.184/login/");
        driver.findElement(By.id("email")).sendKeys("93karanbir@gmail.com");
        driver.findElement(By.id("password-field")).sendKeys("baToshinden1!");
        driver.findElement(By.id("sbBt")).click();
        driver.findElement(By.xpath("//body/section[1]/div[3]/div[1]/div[1]/div[1]/span[1]")).click();

    }

}

