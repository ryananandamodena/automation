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

WebUI.navigateToUrl('https://pmcdev.modena.com/')

WebUI.setText(findTestObject('Object Repository/PMC/Edit Product Detail/input_Email or Username_username'), 'arman.septian')

WebUI.setEncryptedText(findTestObject('Object Repository/PMC/Edit Product Detail/input_Password_password'), 'iFGeFYmXIrUhQZHvW7P22w==')

WebUI.click(findTestObject('Object Repository/PMC/Edit Product Detail/button_Sign In'))

WebUI.click(findTestObject('Object Repository/PMC/Edit Product Detail/a_Product'))

WebUI.click(findTestObject('Object Repository/PMC/Edit Product Detail/a_Master Product'))

WebUI.click(findTestObject('Object Repository/PMC/Edit Product Detail/td_AX923566GB.BSBXC4H'))

WebUI.click(findTestObject('Object Repository/PMC/Edit Product Detail/button_Edit Product'))

WebUI.setText(findTestObject('Object Repository/PMC/Edit Product Detail/input_Item Name_item_name'), 'testaaaa')

WebUI.click(findTestObject('Object Repository/PMC/Edit Product Detail/button_Save'))

WebUI.setText(findTestObject('Object Repository/PMC/Edit Product Detail/textarea_Please enter a remarkmessage about_b9e68f'), 
    'testaaaa')

WebUI.click(findTestObject('Object Repository/PMC/Edit Product Detail/button_Submit'))

WebUI.click(findTestObject('Object Repository/PMC/Edit Product Detail/button_OK'))

WebUI.click(findTestObject('Object Repository/PMC/Edit Product Detail/a_Approvals'))

WebUI.scrollToElement(findTestObject('PMC/Edit Product Detail/i_navigate_next'), 0)

WebUI.click(findTestObject('Object Repository/PMC/Edit Product Detail/i_navigate_next'))

WebUI.click(findTestObject('PMC/Edit Product Detail/span_View AX993567GB.BSBXC4H'))

WebUI.click(findTestObject('Object Repository/PMC/Edit Product Detail/div_Product Image_card-body'))

WebUI.setText(findTestObject('Object Repository/PMC/Edit Product Detail/input_Title_title'), 'test')

WebUI.setText(findTestObject('Object Repository/PMC/Edit Product Detail/input_Tagline_tagline'), 'test')

WebUI.setText(findTestObject('Object Repository/PMC/Edit Product Detail/textarea_test'), 'test')

WebUI.setText(findTestObject('Object Repository/PMC/Edit Product Detail/textarea_test_1'), 'test')

WebUI.setText(findTestObject('Object Repository/PMC/Edit Product Detail/textarea_test_1_2'), 'test')

WebUI.setText(findTestObject('Object Repository/PMC/Edit Product Detail/textarea_test_1_2_3'), 'test')

WebUI.setText(findTestObject('Object Repository/PMC/Edit Product Detail/input_Price_price'), 'Rp3,423')

WebUI.setText(findTestObject('Object Repository/PMC/Edit Product Detail/input_SEO Title_seo_title'), 'test')

WebUI.setText(findTestObject('Object Repository/PMC/Edit Product Detail/input_Product Display Name_product_display_name'), 
    'test')

WebUI.click(findTestObject('Object Repository/PMC/Edit Product Detail/input_Product Display Name_product_display_name'))

WebUI.setText(findTestObject('Object Repository/PMC/Edit Product Detail/textarea_test_1_2_3_4'), 'test')

WebUI.setText(findTestObject('Object Repository/PMC/Edit Product Detail/input_URL AR_url_ar'), 'test')

WebUI.setText(findTestObject('Object Repository/PMC/Edit Product Detail/input_SKU (Stock Keeping Unit) Sticker Me B_aa4da2'), 
    'test')

WebUI.click(findTestObject('Object Repository/PMC/Edit Product Detail/input_SKU (Stock Keeping Unit) Sticker Me B_aa4da2'))

WebUI.setText(findTestObject('Object Repository/PMC/Edit Product Detail/input_Me By MODENA Sticker Price_sticker_price'), 
    '0234')

WebUI.click(findTestObject('Object Repository/PMC/Edit Product Detail/button_Save'))

WebUI.setText(findTestObject('Object Repository/PMC/Edit Product Detail/textarea_Please enter a remarkmessage about_b9e68f'), 
    'test')

WebUI.click(findTestObject('Object Repository/PMC/Edit Product Detail/button_Submit'))

WebUI.click(findTestObject('Object Repository/PMC/Edit Product Detail/button_OK'))

WebUI.click(findTestObject('Object Repository/PMC/Edit Product Detail/span_Arman Septian'))

WebUI.click(findTestObject('Object Repository/PMC/Edit Product Detail/i_Sign Out'))

WebUI.setText(findTestObject('Object Repository/PMC/Edit Product Detail/input_Email or Username_username'), 'muhamad.nur')

WebUI.setEncryptedText(findTestObject('Object Repository/PMC/Edit Product Detail/input_Password_password'), 'iFGeFYmXIrUhQZHvW7P22w==')

WebUI.click(findTestObject('PMC/Edit Product Detail/button_Sign In'))

WebUI.click(findTestObject('Object Repository/PMC/Edit Product Detail/a_Approvals'))

WebUI.click(findTestObject('PMC/Edit Product Detail/span_View AX993567GB.BSBXC4H'))

WebUI.click(findTestObject('Object Repository/PMC/Edit Product Detail/button_Approve'))

WebUI.setText(findTestObject('Object Repository/PMC/Edit Product Detail/textarea_Please enter a remarkmessage about_b9e68f'), 
    'test')

WebUI.click(findTestObject('Object Repository/PMC/Edit Product Detail/button_Submit'))

WebUI.click(findTestObject('Object Repository/PMC/Edit Product Detail/button_OK'))

