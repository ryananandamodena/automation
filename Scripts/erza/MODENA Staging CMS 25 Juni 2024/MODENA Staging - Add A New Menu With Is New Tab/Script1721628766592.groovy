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

WebUI.setText(findTestObject('Object Repository/CMS/input_Submit_email'), 'admin@admin.io')

WebUI.setEncryptedText(findTestObject('Object Repository/CMS/input_Submit_password'), 'wqqFK0MjyiU4Yf1O6K7z4A==')

WebUI.click(findTestObject('Object Repository/CMS/i_Submit_icon-circle-right2 ml-2'))

WebUI.click(findTestObject('Object Repository/CMS/a_Master Menu'))

WebUI.click(findTestObject('Object Repository/CMS/a_Menu Header (1)'))

WebUI.click(findTestObject('Object Repository/CMS/a_add new menu'))

WebUI.setText(findTestObject('Object Repository/CMS/input_Menu title_input0entitle'), '@#$@#&($%&)@')

WebUI.setText(findTestObject('Object Repository/CMS/input_Custom Link_input1enlink'), 'test')

WebUI.click(findTestObject('Object Repository/CMS/a_Indonesian (1)'))

WebUI.setText(findTestObject('Object Repository/CMS/input_Menu title_input0idtitle'), 'test')

WebUI.setText(findTestObject('Object Repository/CMS/input_Custom Link_input1idlink'), 'test')

WebUI.scrollToElement(findTestObject('CMS/button_Create menu'), 0)

WebUI.click(findTestObject('CMS/button_Create menu'))

