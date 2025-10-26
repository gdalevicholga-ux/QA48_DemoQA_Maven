package com.demoqa.pages.interactions;

import com.demoqa.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class DroppablePage extends BasePage {
    public DroppablePage(WebDriver driver) {
        super(driver);
    }
    @FindBy(id ="draggable")
    WebElement dragMe;
    @FindBy(id = "droppable")
    WebElement dropHere;
    public DroppablePage actionDragMe() {
        pause(1000);
        new Actions(driver).dragAndDrop(dragMe, dropHere).perform();
        return this;

    }

    public DroppablePage verifyDropped(String text) {
        Assert.assertTrue(shouldHaveText(dropHere,text,5));
        return this;
    }

    public DroppablePage dragAndDropBy(int x, int y) {
        pause(1000);
        //get elements dragme
        int xOffSet1= dragMe.getLocation().getX();
        int yOffSet1= dragMe.getLocation().getY();
        System.out.println("xOffSet: " + xOffSet1 + " yOffSet: " + yOffSet1);
        //get coordinate dropHere and print
        int  xOffSet= dropHere.getLocation().getX();
        int yOffSet= dropHere.getLocation().getY();
        System.out.println("xOffSet: " + xOffSet + " yOffSet: " + yOffSet);
        //find the difference xOffSet and yOffSet
        xOffSet=(xOffSet-xOffSet1)+x;
        yOffSet=(yOffSet-yOffSet1)+y;
        new Actions(driver).dragAndDropBy(dragMe,xOffSet,yOffSet).perform();

        return this;
    }
}