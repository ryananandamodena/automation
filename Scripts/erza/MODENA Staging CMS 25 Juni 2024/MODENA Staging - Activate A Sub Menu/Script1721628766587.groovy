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

WebUI.setText(findTestObject('CMS/input_Submit_email'), 'admin@admin.io')

WebUI.setEncryptedText(findTestObject('CMS/input_Submit_password'), 'wqqFK0MjyiU4Yf1O6K7z4A==')

WebUI.click(findTestObject('CMS/i_Submit_icon-circle-right2 ml-2'), FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('CMS/p_Master Menu'), 0)

WebUI.click(findTestObject('Object Repository/CMS/p_Master Menu'))

WebUI.scrollToElement(findTestObject('CMS/a_Menu Header'), 0)

WebUI.click(findTestObject('Object Repository/CMS/a_Menu Header'))

WebUI.scrollToElement(findTestObject('CMS/span_Corporate_fi fi-rr-angle-small-down'), 0)

WebUI.click(findTestObject('Object Repository/CMS/span_Corporate_fi fi-rr-angle-small-down'))

WebUI.click(findTestObject('Object Repository/CMS/a_Add new sub menu'))

WebUI.setText(findTestObject('Object Repository/CMS/input_SubMenu title_sub_input0entitle'), 'Corporasi Nihonggo')

WebUI.setText(findTestObject('Object Repository/CMS/input_Link_sub_input1enlink'), 'Corporasi-Nihonggo.com')

WebUI.click(findTestObject('CMS/input_Is new tab_addSubNewTab'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/CMS/a_Indonesian'))

WebUI.setText(findTestObject('Object Repository/CMS/input_SubMenu title_sub_input0idtitle'), 'Corporasi Nihonggo')

WebUI.setText(findTestObject('Object Repository/CMS/input_Link_sub_input1idlink'), 'Corporasi-Nihonggo.com')

WebUI.scrollToElement(findTestObject('CMS/button_Create menu'), 0)

WebUI.click(findTestObject('Object Repository/CMS/button_Create menu'))

WebUI.click(findTestObject('CMS/input_Is new tab_addSubNewTab id'), FailureHandling.STOP_ON_FAILURE)

