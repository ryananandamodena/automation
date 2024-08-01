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

WebUI.navigateToUrl('https://hc-portal-dev.modena.com/login')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/HC PORTAL - HASTRI/input_Email_username'), 'hastri.danahiswari@modena.com')

WebUI.setEncryptedText(findTestObject('Object Repository/HC PORTAL - HASTRI/input_Password_password'), 'iFGeFYmXIrUhQZHvW7P22w==')

WebUI.click(findTestObject('Object Repository/HC PORTAL - HASTRI/button_Sign in'))

WebUI.click(findTestObject('Object Repository/HC PORTAL - HASTRI/div_Master'))

WebUI.click(findTestObject('Object Repository/HC PORTAL - HASTRI/div_Master Performance Template'))

WebUI.click(findTestObject('Object Repository/HC PORTAL - HASTRI/button_New Performance Template'))

WebUI.selectOptionByValue(findTestObject('Object Repository/HC PORTAL - HASTRI/select_Select Perfomance Year202320242025'), 
    '2025', true)

WebUI.selectOptionByValue(findTestObject('HC PORTAL - HASTRI/select_Select Position Level(0) Board of Director(1) Executive Vice President(2) Vice President(3) Senior Manager(4) Manager(5) Lead(6) Officer(7) Internship'), 
    '(1) Executive Vice President', false)

WebUI.setText(findTestObject('Object Repository/HC PORTAL - HASTRI/input__template_name'), 'EVP KPI 2025')

WebUI.click(findTestObject('Object Repository/HC PORTAL - HASTRI/button_Performance Section_rounded-full bg-_8c1e74'))

WebUI.verifyMatch('', '', false)

WebUI.closeBrowser()

