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

WebUI.setText(findTestObject('Object Repository/gccs/sprint 8/Page_Login - GCCS/input_Username_userName'), 'sa_cc003')

WebUI.setEncryptedText(findTestObject('Object Repository/gccs/sprint 8/Page_Login - GCCS/input_Password_password'), 'QiSQiLhspCy/AIcOjDjVqQ==')

WebUI.click(findTestObject('Object Repository/gccs/sprint 8/Page_Login - GCCS/button_Login'))

WebUI.click(findTestObject('Object Repository/gccs/sprint 8/Page_Dashboard - GCCS/div_Setup'))

WebUI.click(findTestObject('Object Repository/gccs/sprint 8/Page_Dashboard - GCCS/div_Master Knowledge'))

WebUI.click(findTestObject('Object Repository/gccs/sprint 8/Page_Dashboard - GCCS/li_Cost'))

WebUI.click(findTestObject('Object Repository/gccs/sprint 8/Page_Cost - GCCS/button_Add Cost'))

WebUI.click(findTestObject('Object Repository/gccs/sprint 8/Page_Cost - GCCS/span_Select Knowledge'))

WebUI.click(findTestObject('Object Repository/gccs/sprint 8/Page_Cost - GCCS/li_SB001 - MODENA STEAM OVEN_OLD'))

WebUI.click(findTestObject('Object Repository/gccs/sprint 8/Page_Cost - GCCS/span_Select Service Area'))

WebUI.click(findTestObject('Object Repository/gccs/sprint 8/Page_Cost - GCCS/li_DSC-IN - Area DSC IN Warranty'))

WebUI.click(findTestObject('Object Repository/gccs/sprint 8/Page_Cost - GCCS/span_Select Job Category'))

WebUI.click(findTestObject('Object Repository/gccs/sprint 8/Page_Cost - GCCS/li_HVY - HEAVY'))

WebUI.setText(findTestObject('Object Repository/gccs/sprint 8/Page_Cost - GCCS/input_Labor Cost_laborCostModal'), '1000')

WebUI.setText(findTestObject('Object Repository/gccs/sprint 8/Page_Cost - GCCS/input_Material Cost_materialCostModal'), 
    '1000')

WebUI.click(findTestObject('Object Repository/gccs/sprint 8/Page_Cost - GCCS/input_Start Date_startFromModal'))

WebUI.click(findTestObject('Object Repository/gccs/sprint 8/Page_Cost - GCCS/div_1'))

WebUI.click(findTestObject('Object Repository/gccs/sprint 8/Page_Cost - GCCS/button_Save'))

