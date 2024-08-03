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

WebUI.setText(findTestObject('Object Repository/B2B PORTAL - HASTRI/Department/Page_B2B Portal/input_Email Account_username'), 
    'hastri.danahiswari@modena.com')

WebUI.selectOptionByValue(findTestObject('Object Repository/B2B PORTAL - HASTRI/Department/Page_B2B Portal/select_-- Choose Your Company --PT. ABCPT Autosave'), 
    '205', true)

WebUI.setEncryptedText(findTestObject('Object Repository/B2B PORTAL - HASTRI/Department/Page_B2B Portal/input_Password_password'), 
    'iFGeFYmXIrUhQZHvW7P22w==')

WebUI.click(findTestObject('Object Repository/B2B PORTAL - HASTRI/Department/Page_B2B Portal/button_Login'))

WebUI.click(findTestObject('Object Repository/B2B PORTAL - HASTRI/Department/Page_B2B Portal/div_keyboard_double_arrow_rightHide Menu'))

WebUI.click(findTestObject('Object Repository/B2B PORTAL - HASTRI/Department/Page_B2B Portal/div_Configuration Setting'))

WebUI.click(findTestObject('Object Repository/B2B PORTAL - HASTRI/Department/Page_B2B Portal/a_Department'))

WebUI.click(findTestObject('Object Repository/B2B PORTAL - HASTRI/Department/Page_B2B Portal/button_Add Department'))

WebUI.setText(findTestObject('Object Repository/B2B PORTAL - HASTRI/Department/Page_B2B Portal/input_Department Code_dept_code'), 
    'SH7')

WebUI.setText(findTestObject('Object Repository/B2B PORTAL - HASTRI/Department/Page_B2B Portal/input_Department Name_dept_name'), 
    'Backend Engineer')

WebUI.setText(findTestObject('Object Repository/B2B PORTAL - HASTRI/Department/Page_B2B Portal/input_Sort Code_sort_code'), 
    'BE')

WebUI.click(findTestObject('Object Repository/B2B PORTAL - HASTRI/Department/Page_B2B Portal/div_Save'))

WebUI.click(findTestObject('Object Repository/B2B PORTAL - HASTRI/Department/Page_B2B Portal/button_OK'))

WebUI.closeBrowser()

