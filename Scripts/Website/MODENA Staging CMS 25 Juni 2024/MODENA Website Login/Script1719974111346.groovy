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

WebUI.setText(findTestObject('Object Repository/Add new menu/Page_MODENA/input_Submit_email'), 'admin@admin.io')

WebUI.setEncryptedText(findTestObject('Object Repository/Add new menu/Page_MODENA/input_Submit_password'), 'wqqFK0MjyiU4Yf1O6K7z4A==')

WebUI.click(findTestObject('Object Repository/Add new menu/Page_MODENA/i_Submit_icon-circle-right2 ml-2'))

WebUI.click(findTestObject('Object Repository/Add new menu/Page_MODENA/a_Master Menu'))

WebUI.click(findTestObject('Object Repository/Add new menu/Page_MODENA/a_Menu Header'))

WebUI.click(findTestObject('Object Repository/Add new menu/Page_MODENA/a_add new menu'))

WebUI.setText(findTestObject('Object Repository/Add new menu/Page_MODENA/input_Menu title_input0entitle'), 'test')

WebUI.setText(findTestObject('Object Repository/Add new menu/Page_MODENA/input_Custom Link_input1enlink'), 'test')

WebUI.click(findTestObject('Object Repository/Add new menu/Page_MODENA/a_Indonesian'))

WebUI.setText(findTestObject('Object Repository/Add new menu/Page_MODENA/input_Menu title_input0idtitle'), 'test')

WebUI.setText(findTestObject('Object Repository/Add new menu/Page_MODENA/input_Custom Link_input1idlink'), 'test')

WebUI.click(findTestObject('Object Repository/Add new menu/Page_MODENA/button_Create menu'))

WebUI.click(findTestObject('Object Repository/Add new menu/Page_MODENA/div_Deactive Edit Delete'))

WebUI.click(findTestObject('Object Repository/Add new menu/Page_MODENA/i_test_fi fi-rr-menu-dots-vertical'))

WebUI.click(findTestObject('Object Repository/Add new menu/Page_MODENA/button_Active'))

WebUI.click(findTestObject('Object Repository/Add new menu/Page_MODENA/i_Corporate_fi fi-rr-menu-dots-vertical'))

WebUI.click(findTestObject('Object Repository/Add new menu/Page_MODENA/button_Deactive'))

WebUI.click(findTestObject('Object Repository/Add new menu/Page_MODENA/div_Active Edit Delete'))

