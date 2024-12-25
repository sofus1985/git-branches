package home_page_news;

import Base.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageNews extends Base {


    @FindBy(xpath = "//span//a[text()='NEWS']")
    public WebElement buttonNews;
    @FindBy(xpath = "//ul[@class='navbarul']//a[text()='Interviews']")
    public WebElement buttonInterviews;
    @FindBy(xpath = "//div[@class='section flex maxwrap']//h2[1]//a[2]")
    public WebElement text;


    public HomePageNews(){
        PageFactory.initElements(driver, this);
    }


    public void clickButtonNews(){
        clickOnElement(buttonNews);
    }
    public void clickButtonInterviews(){
        clickOnElement(buttonInterviews);
    }
}
