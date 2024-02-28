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

WebUI.setText(findTestObject('Object Repository/gccs/cr_gccs/Page_Login - GCCS/input_Username_userName'), 'sa_cc004')

WebUI.setEncryptedText(findTestObject('Object Repository/gccs/cr_gccs/Page_Login - GCCS/input_Password_password'), 'QiSQiLhspCy/AIcOjDjVqQ==')

WebUI.click(findTestObject('Object Repository/gccs/cr_gccs/Page_Login - GCCS/button_Login'))

WebUI.click(findTestObject('Object Repository/gccs/gccs sprint 3/Page_Dashboard - GCCS/span_Customer Survey'))

WebUI.click(findTestObject('Object Repository/gccs/gccs sprint 3/Page_Dashboard - GCCS/div_Survey Progress'))

WebUI.click(findTestObject('Object Repository/gccs/gccs sprint 3/Page_Survey Progress - GCCS/span_Survey Report'))

WebUI.click(findTestObject('Object Repository/gccs/gccs sprint 3/Page_Survey Progress - GCCS/span_Repair  Warranty  Happy Call'))

WebUI.click(findTestObject('gccs/gccs sprint 3/Page_Survey Progress - GCCS/span_p-ink p-ink-active'))

WebUI.click(findTestObject('Object Repository/gccs/gccs sprint 3/Page_Survey Progress - GCCS/span_Select Title'))

WebUI.click(findTestObject('Object Repository/gccs/gccs sprint 3/Page_Survey Progress - GCCS/li_test Ryan 1'))

WebUI.click(findTestObject('Object Repository/gccs/gccs sprint 3/Page_Survey Progress - GCCS/span_Select Survey Target'))

WebUI.click(findTestObject('Object Repository/gccs/gccs sprint 3/Page_Survey Progress - GCCS/span_p-ink p-ink-active'))

WebUI.click(findTestObject('Object Repository/gccs/gccs sprint 3/Page_Survey Progress - GCCS/span_p-ink p-ink-active_1'))

WebUI.click(findTestObject('Object Repository/gccs/gccs sprint 3/Page_Survey Progress - GCCS/span_Detail'))

WebUI.click(findTestObject('Object Repository/gccs/gccs sprint 3/Page_Setup Target - GCCS/span_Export'))

