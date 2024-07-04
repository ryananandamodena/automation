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

WebUI.setText(findTestObject('Object Repository/Filter PR/Page_B2B Portal/input_Email Account_username'), 'hastri.danahiswari@modena.com')

WebUI.selectOptionByValue(findTestObject('Object Repository/Filter PR/Page_B2B Portal/select_-- Choose Your Company --PT Autosave'), 
    '205', true)

WebUI.setEncryptedText(findTestObject('Object Repository/Filter PR/Page_B2B Portal/input_Password_password'), 'iFGeFYmXIrUhQZHvW7P22w==')

WebUI.click(findTestObject('Object Repository/Filter PR/Page_B2B Portal/span_Login'))

WebUI.click(findTestObject('Object Repository/Filter PR/Page_B2B Portal/span_keyboard_double_arrow_right'))

WebUI.click(findTestObject('Object Repository/Filter PR/Page_B2B Portal/img'))

WebUI.click(findTestObject('Object Repository/Filter PR/Page_B2B Portal/span_Purchase Request'))

WebUI.click(findTestObject('Object Repository/Filter PR/Page_B2B Portal/button_Add Purchase Request'))

WebUI.click(findTestObject('Object Repository/Filter PR/Page_B2B Portal/div_hastri.danahiswarimodena.com_col-1'))

WebUI.click(findTestObject('Object Repository/Filter PR/Page_B2B Portal/i_hastri.danahiswarimodena.com_fas fa-arrow-left'))

WebUI.click(findTestObject('Object Repository/Filter PR/Page_B2B Portal/div_Filter'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Filter PR/Page_B2B Portal/select_Select fieldPR NumberPR DateDescript_6a4a41'), 
    'pr_date', true)

WebUI.setText(findTestObject('Object Repository/Filter PR/Page_B2B Portal/input_Filter_filter_value'), '2024')

WebUI.click(findTestObject('Object Repository/Filter PR/Page_B2B Portal/button_Filter_btn  btn-outline-warning'))

WebUI.click(findTestObject('Object Repository/Filter PR/Page_B2B Portal/div_do_not_disturb_on_total_silence No data_f5d4e7'))

WebUI.click(findTestObject('Object Repository/Filter PR/Page_B2B Portal/button_Filter_btn  btn-outline-warning'))

WebUI.findWebElement(findTestObject('Filter PR/Page_B2B Portal/span_No data found'))

