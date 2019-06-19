package testsignInPage;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import signInPage.VerfyingLogInPage;

import java.util.ArrayList;
import java.util.List;

public class TestVerifyingClass extends CommonAPI {
    VerfyingLogInPage verfyingLogInPage;
    String homeURL = "https://www.facebook.com";
    @BeforeClass
    public void initializing(){
        driver.get(homeURL);
        verfyingLogInPage = PageFactory.initElements(driver,VerfyingLogInPage.class);
    }

    @AfterMethod
    public void cleanTest() {
        driver.navigate().to(homeURL);
    }

    @Test(enabled = false)
    public void testInputEmail(){
        verfyingLogInPage.putInEmail("sarah.marium@gmail.com");
        driver.navigate().back();
    }
    @Test(enabled = false)
    public void testInputPassword(){
        verfyingLogInPage.putInpass("1234");
    }

    @Test(enabled = false)
    public void inputFirstName(){
        verfyingLogInPage.typeOnInputFirstName("Sarah");
    }

    @Test(enabled = false)
    public void variFyday(){
        List<String> text = new ArrayList<String>();

        text =  verfyingLogInPage.getTextFromWebElements("day");
        System.out.println(text);
    }
    @Test(enabled = false)
    public void variFymonth(){
        List<String> text;
       // text=  CommonAPI.getTextFromWebElements("month");
        //System.out.println(text);

    }
    @Test(enabled = false)
    public void testDayDOB(){
        verfyingLogInPage.dayfromDOB();
    }

    @Test(enabled = false)
    public void testSurName(){
        verfyingLogInPage.setSurnameInput("Sarah Marium");
    }
    @Test(enabled = false)
    public void testEmailSignUpInput(){
        verfyingLogInPage.setEmailSignUpInput("sarah1.marium@gmail.com");
    }
    @Test(enabled = false)
    public void testSignUpPass(){
        verfyingLogInPage.setSignupPass("12345");
    }
    @Test(enabled = false)
    public void testGenderSeletion(){
        verfyingLogInPage.setSelectGender();
    }
    @Test(enabled = false)
    public void testSignUpButton(){
        verfyingLogInPage.setClickSignUp();
    }

    @Test(enabled = false)
    public void test1(){
        driver.findElement(By.id("email")).sendKeys("sarah marium", Keys.ENTER);
    }

    @Test(enabled = false)
    public void testFaceBookLogoIsDisplayed(){
        verfyingLogInPage.setTestFaceBookLogo();
    }

    String  DOB = "9-May-1990";
    String[] arrayDob = DOB.split("-");

    @Test(enabled = false)
    public void selectingMonth(){
        WebElement month = driver.findElement(By.id("month"));
        verfyingLogInPage.setMonthInDropDown(month,arrayDob[1]);
    }
    @Test(enabled = false)
    public void selectingday(){
        WebElement day= driver.findElement(By.id("day"));
        verfyingLogInPage.setMonthInDropDown(day,arrayDob[0]);
    }
    @Test(enabled = false)
    public void selectingyear(){
        WebElement year = driver.findElement(By.id("year"));
        verfyingLogInPage.setMonthInDropDown(year,arrayDob[2]);
    }
}