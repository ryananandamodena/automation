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

WebUI.setText(findTestObject('Object Repository/PMC/End To End Testing/input_Email or Username_username'), 'arman.septian')

WebUI.setEncryptedText(findTestObject('Object Repository/PMC/End To End Testing/input_Password_password'), 'iFGeFYmXIrUhQZHvW7P22w==')

WebUI.click(findTestObject('Object Repository/PMC/End To End Testing/button_Sign In'))

WebUI.click(findTestObject('Object Repository/PMC/End To End Testing/a_Product'))

WebUI.click(findTestObject('Object Repository/PMC/End To End Testing/p_Master Product'))

WebUI.click(findTestObject('Object Repository/PMC/End To End Testing/button_Add'))

WebUI.selectOptionByValue(findTestObject('Object Repository/PMC/End To End Testing/select_Select Subcategory PrefixCUWSAXBABBB_17fa1a'), 
    'AX', true)

WebUI.click(findTestObject('Object Repository/PMC/End To End Testing/a_3'))

WebUI.selectOptionByValue(findTestObject('Object Repository/PMC/End To End Testing/select_Select Code0123456789'), '9', 
    true)

WebUI.click(findTestObject('Object Repository/PMC/End To End Testing/a_4'))

WebUI.selectOptionByValue(findTestObject('Object Repository/PMC/End To End Testing/select_Select Code0123456789'), '2', 
    true)

WebUI.click(findTestObject('Object Repository/PMC/End To End Testing/a_5'))

WebUI.selectOptionByValue(findTestObject('Object Repository/PMC/End To End Testing/select_Select Code0123456789'), '3', 
    true)

WebUI.click(findTestObject('Object Repository/PMC/End To End Testing/a_6'))

WebUI.selectOptionByValue(findTestObject('Object Repository/PMC/End To End Testing/select_Select Code0123456789'), '5', 
    true)

WebUI.click(findTestObject('Object Repository/PMC/End To End Testing/a_7'))

WebUI.selectOptionByValue(findTestObject('Object Repository/PMC/End To End Testing/select_Select Code0123456789'), '6', 
    true)

WebUI.click(findTestObject('Object Repository/PMC/End To End Testing/a_8'))

WebUI.selectOptionByValue(findTestObject('Object Repository/PMC/End To End Testing/select_Select Code0123456789'), '7', 
    true)

WebUI.selectOptionByValue(findTestObject('Object Repository/PMC/End To End Testing/select_Select ColorBlackBlack GlassBlack Ma_44b2d0'), 
    'GB', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/PMC/End To End Testing/select_Select CountryAfghanistanAland Islan_c0361e'), 
    'bs', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/PMC/End To End Testing/select_Select BrandHONDATOYOTAENERGYMODENA _21fc10'), 
    '3-PRO', true)

WebUI.click(findTestObject('Object Repository/PMC/End To End Testing/div_Part Change SequenceSelect Part Change _bf464c'))

WebUI.selectOptionByValue(findTestObject('Object Repository/PMC/End To End Testing/select_Select Part Change LocationOriginalM_aea900'), 
    'H', true)

WebUI.setText(findTestObject('Object Repository/PMC/End To End Testing/input_Item Name_item_name'), 'test')

WebUI.selectOptionByValue(findTestObject('Object Repository/PMC/End To End Testing/select_Select CertificateNo certificationSN_73f234'), 
    'B', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/PMC/End To End Testing/select_Select UnitUNIT'), 'UNIT', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/PMC/End To End Testing/select_Select GroupFG - HOME APPLIANCEFG - _be317a'), 
    '113', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/PMC/End To End Testing/select_Select Electrical Rating220V50Hz220V_8a33e7'), 
    'X', true)

WebUI.click(findTestObject('Object Repository/PMC/End To End Testing/div_Model CodeItem NameGroupSelect GroupFG _f6dbed'))

WebUI.setText(findTestObject('Object Repository/PMC/End To End Testing/input_Supplier Code_cardcode'), 'VCN-C037-9')

WebUI.selectOptionByValue(findTestObject('Object Repository/PMC/End To End Testing/select_Select AssemblyCBUCKDSKD'), 'C-CKD', 
    true)

WebUI.setText(findTestObject('Object Repository/PMC/End To End Testing/input_Scale_scale'), '234')

WebUI.setText(findTestObject('Object Repository/PMC/End To End Testing/input_Launch Date_launch_date'), '2024-07-18')

WebUI.selectOptionByValue(findTestObject('Object Repository/PMC/End To End Testing/select_Select Sub - SubcategoryDowndraft Ho_8564d0'), 
    '17', true)

WebUI.setText(findTestObject('Object Repository/PMC/End To End Testing/input_Original Item (SKU)_item_code_original'), '234')

