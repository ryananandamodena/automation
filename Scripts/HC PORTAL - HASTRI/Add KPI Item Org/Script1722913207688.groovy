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

WebUI.setText(findTestObject('Object Repository/HC PORTAL - HASTRI/Add KPI Item Org/input_Email_username'), 'syahrida.syahrul@modena.com')

WebUI.setEncryptedText(findTestObject('Object Repository/HC PORTAL - HASTRI/Add KPI Item Org/input_Password_password'), 
    'iFGeFYmXIrUhQZHvW7P22w==')

WebUI.click(findTestObject('Object Repository/HC PORTAL - HASTRI/Add KPI Item Org/button_Sign in'))

WebUI.click(findTestObject('Object Repository/HC PORTAL - HASTRI/Add KPI Item Org/div_Performance'))

WebUI.click(findTestObject('Object Repository/HC PORTAL - HASTRI/Add KPI Item Org/div_Organization Performance Plan'))

WebUI.click(findTestObject('Object Repository/HC PORTAL - HASTRI/Add KPI Item Org/button_Organization Performance Plan'))

WebUI.click(findTestObject('Object Repository/HC PORTAL - HASTRI/Add KPI Item Org/p_Performance Plan'))

WebUI.selectOptionByValue(findTestObject('Object Repository/HC PORTAL - HASTRI/Add KPI Item Org/select_Select Performance Year202320242025'), 
    '2023', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/HC PORTAL - HASTRI/Add KPI Item Org/select_Select Performance LevelCorporateDiv_a95fa5'), 
    'Division', true)

WebUI.click(findTestObject('Object Repository/HC PORTAL - HASTRI/Add KPI Item Org/div_Division_css-19bb58m'))

WebUI.click(findTestObject('Object Repository/HC PORTAL - HASTRI/Add KPI Item Org/div_Global Management (GM) (GM)'))

WebUI.click(findTestObject('Object Repository/HC PORTAL - HASTRI/Add KPI Item Org/svg_Divisional Performance_h-3 w-3'))

WebUI.scrollToPosition(0, 0)

WebUI.selectOptionByValue(findTestObject('Object Repository/HC PORTAL - HASTRI/Add KPI Item Org/select_Select Reference KPI ParentSales And_8cee7a'), 
    '1', true)

WebUI.click(findTestObject('Object Repository/HC PORTAL - HASTRI/Add KPI Item Org/button_Save'))

WebUI.click(findTestObject('Object Repository/HC PORTAL - HASTRI/Add KPI Item Org/html_t16y9g8l700-beta13appearancenonebackgr_fde95e'))

WebUI.click(findTestObject('Object Repository/HC PORTAL - HASTRI/Add KPI Item Org/button_Save'))

WebUI.verifyMatch('', '', true)

WebUI.closeBrowser()

