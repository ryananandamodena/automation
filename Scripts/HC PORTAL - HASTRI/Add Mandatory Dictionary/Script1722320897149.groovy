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

WebUI.setText(findTestObject('Object Repository/HC PORTAL - HASTRI/Mandatory Dictionary/input_Email_username'), 'syahrida.syahrul@modena.com')

WebUI.setEncryptedText(findTestObject('Object Repository/HC PORTAL - HASTRI/Mandatory Dictionary/input_Password_password'), 
    'iFGeFYmXIrUhQZHvW7P22w==')

WebUI.click(findTestObject('Object Repository/HC PORTAL - HASTRI/Mandatory Dictionary/button_Sign in'))

WebUI.click(findTestObject('Object Repository/HC PORTAL - HASTRI/Mandatory Dictionary/div_Master'))

WebUI.click(findTestObject('Object Repository/HC PORTAL - HASTRI/Mandatory Dictionary/div_Master Performance Dictionary'))

WebUI.click(findTestObject('Object Repository/HC PORTAL - HASTRI/Mandatory Dictionary/button_New Performance Dictionary'))

WebUI.setText(findTestObject('Object Repository/HC PORTAL - HASTRI/Mandatory Dictionary/input__kpi_name'), 'QA Tester 1')

WebUI.setText(findTestObject('Object Repository/HC PORTAL - HASTRI/Mandatory Dictionary/textarea_100 x capaiantarget'), 
    '100% x capaian/target')

WebUI.setText(findTestObject('Object Repository/HC PORTAL - HASTRI/Mandatory Dictionary/textarea_100 x capaiantarget_1'), 
    '100% x capaian/target')

WebUI.click(findTestObject('Object Repository/HC PORTAL - HASTRI/Mandatory Dictionary/div_Formula100 x capaiantarget'))

WebUI.setText(findTestObject('Object Repository/HC PORTAL - HASTRI/Mandatory Dictionary/textarea_capaiantarget x 100_1'), 
    'capaian/target x 100%')

WebUI.selectOptionByValue(findTestObject('Object Repository/HC PORTAL - HASTRI/Mandatory Dictionary/select_Select CategoryMandatoryGeneral'), 
    'Mandatory', true)

WebUI.click(findTestObject('Object Repository/HC PORTAL - HASTRI/Mandatory Dictionary/button_Save'))

WebUI.verifyMatch('', '', false)

WebUI.closeBrowser()

