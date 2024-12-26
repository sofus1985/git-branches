package home_page_movies;

import Base.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageMovies extends Base {


    @FindBy(xpath = "//a[text()='MOVIES']")
    public WebElement buttonMovies;
    @FindBy(xpath = "//div[@class='section flex maxwrap']//h2[1]//a[2]")
    public WebElement text;

    public HomePageMovies(){
        PageFactory.initElements(driver,this);
    }



    public void clickButtonMovies(){
        clickOnElement(buttonMovies);
    }

}
