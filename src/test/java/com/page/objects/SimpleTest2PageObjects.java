package com.page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
public class SimpleTest2PageObjects {
	
	@FindBy(how = How.XPATH, using = "//*[@id='search_form_input_homepage']")
	public WebElement clickSearchField;
	
	@FindBy(how = How.XPATH, using = "//*[@id='search_form_input_homepage']")
	public WebElement clickSearchFieldSendKeys;
	
	@FindBy(how = How.XPATH, using = "//*[@id='search_button_homepage']")
	public WebElement clickSearchFieldButton;
	
	@FindBy(how = How.XPATH, using = "//*[@id='r1-0']/div/h2/a[1]/b")
	public WebElement clickWikipediaResultLink;
	
	@FindBy(how = How.XPATH, using = "//*[@id='www-wikipedia-org']/div[2]/form/fieldset/input[3]")
	public WebElement clickFinalLink;
	
	 public void clickSearchField() {
		 clickSearchField.click();
		 }
	 public void clickSearchFieldSendKeys(String clickSearchFieldSendKeys) {
		 clickSearchField.sendKeys(clickSearchFieldSendKeys);
		 }
	 public void clickSearchFieldButton() {
		 clickSearchFieldButton.click();
		 }
	 public void clickWikipediaResultLink() {
		 clickWikipediaResultLink.click();
		 }
	 public void clickFinalLink() {
		 clickFinalLink.click();
		 }
}
