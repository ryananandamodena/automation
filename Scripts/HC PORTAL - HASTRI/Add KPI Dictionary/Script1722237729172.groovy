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

WebUI.setText(findTestObject('Object Repository/HC PORTAL - HASTRI/input_Email_username'), 'hastri.danahiswari@modena.com')

WebUI.setEncryptedText(findTestObject('Object Repository/HC PORTAL - HASTRI/input_Password_password'), 'iFGeFYmXIrUhQZHvW7P22w==')

WebUI.click(findTestObject('Object Repository/HC PORTAL - HASTRI/button_Sign in'))

WebUI.click(findTestObject('Object Repository/HC PORTAL - HASTRI/div_Master'))

WebUI.click(findTestObject('Object Repository/HC PORTAL - HASTRI/div_Master Performance Dictionary'))

WebUI.click(findTestObject('Object Repository/HC PORTAL - HASTRI/button_New Performance Dictionary'))

WebUI.setText(findTestObject('Object Repository/HC PORTAL - HASTRI/input__kpi_name'), 'EVP KPI 2024')

WebUI.setText(findTestObject('Object Repository/HC PORTAL - HASTRI/textarea_B'), 'B')

WebUI.setText(findTestObject('Object Repository/HC PORTAL - HASTRI/textarea_Be'), 'Be')

WebUI.setText(findTestObject('Object Repository/HC PORTAL - HASTRI/textarea_Bec'), 'Bec')

WebUI.setText(findTestObject('Object Repository/HC PORTAL - HASTRI/textarea_Beca'), 'Beca')

WebUI.setText(findTestObject('Object Repository/HC PORTAL - HASTRI/textarea_Becam'), 'Becam')

WebUI.setText(findTestObject('Object Repository/HC PORTAL - HASTRI/textarea_Became'), 'Became')

WebUI.setText(findTestObject('Object Repository/HC PORTAL - HASTRI/textarea_Became_1'), 'Became ')

WebUI.setText(findTestObject('Object Repository/HC PORTAL - HASTRI/textarea_Became T'), 'Became T')

WebUI.setText(findTestObject('Object Repository/HC PORTAL - HASTRI/textarea_Became Te'), 'Became Te')

WebUI.setText(findTestObject('Object Repository/HC PORTAL - HASTRI/textarea_Became Tec'), 'Became Tec')

WebUI.setText(findTestObject('Object Repository/HC PORTAL - HASTRI/textarea_Became Tech'), 'Became Tech')

WebUI.setText(findTestObject('Object Repository/HC PORTAL - HASTRI/textarea_Became Tech_1'), 'Became Tech ')

WebUI.setText(findTestObject('Object Repository/HC PORTAL - HASTRI/textarea_Became Tech S'), 'Became Tech S')

WebUI.setText(findTestObject('Object Repository/HC PORTAL - HASTRI/textarea_Became Tech Sa'), 'Became Tech Sa')

WebUI.setText(findTestObject('Object Repository/HC PORTAL - HASTRI/textarea_Became Tech Sav'), 'Became Tech Sav')

WebUI.setText(findTestObject('Object Repository/HC PORTAL - HASTRI/textarea_Became Tech Savy'), 'Became Tech Savy')

WebUI.setText(findTestObject('Object Repository/HC PORTAL - HASTRI/textarea_(TargetCapaian) x 100'), '(Target/Capaian) x 100%')

WebUI.selectOptionByValue(findTestObject('Object Repository/HC PORTAL - HASTRI/select_Select CategoryMandatoryGeneral'), 
    'Mandatory', true)

WebUI.click(findTestObject('Object Repository/HC PORTAL - HASTRI/button_Save'))

WebUI.closeBrowser()

