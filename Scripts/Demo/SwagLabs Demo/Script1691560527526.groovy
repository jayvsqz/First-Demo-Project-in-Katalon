import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import javax.servlet.http.WebConnection as WebConnection
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

WebUI.navigateToUrl(GlobalVariable.URL)

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/SwagLabs/input_Swag Labs_user-name'), GlobalVariable.Username)

WebUI.setEncryptedText(findTestObject('Object Repository/SwagLabs/input_Swag Labs_password'), GlobalVariable.Password)

WebUI.click(findTestObject('Object Repository/SwagLabs/input_Swag Labs_login-button'))

WebUI.verifyElementPresent(findTestObject('Object Repository/SwagLabs/div_Swag Labs'), 0)

WebUI.click(findTestObject('Object Repository/SwagLabs/button_Add to cart'))

WebUI.click(findTestObject('Object Repository/SwagLabs/button_Add to cart_1'))

WebUI.click(findTestObject('Object Repository/SwagLabs/button_Add to cart_1_2'))

WebUI.click(findTestObject('Object Repository/SwagLabs/button_Add to cart_1_2_3'))

WebUI.click(findTestObject('Object Repository/SwagLabs/button_Add to cart_1_2_3_4'))

WebUI.click(findTestObject('Object Repository/SwagLabs/button_Add to cart_1_2_3_4_5'))

WebUI.click(findTestObject('Object Repository/SwagLabs/a_6'))

WebUI.click(findTestObject('Object Repository/SwagLabs/button_Checkout'))

WebUI.setText(findTestObject('Object Repository/SwagLabs/input_Checkout Your Information_firstName'), 'LOWELL JAY')

WebUI.setText(findTestObject('Object Repository/SwagLabs/input_Checkout Your Information_lastName'), 'VASQUEZ')

WebUI.setText(findTestObject('Object Repository/SwagLabs/input_Checkout Your Information_postalCode'), '1218')

WebUI.click(findTestObject('Object Repository/SwagLabs/input_Cancel_continue'))

WebUI.click(findTestObject('Object Repository/SwagLabs/button_Finish'))

WebUI.click(findTestObject('Object Repository/SwagLabs/div_Thank you for your orderYour order has _f1f997'))

not_run: WebUI.scrollToElement(findTestObject('Object Repository/SwagLabs/button_Add to cart_1_2_3'), 0)

//code for taking a screenshot and saving it on a respective file starts here
def timestamp = new Date().format('YYYY-MM-dd HH:mm:ss') // defining the timestamp in a specific format

//converting timestamp to string and stores it on variable
def fileName = timestamp.toString().replace(' ', '-').replace(':', '-')
def storageName = timestamp.toString().replace(' ', '-').replace(':', '-')

//defining the path 
def FilePath = 'C:\\Users\\lvasquez\\Katalon Studio\\Testing\\Test Evidence\\' + storageName

//code for taking a screenshot and saving it to the path
WebUI.takeFullPageScreenshot(FilePath + '\\' + fileName + '.png')

//code for copying a web text and saving it to a variable
String text = WebUI.getText(findTestObject('Object Repository/SwagLabs/h2_Thank you for your order'))
String text1 = WebUI.getText(findTestObject('Object Repository/SwagLabs/div_Your order has been dispatched, and will arrive just as fast as the pony can get there'))

//code for creating a .txt file and saving it on the filepath
File myfile = new File(FilePath + '\\' + fileName + '.txt')

//code for writing in the .txt file
myfile.write(text + '\n' + text1)

WebUI.closeBrowser()

