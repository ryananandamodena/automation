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

WebUI.closeBrowser()

WebUI.openBrowser('')

WebUI.navigateToUrl('https://gccs-test.modena.com/')

WebUI.setText(findTestObject('Object Repository/gccs/gccs flow/Page_Login - GCCS/input_Username_userName'), 'sa_cc001')

WebUI.setEncryptedText(findTestObject('Object Repository/gccs/gccs flow/Page_Login - GCCS/input_Password_password'), 'QiSQiLhspCy/AIcOjDjVqQ==')

WebUI.click(findTestObject('Object Repository/gccs/gccs flow/Page_Login - GCCS/span_Login'))

WebUI.click(findTestObject('Object Repository/gccs/gccs flow/Page_Dashboard - GCCS/span_Call Center'))

WebUI.click(findTestObject('Object Repository/gccs/gccs flow/Page_Dashboard - GCCS/div_Call Entry'))

WebUI.setText(findTestObject('Object Repository/gccs/gccs flow/Page_Call Entry - GCCS/input_Phone Number_phone'), '087770666214')

WebUI.sendKeys(findTestObject('Object Repository/gccs/gccs flow/Page_Call Entry - GCCS/input_Phone Number_phone'), Keys.chord(
        Keys.ENTER))

WebUI.click(findTestObject('Object Repository/gccs/gccs flow/Page_Call Entry - GCCS/svg'))

WebUI.click(findTestObject('Object Repository/gccs/gccs flow/Page_Call Entry - GCCS/span_Work Order'))

WebUI.click(findTestObject('Object Repository/gccs/gccs flow/Page_Call Entry - GCCS/span_SERVICE CENTER JAKARTA 2'))

WebUI.click(findTestObject('Object Repository/gccs/gccs flow/Page_Call Entry - GCCS/span_Select'))

WebUI.click(findTestObject('Object Repository/gccs/gccs flow/Page_Call Entry - GCCS/svg_1'))

WebUI.click(findTestObject('Object Repository/gccs/gccs flow/Page_Call Entry - GCCS/span_Select Received Method'))

WebUI.click(findTestObject('Object Repository/gccs/gccs flow/Page_Call Entry - GCCS/li_Call Center'))

WebUI.setText(findTestObject('Object Repository/gccs/gccs flow/Page_Call Entry - GCCS/input_Complaint Customer_customerComplaintNotes'), 
    'test')

WebUI.setText(findTestObject('Object Repository/gccs/gccs flow/Page_Call Entry - GCCS/input_Request Date  (Local Time)_requestDate'), 
    '')

WebUI.click(findTestObject('Object Repository/gccs/gccs flow/Page_Call Entry - GCCS/input_Request Date  (Local Time)_requestDate'))

WebUI.click(findTestObject('Object Repository/gccs/gccs flow/Page_Call Entry - GCCS/div_5'))

WebUI.click(findTestObject('Object Repository/gccs/gccs flow/Page_Call Entry - GCCS/input_hidden_requestTime'))

WebUI.click(findTestObject('Object Repository/gccs/gccs flow/Page_Call Entry - GCCS/li_400 PM'))

WebUI.click(findTestObject('Object Repository/gccs/gccs flow/Page_Call Entry - GCCS/span_Select Technician'))

WebUI.click(findTestObject('Object Repository/gccs/gccs flow/Page_Call Entry - GCCS/li_TMM - MEGA ARIF TRIYANA'))

WebUI.click(findTestObject('Object Repository/gccs/gccs flow/Page_Call Entry - GCCS/input_serial'))

WebUI.click(findTestObject('Object Repository/gccs/gccs flow/Page_Call Entry - GCCS/div_5_1'))

WebUI.setText(findTestObject('Object Repository/gccs/gccs flow/Page_Call Entry - GCCS/input_serial'), 
    'test')

WebUI.click(findTestObject('Object Repository/gccs/gccs flow/Page_Call Entry - GCCS/button_Save'))

