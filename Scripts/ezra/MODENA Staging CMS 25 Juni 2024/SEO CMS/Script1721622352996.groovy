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

WebUI.navigateToUrl('https://staging.modena.com/admin/login')

WebUI.setText(findTestObject('Object Repository/CMS/Page_MODENA/SEO CMS/input_Submit_email'), 'admin@admin.io')

WebUI.setEncryptedText(findTestObject('Object Repository/CMS/Page_MODENA/SEO CMS/input_Submit_password'), 'wqqFK0MjyiU4Yf1O6K7z4A==')

WebUI.click(findTestObject('CMS/i_Submit_icon-circle-right2 ml-2'))

WebUI.click(findTestObject('Object Repository/CMS/Page_MODENA/SEO CMS/a_SEO Function'))

WebUI.scrollToElement(findTestObject('CMS/Page_MODENA/SEO CMS/a_Meta Title'), 0)

WebUI.click(findTestObject('Object Repository/CMS/Page_MODENA/SEO CMS/a_Meta Title'))

WebUI.click(findTestObject('Object Repository/CMS/Page_MODENA/SEO CMS/a_Add SEO Meta'))

WebUI.setText(findTestObject('Object Repository/CMS/Page_MODENA/SEO CMS/input__inputenmeta_title'), 'tes')

WebUI.setText(findTestObject('Object Repository/CMS/Page_MODENA/SEO CMS/textarea__inputenmeta_description'), 't')

WebUI.setText(findTestObject('Object Repository/CMS/Page_MODENA/SEO CMS/input_Menu_inputenmeta_menu'), 't')

WebUI.setText(findTestObject('Object Repository/CMS/Page_MODENA/SEO CMS/input_Category_inputenmeta_category'), 't')

WebUI.setText(findTestObject('Object Repository/CMS/Page_MODENA/SEO CMS/input_Url_inputenurl'), 't')

WebUI.click(findTestObject('Object Repository/CMS/Page_MODENA/SEO CMS/li_Indonesian'))

WebUI.setText(findTestObject('Object Repository/CMS/Page_MODENA/SEO CMS/input__inputidmeta_title'), 't')

WebUI.setText(findTestObject('Object Repository/CMS/Page_MODENA/SEO CMS/textarea__inputidmeta_description'), 't')

WebUI.setText(findTestObject('Object Repository/CMS/Page_MODENA/SEO CMS/input_Menu_inputidmeta_menu'), 't')

WebUI.setText(findTestObject('Object Repository/CMS/Page_MODENA/SEO CMS/input_Category_inputidmeta_category'), 't')

WebUI.setText(findTestObject('Object Repository/CMS/Page_MODENA/SEO CMS/input_Url_inputidurl'), 't')

WebUI.scrollToElement(findTestObject('CMS/Page_MODENA/SEO CMS/button_Save'), 0)

WebUI.click(findTestObject('Object Repository/CMS/Page_MODENA/SEO CMS/button_Save'))

