package idprofileHomePage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.List;

public class IDProfileHomePage {
    @FindBy(id = "email")
    WebElement loginEmail;

    @FindBy(css = "#pass")
    WebElement loginPassword;

    @FindBy(xpath = "//input[@value='Log In']")
    WebElement loginTab;

    @FindBy(xpath = "//span[@class='_1qv9']")
    WebElement profileTab;

    @FindBy(id = "u_fetchstream_1_d")
    WebElement clickOnMore;

    @FindBy(xpath = "//a[text()='About']")
    WebElement clickOnAbout;

    @FindBy(id = "fbCoverImageContainer")
    WebElement idProfileCoverPicture;

    @FindBy(css = "._6-6._6-7")
    WebElement clickOnArchive;

    /*****************************/
    @FindBy(css = "div[class*='fbTimelineNullProfilePicSelector ']")
    WebElement clickOnUploadImage;

    @FindBy(xpath = "//div[@class='_3jk']/input[@id='js_67']")
    WebElement uplodingTag;

    public void setLoginTab(){
        loginTab.click();
    }
    public void setLoginEmail(String logInEmail){
        loginEmail.sendKeys(logInEmail);
    }
    public void setLoginPassword(String password){
        loginPassword.sendKeys(password);
    }
    public void setProfileTab(){
        profileTab.click();
    }



    public void setClickOnAbout(){
        String str = clickOnAbout.getText();
        System.out.println(str);
        clickOnAbout.click();
    }
    public void setIdProfileCoverPicture(){
        boolean bl= idProfileCoverPicture.isDisplayed();
        Assert.assertTrue(bl);

    }
    public void setClickOnArchive(){
        clickOnArchive.click();
    }
    public void testUploadingPicture()throws Exception{
        clickOnUploadImage.click();
        Thread.sleep(3000);
        String str=uplodingTag.getText();
        System.out.println(str);
        uplodingTag.sendKeys("/Users/jewal/poxlm");
    }

}