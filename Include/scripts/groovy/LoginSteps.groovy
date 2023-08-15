import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When
import internal.GlobalVariable

public class LoginSteps {
	
	@Given("user is on login page")
	public void user_is_on_login_page() {
		
		//Opens the browser
		WebUI.openBrowser('')  
		
		//Maximizes the window
		WebUI.maximizeWindow() 
		
		// Navigates to the URL
		WebUI.navigateToUrl('https://www.saucedemo.com/') 
		
	}
	
	@When("user enters valid set of (.*) and (.*)")
	public void user_enters_valid_set_of_username_and_password(String username, password) {
		
		//Enters the user's username		
		WebUI.setText(findTestObject('Object Repository/SwagLabs/input_Swag Labs_user-name'), username)
		
		//Enters the user's password
		WebUI.setEncryptedText(findTestObject('Object Repository/SwagLabs/input_Swag Labs_password'), password)
	}
	
	@And("clicks on login button")
	public void clicks_on_login_button() {
		
		//Click on the login button
		WebUI.click(findTestObject('Object Repository/SwagLabs/input_Swag Labs_login-button'))
	}
	
	@Then("user is navigated on the homepage")
	public void user_is_navigated_on_the_homepage() {
		
		//Verifies if a homepage element is present
		WebUI.verifyElementPresent(findTestObject('Object Repository/SwagLabs/div_Swag Labs'), 0)
		
		//Closes the browser
		WebUI.closeBrowser()
	}
	
}
