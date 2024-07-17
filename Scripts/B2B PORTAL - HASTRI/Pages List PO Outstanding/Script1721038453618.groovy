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

WebUI.setText(findTestObject('Object Repository/B2B PORTAL - HASTRI/Multiple filter/Page_B2B Portal/input_Email Account_username'), 
    'hastri.danahiswari@modena.com')

WebUI.selectOptionByValue(findTestObject('Object Repository/B2B PORTAL - HASTRI/Multiple filter/Page_B2B Portal/select_-- Choose Your Company --PT Autosave'), 
    '205', true)

WebUI.setEncryptedText(findTestObject('Object Repository/B2B PORTAL - HASTRI/Multiple filter/Page_B2B Portal/input_Password_password'), 
    'iFGeFYmXIrUhQZHvW7P22w==')

WebUI.click(findTestObject('Object Repository/B2B PORTAL - HASTRI/Multiple filter/Page_B2B Portal/button_Login'))

WebUI.click(findTestObject('Object Repository/B2B PORTAL - HASTRI/Multiple filter/Page_B2B Portal/span_keyboard_double_arrow_right'))

WebUI.click(findTestObject('Object Repository/B2B PORTAL - HASTRI/Multiple filter/Page_B2B Portal/img'))

WebUI.click(findTestObject('Object Repository/B2B PORTAL - HASTRI/Multiple filter/Page_B2B Portal/span_Goods Receipt'))

WebUI.click(findTestObject('Object Repository/B2B PORTAL - HASTRI/Multiple filter/Page_B2B Portal/div_Filter'))

WebUI.selectOptionByValue(findTestObject('Object Repository/B2B PORTAL - HASTRI/Multiple filter/Page_B2B Portal/select_Select fieldPR NumberPO NumberPO Dat_ce0b89'), 
    'pr_number', true)

WebUI.click(findTestObject('Object Repository/B2B PORTAL - HASTRI/Multiple filter/Page_B2B Portal/input_Filter_filter_value'))

WebUI.setText(findTestObject('Object Repository/B2B PORTAL - HASTRI/Multiple filter/Page_B2B Portal/input_Filter_filter_value'), 
    'PR/CLN0000199')

WebUI.click(findTestObject('Object Repository/B2B PORTAL - HASTRI/Multiple filter/Page_B2B Portal/button_Filter_btn  btn-outline-warning'))

WebUI.click(findTestObject('Object Repository/B2B PORTAL - HASTRI/Multiple filter/Page_B2B Portal/i_PRCLN0000199_fa fa-times'))

WebUI.click(findTestObject('Object Repository/B2B PORTAL - HASTRI/Multiple filter/Page_B2B Portal/div_Select fieldPR NumberPO NumberPO DatePR_158776'))

WebUI.selectOptionByValue(findTestObject('Object Repository/B2B PORTAL - HASTRI/Multiple filter/Page_B2B Portal/select_Select fieldPR NumberPO NumberPO Dat_ce0b89'), 
    'po_date', true)

WebUI.setText(findTestObject('Object Repository/B2B PORTAL - HASTRI/Multiple filter/Page_B2B Portal/input_Filter_filter_value'), 
    '2024-06-19')

WebUI.click(findTestObject('Object Repository/B2B PORTAL - HASTRI/Multiple filter/Page_B2B Portal/i_Filter_fa fa-plus'))

WebUI.selectOptionByValue(findTestObject('Object Repository/B2B PORTAL - HASTRI/Multiple filter/Page_B2B Portal/select_Select fieldPR NumberPO NumberPR Nee_47b142'), 
    'pr_number', true)

WebUI.setText(findTestObject('Object Repository/B2B PORTAL - HASTRI/Multiple filter/Page_B2B Portal/input_Filter_filter_value'), 
    'PR/CLN0000199')

WebUI.click(findTestObject('Object Repository/B2B PORTAL - HASTRI/Multiple filter/Page_B2B Portal/button_Filter_btn  btn-outline-warning'))

