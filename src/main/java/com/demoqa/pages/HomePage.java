package com.demoqa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {
        super(driver);
    }
    @FindBy(css=".card:nth-child(6)")
    WebElement bookstore;

    public SidePanel getBookStore() {
        click(bookstore);
        return new SidePanel(driver);
    }
    @FindBy(css=".card:nth-child(3)")
    WebElement alertsFrameWindows;
    public void getAlertsFrameWindows() {
        click(alertsFrameWindows);
    }
    @FindBy(css=".card:nth-child(4)")
    WebElement widgets;
    public SidePanel getWidgets() {
        click(widgets);
        return new SidePanel(driver);
    }
    @FindBy(css=".card:nth-child(5)")
    WebElement interactions;
    public SidePanel getInteractions() {
        clickWithJS(interactions);
        return new SidePanel(driver);
    }
    @FindBy(css=".card:nth-child(1)")
    WebElement elements;
    public SidePanel getElements() {
        clickWithJS(elements);
        return new SidePanel(driver);
    }
}
