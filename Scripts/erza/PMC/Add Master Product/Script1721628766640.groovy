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

WebUI.setText(findTestObject('Object Repository/CMS/Page_MODENA/input_Email or Username_username'), 'arman.septian')

WebUI.setEncryptedText(findTestObject('Object Repository/CMS/Page_MODENA/input_Password_password'), 'iFGeFYmXIrUhQZHvW7P22w==')

WebUI.click(findTestObject('Object Repository/CMS/Page_MODENA/button_Sign In'))

WebUI.click(findTestObject('Object Repository/CMS/Page_MODENA/a_Product'))

WebUI.click(findTestObject('Object Repository/CMS/Page_MODENA/p_Master Product'))

WebUI.click(findTestObject('Object Repository/CMS/Page_MODENA/button_Add'))

WebUI.click(findTestObject('Object Repository/CMS/Page_MODENA/a_3'))

WebUI.selectOptionByValue(findTestObject('Object Repository/CMS/Page_MODENA/select_Select Subcategory PrefixCUWSAXBABBB_17fa1a'), 
    'AX', true)

WebUI.click(findTestObject('Object Repository/CMS/Page_MODENA/a_3'))

WebUI.selectOptionByValue(findTestObject('Object Repository/CMS/Page_MODENA/select_Select Code0123456789'), '2', true)

WebUI.click(findTestObject('Object Repository/CMS/Page_MODENA/a_4'))

WebUI.selectOptionByValue(findTestObject('Object Repository/CMS/Page_MODENA/select_Select Code0123456789'), '3', true)

WebUI.click(findTestObject('Object Repository/CMS/Page_MODENA/a_5'))

WebUI.selectOptionByValue(findTestObject('Object Repository/CMS/Page_MODENA/select_Select Code0123456789'), '4', true)

WebUI.click(findTestObject('Object Repository/CMS/Page_MODENA/a_6'))

WebUI.selectOptionByValue(findTestObject('Object Repository/CMS/Page_MODENA/select_Select Code0123456789'), '5', true)

WebUI.click(findTestObject('Object Repository/CMS/Page_MODENA/a_7'))

WebUI.selectOptionByValue(findTestObject('Object Repository/CMS/Page_MODENA/select_Select Code0123456789'), '6', true)

WebUI.click(findTestObject('Object Repository/CMS/Page_MODENA/a_8'))

WebUI.selectOptionByValue(findTestObject('Object Repository/CMS/Page_MODENA/select_Select Code0123456789'), '7', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/CMS/Page_MODENA/select_Select ColorBlackBlack GlassBlack Ma_44b2d0'), 
    'GK', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/CMS/Page_MODENA/select_Select Part Change Sequence0123456789'), 
    '5', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/CMS/Page_MODENA/select_Select CountryAfghanistanAland Islan_c0361e'), 
    'az', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/CMS/Page_MODENA/select_Select BrandHONDATOYOTAENERGYMODENA _21fc10'), 
    '4-ENG', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/CMS/Page_MODENA/select_Select Part Change LocationOriginalM_aea900'), 
    'K', true)

WebUI.setText(findTestObject('Object Repository/CMS/Page_MODENA/input_Item Name_item_name'), 'test')

WebUI.selectOptionByValue(findTestObject('Object Repository/CMS/Page_MODENA/select_Select CertificateNo certificationSN_73f234'), 
    'B', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/CMS/Page_MODENA/select_Select UnitUNIT'), 'UNIT', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/CMS/Page_MODENA/select_Select GroupFG - HOME APPLIANCEFG - _be317a'), 
    '113', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/CMS/Page_MODENA/select_Select Electrical Rating220V50Hz220V_8a33e7'), 
    'X', true)

WebUI.setText(findTestObject('Object Repository/CMS/Page_MODENA/input_Supplier Code_cardcode'), 'VCN-C037-9')

WebUI.click(findTestObject('Object Repository/CMS/Page_MODENA/input_Series_series'))

WebUI.setText(findTestObject('Object Repository/CMS/Page_MODENA/input_Supplier Code_cardcode'), 'VCN-C037-9')

WebUI.click(findTestObject('Object Repository/CMS/Page_MODENA/input_Scale_scale'))

WebUI.setText(findTestObject('Object Repository/CMS/Page_MODENA/input_Scale_scale'), 'test')

WebUI.selectOptionByValue(findTestObject('Object Repository/CMS/Page_MODENA/select_Select AssemblyCBUCKDSKD'), 'C-CKD', 
    true)

WebUI.click(findTestObject('Object Repository/CMS/Page_MODENA/input_Launch Date_launch_date'))

WebUI.click(findTestObject('Object Repository/CMS/Page_MODENA/td_17'))

WebUI.selectOptionByValue(findTestObject('Object Repository/CMS/Page_MODENA/select_Select Sub - SubcategoryDowndraft Ho_8564d0'), 
    '13', true)

WebUI.setText(findTestObject('Object Repository/CMS/Page_MODENA/input_Original Item (SKU)_item_code_original'), '34')

WebUI.setText(findTestObject('Object Repository/CMS/Page_MODENA/input_Barcode EAN-13_barcode_sni'), '34')

WebUI.setText(findTestObject('Object Repository/CMS/Page_MODENA/input_Serial Number_barcode_qr'), '34')

WebUI.selectOptionByValue(findTestObject('Object Repository/CMS/Page_MODENA/select_Select SeriesMODENA'), '1', true)

WebUI.setText(findTestObject('Object Repository/CMS/Page_MODENA/input_Height (mm)_height'), '20')

