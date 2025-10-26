package com.demoqa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import org.openqa.selenium.*;


public class BasePage {

    public WebDriver driver;

    // Конструктор
    public BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Обычный клик
    public void click(WebElement element) {
        element.click();
    }

    // Ввод текста
    public void type(WebElement element, String text) {
        if (text != null) {
            click(element);
            element.clear();
            element.sendKeys(text);
        }
    }

    // Проверка текста с ожиданием
    public boolean shouldHaveText(WebElement element, String text, int time) {
        return new WebDriverWait(driver, Duration.ofSeconds(time))
                .until(ExpectedConditions.textToBePresentInElement(element, text));
    }

    // Клик через JS (если элемент не кликабелен обычным click)
    public void clickWithJS(WebElement element) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
    }

    // Прокрутка окна через JS
    public void scrollBy(int x, int y) {
        ((JavascriptExecutor) driver).executeScript("window.scrollBy(arguments[0], arguments[1]);", x, y);
    }

    // Скрытие рекламы
    public void hideAd() {
        ((JavascriptExecutor) driver).executeScript(
                "let ad = document.getElementById('adplus-anchor'); if(ad) ad.style.display='none';"
        );
    }

    // Скрытие футера
    public void hideFooter() {
        ((JavascriptExecutor) driver).executeScript(
                "let footer = document.querySelector('footer'); if(footer) footer.style.display='none';"
        );
    }

    // Скрытие всего лишнего на странице
    public void hideiFrames() {
        hideAd();
        hideFooter();
    }
    public void pause(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public boolean isElementDisplayed(WebElement element) {
        try{
            element.isDisplayed();
            return true;
        }catch (NoSuchElementException e){
            e.getMessage();
            return false;
        }
    }
}