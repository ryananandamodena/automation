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

WebUI.setText(findTestObject('Object Repository/gccs/voc/depth1/Page_Login - GCCS/input_Username_userName'), 'sa_cc001')

WebUI.setEncryptedText(findTestObject('Object Repository/gccs/voc/depth1/Page_Login - GCCS/input_Password_password'), 'QiSQiLhspCy/AIcOjDjVqQ==')

WebUI.click(findTestObject('Object Repository/gccs/voc/depth1/Page_Login - GCCS/button_Login'))

WebUI.click(findTestObject('Object Repository/gccs/voc/depth1/Page_Dashboard - GCCS/div_Setup'))

WebUI.click(findTestObject('Object Repository/gccs/voc/depth1/Page_Dashboard - GCCS/div_VOC'))

WebUI.click(findTestObject('Object Repository/gccs/voc/depth1/Page_Dashboard - GCCS/li_VOC Master'))

WebUI.click(findTestObject('Object Repository/gccs/voc/depth1/Page_VOC Master - GCCS/span_DEPTH 1'))

WebUI.setText(findTestObject('Object Repository/gccs/voc/depth1/Page_VOC Master - GCCS/input_Dept 1_depthSatu'), 'test')

WebUI.click(findTestObject('Object Repository/gccs/voc/depth1/Page_VOC Master - GCCS/span_Active'))

WebUI.click(findTestObject('Object Repository/gccs/voc/depth1/Page_VOC Master - GCCS/li_Active'))

WebUI.click(findTestObject('Object Repository/gccs/voc/depth1/Page_VOC Master - GCCS/button_Save'))

WebUI.verifyElementText(findTestObject(null), '')

