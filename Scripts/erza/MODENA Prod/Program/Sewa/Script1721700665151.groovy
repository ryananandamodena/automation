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

WebUI.navigateToUrl('https://www.modena.com/id_id/service/rental')

WebUI.selectOptionByValue(findTestObject('Object Repository/website/Page_Rental atau sewa produk dapur  MODENA/select_Pilih Judul Anda                    _e0c890'), 
    '220', true)

WebUI.setText(findTestObject('Object Repository/website/Page_Rental atau sewa produk dapur  MODENA/input__name'), 'test')

WebUI.setText(findTestObject('Object Repository/website/Page_Rental atau sewa produk dapur  MODENA/input__email'), 'test')

WebUI.setText(findTestObject('Object Repository/website/Page_Rental atau sewa produk dapur  MODENA/input__phone'), '2')

WebUI.setText(findTestObject('Object Repository/website/Page_Rental atau sewa produk dapur  MODENA/textarea__address'), 
    't')

WebUI.selectOptionByValue(findTestObject('Object Repository/website/Page_Rental atau sewa produk dapur  MODENA/select_Pilih ProvinsiAcehBaliBantenBengkulu_cabdf7'), 
    '1804', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/website/Page_Rental atau sewa produk dapur  MODENA/select_Pilih KotaBalikpapanBerauBontangKuta_ae68ef'), 
    '149349', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/website/Page_Rental atau sewa produk dapur  MODENA/select_Pilih KecamatanBalikpapan BaratBalik_a2d421'), 
    '4395', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/website/Page_Rental atau sewa produk dapur  MODENA/select_Pilih KecamatanDamaiKlandasan IlirKl_f2120c'), 
    '54500', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/website/Page_Rental atau sewa produk dapur  MODENA/select_Pilih Kode Pos Anda76114'), 
    '54500', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/website/Page_Rental atau sewa produk dapur  MODENA/select_Pilih Produk                        _710270'), 
    '8', true)

WebUI.setText(findTestObject('Object Repository/website/Page_Rental atau sewa produk dapur  MODENA/input__product0qty'), 
    '02')

WebUI.click(findTestObject('Object Repository/website/Page_Rental atau sewa produk dapur  MODENA/button_Kirim'))

