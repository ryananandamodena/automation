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

WebUI.setText(findTestObject('Object Repository/survey/Page_Login - GCCS/input_userName'), 'sa_cc004')

WebUI.setEncryptedText(findTestObject('Object Repository/survey/Page_Login - GCCS/input_password'), 'QiSQiLhspCy/AIcOjDjVqQ==')

WebUI.click(findTestObject('Object Repository/survey/Page_Login - GCCS/span_p-ink p-ink-active'))

WebUI.click(findTestObject('Object Repository/survey/Page_Dashboard - GCCS/div_Customer Survey'))

WebUI.click(findTestObject('Object Repository/survey/Page_Dashboard - GCCS/div_Survey Running'))

WebUI.click(findTestObject('Object Repository/survey/Page_Dashboard - GCCS/div_p-dropdown-trigger'))

WebUI.click(findTestObject('Object Repository/survey/Page_Dashboard - GCCS/span_p-ink p-ink-active'))

WebUI.click(findTestObject('Object Repository/survey/Page_Dashboard - GCCS/div_p-dropdown-trigger'))

WebUI.click(findTestObject('Object Repository/survey/Page_Dashboard - GCCS/span_p-ink p-ink-active'))

WebUI.click(findTestObject('Object Repository/survey/Page_Dashboard - GCCS/span_Select Questionnaire'))

WebUI.click(findTestObject('Object Repository/survey/Page_Dashboard - GCCS/span_p-ink p-ink-active'))

WebUI.click(findTestObject('Object Repository/survey/Page_Dashboard - GCCS/span_Select Target'))

WebUI.click(findTestObject('Object Repository/survey/Page_Dashboard - GCCS/span_p-ink p-ink-active'))

WebUI.click(findTestObject('Object Repository/survey/Page_Dashboard - GCCS/span_ALL'))

WebUI.click(findTestObject('Object Repository/survey/Page_Dashboard - GCCS/span_ALL'))

WebUI.click(findTestObject('Object Repository/survey/Page_Dashboard - GCCS/span_p-ink p-ink-active_1'))

WebUI.click(findTestObject('Object Repository/survey/Page_Dashboard - GCCS/span_Call'))

WebUI.click(findTestObject('Object Repository/survey/Page_Dashboard - GCCS/span_p-ink p-ink-active_1_2'))

WebUI.click(findTestObject('Object Repository/survey/Page_Dashboard - GCCS/path'))

WebUI.click(findTestObject('Object Repository/survey/Page_Dashboard - GCCS/span_Survey Detail'))

WebUI.click(findTestObject('Object Repository/survey/Page_Dashboard - GCCS/path_1'))

WebUI.click(findTestObject('Object Repository/survey/Page_Dashboard - GCCS/span_Call'))

WebUI.click(findTestObject('Object Repository/survey/Page_Dashboard - GCCS/span_p-ink p-ink-active_1_2'))

WebUI.click(findTestObject('Object Repository/survey/Page_Dashboard - GCCS/path_1'))

WebUI.click(findTestObject('Object Repository/survey/Page_Dashboard - GCCS/div_Call'))

WebUI.click(findTestObject('Object Repository/survey/Page_Dashboard - GCCS/span_p-ink p-ink-active_1_2'))

