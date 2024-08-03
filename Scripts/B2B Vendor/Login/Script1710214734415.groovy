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

WebUI.navigateToUrl('https://b2b-dev.modena.com/')

WebUI.delay(2)

WebUI.setText(findTestObject('B2B/Brand/Page_B2B Portal/Username'), Username)

WebUI.selectOptionByValue(findTestObject('Object Repository/B2B Vendor/Login/Page_B2B Portal/select_-- Choose Your Company --Client Name 1'), 
    '1', true)

WebUI.setText(findTestObject('Object Repository/B2B Vendor/Login/Page_B2B Portal/input_Password_password_1'), Password)

not_run: WebUI.setText(findTestObject('Object Repository/B2B Vendor/Page_B2B Portal/input_Email Account_username'), Username)

not_run: WebUI.selectOptionByValue(findTestObject('Object Repository/B2B Vendor/Page_B2B Portal/select_-- Choose Your Company --Client Name 1'), 
    '1', true)

not_run: WebUI.setText(findTestObject('Object Repository/B2B Vendor/Page_B2B Portal/input_Password_password_1'), Password)

WebUI.click(findTestObject('Object Repository/B2B Vendor/Page_B2B Portal/span_Login'))

WebUI.verifyElementText(findTestObject('Object Repository/B2B Vendor/Page_B2B Portal/h2_Succes'), 'Succes!')

