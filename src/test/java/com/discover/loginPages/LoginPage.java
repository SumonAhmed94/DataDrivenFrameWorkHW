package com.discover.loginPages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class LoginPage {
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
			super();
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}
@FindBy(how=How.XPATH, using="//*[@id=\"main-content-rwd\"]/div/div/div[2]/div[1]/div[1]/ul/li[1]/a/div/p") WebElement creditCards;
public void creditcardsMethod() {
	creditCards.click();
}
@FindBy(how=How.XPATH, using="//*[@id=\"siteframe\"]/div/div[1]/div/div[3]/div/div[4]/div/div/div[2]/div[2]/div[3]/div[2]/div/a/span") WebElement applyCards;
public void applycardsMethod() {
	applyCards.click();
}
	@FindBy(how=How.ID, using="zip-code")
	WebElement zipcode;
	public WebElement zipMethod(String enterzipcode) {
		zipcode.sendKeys(enterzipcode);
		return zipcode;
	}

}

	

