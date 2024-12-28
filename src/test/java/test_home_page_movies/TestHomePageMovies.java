package test_home_page_movies;

import Base.Base;
import home_page_movies.HomePageMovies;
import org.testng.Assert;
import org.testng.annotations.Test;

public class
TestHomePageMovies extends Base {
    @Test
    public void testMovies(){
        HomePageMovies homePageMovies = new HomePageMovies();
        homePageMovies.clickButtonMovies();

        Assert.assertTrue(homePageMovies.text.isDisplayed());
    }

}
