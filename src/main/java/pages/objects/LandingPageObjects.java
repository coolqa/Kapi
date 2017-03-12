package pages.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LandingPageObjects {

    @FindBy(how = How.XPATH, using = ".//*[@id='search_form_input_homepage']")
    public WebElement textBox;

    @FindBy(how = How.XPATH, using = ".//*[@id='search_button_homepage']")
    public WebElement searchButton;
}
