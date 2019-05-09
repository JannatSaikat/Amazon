package RegressionSuite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import regression.HomePage;

import java.util.PriorityQueue;

public class TestHomePage extends HomePage {

    @Test (priority = 1)
    public void user1() {
        signIn("sohan", "password1");
    }

    @Test (priority = 2)
    public void user2() {
        signIn("daljeet","password 2");
    }


    public void user3() { signIn("jannat","password 3");
    }

}
