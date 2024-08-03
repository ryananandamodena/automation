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

WebUI.navigateToUrl('https://hc-portal-dev.modena.com/login')

WebUI.setText(findTestObject('Object Repository/HC PORTAL - HASTRI/PERFORMANCE ORGANIZATION MAPPING/input_Email_username'), 
    'syahrida.syahrul@modena.com')

WebUI.setEncryptedText(findTestObject('Object Repository/HC PORTAL - HASTRI/PERFORMANCE ORGANIZATION MAPPING/input_Password_password'), 
    'iFGeFYmXIrUhQZHvW7P22w==')

WebUI.click(findTestObject('Object Repository/HC PORTAL - HASTRI/PERFORMANCE ORGANIZATION MAPPING/button_Sign in'))

WebUI.click(findTestObject('Object Repository/HC PORTAL - HASTRI/PERFORMANCE ORGANIZATION MAPPING/div_Master'))

WebUI.click(findTestObject('Object Repository/HC PORTAL - HASTRI/PERFORMANCE ORGANIZATION MAPPING/div_Master Performance Organization Mapping'))

WebUI.click(findTestObject('Object Repository/HC PORTAL - HASTRI/PERFORMANCE ORGANIZATION MAPPING/button_New Performance Organization'))

WebUI.setText(findTestObject('Object Repository/HC PORTAL - HASTRI/PERFORMANCE ORGANIZATION MAPPING/input__block w-full rounded-lg border-0 px-_8c6cdf'), 
    'part')

WebUI.click(findTestObject('Object Repository/HC PORTAL - HASTRI/PERFORMANCE ORGANIZATION MAPPING/div_Parts Management (PMT)'))

WebUI.click(findTestObject('Object Repository/HC PORTAL - HASTRI/PERFORMANCE ORGANIZATION MAPPING/button_Save'))

WebUI.closeBrowser()

