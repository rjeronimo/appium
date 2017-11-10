package com.belatrix.connect.framework;

import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import com.belatrix.connect.page.ContactsPage;
import com.belatrix.connect.page.EventPage;
import com.belatrix.connect.page.KudoPage;
import com.belatrix.connect.page.LoginPage;
import com.belatrix.connect.page.MainProfilePage;
import com.belatrix.connect.page.MenuPage;
import com.belatrix.connect.page.NewsPage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class ParentScenario {
    private AppiumDriver driver;
    protected static LoginPage loginPage;
    protected static NewsPage newsPage;
    protected static MainProfilePage mainProfilePage;
    protected static ContactsPage contactPage;
    protected static KudoPage  kudoPage;
    protected static MenuPage menuPage;
    protected static EventPage eventPage;
    
    public void startAndroid(){
        String url = "http://localhost:4723/wd/hub";
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "ANDROID");
        //cap.setCapability(MobileCapabilityType.DEVICE_NAME,"LGH99041decf7c");
        //cap.setCapability(MobileCapabilityType.DEVICE_NAME,"47Q6R16919000054");
        cap.setCapability(MobileCapabilityType.DEVICE_NAME,"0123456789ABCDEF");
//        cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "5.1.1");
        cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "5.0");
        cap.setCapability(MobileCapabilityType.APP,"C:\\Users\\rjeronimo\\Downloads\\Android_Instaladores\\Bx Connect_2.0.5.apk");
        cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.belatrixsf.connect");
        cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.belatrixsf.connect.ui.SplashActivity");

        try{
            driver = new AndroidDriver<MobileElement>(new URL(url),cap);
        }catch (Exception e){
            System.out.println("Excepcion al momneto de generar el Driver " + e);
        }

        // instancia nueeevas paginas!!!!! 
        loginPage = new LoginPage(driver);
        newsPage = new NewsPage(driver);
        mainProfilePage = new MainProfilePage(driver);
        contactPage = new ContactsPage(driver);
        kudoPage = new KudoPage(driver);
        menuPage = new MenuPage(driver);
        eventPage = new EventPage(driver);
    }

}
