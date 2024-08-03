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

WebUI.navigateToUrl('https://www.modena.com/id_id')

WebUI.click(findTestObject('Object Repository/website/Login, Add Item, Checkout/a_Masuk'))

WebUI.setText(findTestObject('Object Repository/website/Login, Add Item, Checkout/input_Masuk_email'), 'akbarerza3@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/website/Login, Add Item, Checkout/input_Masuk_password'), '4fedHSGQWPFwXDpLXl3AIA==')

WebUI.click(findTestObject('Object Repository/website/Login, Add Item, Checkout/button_Masuk'))

WebUI.click(findTestObject('Object Repository/website/Login, Add Item, Checkout/a_Produk'))

WebUI.click(findTestObject('Object Repository/website/Login, Add Item, Checkout/div_HYBRID HOB'))

WebUI.click(findTestObject('Object Repository/website/Login, Add Item, Checkout/button_Masukkan ke keranjang'))

WebUI.click(findTestObject('Object Repository/website/Login, Add Item, Checkout/i_Korporasi_fi-rr-shopping-cart'))

WebUI.click(findTestObject('Object Repository/website/Login, Add Item, Checkout/a_Checkout'))

WebUI.click(findTestObject('Object Repository/website/Login, Add Item, Checkout/a_Add Address'))

WebUI.setText(findTestObject('Object Repository/website/Login, Add Item, Checkout/input_Address Name_title'), 'test3')

WebUI.setText(findTestObject('Object Repository/website/Login, Add Item, Checkout/input_Nama Penerima_recipient_name'), 
    '12345')

WebUI.click(findTestObject('Object Repository/website/Login, Add Item, Checkout/div_Choose shipping address                _43ce87'))

WebUI.setText(findTestObject('Object Repository/website/Login, Add Item, Checkout/input_Nama Penerima_recipient_name'), 
    'erza')

WebUI.doubleClick(findTestObject('Object Repository/website/Login, Add Item, Checkout/input_Nama Penerima_recipient_name'))

WebUI.setText(findTestObject('Object Repository/website/Login, Add Item, Checkout/input_Nomor Telepon_phone_number'), '081280984758')

WebUI.setText(findTestObject('Object Repository/website/Login, Add Item, Checkout/textarea_Alamat_address'), 'jalan test')

WebUI.selectOptionByValue(findTestObject('Object Repository/website/Login, Add Item, Checkout/select_Pilih ProvinsiAcehBaliBantenBengkulu_cabdf7'), 
    '1794', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/website/Login, Add Item, Checkout/select_Pilih KotaBarito SelatanBarito Timur_800a3c'), 
    '149345', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/website/Login, Add Item, Checkout/select_Pilih KecamatanBarito Tuhup RayaLaun_800c3c'), 
    '4240', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/website/Login, Add Item, Checkout/select_Pilih KecamatanBatu MakapKalapeh Bar_721505'), 
    '52877', true)

WebUI.click(findTestObject('Object Repository/website/Login, Add Item, Checkout/button_Save Address'))

