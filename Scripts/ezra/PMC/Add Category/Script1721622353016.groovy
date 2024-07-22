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

WebUI.sendKeys(findTestObject('Object Repository/CMS/Page_MODENA/input_Password_password'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/CMS/Page_MODENA/a_Master'))

WebUI.click(findTestObject('Object Repository/CMS/Page_MODENA/a_Product'))

WebUI.click(findTestObject('Object Repository/CMS/Page_MODENA/p_Master Product'))

WebUI.click(findTestObject('Object Repository/CMS/Page_MODENA/td_AX224777RD.JPXDB5J'))

WebUI.click(findTestObject('Object Repository/CMS/Page_MODENA/button_Close'))

WebUI.click(findTestObject('Object Repository/CMS/Page_MODENA/button_Add'))

WebUI.selectOptionByValue(findTestObject('Object Repository/CMS/Page_MODENA/select_Select Subcategory PrefixCUWSAXBABBB_17fa1a'), 
    'AX', true)

WebUI.click(findTestObject('Object Repository/CMS/Page_MODENA/a_4'))

WebUI.selectOptionByValue(findTestObject('Object Repository/CMS/Page_MODENA/select_Select Code0123456789'), '1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/CMS/Page_MODENA/select_Select ColorBlackBlack GlassBlack Ma_44b2d0'), 
    'EL', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/CMS/Page_MODENA/select_Select Part Change Sequence0123456789'), 
    '6', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/CMS/Page_MODENA/select_Select BrandHONDATOYOTAENERGYMODENA _21fc10'), 
    '5-TYT', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/CMS/Page_MODENA/select_Select CountryAfghanistanAland Islan_c0361e'), 
    'au', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/CMS/Page_MODENA/select_Select Part Change LocationOriginalM_aea900'), 
    'E', true)

WebUI.setText(findTestObject('Object Repository/CMS/Page_MODENA/input_Item Name_item_name'), 'test')

WebUI.selectOptionByValue(findTestObject('Object Repository/CMS/Page_MODENA/select_Select CertificateNo certificationSN_73f234'), 
    'A', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/CMS/Page_MODENA/select_Select UnitUNIT'), 'UNIT', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/CMS/Page_MODENA/select_Select GroupFG - HOME APPLIANCEFG - _be317a'), 
    '113', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/CMS/Page_MODENA/select_Select Electrical Rating220V50Hz220V_8a33e7'), 
    'D', true)

WebUI.setText(findTestObject('Object Repository/CMS/Page_MODENA/input_Supplier Code_cardcode'), 'test')

WebUI.click(findTestObject('Object Repository/CMS/Page_MODENA/div_CVC TESTING TECHNOLOGY CO.,LTD'))

WebUI.click(findTestObject('Object Repository/CMS/Page_MODENA/input_Supplier Code_cardcode'))

WebUI.click(findTestObject('Object Repository/CMS/Page_MODENA/input_Supplier Code_cardcode'))

WebUI.setText(findTestObject('Object Repository/CMS/Page_MODENA/input_Supplier Code_cardcode'), 'VCN-C037-9')

WebUI.selectOptionByValue(findTestObject('Object Repository/CMS/Page_MODENA/select_Select AssemblyCBUCKDSKD'), 'B-CBU', 
    true)

WebUI.setText(findTestObject('Object Repository/CMS/Page_MODENA/input_Scale_scale'), 'test')

WebUI.click(findTestObject('Object Repository/CMS/Page_MODENA/div_Model CodeItem NameGroupSelect GroupFG _f6dbed'))

WebUI.click(findTestObject('Object Repository/CMS/Page_MODENA/input_Launch Date_launch_date'))

WebUI.setText(findTestObject('Object Repository/CMS/Page_MODENA/input_Original Item (SKU)_item_code_original'), 'test')

WebUI.setText(findTestObject('Object Repository/CMS/Page_MODENA/input_Barcode EAN-13_barcode_sni'), 'test')

