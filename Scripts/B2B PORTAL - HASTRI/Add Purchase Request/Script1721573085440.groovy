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

WebUI.navigateToUrl('https://b2b-dev.modena.com/')

WebUI.setText(findTestObject('Object Repository/B2B PORTAL - HASTRI/Purchase Request/Page_B2B Portal/input_Email Account_username'), 
    'choirul.ilahi@modena.com')

WebUI.selectOptionByValue(findTestObject('Object Repository/B2B PORTAL - HASTRI/Purchase Request/Page_B2B Portal/select_-- Choose Your Company --PT. ABCPT Autosave'), 
    '205', true)

WebUI.setEncryptedText(findTestObject('Object Repository/B2B PORTAL - HASTRI/Purchase Request/Page_B2B Portal/input_Password_password'), 
    'iFGeFYmXIrUhQZHvW7P22w==')

WebUI.click(findTestObject('Object Repository/B2B PORTAL - HASTRI/Purchase Request/Page_B2B Portal/button_Login'))

WebUI.click(findTestObject('Object Repository/B2B PORTAL - HASTRI/Purchase Request/Page_B2B Portal/div_keyboard_double_arrow_rightHide Menu'))

WebUI.click(findTestObject('Object Repository/B2B PORTAL - HASTRI/Purchase Request/Page_B2B Portal/div_Vendor'))

WebUI.click(findTestObject('Object Repository/B2B PORTAL - HASTRI/Purchase Request/Page_B2B Portal/a_Purchase Request'))

WebUI.click(findTestObject('Object Repository/B2B PORTAL - HASTRI/Purchase Request/Page_B2B Portal/button_Add Purchase Request'))

WebUI.setText(findTestObject('Object Repository/B2B PORTAL - HASTRI/Purchase Request/Page_B2B Portal/input_PR Need Date_pr_need_date'), 
    '09252024')

WebUI.setText(findTestObject('Object Repository/B2B PORTAL - HASTRI/Purchase Request/Page_B2B Portal/textarea_Shipping Address_shipping_address'), 
    'tes1')

WebUI.setText(findTestObject('Object Repository/B2B PORTAL - HASTRI/Purchase Request/Page_B2B Portal/textarea_Summary RequestDescription_summary_049f2b'), 
    'tes1')

WebUI.click(findTestObject('Object Repository/B2B PORTAL - HASTRI/Purchase Request/Page_B2B Portal/div_Battery Charger ZQ521, 3 SlotPriceRp 5,_8683d4'))

WebUI.setText(findTestObject('Object Repository/B2B PORTAL - HASTRI/Purchase Request/Page_B2B Portal/input_Request For_request_for'), 
    'tes1')

WebUI.setText(findTestObject('Object Repository/B2B PORTAL - HASTRI/Purchase Request/Page_B2B Portal/input_Quantity_quantity'), 
    '2')

WebUI.setText(findTestObject('Object Repository/B2B PORTAL - HASTRI/Purchase Request/Page_B2B Portal/textarea_t'), 't')

WebUI.setText(findTestObject('Object Repository/B2B PORTAL - HASTRI/Purchase Request/Page_B2B Portal/textarea_te'), 'te')

WebUI.setText(findTestObject('Object Repository/B2B PORTAL - HASTRI/Purchase Request/Page_B2B Portal/textarea_tes'), 'tes')

WebUI.setText(findTestObject('Object Repository/B2B PORTAL - HASTRI/Purchase Request/Page_B2B Portal/textarea_tes1'), 'tes1')

WebUI.click(findTestObject('Object Repository/B2B PORTAL - HASTRI/Purchase Request/Page_B2B Portal/button_Select'))

WebUI.click(findTestObject('Object Repository/B2B PORTAL - HASTRI/Purchase Request/Page_B2B Portal/button_Send  Save'))

WebUI.setText(findTestObject('Object Repository/B2B PORTAL - HASTRI/Purchase Request/Page_B2B Portal/textarea_t_1'), 't')

WebUI.setText(findTestObject('Object Repository/B2B PORTAL - HASTRI/Purchase Request/Page_B2B Portal/textarea_te_1'), 'te')

WebUI.setText(findTestObject('Object Repository/B2B PORTAL - HASTRI/Purchase Request/Page_B2B Portal/textarea_tes_1'), 'tes')

WebUI.setText(findTestObject('Object Repository/B2B PORTAL - HASTRI/Purchase Request/Page_B2B Portal/textarea_tes1_1'), 
    'tes1')

WebUI.click(findTestObject('Object Repository/B2B PORTAL - HASTRI/Purchase Request/Page_B2B Portal/button_Send Approval'))

WebUI.click(findTestObject('Object Repository/B2B PORTAL - HASTRI/Purchase Request/Page_B2B Portal/button_OK'))

WebUI.closeBrowser()