WebUI.setText(findTestObject('Object Repository/PMC/End To End Testing/input_Barcode EAN-13_barcode_sni'), '234')

WebUI.setText(findTestObject('Object Repository/PMC/End To End Testing/input_Serial Number_barcode_qr'), '234')

WebUI.selectOptionByValue(findTestObject('Object Repository/PMC/End To End Testing/select_Select SeriesMODENA'), '1', true)

WebUI.setText(findTestObject('Object Repository/PMC/End To End Testing/input_Height (mm)_height'), '023')

WebUI.setText(findTestObject('Object Repository/PMC/End To End Testing/input_Width (mm)_width'), '0234')

WebUI.setText(findTestObject('Object Repository/PMC/End To End Testing/input_Length (mm)_length'), '43')

WebUI.click(findTestObject('Object Repository/PMC/End To End Testing/input_Length (mm)_length'))

WebUI.setText(findTestObject('Object Repository/PMC/End To End Testing/input_Depth (mm)_depth'), '0')

WebUI.setText(findTestObject('Object Repository/PMC/End To End Testing/input_Thickness (mm)_thickness'), '023')

WebUI.setText(findTestObject('Object Repository/PMC/End To End Testing/input_Weight_weight'), '023')

WebUI.selectOptionByValue(findTestObject('Object Repository/PMC/End To End Testing/select_Select Weight TypeGramKG'), 'GR', 
    true)

WebUI.setText(findTestObject('Object Repository/PMC/End To End Testing/input_Outer Height (mm)_outer_height'), '023')

WebUI.setText(findTestObject('Object Repository/PMC/End To End Testing/input_Outer Width (mm)_outer_width'), '023')

WebUI.setText(findTestObject('Object Repository/PMC/End To End Testing/input_Outer Length (mm)_outer_length'), '023')

WebUI.setText(findTestObject('Object Repository/PMC/End To End Testing/input_Outer Depth (mm)_outer_depth'), '0')

WebUI.setText(findTestObject('Object Repository/PMC/End To End Testing/input_Outer Weight (kg)_outer_weight'), '023')

WebUI.setText(findTestObject('Object Repository/PMC/End To End Testing/input_Height (mm)_cut_out_height'), '023')

WebUI.setText(findTestObject('Object Repository/PMC/End To End Testing/input_Width (mm)_cut_out_width'), '023')

WebUI.setText(findTestObject('Object Repository/PMC/End To End Testing/input_Length (mm)_cut_out_length'), '023')

WebUI.setText(findTestObject('Object Repository/PMC/End To End Testing/input_Depth (mm)_cut_out_depth'), '023')

WebUI.setText(findTestObject('Object Repository/PMC/End To End Testing/input_Height (mm)_cut_out_height_topmount'), '2')

WebUI.click(findTestObject('Object Repository/PMC/End To End Testing/input_Height (mm)_cut_out_height_topmount'))

WebUI.doubleClick(findTestObject('Object Repository/PMC/End To End Testing/input_Height (mm)_cut_out_height_topmount'))

WebUI.setText(findTestObject('Object Repository/PMC/End To End Testing/input_Height (mm)_cut_out_height_topmount'), '23')

WebUI.setText(findTestObject('Object Repository/PMC/End To End Testing/input_Width (mm)_cut_out_width_topmount'), '023')

WebUI.setText(findTestObject('Object Repository/PMC/End To End Testing/input_Length (mm)_cut_out_length_topmount'), '023')

WebUI.setText(findTestObject('Object Repository/PMC/End To End Testing/input_Height (mm)_cut_out_height_undermount'), '023')

WebUI.setText(findTestObject('Object Repository/PMC/End To End Testing/input_Width (mm)_cut_out_width_undermount'), '023')

WebUI.setText(findTestObject('Object Repository/PMC/End To End Testing/input_Length (mm)_cut_out_length_undermount'), '230')

WebUI.click(findTestObject('Object Repository/PMC/End To End Testing/i_Save_fa fa-save'))

WebUI.selectOptionByValue(findTestObject('Object Repository/PMC/End To End Testing/select_Select Part Change Sequence0123456789'), 
    '4', true)

WebUI.click(findTestObject('Object Repository/PMC/End To End Testing/button_Save'))

WebUI.click(findTestObject('Object Repository/PMC/End To End Testing/button_OK'))

WebUI.click(findTestObject('Object Repository/PMC/End To End Testing/div_NoCodeModelNameSeriesSegmentCategorySub_490e57'))

WebUI.click(findTestObject('PMC/End To End Testing/top master'))

WebUI.scrollToElement(findTestObject('PMC/End To End Testing/button_Edit Product'), 0)

WebUI.click(findTestObject('Object Repository/PMC/End To End Testing/button_Edit Product'))

