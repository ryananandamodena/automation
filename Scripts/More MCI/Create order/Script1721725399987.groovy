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

WebUI.navigateToUrl('https://more-dev.modena.com/')

WebUI.setText(findTestObject('Object Repository/MCI Page/Page_More 2.0/input_Email or Username_username'), 'user.cabang')

WebUI.setEncryptedText(findTestObject('Object Repository/MCI Page/Page_More 2.0/input_Password_password'), 'W3hObB4uSEA=')

WebUI.click(findTestObject('Object Repository/MCI Page/Page_More 2.0/button_Login'))

WebUI.click(findTestObject('Object Repository/MCI Page/Page_More 2.0/p_MODENA Centro Indonesia (MCI_LIVE)'))

WebUI.click(findTestObject('Object Repository/MCI Page/Page_More 2.0/button_Yes'))

WebUI.click(findTestObject('Object Repository/MCI Page/Page_More 2.0/li_Order'))

WebUI.click(findTestObject('Object Repository/MCI Page/Page_More 2.0/a_Order'))

WebUI.click(findTestObject('Object Repository/MCI Page/Page_More 2.0/button_Add New Order'))

WebUI.click(findTestObject('Object Repository/MCI Page/Page_More 2.0/input__customer_name'))

WebUI.setText(findTestObject('Object Repository/MCI Page/Page_More 2.0/input_Select Customer_search'), 'offi')

WebUI.click(findTestObject('Object Repository/MCI Page/Page_More 2.0/div_PROJECT OFFICIAL STORE (BUKALAPAK)'))

WebUI.click(findTestObject('Object Repository/MCI Page/Page_More 2.0/input_End Customer_end_name'))

WebUI.click(findTestObject('Object Repository/MCI Page/Page_More 2.0/div_Lolo62 9898989800070userbarugmail.comEdit'))

WebUI.click(findTestObject('Object Repository/MCI Page/Page_More 2.0/div_Lolo62 9898989800070userbarugmail.comEdit'))

WebUI.click(findTestObject('Object Repository/MCI Page/Page_More 2.0/div_Lolo62 9898989800070userbarugmail.comEdit'))

WebUI.click(findTestObject('Object Repository/MCI Page/Page_More 2.0/div_Lolo'))

WebUI.click(findTestObject('Object Repository/MCI Page/Page_More 2.0/button_Continue'))

WebUI.click(findTestObject('Object Repository/MCI Page/Page_More 2.0/div_12'))

WebUI.click(findTestObject('Object Repository/MCI Page/Page_More 2.0/span_Select Type'))

WebUI.click(findTestObject('Object Repository/MCI Page/Page_More 2.0/li_Direct To Customer'))

WebUI.click(findTestObject('Object Repository/MCI Page/Page_More 2.0/div_Installation_p-checkbox-box p-highlight_c82153'))

WebUI.setText(findTestObject('Object Repository/MCI Page/Page_More 2.0/input_Request installation for new product_count'), 
    '1')

WebUI.click(findTestObject('Object Repository/MCI Page/Page_More 2.0/button_Add Cart'))

WebUI.click(findTestObject('Object Repository/MCI Page/Page_More 2.0/span_1'))

WebUI.click(findTestObject('Object Repository/MCI Page/Page_More 2.0/button_Continue'))

WebUI.click(findTestObject('Object Repository/MCI Page/Page_More 2.0/button_Continue'))

WebUI.click(findTestObject('Object Repository/MCI Page/Page_More 2.0/svg__p-icon'))

WebUI.click(findTestObject('Object Repository/MCI Page/Page_More 2.0/span_26'))

WebUI.click(findTestObject('Object Repository/MCI Page/Page_More 2.0/button_Order'))

WebUI.click(findTestObject('Object Repository/MCI Page/Page_More 2.0/button_Order'))

