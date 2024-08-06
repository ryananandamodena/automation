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

WebUI.switchToWindowTitle('Login - GCCS')

WebUI.setText(findTestObject('Object Repository/gccs/Gccs_Sprint 10/Page_Login - GCCS/input_Username_userName'), 'sa_cc001')

WebUI.setEncryptedText(findTestObject('Object Repository/gccs/Gccs_Sprint 10/Page_Login - GCCS/input_Password_password'), 
    'QiSQiLhspCy/AIcOjDjVqQ==')

WebUI.click(findTestObject('Object Repository/gccs/Gccs_Sprint 10/Page_Login - GCCS/button_Login'))

WebUI.click(findTestObject('Object Repository/gccs/Gccs_Sprint 10/Page_Dashboard - GCCS/li_Repair Center'))

WebUI.click(findTestObject('Object Repository/gccs/Gccs_Sprint 10/Page_Dashboard - GCCS/div_Repair Center'))

WebUI.click(findTestObject('Object Repository/gccs/Gccs_Sprint 10/Page_Dashboard - GCCS/div_Technician Incentive Data'))

WebUI.click(findTestObject('Object Repository/gccs/Gccs_Sprint 10/Page_Technician Incentive Data - GCCS/input_Insentif Teknisi Data_custom-calendar_04b84c'))

WebUI.click(findTestObject('Object Repository/gccs/Gccs_Sprint 10/Page_Technician Incentive Data - GCCS/button_Previous Month'))

WebUI.click(findTestObject('Object Repository/gccs/Gccs_Sprint 10/Page_Technician Incentive Data - GCCS/span_Previous Month'))

WebUI.click(findTestObject('Object Repository/gccs/Gccs_Sprint 10/Page_Technician Incentive Data - GCCS/span_Previous Month'))

WebUI.click(findTestObject('Object Repository/gccs/Gccs_Sprint 10/Page_Technician Incentive Data - GCCS/span_Previous Month'))

WebUI.click(findTestObject('Object Repository/gccs/Gccs_Sprint 10/Page_Technician Incentive Data - GCCS/span_Previous Month'))

WebUI.click(findTestObject('Object Repository/gccs/Gccs_Sprint 10/Page_Technician Incentive Data - GCCS/span_Previous Month'))

WebUI.click(findTestObject('Object Repository/gccs/Gccs_Sprint 10/Page_Technician Incentive Data - GCCS/span_Previous Month'))

WebUI.click(findTestObject('Object Repository/gccs/Gccs_Sprint 10/Page_Technician Incentive Data - GCCS/div_1'))

WebUI.click(findTestObject('Object Repository/gccs/Gccs_Sprint 10/Page_Technician Incentive Data - GCCS/input_Selected date Monday, January 1st, 20_d0d9ff'))

WebUI.click(findTestObject('Object Repository/gccs/Gccs_Sprint 10/Page_Technician Incentive Data - GCCS/div_6'))

WebUI.click(findTestObject('Object Repository/gccs/Gccs_Sprint 10/Page_Technician Incentive Data - GCCS/button_Filter'))

WebUI.click(findTestObject('Object Repository/gccs/Gccs_Sprint 10/Page_Technician Incentive Data - GCCS/button_Export Excel'))

WebUI.click(findTestObject('Object Repository/gccs/Gccs_Sprint 10/Page_Technician Incentive Data - GCCS/div_Select Name_p-dropdown-trigger'))

WebUI.setText(findTestObject('Object Repository/gccs/Gccs_Sprint 10/Page_Technician Incentive Data - GCCS/input_Page SizePage_p-dropdown-filter p-inp_2cafbb'), 
    'aa')

WebUI.click(findTestObject('Object Repository/gccs/Gccs_Sprint 10/Page_Technician Incentive Data - GCCS/li_TEC_JK2004 - AAN SUGIANTO'))

WebUI.click(findTestObject('Object Repository/gccs/Gccs_Sprint 10/Page_Technician Incentive Data - GCCS/button_Filter'))

WebUI.click(findTestObject('Object Repository/gccs/Gccs_Sprint 10/Page_Technician Incentive Data - GCCS/i_TEC_JK2004 - AAN SUGIANTO_p-dropdown-clea_11193a'))

WebUI.click(findTestObject('Object Repository/gccs/Gccs_Sprint 10/Page_Technician Incentive Data - GCCS/span_Select Role'))

WebUI.click(findTestObject('Object Repository/gccs/Gccs_Sprint 10/Page_Technician Incentive Data - GCCS/li_Stock Keeper'))

WebUI.click(findTestObject('Object Repository/gccs/Gccs_Sprint 10/Page_Technician Incentive Data - GCCS/span_Filter'))

WebUI.click(findTestObject('Object Repository/gccs/Gccs_Sprint 10/Page_Technician Incentive Data - GCCS/i_TEC_JK2004 - AAN SUGIANTO_p-dropdown-clea_11193a'))

WebUI.click(findTestObject('Object Repository/gccs/Gccs_Sprint 10/Page_Technician Incentive Data - GCCS/div_Select Name_p-dropdown-trigger'))

WebUI.setText(findTestObject('Object Repository/gccs/Gccs_Sprint 10/Page_Technician Incentive Data - GCCS/input_Page SizePage_p-dropdown-filter p-inp_2cafbb'), 
    'jak')

WebUI.click(findTestObject('Object Repository/gccs/Gccs_Sprint 10/Page_Technician Incentive Data - GCCS/li_SERVICE CENTER JAKARTA 2'))

WebUI.click(findTestObject('Object Repository/gccs/Gccs_Sprint 10/Page_Technician Incentive Data - GCCS/button_Filter'))

WebUI.click(findTestObject('Object Repository/gccs/Gccs_Sprint 10/Page_Technician Incentive Data - GCCS/button_Export Excel'))

