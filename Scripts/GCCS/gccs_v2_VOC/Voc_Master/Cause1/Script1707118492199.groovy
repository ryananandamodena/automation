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

WebUI.navigateToUrl('https://gccs-test.modena.com/dashboard')

WebUI.setText(findTestObject('Object Repository/gccs/voc/Page_Login - GCCS/input_Username_userName'), 'sa_cc004')

WebUI.setEncryptedText(findTestObject('Object Repository/gccs/voc/Page_Login - GCCS/input_Password_password'), 'QiSQiLhspCy/AIcOjDjVqQ==')

WebUI.click(findTestObject('Object Repository/gccs/voc/Page_Login - GCCS/button_Login'))

WebUI.click(findTestObject('Object Repository/gccs/voc/Page_Dashboard - GCCS/li_Setup'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/gccs/voc/Page_Dashboard - GCCS/div_VOC'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/gccs/voc/Page_Dashboard - GCCS/li_VOC Master'))

WebUI.click(findTestObject('Object Repository/gccs/voc/Page_VOC Master - GCCS/span_COUSE'))

WebUI.setText(findTestObject('Object Repository/gccs/voc/Page_VOC Master - GCCS/input_Couse Name_couseName'), 'qa')

WebUI.click(findTestObject('gccs/voc/Page_VOC Master - GCCS/div_empty'))

WebUI.selectOptionByLabel(findTestObject('gccs/voc/Page_VOC Master - GCCS/li_Service'), Target, false)

WebUI.click(findTestObject('gccs/voc/Page_VOC Master - GCCS/div_empty1'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/gccs/voc/Page_VOC Master - GCCS/li_SUKRON'), contac, false)

WebUI.selectOptionByLabel(findTestObject('gccs/voc/voc_select_variabel/Page_VOC Master - GCCS/status'), status, false)

WebUI.click(findTestObject('Object Repository/gccs/voc/Page_VOC Master - GCCS/button_Save'))

