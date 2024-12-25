package home_page;

import Base.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Base {



    @FindBy(xpath = "//span//a[text()='NEWS']")
   public WebElement buttonNews;


    public HomePage(){
        PageFactory.initElements(driver, this);
    }


    public void clickButtonNews(){
        clickOnElement(buttonNews);
    }





}
