package regression;

import base.CommonAPI;
import org.openqa.selenium.By;

public class HomePage extends CommonAPI {
    public void clickAccount(String URL) {
        //click on account
        System.out.println(driver.getCurrentUrl());
    }

    public void clickSignIn(){
        driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]")).click();
    }

    public void writeUsername(String userName) {
        driver.findElement(By.xpath("//*[@id=\"ap_email\"]")).sendKeys(userName);
        //user
        //parameterize
    }


    public void writePass(String pass) {
        driver.findElement(By.xpath("//*[@id=\"ap_password\"]")).sendKeys(pass);
        //pass
        //parameterize
    }
    public void submit(){
        driver.findElement(By.xpath("//*[@id=\"signInSubmit\"]")).click();
    }

    public void signIn(String userName, String password){
        clickAccount("https://amazon.com");
        driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"ap_email\"]")).sendKeys(userName);
        driver.findElement(By.xpath("//*[@id=\"ap_password\"]")).sendKeys(password);
        driver.findElement(By.xpath("//*[@id=\"signInSubmit\"]")).click();
    }
}
