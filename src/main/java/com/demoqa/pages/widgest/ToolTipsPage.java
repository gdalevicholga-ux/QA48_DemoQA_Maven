package com.demoqa.pages.widgets;

import com.demoqa.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class ToolTipsPage extends BasePage {
    public ToolTipsPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(id="toolTipButton")
    WebElement toolTipButton;
    public ToolTipsPage hoverToolTips() {
        pause(1000);
        new Actions(driver).moveToElement(toolTipButton).perform();
        return this;
    }

    public ToolTipsPage verifyAllTips(String value) {
        pause(1000);
        Assert.assertEquals(toolTipButton.getDomAttribute("aria-describedby"), value);
        return this;
    }
}