package org.example;

//import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Mainmethod extends Browserlaunch {
    @Test
    public void SearchTheProduct() throws InterruptedException {
        WebElement Search =  driver.findElement(By.cssSelector("input[id='inputValEnter']"));
        Search.sendKeys("Mobiles under 10000");
        driver.findElement(By.cssSelector("button[class='searchformButton col-xs-4 rippleGrey']")).click();
    }
    }
