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

WebUI.navigateToUrl('http://192.168.3.86:28064/')

WebUI.setText(findTestObject('Object Repository/SERVICE DESK - HASTRI/Pages Add Service Request/Page_Modena Servicedesk/input_Email_username'), 
    'hastri.danahiswari@modena.com')

WebUI.setEncryptedText(findTestObject('Object Repository/SERVICE DESK - HASTRI/Pages Add Service Request/Page_Modena Servicedesk/input_Password_password'), 
    'iFGeFYmXIrUhQZHvW7P22w==')

WebUI.click(findTestObject('Object Repository/SERVICE DESK - HASTRI/Pages Add Service Request/Page_Modena Servicedesk/button_Sign In'))

WebUI.click(findTestObject('Object Repository/SERVICE DESK - HASTRI/Pages Add Service Request/Page_Modena Servicedesk/a_Service Requests'))

WebUI.click(findTestObject('Object Repository/SERVICE DESK - HASTRI/Pages Add Service Request/Page_Modena Servicedesk/button_Service Request'))

WebUI.click(findTestObject('Object Repository/SERVICE DESK - HASTRI/Pages Add Service Request/Page_Modena Servicedesk/a_General Support'))

WebUI.click(findTestObject('Object Repository/SERVICE DESK - HASTRI/Pages Add Service Request/Page_Modena Servicedesk/h6_Mobil Operasional'))

WebUI.selectOptionByValue(findTestObject('Object Repository/SERVICE DESK - HASTRI/Pages Add Service Request/Page_Modena Servicedesk/select_CabangJakartaBaliBalikpapanBanjarmas_7b7817'), 
    'Jakarta', true)

WebUI.setText(findTestObject('Object Repository/SERVICE DESK - HASTRI/Pages Add Service Request/Page_Modena Servicedesk/input__Deskripsi'), 
    Description)

WebUI.setText(findTestObject('Object Repository/SERVICE DESK - HASTRI/Pages Add Service Request/Page_Modena Servicedesk/input__requested_for'), 
    Requestfor)

WebUI.setText(findTestObject('Object Repository/SERVICE DESK - HASTRI/Pages Add Service Request/Page_Modena Servicedesk/input__requested_for_email'), 
    Requestedemail)

WebUI.click(findTestObject('Object Repository/SERVICE DESK - HASTRI/Pages Add Service Request/Page_Modena Servicedesk/button_Submit'))

WebUI.click(findTestObject('Object Repository/SERVICE DESK - HASTRI/Pages Add Service Request/Page_Modena Servicedesk/button_OK'))

WebUI.closeBrowser()

