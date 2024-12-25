package test_home_page_news;

import Base.Base;
import home_page_news.HomePageNews;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestHomePageNewsInterviews extends Base {


    @Test
    public void testInterviews(){
        HomePageNews homePageNews= new HomePageNews();
        homePageNews.clickButtonNews();
        homePageNews.clickButtonInterviews();
        Assert.assertTrue(homePageNews.text.isDisplayed());
    }
}
