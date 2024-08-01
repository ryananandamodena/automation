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

WebUI.setText(findTestObject('Object Repository/gccs/sprint 8/Page_Login - GCCS/input_Username_userName'), 'sa_cc001')

WebUI.setEncryptedText(findTestObject('Object Repository/gccs/sprint 8/Page_Login - GCCS/input_Password_password'), 'QiSQiLhspCy/AIcOjDjVqQ==')

WebUI.click(findTestObject('Object Repository/gccs/sprint 8/Page_Login - GCCS/button_Login'))

WebUI.click(findTestObject('Object Repository/gccs/sprint 8/Page_Dashboard - GCCS/div_Setup'))

WebUI.click(findTestObject('Object Repository/gccs/sprint 8/Page_Dashboard - GCCS/div_Master Knowledge'))

WebUI.click(findTestObject('Object Repository/gccs/sprint 8/Page_Dashboard - GCCS/li_Base'))

WebUI.click(findTestObject('Object Repository/gccs/sprint 8/Page_Base - GCCS/button_Add Solution'))

WebUI.click(findTestObject('Object Repository/gccs/sprint 8/Page_Base - GCCS/span_Select Knowledge'))

WebUI.click(findTestObject('Object Repository/gccs/sprint 8/Page_Base - GCCS/li_GG001 - MODENA PRO GAS STOVE'))

WebUI.click(findTestObject('Object Repository/gccs/sprint 8/Page_Base - GCCS/span_Select Job Category_p-dropdown-trigger_2a0f44'))

WebUI.click(findTestObject('Object Repository/gccs/sprint 8/Page_Base - GCCS/i_VIS - VISIT_p-dropdown-clear-icon pi pi-times'))

WebUI.click(findTestObject('Object Repository/gccs/sprint 8/Page_Base - GCCS/div_Select Knowledge_p-dropdown-trigger'))

WebUI.click(findTestObject('Object Repository/gccs/sprint 8/Page_Base - GCCS/li_MD003 - MODENA CHEST FREEZER  750 LT'))

WebUI.click(findTestObject('Object Repository/gccs/sprint 8/Page_Base - GCCS/span_Select Symptom'))

WebUI.click(findTestObject('Object Repository/gccs/sprint 8/Page_Base - GCCS/li_MD00313 - Tombol Display Tidak Berfungsi Mati'))

WebUI.click(findTestObject('Object Repository/gccs/sprint 8/Page_Base - GCCS/div_Select Knowledge_p-dropdown-trigger'))

WebUI.click(findTestObject('Object Repository/gccs/sprint 8/Page_Base - GCCS/li_MD0031301 - Unit Normal'))

WebUI.click(findTestObject('Object Repository/gccs/sprint 8/Page_Base - GCCS/span_Select Job Category'))

WebUI.click(findTestObject('Object Repository/gccs/sprint 8/Page_Base - GCCS/li_VIS - VISIT'))

WebUI.setText(findTestObject('Object Repository/gccs/sprint 8/Page_Base - GCCS/input_Solution Code_solutionCodeModal'), 
    'eeee')

WebUI.setText(findTestObject('Object Repository/gccs/sprint 8/Page_Base - GCCS/input_Solution Name_solutionNameModal'), 
    'eeeee')

WebUI.click(findTestObject('Object Repository/gccs/sprint 8/Page_Base - GCCS/div_Is Active_react-toggle-track'))

WebUI.click(findTestObject('Object Repository/gccs/sprint 8/Page_Base - GCCS/button_Save'))

