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

WebUI.navigateToUrl('https://gccs-test.modena.com/')

WebUI.setText(findTestObject('Object Repository/gccs/gccs_sprint_7/Page_Login - GCCS/input_Username_userName'), 'sa_cc001')

WebUI.setEncryptedText(findTestObject('Object Repository/gccs/gccs_sprint_7/Page_Login - GCCS/input_Password_password'), 
    'QiSQiLhspCy/AIcOjDjVqQ==')

WebUI.click(findTestObject('Object Repository/gccs/gccs_sprint_7/Page_Login - GCCS/button_Login'))

WebUI.click(findTestObject('Object Repository/gccs/gccs_sprint_7/Page_Dashboard - GCCS/div_Inventory'))

WebUI.click(findTestObject('Object Repository/gccs/gccs_sprint_7/Page_Dashboard - GCCS/div_ETA'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/gccs/gccs_sprint_7/Page_ETA - GCCS/svg'))

WebUI.click(findTestObject('Object Repository/gccs/gccs_sprint_7/Page_ETA - GCCS/input_ETA Shipment Date_p-inputtext p-compo_4fe088'))

WebUI.click(findTestObject('Object Repository/gccs/gccs_sprint_7/Page_ETA - GCCS/div_21'))

WebUI.click(findTestObject('Object Repository/gccs/gccs_sprint_7/Page_ETA - GCCS/span_Shipment PIC'))

WebUI.click(findTestObject('Object Repository/gccs/gccs_sprint_7/Page_ETA - GCCS/li_Becca'))

WebUI.setText(findTestObject('Object Repository/gccs/gccs_sprint_7/Page_ETA - GCCS/textarea_test'), 'test')

WebUI.click(findTestObject('Object Repository/gccs/gccs_sprint_7/Page_ETA - GCCS/button_Save'))

