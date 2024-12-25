package test_home_page;

import Base.Base;
import home_page.HomePage;
import org.testng.annotations.Test;

public class TestHomePage extends Base {



    @Test
    public void testHomePage(){

        HomePage homePage= new HomePage();
        homePage.clickButtonNews();

    }
}
