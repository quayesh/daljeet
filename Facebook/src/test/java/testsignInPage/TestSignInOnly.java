package testsignInPage;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import signInPage.signInOnly;

public class TestSignInOnly extends signInOnly {

    String homeUrl ="https://www.facebook.com/";
    signInOnly signInOnly;

    @BeforeClass
    public void initializing(){
        driver.get(homeUrl);
        signInOnly = PageFactory.initElements(driver,signInOnly.class);
    }
    @AfterMethod
    public void re_init(){
        driver.get(homeUrl);
    }

    @Test(enabled = false)
    public void testLogIn(){

        //TestLogger.log(getClass().getSimpleName() + ": " +
                //convertToString(new Object(){}.getClass().getEnclosingMethod().getName())+"Sign In");
        signInOnly.setLoginEmail("5167491489");
        signInOnly.setLoginPassword("sarah2017");
        signInOnly.setLoginTab();
    }

}