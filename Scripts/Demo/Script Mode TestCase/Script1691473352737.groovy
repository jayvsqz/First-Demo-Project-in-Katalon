import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.webui.keyword.internal.WebUIAbstractKeyword
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://twitter.com/')

WebUI.click(findTestObject('Twitter/btn_signin'))
/*WebUI.waitForPageLoad(100)
WebUI.waitForElementVisible(findTestObject('Object Repository/Twitter/input_username'), 100)*/
WebUI.setText(findTestObject('Object Repository/Twitter/input_username'), 'lowelljayvasquez11@gmail.com')
WebUI.click(findTestObject('Object Repository/Twitter/btn_Next'))
WebUI.setText(findTestObject('Object Repository/Twitter/input_username2nd'), 'jayyvsqz')
WebUI.click(findTestObject('Object Repository/Twitter/btn_Next2nd'))
WebUI.setEncryptedText(findTestObject('Object Repository/Twitter/input_Password'), 'E9OuqOhxBlzzE53PPoH0FA==')
WebUI.click(findTestObject('Object Repository/Twitter/btn_Log in'))
WebUI.verifyTextPresent('Home', false)
WebUI.closeBrowser()

	


