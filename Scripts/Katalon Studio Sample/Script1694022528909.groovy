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
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://sandbox.sg.ebaocloud.com/cas/login?client_id=key&response_type=code&tenant_code=troolifeatom&redirect_uri=https%3A%2F%2Ftroolifeatom-gi-sandbox-sg.insuremo.com%2Fui%2Fadmin%2F')

WebUI.click(findTestObject('Object Repository/Insuremo Sample/input_Welcome to InsureMO_username'))

WebUI.setText(findTestObject('Object Repository/Insuremo Sample/input_Welcome to InsureMO_username'), 'LowellJayVasquez')

WebUI.setEncryptedText(findTestObject('Object Repository/Insuremo Sample/input_Welcome to InsureMO_password'), 'E9OuqOhxBlzzE53PPoH0FA==')

WebUI.click(findTestObject('Object Repository/Insuremo Sample/input_Welcome to InsureMO_submitEbao'))

WebUI.closeBrowser()

