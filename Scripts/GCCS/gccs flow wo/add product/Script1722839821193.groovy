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

WebUI.navigateToUrl('https://gccs-test.modena.com/')

WebUI.setText(findTestObject('Object Repository/gccs/gccs flow/Page_Login - GCCS/input_Username_userName'), 'sa_cc001')

WebUI.setEncryptedText(findTestObject('Object Repository/gccs/gccs flow/Page_Login - GCCS/input_Password_password'), 'QiSQiLhspCy/AIcOjDjVqQ==')

WebUI.click(findTestObject('Object Repository/gccs/gccs flow/Page_Login - GCCS/button_Login'))

WebUI.click(findTestObject('Object Repository/gccs/gccs flow/Page_Dashboard - GCCS/span_Call Center'))

WebUI.click(findTestObject('Object Repository/gccs/gccs flow/Page_Dashboard - GCCS/div_Call Entry'))

WebUI.setText(findTestObject('Object Repository/gccs/gccs flow/Page_Call Entry - GCCS/input_Phone Number_phone'), '087770666214')

WebUI.sendKeys(findTestObject('Object Repository/gccs/gccs flow/Page_Call Entry - GCCS/input_Phone Number_phone'), Keys.chord(
        Keys.ENTER))

WebUI.click(findTestObject('Object Repository/gccs/gccs flow/Page_Call Entry - GCCS/div_Select Sales Model_css-13z0ixq'))

WebUI.setText(findTestObject('Object Repository/gccs/gccs flow/Page_Call Entry - GCCS/input_Sales Model_react-select-2-input'), 
    'bh')

WebUI.click(findTestObject('Object Repository/gccs/gccs flow/Page_Call Entry - GCCS/div_BH2835ZZAA - MODENA GAS HOB - BH 2835'))

WebUI.setText(findTestObject('gccs/gccs flow/Page_Call Entry - GCCS/input_serial'), '8373627736886G7')

WebUI.click(findTestObject('gccs/gccs flow/Page_Call Entry - GCCS/dealer'))

WebUI.click(findTestObject('gccs/gccs flow/Page_Call Entry - GCCS/dealer Name'))

WebUI.setText(findTestObject('gccs/gccs flow/Page_Call Entry - GCCS/date'), '')

WebUI.click(findTestObject('gccs/gccs flow/Page_Call Entry - GCCS/tanggal'))

WebUI.click(findTestObject('Object Repository/gccs/gccs flow/Page_Call Entry - GCCS/div_5'))

WebUI.click(findTestObject('Object Repository/gccs/gccs flow/Page_Call Entry - GCCS/span_OUT WARRANTY'))

WebUI.click(findTestObject('Object Repository/gccs/gccs flow/Page_Call Entry - GCCS/li_IN WARRANTY'))

WebUI.click(findTestObject('Object Repository/gccs/gccs flow/Page_Call Entry - GCCS/button_Save'))

