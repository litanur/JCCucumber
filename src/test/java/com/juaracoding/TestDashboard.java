package com.juaracoding;

import com.juaracoding.pages.DashboardPage;
import com.juaracoding.pages.LoginPage;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class TestDashboard {

    static WebDriver driver;
    static ExtentTest extentTest;
    static LoginPage loginPage = new LoginPage();
    static DashboardPage dashboardPage = new DashboardPage();

    public TestDashboard(){
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    @When("User click menu dashboard")
    public void user_click_menu_dashboard(){
        loginPage.login("Admin","admin123");
        dashboardPage.clickBtnMenuDashboard();
        extentTest.log(LogStatus.PASS,"User click menu dashboard");
    }
}
