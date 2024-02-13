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

WebUI.navigateToUrl('https://salesmobiledev.modena.com/')

WebUI.setText(findTestObject('Object Repository/sales/Page_Sales Force Automation/input_Email or Username_username'), 'arman.septian')

WebUI.setEncryptedText(findTestObject('Object Repository/sales/Page_Sales Force Automation/input_Password_password'), 'iFGeFYmXIrUhQZHvW7P22w==')

WebUI.click(findTestObject('Object Repository/sales/Page_Sales Force Automation/button_Login'))

WebUI.click(findTestObject('Object Repository/sales/Page_Sales Force Automation/p_Master Data SCC'))

WebUI.click(findTestObject('Object Repository/sales/Page_Sales Force Automation/p_Sales'))

WebUI.click(findTestObject('Object Repository/sales/Page_Sales Force Automation/button_Add'))

WebUI.setText(findTestObject('Object Repository/sales/Page_Sales Force Automation/input_Email_email'), a)

WebUI.click(findTestObject('Object Repository/sales/Page_Sales Force Automation/span_preddy.desmonmodena.com'))

WebUI.setText(findTestObject('Object Repository/sales/Page_Sales Force Automation/input_Username_username'), a)

WebUI.setText(findTestObject('Object Repository/sales/Page_Sales Force Automation/input_Sales Code_sales_code'), a)

WebUI.click(findTestObject('Object Repository/sales/Page_Sales Force Automation/input_Join Date_join_date'))

WebUI.click(findTestObject('Object Repository/sales/Page_Sales Force Automation/td_13'))

WebUI.selectOptionByValue(findTestObject('Object Repository/sales/Page_Sales Force Automation/select_Select RoleSalesConsultantCoordinator'), 
    '65bb56a3347b24603ce40761', true)

WebUI.click(findTestObject('Object Repository/sales/Page_Sales Force Automation/button_Save'))

