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

WebUI.setText(findTestObject('Object Repository/HC DICTIONARY/input_Email_username'), 'SYAHRIDA.SYAHRUL@MODENA.COM')

WebUI.setEncryptedText(findTestObject('Object Repository/HC DICTIONARY/input_Password_password'), 'iFGeFYmXIrUhQZHvW7P22w==')

WebUI.click(findTestObject('Object Repository/HC DICTIONARY/button_Sign in'))

WebUI.click(findTestObject('Object Repository/HC DICTIONARY/div_Master'))

WebUI.click(findTestObject('Object Repository/HC DICTIONARY/div_Master Performance Dictionary'))

WebUI.click(findTestObject('Object Repository/HC DICTIONARY/button_New Performance Dictionary'))

WebUI.setText(findTestObject('HC DICTIONARY/input__kpi_name', [('performancename') : '', ('definition') : '', ('formula') : '']), 
    'BOD 1')

WebUI.setText(findTestObject('Object Repository/HC DICTIONARY/textarea_1'), '1')

WebUI.setText(findTestObject('Object Repository/HC DICTIONARY/textarea_1_1'), '1')

WebUI.selectOptionByValue(findTestObject('Object Repository/HC DICTIONARY/select_Select CategoryMandatoryGeneral'), 'Mandatory', 
    true)

WebUI.click(findTestObject('Object Repository/HC DICTIONARY/button_Save'))

WebUI.closeBrowser()

