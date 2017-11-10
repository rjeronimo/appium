package com.belatrix.connect.framework;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import io.appium.java_client.TouchAction;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public abstract class DSL {

    private AppiumDriver driver;

    public DSL(AppiumDriver driver) {
        this.driver = driver;
    }

    /**
     * This method is use for send some text to Element
     * @param locator
     * @param textToSend
     */
    public void sendKeys(By locator, String textToSend){
        driver.findElement(locator).sendKeys(textToSend);
    }

    /**
    * This a method returns the text value of some Element
    * @param locator
    */
    public String getElementValue(By locator){
       return driver.findElement(locator).getText();
   }
   
    /**
     * This method is use for clear some placeholder text and sent keys to Element
     * @param locator
     * @param textToSend
     */
    public void hideTextSendKeys(By locator, String textToSend){
        AndroidElement editElement = (AndroidElement) driver.findElement(locator);
        editElement.setValue(textToSend);
    }

    /**
     * This method is used for send click to Element
     * @param locator
     */
    public void click(By locator){
        driver.findElement(locator).click();
    }

    /**
     * This a method to wait for an Element
     * @param locator
     */
    public void handlingWaitToElement(By locator){
        final WebDriverWait wait = new WebDriverWait(driver, 60);
        wait.until(ExpectedConditions.presenceOfElementLocated(locator));
    }

    /**
     * This a method clear the Text value of any Component
     * @param locator
     **/
    public void clearTextValue(By locator)
    {
        driver.findElement(locator).clear();
    }

    /**
     * This a method to perform an Swipe the principal top bar in SmartPhone
     **/
    // quitar con versiones menores a 7 en el Open App step esta
    public void refreshWithSwipeTopBar()
    {
        TouchAction action = new TouchAction((AppiumDriver) driver);
        driver.getPageSource();
       
        action.longPress(540,30).moveTo(540,1500).release().perform();
        driver.navigate().back();
        action.longPress(540,30).moveTo(540,1500).release().perform();
        // EL BACK de atras de la parte de abajo del ios
        driver.navigate().back();
        driver.getPageSource();
    }

    /**
     * This a method wait for a component with any Variable Text
     * this method is only for locator type xpath
     * @param locator
     * @param textValue
     **/
    public void handlingWaitsToNewElementByText(By locator, String textValue)
    {
        WebDriverWait wait = new WebDriverWait(driver, 60);
        By newLocator = By.xpath(locator.toString().replaceAll("(By.xpath: )|(\\[@text.*?\\])", "")
                + "[@text='"+textValue+"']");
        wait.until(ExpectedConditions.presenceOfElementLocated(newLocator));
    }
    
    /**
     * This a method for do a click on one element with a specific text
     * this method contain a handling wait by new element
     * this method is only for locator type xpath
     * @param  locator
     * @param  textValue
     **/
    public void clickElementByTextValue(By locator, String textValue)
    {
        By newLocator = By.xpath(locator.toString().replaceAll("(By.xpath: )|(\\[@text.*?\\])", "")
                + "[@text='"+textValue+"']");
        handlingWaitToElement(newLocator);
        click(newLocator);
    }
    
    /**
     * This a method for click on Android back button
     **/
    public void clickAndroidBackButton(){
        driver.navigate().back();
    }

    // mioOoOoOoOos :) 
    
    public void getElementOnPage(String name) { 
    	 driver.findElements(By.partialLinkText(name));
    }
    
    public void selectTextViewByText(String name) {
    	 driver.findElement(By.xpath("//android.widget.TextView[@text='"+name+"']")).click();
    }
    
    public void selectClassByIndex(String className, int index) {
    	AndroidElement editElement = (AndroidElement) driver.findElements(By.className(className)).get(index);
        editElement.click();
    }
    
    public boolean isElementPresent(String locator) {
    	return driver.findElement(By.id(locator)).isDisplayed();
    }

    public boolean isElementPresentByText(String name) {
    	return driver.findElement(By.xpath("//android.widget.TextView[@text='"+name+"']")).isDisplayed();
    }
}