WebUI.setText(findTestObject('Object Repository/CMS/Page_MODENA/input_Serial Number_barcode_qr'), 'test')

WebUI.selectOptionByValue(findTestObject('Object Repository/CMS/Page_MODENA/select_Select SeriesMODENA'), '1', true)

WebUI.setText(findTestObject('Object Repository/CMS/Page_MODENA/input_Height (mm)_height'), '23')

WebUI.setText(findTestObject('Object Repository/CMS/Page_MODENA/input_Width (mm)_width'), '23')

WebUI.setText(findTestObject('Object Repository/CMS/Page_MODENA/input_Length (mm)_length'), '23')

WebUI.setText(findTestObject('Object Repository/CMS/Page_MODENA/input_Thickness (mm)_thickness'), '23')

WebUI.setText(findTestObject('Object Repository/CMS/Page_MODENA/input_Weight_weight'), '23')

WebUI.selectOptionByValue(findTestObject('Object Repository/CMS/Page_MODENA/select_Select Weight TypeGramKG'), 'GR', true)

WebUI.setText(findTestObject('Object Repository/CMS/Page_MODENA/input_Outer Height (mm)_outer_height'), '23')

WebUI.setText(findTestObject('Object Repository/CMS/Page_MODENA/input_Outer Width (mm)_outer_width'), '23')

WebUI.setText(findTestObject('Object Repository/CMS/Page_MODENA/input_Outer Length (mm)_outer_length'), '23')

WebUI.setText(findTestObject('Object Repository/CMS/Page_MODENA/input_Outer Depth (mm)_outer_depth'), '0')

WebUI.setText(findTestObject('Object Repository/CMS/Page_MODENA/input_Outer Weight (kg)_outer_weight'), '23')

WebUI.setText(findTestObject('Object Repository/CMS/Page_MODENA/input_Height (mm)_cut_out_height'), '23')

WebUI.setText(findTestObject('Object Repository/CMS/Page_MODENA/input_Width (mm)_cut_out_width'), '23')

WebUI.setText(findTestObject('Object Repository/CMS/Page_MODENA/input_Length (mm)_cut_out_length'), '23')

WebUI.click(findTestObject('Object Repository/CMS/Page_MODENA/input_Length (mm)_cut_out_length'))

WebUI.setText(findTestObject('Object Repository/CMS/Page_MODENA/input_Depth (mm)_cut_out_depth'), '23')

WebUI.setText(findTestObject('Object Repository/CMS/Page_MODENA/input_Height (mm)_cut_out_height_topmount'), '23')

WebUI.setText(findTestObject('Object Repository/CMS/Page_MODENA/input_Width (mm)_cut_out_width_topmount'), '23')

WebUI.setText(findTestObject('Object Repository/CMS/Page_MODENA/input_Length (mm)_cut_out_length_topmount'), '')

WebUI.setText(findTestObject('Object Repository/CMS/Page_MODENA/input_Height (mm)_cut_out_height_undermount'), '23')

WebUI.setText(findTestObject('Object Repository/CMS/Page_MODENA/input_Width (mm)_cut_out_width_undermount'), '23')

WebUI.setText(findTestObject('Object Repository/CMS/Page_MODENA/input_Length (mm)_cut_out_length_undermount'), '23')

WebUI.setText(findTestObject('Object Repository/CMS/Page_MODENA/input_Length (mm)_cut_out_length_topmount'), '23')

WebUI.click(findTestObject('Object Repository/CMS/Page_MODENA/button_Save'))

WebUI.selectOptionByValue(findTestObject('Object Repository/CMS/Page_MODENA/select_Select Sub - SubcategoryDowndraft Ho_8564d0'), 
    '12', true)

WebUI.setText(findTestObject('Object Repository/CMS/Page_MODENA/input_Depth (mm)_depth'), '0')

WebUI.setText(findTestObject('Object Repository/CMS/Page_MODENA/input_Outer Depth (mm)_outer_depth'), '0')

WebUI.click(findTestObject('Object Repository/CMS/Page_MODENA/button_Save'))

