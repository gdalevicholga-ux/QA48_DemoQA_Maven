package com.demoqa.tests;

import com.demoqa.pages.HomePage;
import com.demoqa.pages.SidePanel;
import com.demoqa.pages.alertsFrameWindows.FramePage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class iFrameTests extends TestBase{
    @BeforeMethod
    public void preCondition(){
        new HomePage(driver).getAlertsFrameWindows();
    }
    @Test
    public void iFrameTest(){
        new SidePanel(driver).selectFrame();
        new FramePage(driver).returnListOfFrames()
                .switchToiFrameByIndex(1)
                .verifyiFrameByText("This is a sample page");
    }
    @Test
    public void iFrameTest2(){
        new SidePanel(driver).selectFrame();
        new FramePage(driver).switchToiFrameByID()
                .verifyiFrameByText("sample page")
                .switchToMainPage()
                .verifyMainPageByTitle("Frames");
    }
    @Test
    public void nestediFramesTest(){
        new SidePanel(driver).selectNestedFrames();
        new FramePage(driver).handleNestledFrames();
    }
}