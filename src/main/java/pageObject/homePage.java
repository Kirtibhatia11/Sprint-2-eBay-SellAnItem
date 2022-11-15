package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

//-------------------------------------------scenario:1---------------------------------------------------------//

public class homePage {
	
	private static final String String = null;

	@FindBy(xpath = "/html/body/div[6]/div[1]/ul/li[1]/span")
	@CacheLookup
	WebElement btnText1; // homepage

	public WebDriver driver;

	public homePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void clickText() {
		btnText1.click();
	}

	// ----------------------------------------------------
	
	
	
	@FindBy(xpath = "/html/body/header/div/ul[2]/li[2]/a")
	@CacheLookup
	WebElement btn_a1; // selling

	@FindBy(xpath = "/html/body/div[2]/div[2]/main/div[1]/div/section[1]/div/div/a")
	@CacheLookup
	WebElement btn_a; // listAnItem

	// WebElement searchbox=driver.findElement(By.id(""));
//	searchbox.sendKeys("shoes");

	/// html/body/div[2]/div[2]/main/div/div/div[1]/button
	@FindBy(xpath = "/html/body/div[2]/div[2]/main/div/div/div[1]/div/div/div/input")
	@CacheLookup
	WebElement btnText11; // search textbox

	@FindBy(xpath = "/html/body/div[2]/div[2]/main/div/div/div[1]/button")
	@CacheLookup
	WebElement searchButton; // search button

	@FindBy(xpath = "/html/body/div[2]/div[2]/main/div/div/div[2]/button")
	@CacheLookup
	WebElement btnText111; // continue button

	@FindBy(xpath = "/html/body/div[3]/div[2]/main/div/div/div[1]/div[1]/div/div[2]/div[3]/div/div/div[1]/form/div/fieldset/div/div[1]/label")
	@CacheLookup
	WebElement btn_op; // newbtn

	@FindBy(xpath = "/html/body/div[3]/div[2]/main/div/div/div[1]/div[1]/div/div[2]/div[3]/div/div/div[2]/button")
	@CacheLookup
	WebElement listing_btn; // Listing_btn  
	
	@FindBy(xpath = "/html/body/div[4]/main/div[2]/form[1]/div[1]/div/button")
	@CacheLookup
	WebElement continueButton; 

	/*-------------------------------------------------------------*/
	@FindBy(id = "userid")
	@CacheLookup
	WebElement username;

	@FindBy(how = How.ID, using = "pass")
	@CacheLookup
	WebElement password;

	@FindBy(how = How.XPATH, using = "//*[@id=\"sgnBt\"]")
	@CacheLookup
	WebElement submit_button;

	private WebElement txtuser;

	private CharSequence user;

	private CharSequence email;

	public void selling(String uid, String pass) {
		username.sendKeys("kibha9054");
		password.sendKeys("Kirti@2001");
		submit_button.click();
	}

	public void sell() {
		btn_a1.click();
	}

	public void list() {
		btn_a.click();
	}

	public void continueWithoutMatch() {
		btnText111.click();
	}

	public void newWithBox() {
		btn_op.click();
	}

	public void search() {
		btnText11.click();
	}

	public void searchButton() {
		searchButton.click();
	}
	
	public void listingButton() {
		listing_btn.click();
	}

	public void continueButton() {
		// TODO Auto-generated method stub
		continueButton.click();
	}

	
	
	
/*	public void clickSignInLink() {
		// TODO Auto-generated method stub
		signInLink.click();
	}

	public void setUser() {
		// TODO Auto-generated method stub
		txtuser.clear();
	    txtuser.sendKeys(email);

	}

	public void clickContinue() {
		// TODO Auto-generated method stub
		clickContinue.click();
		
	}

	public void setUserPassword(java.lang.String password2) {
		// TODO Auto-generated method stub
		setUserPassword.click();
	}

	public void clickSignIn() {
		// TODO Auto-generated method stub
		clickSignIn.click();
	}

	
	/* * public void clickText() { btnText1.click(); }
	 * 
	 * @FindBy(id="userid")
	 * 
	 * @CacheLookup WebElement username;
	 * 
	 * @FindBy(how=How.ID,using="pass")
	 * 
	 * @CacheLookup WebElement password;
	 * 
	 * @FindBy(how=How.XPATH,using="//*[@id=\"sgnBt\"]")
	 * 
	 * @CacheLookup WebElement submit_button;
	 * 
	 * public void selling(String uid,String pass) { username.sendKeys("");
	 * password.sendKeys(""); submit_button.click(); }
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * public void clickNewOp() { btn_op.click(); }
	 * 
	 * /* public void clickSubmit() { submit_button.click(); }
	 */

}
/*@FindBy(xpath = "/html/body/header/div/ul[1]/li[1]/span/a")
@CacheLookup
WebElement signInLink;

@FindBy(xpath = "/html/body/div[4]/main/div[2]/form[1]/div[1]/div/div/div/input")
@CacheLookup
WebElement setUser;

@FindBy(xpath="/html/body/div[4]/main/div[2]/form[1]/div[1]/div/button")
@CacheLookup
WebElement clickContinue;

@FindBy(xpath="/html/body/div[4]/main/div[2]/form[1]/div[2]/div/div/div/input")
@CacheLookup
WebElement setUserPassword;

@FindBy(xpath="")
@CacheLookup
WebElement clickSignIn ;*/