WebUI.setText(findTestObject('Object Repository/PMC/End To End Testing/input_Model Code_model_code'), '999')

WebUI.setText(findTestObject('Object Repository/PMC/End To End Testing/input_Outer Height (mm)_outer_height'), '23.0023')

WebUI.setText(findTestObject('Object Repository/PMC/End To End Testing/input_Width (mm)_cut_out_width_undermount'), '23.0043')

WebUI.click(findTestObject('Object Repository/PMC/End To End Testing/button_Save'))

WebUI.setText(findTestObject('Object Repository/PMC/End To End Testing/textarea_Please enter a remarkmessage about_b9e68f'), 
    'test')

WebUI.click(findTestObject('PMC/End To End Testing/button_Submit'))

WebUI.click(findTestObject('PMC/End To End Testing/button_OK'))

WebUI.click(findTestObject('Object Repository/PMC/End To End Testing/a_Approvals'))

WebUI.click(findTestObject('PMC/End To End Testing/i_navigate_next'))

WebUI.click(findTestObject('PMC/End To End Testing/span_View top row'))

WebUI.setText(findTestObject('Object Repository/PMC/End To End Testing/textarea_test'), 'test')

WebUI.setText(findTestObject('Object Repository/PMC/End To End Testing/textarea_test_1'), 'test')

WebUI.setText(findTestObject('Object Repository/PMC/End To End Testing/textarea_test_1_2'), 'test')

WebUI.setText(findTestObject('Object Repository/PMC/End To End Testing/textarea_test_1_2_3'), 'test')

WebUI.click(findTestObject('Object Repository/PMC/End To End Testing/button_Save'))

WebUI.setText(findTestObject('Object Repository/PMC/End To End Testing/input_Product Display Name_product_display_name'), 
    'test')

WebUI.setText(findTestObject('Object Repository/PMC/End To End Testing/input_SEO Title_seo_title'), 'test')

WebUI.setText(findTestObject('Object Repository/PMC/End To End Testing/input_URL AR_url_ar'), 'test')

WebUI.setText(findTestObject('Object Repository/PMC/End To End Testing/input_Price_price'), 'Rp0')

WebUI.setText(findTestObject('Object Repository/PMC/End To End Testing/input_Title_title'), 'test')

WebUI.setText(findTestObject('Object Repository/PMC/End To End Testing/input_Tagline_tagline'), 'test')

WebUI.click(findTestObject('Object Repository/PMC/End To End Testing/div_Including'))

WebUI.setText(findTestObject('Object Repository/PMC/End To End Testing/textarea_test_1_2_3_4'), 'test')

WebUI.click(findTestObject('Object Repository/PMC/End To End Testing/button_Save'))

WebUI.setText(findTestObject('Object Repository/PMC/End To End Testing/textarea_Please enter a remarkmessage about_b9e68f'), 
    'test')

WebUI.click(findTestObject('Object Repository/PMC/End To End Testing/button_Submit'))

WebUI.click(findTestObject('Object Repository/PMC/End To End Testing/button_OK'))

WebUI.click(findTestObject('Object Repository/PMC/End To End Testing/span_Arman Septian'))

WebUI.click(findTestObject('Object Repository/PMC/End To End Testing/button_Sign Out'))

WebUI.setText(findTestObject('Object Repository/PMC/End To End Testing/input_Email or Username_username'), 'muhamad.nur')

WebUI.setEncryptedText(findTestObject('Object Repository/PMC/End To End Testing/input_Password_password'), 'iFGeFYmXIrUhQZHvW7P22w==')

WebUI.click(findTestObject('Object Repository/PMC/End To End Testing/button_Sign In'))

WebUI.click(findTestObject('Object Repository/PMC/End To End Testing/a_Approvals'))

WebUI.click(findTestObject('Object Repository/PMC/End To End Testing/button_navigate_next'))

WebUI.click(findTestObject('Object Repository/PMC/End To End Testing/i_navigate_before'))

WebUI.click(findTestObject('PMC/End To End Testing/span_View top row'))

WebUI.setText(findTestObject('Object Repository/PMC/End To End Testing/input_Title_title'), 'test')

WebUI.setText(findTestObject('Object Repository/PMC/End To End Testing/textarea_test'), 'test')

WebUI.setText(findTestObject('Object Repository/PMC/End To End Testing/textarea_test_1_2'), 'test')

WebUI.click(findTestObject('Object Repository/PMC/End To End Testing/button_Approve'))

WebUI.setText(findTestObject('Object Repository/PMC/End To End Testing/textarea_Please enter a remarkmessage about_b9e68f'), 
    'test')

WebUI.click(findTestObject('Object Repository/PMC/End To End Testing/button_Submit'))

WebUI.click(findTestObject('Object Repository/PMC/End To End Testing/button_OK'))

WebUI.closeBrowser()

