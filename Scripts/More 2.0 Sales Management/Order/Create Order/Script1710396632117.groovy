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

WebUI.setText(findTestObject('Object Repository/Page_More 2.0/input_Email or Username_username'), 'user.pusat')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_More 2.0/input_Password_password'), 'W3hObB4uSEA=')

WebUI.click(findTestObject('Object Repository/Page_More 2.0/button_Login'))

WebUI.click(findTestObject('Object Repository/Page_More 2.0/p_MODENA Indonesia (MODENA_LIVE)'))

WebUI.click(findTestObject('Object Repository/Page_More 2.0/button_Yes'))

WebUI.click(findTestObject('Object Repository/Page_More 2.0/a_Order'))

WebUI.click(findTestObject('Object Repository/Page_More 2.0/a_Order_1'))

WebUI.click(findTestObject('Object Repository/Page_More 2.0/button_Add New Order'))

WebUI.click(findTestObject('Object Repository/Page_More 2.0/input__customer_name'))

WebUI.click(findTestObject('Object Repository/Page_More 2.0/input_Select Customer_search'))

WebUI.click(findTestObject('Object Repository/Page_More 2.0/div_C001-000022ELECTRONIC CITY INDONESIA, P_8244d0'))

WebUI.scrollToElement(findTestObject('Page_More 2.0/button_Continue'), 0)

WebUI.click(findTestObject('Object Repository/Page_More 2.0/button_Continue'))

WebUI.click(findTestObject('Object Repository/Page_More 2.0/div_1074'))

WebUI.scrollToElement(findTestObject('Page_More 2.0/span_Select Type'), 0)

WebUI.click(findTestObject('Object Repository/Page_More 2.0/span_Select Type'))

WebUI.click(findTestObject('Object Repository/Page_More 2.0/li_Direct To Customer'))

WebUI.click(findTestObject('Object Repository/Page_More 2.0/input_Shipping Address_shipping'))

WebUI.click(findTestObject('Object Repository/Page_More 2.0/div_EC-LS BDG, LUCKY SQUARE A25 SENAYAN, KE_ef4387'))

WebUI.click(findTestObject('Object Repository/Page_More 2.0/div_Request diassembling for current Produc_26fb57'))

WebUI.click(findTestObject('Object Repository/Page_More 2.0/div_Request diassembling for current Produc_26fb57'))

WebUI.setText(findTestObject('Object Repository/Page_More 2.0/input_Request installation for new product_count'), '3')

WebUI.click(findTestObject('Object Repository/Page_More 2.0/button_Add Cart'))

WebUI.click(findTestObject('Object Repository/Page_More 2.0/div_1'))

WebUI.click(findTestObject('Object Repository/Page_More 2.0/button_Continue'))

WebUI.scrollToElement(findTestObject('Page_More 2.0/button_Continue'), 0)

WebUI.click(findTestObject('Object Repository/Page_More 2.0/button_Continue'))

WebUI.click(findTestObject('Object Repository/Page_More 2.0/path'))

WebUI.click(findTestObject('Object Repository/Page_More 2.0/span_23'))

WebUI.scrollToElement(findTestObject('Page_More 2.0/textarea_Remarks_remarks'), 0)

WebUI.setText(findTestObject('Object Repository/Page_More 2.0/textarea_Remarks_remarks'), 'cek auto')

WebUI.scrollToElement(findTestObject('Page_More 2.0/button_Order'), 0)

WebUI.click(findTestObject('Object Repository/Page_More 2.0/button_Order'))

WebUI.click(findTestObject('Page_More 2.0/button_Order2'))

WebUI.click(findTestObject('Object Repository/Page_More 2.0/button_OK'))

WebUI.closeBrowser()

