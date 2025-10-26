package com.demoqa.tests;
import org.openqa.selenium.WebDriver;
import com.demoqa.pages.HomePage;
import com.demoqa.pages.SidePanel;
import com.demoqa.pages.widgets.MenuPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MenuTest extends TestBase {
    @BeforeMethod
    public void preCondition(){
        new HomePage(driver).getWidgets();
        new SidePanel(driver).getMenu().hideiFrames();
    }
    @Test
    public void moveToMenuTest(){
        new MenuPage(driver).selectSubMenu().verifySubMenu();

    }
}