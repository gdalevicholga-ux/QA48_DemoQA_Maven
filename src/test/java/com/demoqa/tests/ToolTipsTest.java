package com.demoqa.tests;

import com.demoqa.pages.HomePage;
import com.demoqa.pages.SidePanel;
import com.demoqa.pages.widgets.ToolTipsPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ToolTipsTest extends TestBase{
    @BeforeMethod
    public void preCondition(){
        new HomePage(driver).getWidgets();
        new SidePanel(driver).selectToolTips().hideiFrames();
    }
    @Test
    public void toolTipsTest(){
        new ToolTipsPage(driver).hoverToolTips().verifyAllTips("buttonToolTip");

    }
}