WebUI.setText(findTestObject('Object Repository/CMS/Page_MODENA/input_Width (mm)_width'), '0')

WebUI.click(findTestObject('Object Repository/CMS/Page_MODENA/input_Height (mm)_height'))

WebUI.setText(findTestObject('Object Repository/CMS/Page_MODENA/input_Width (mm)_width'), '99')

WebUI.setText(findTestObject('Object Repository/CMS/Page_MODENA/input_Length (mm)_length'), '0')

WebUI.click(findTestObject('Object Repository/CMS/Page_MODENA/div_Length (mm)'))

WebUI.setText(findTestObject('Object Repository/CMS/Page_MODENA/input_Length (mm)_length'), '99')

WebUI.click(findTestObject('Object Repository/CMS/Page_MODENA/div_Length (mm)'))

WebUI.setText(findTestObject('Object Repository/CMS/Page_MODENA/input_Depth (mm)_depth'), '0')

WebUI.click(findTestObject('Object Repository/CMS/Page_MODENA/div_Product DimensionHeight (mm) Width (mm)_00446a'))

WebUI.setText(findTestObject('Object Repository/CMS/Page_MODENA/input_Thickness (mm)_thickness'), '99')

WebUI.setText(findTestObject('Object Repository/CMS/Page_MODENA/input_Weight_weight'), '100')

WebUI.click(findTestObject('Object Repository/CMS/Page_MODENA/div_Weight'))

WebUI.setText(findTestObject('Object Repository/CMS/Page_MODENA/input_Weight_weight'), '1')

WebUI.click(findTestObject('Object Repository/CMS/Page_MODENA/input_Weight_weight'))

WebUI.selectOptionByValue(findTestObject('Object Repository/CMS/Page_MODENA/select_Select Weight TypeGramKG'), 'GR', true)

WebUI.click(findTestObject('Object Repository/CMS/Page_MODENA/div_SKU NumberAX224246GK.AZBXC5K ListNameCo_675199'))

WebUI.setText(findTestObject('Object Repository/CMS/Page_MODENA/input_Outer Height (mm)_outer_height'), '2')

WebUI.click(findTestObject('Object Repository/CMS/Page_MODENA/div_Outer Height (mm)'))

WebUI.setText(findTestObject('Object Repository/CMS/Page_MODENA/input_Outer Width (mm)_outer_width'), '3')

WebUI.click(findTestObject('Object Repository/CMS/Page_MODENA/input_Outer Width (mm)_outer_width'))

WebUI.setText(findTestObject('Object Repository/CMS/Page_MODENA/input_Outer Length (mm)_outer_length'), '4')

WebUI.setText(findTestObject('Object Repository/CMS/Page_MODENA/input_Outer Depth (mm)_outer_depth'), '0')

WebUI.setText(findTestObject('Object Repository/CMS/Page_MODENA/input_Height (mm)_cut_out_height'), '5')

WebUI.click(findTestObject('Object Repository/CMS/Page_MODENA/input_Height (mm)_cut_out_height'))

WebUI.setText(findTestObject('Object Repository/CMS/Page_MODENA/input_Width (mm)_cut_out_width'), '6')

WebUI.setText(findTestObject('Object Repository/CMS/Page_MODENA/input_Length (mm)_cut_out_length'), '0')

WebUI.click(findTestObject('Object Repository/CMS/Page_MODENA/div_Width (mm)'))

WebUI.setText(findTestObject('Object Repository/CMS/Page_MODENA/input_Length (mm)_cut_out_length'), '7')

WebUI.setText(findTestObject('Object Repository/CMS/Page_MODENA/input_Depth (mm)_cut_out_depth'), '99')

WebUI.setText(findTestObject('Object Repository/CMS/Page_MODENA/input_Height (mm)_cut_out_height_topmount'), '0')

WebUI.click(findTestObject('Object Repository/CMS/Page_MODENA/div_Height (mm)'))

WebUI.setText(findTestObject('Object Repository/CMS/Page_MODENA/input_Height (mm)_cut_out_height_topmount'), '10')

WebUI.click(findTestObject('Object Repository/CMS/Page_MODENA/div_Product DimensionHeight (mm) Width (mm)_00446a'))

WebUI.setText(findTestObject('Object Repository/CMS/Page_MODENA/input_Width (mm)_cut_out_width_topmount'), '99')

WebUI.setText(findTestObject('Object Repository/CMS/Page_MODENA/input_Length (mm)_cut_out_length_topmount'), '99')

WebUI.setText(findTestObject('Object Repository/CMS/Page_MODENA/input_Height (mm)_cut_out_height_undermount'), '9')

WebUI.setText(findTestObject('Object Repository/CMS/Page_MODENA/input_Width (mm)_cut_out_width_undermount'), '8')

WebUI.setText(findTestObject('Object Repository/CMS/Page_MODENA/input_Length (mm)_cut_out_length_undermount'), '99')

WebUI.click(findTestObject('Object Repository/CMS/Page_MODENA/button_Save'))

WebUI.click(findTestObject('Object Repository/CMS/Page_MODENA/div_Outer Depth (mm)'))

WebUI.setText(findTestObject('Object Repository/CMS/Page_MODENA/input_Outer Weight (kg)_outer_weight'), '99')

WebUI.click(findTestObject('Object Repository/CMS/Page_MODENA/button_Save'))

WebUI.click(findTestObject('Object Repository/CMS/Page_MODENA/button_OK'))

