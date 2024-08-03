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

WebUI.navigateToUrl('https://www.modena.com/id_id/service/trade-in')

WebUI.selectOptionByValue(findTestObject('Object Repository/website/Page_Pusat servis atau Service Center  MODENA/select_Pilih Judul Anda                    _e0c890'), 
    '220', true)

WebUI.setText(findTestObject('Object Repository/website/Page_Pusat servis atau Service Center  MODENA/input__name'), 'test')

WebUI.setText(findTestObject('Object Repository/website/Page_Pusat servis atau Service Center  MODENA/input__email'), 'test')

WebUI.setText(findTestObject('Object Repository/website/Page_Pusat servis atau Service Center  MODENA/input__phone'), '2342')

WebUI.setText(findTestObject('Object Repository/website/Page_Pusat servis atau Service Center  MODENA/textarea__address'), 
    'test')

WebUI.selectOptionByValue(findTestObject('Object Repository/website/Page_Pusat servis atau Service Center  MODENA/select_Pilih ProvinsiAcehBaliBantenBengkulu_cabdf7'), 
    '1804', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/website/Page_Pusat servis atau Service Center  MODENA/select_Pilih Kategori                      _af3b5f'), 
    '17', true)

WebUI.click(findTestObject('Object Repository/website/Page_Pusat servis atau Service Center  MODENA/input__product_info0brand'))

WebUI.selectOptionByValue(findTestObject('Object Repository/website/Page_Pusat servis atau Service Center  MODENA/select_Pilih di sini                       _c46876'), 
    '3 years', true)

WebUI.click(findTestObject('Object Repository/website/Page_Pusat servis atau Service Center  MODENA/input_Produk_product_info0requests'))

WebUI.click(findTestObject('Object Repository/website/Page_Pusat servis atau Service Center  MODENA/input_Tambah Produk Baru_declare'))

WebUI.click(findTestObject('Object Repository/website/Page_Pusat servis atau Service Center  MODENA/button_Kirim'))

WebUI.closeBrowser()

