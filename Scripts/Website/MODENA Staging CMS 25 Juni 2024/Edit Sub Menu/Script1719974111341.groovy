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

WebUI.setText(findTestObject('Object Repository/Add new menu/Edit Sub Menu/Page_MODENA/input_Submit_email'), 'admin@admin.io')

WebUI.setEncryptedText(findTestObject('Object Repository/Add new menu/Edit Sub Menu/Page_MODENA/input_Submit_password'), 
    'wqqFK0MjyiU4Yf1O6K7z4A==')

WebUI.click(findTestObject('Object Repository/Add new menu/Edit Sub Menu/Page_MODENA/button_Submit'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Add new menu/Edit Sub Menu/Page_MODENA/p_Master Menu'))

WebUI.click(findTestObject('Object Repository/Add new menu/Edit Sub Menu/Page_MODENA/a_Menu Header'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Add new menu/Edit Sub Menu/Page_MODENA/div_Deactive Edit Delete'))

WebUI.click(findTestObject('Object Repository/Add new menu/Edit Sub Menu/Page_MODENA/i_test_fi fi-rr-menu-dots-vertical'))

WebUI.click(findTestObject('Object Repository/Add new menu/Edit Sub Menu/Page_MODENA/a_Edit'))

WebUI.setText(findTestObject('Object Repository/Add new menu/Edit Sub Menu/Page_MODENA/input_Menu title_edit_input0entitle'), 
    'test3')

WebUI.setText(findTestObject('Object Repository/Add new menu/Edit Sub Menu/Page_MODENA/input_Custom Link_edit_input1enlink'), 
    'test2')

WebUI.click(findTestObject('Object Repository/Add new menu/Edit Sub Menu/Page_MODENA/a_Indonesian'))

WebUI.setText(findTestObject('Object Repository/Add new menu/Edit Sub Menu/Page_MODENA/input_Menu title_edit_input0idtitle'), 
    'test2')

WebUI.setText(findTestObject('Object Repository/Add new menu/Edit Sub Menu/Page_MODENA/input_Custom Link_edit_input1idlink'), 
    'test2')

WebUI.click(findTestObject('Object Repository/Add new menu/Edit Sub Menu/Page_MODENA/button_Update'))

WebUI.click(findTestObject('Object Repository/Add new menu/Edit Sub Menu/Page_MODENA/i_test_fi fi-rr-menu-dots-vertical'))

WebUI.closeBrowser()

