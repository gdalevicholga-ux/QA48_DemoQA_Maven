package com.demoqa.pages;

import com.demoqa.pages.alertsFrameWindows.AlertsPage;
import com.demoqa.pages.alertsFrameWindows.BrowserWindows;
import com.demoqa.pages.alertsFrameWindows.FramePage;
import com.demoqa.pages.bookStore.LoginPage;
import com.demoqa.pages.elements.ButtonsPage;
import com.demoqa.pages.interactions.DroppablePage;
import com.demoqa.pages.widgets.MenuPage;
import com.demoqa.pages.widgets.SelectMenuPage;
import com.demoqa.pages.widgets.SliderPage;
import com.demoqa.pages.widgets.ToolTipsPage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SidePanel extends BasePage {
    public SidePanel(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//span[.=\"Login\"]")
    WebElement login;

    public LoginPage selectLogin() {
        click(login);
        return new LoginPage(driver);
    }

    @FindBy(xpath = "//span[.='Alerts']")
    WebElement alerts;

    public AlertsPage selectAlerts() {
        click(alerts);
        return new AlertsPage(driver);
    }

    @FindBy(xpath = "//span[.='Frames']")
    WebElement frames;

    public FramePage selectFrame() {
        click(frames);
        return new FramePage(driver);
    }

    @FindBy(xpath = "//span[.='Nested Frames']")
    WebElement nestedFrames;

    public FramePage selectNestedFrames() {
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", nestedFrames);
        return new FramePage(driver);
    }

    @FindBy(xpath = "//span[.='Browser Windows']")
    WebElement browserWindows;

    public BrowserWindows selectBrowserWindows() {
        click(browserWindows);
        return new BrowserWindows(driver);
    }

    @FindBy(xpath = "//span[.='Select Menu']")
    WebElement menu;

    public SelectMenuPage getSelectMenu() {
        clickWithJS(menu);
        return new SelectMenuPage(driver);
    }
    @FindBy(xpath = "//span[.='Menu']")
    WebElement menu2;
    public MenuPage getMenu() {
        clickWithJS(menu2);
        return new MenuPage(driver);
    }
    @FindBy(xpath = "//span[.='Slider']")
    WebElement slider;
    public SliderPage selectSlider() {
        clickWithJS(slider);
        return new SliderPage(driver);
    }
    @FindBy(xpath = "//span[.='Droppable']")
    WebElement droppable;
    public DroppablePage selectDroppable() {
        clickWithJS(droppable);
        return new DroppablePage(driver);
    }
    @FindBy(xpath = "//span[.='Tool Tips']")
    WebElement toolTips;
    public ToolTipsPage selectToolTips() {
        clickWithJS(toolTips);
        return new ToolTipsPage(driver);
    }
    @FindBy(xpath = "//span[.='Buttons']")
    WebElement buttons;
    public ButtonsPage selectButtons() {
        clickWithJS(buttons);
        return new ButtonsPage(driver);
    }
}
