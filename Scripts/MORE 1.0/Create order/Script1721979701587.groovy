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

WebUI.navigateToUrl('https://sfadev.modena.com/')

WebUI.setText(findTestObject('Object Repository/Page More 1.0/Page_MoRe/input_User_username'), 'dedi.slamets@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page More 1.0/Page_MoRe/input_Password_password'), 'iFGeFYmXIrUhQZHvW7P22w==')

WebUI.click(findTestObject('Object Repository/Page More 1.0/Page_MoRe/button_Login'))

WebUI.click(findTestObject('Object Repository/Page More 1.0/Page_MoRe/span_Sales Order'))

WebUI.click(findTestObject('Object Repository/Page More 1.0/Page_MoRe/button_Add'))

WebUI.click(findTestObject('Object Repository/Page More 1.0/Page_MoRe/input_NameID_name'))

WebUI.setText(findTestObject('Object Repository/Page More 1.0/Page_MoRe/input_List Customer_search'), Customer)

WebUI.click(findTestObject('Object Repository/Page More 1.0/Page_MoRe/a_Asma Testing'))

WebUI.click(findTestObject('Object Repository/Page More 1.0/Page_MoRe/button_Add Product'))

WebUI.setText(findTestObject('Object Repository/Page More 1.0/Page_MoRe/input_List Customer_search'), Item)

WebUI.click(findTestObject('Object Repository/Page More 1.0/Page_MoRe/a_MODENA GAS INSTANT WATER HEATER - GI 1020 B'))

WebUI.click(findTestObject('Object Repository/Page More 1.0/Page_MoRe/input_Display_inlineRadioOptions'))

WebUI.setText(findTestObject('Object Repository/Page More 1.0/Page_MoRe/input_-_qty'), Quantity)

WebUI.click(findTestObject('Object Repository/Page More 1.0/Page_MoRe/button_Add Product'))

WebUI.click(findTestObject('Object Repository/Page More 1.0/Page_MoRe/button_Save Order'))

WebUI.click(findTestObject('Object Repository/Page More 1.0/Page_MoRe/button_Yes'))

WebUI.click(findTestObject('Object Repository/Page More 1.0/Page_MoRe/div_Update sales order success'))

WebUI.click(findTestObject('Object Repository/Page More 1.0/Page_MoRe/button_OK'))

WebUI.waitForElementClickable(findTestObject('Page More 1.0/Page_MoRe/button_Submit'), 300)

WebUI.click(findTestObject('Object Repository/Page More 1.0/Page_MoRe/button_Submit'))

WebUI.click(findTestObject('Object Repository/Page More 1.0/Page_MoRe/button_OK'))

WebUI.click(findTestObject('Object Repository/Page More 1.0/Page_MoRe/img_MHC Kelapa Gading_img-profile rounded-circle'))

WebUI.closeBrowser()

