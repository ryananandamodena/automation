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

WebUI.navigateToUrl('https://energy.modena.com/')

WebUI.click(findTestObject('MODENA Energy/Page_MODENA Energy/button_Hitung Sekarang'))

WebUI.click(findTestObject('Object Repository/MODENA Energy/Page_MODENA Energy/div_Rumah'))

WebUI.click(findTestObject('Object Repository/MODENA Energy/Page_MODENA Energy/input_Pilih Jenis Properti yang Dimiliki_ne_2bc63f'))

WebUI.setText(findTestObject('Object Repository/MODENA Energy/Page_MODENA Energy/input_Tagihan Listrik Perbulan (Rp)_tagihan_7ffa47'), 
    '200.0000')

WebUI.click(findTestObject('Object Repository/MODENA Energy/Page_MODENA Energy/input_Kapasitas Daya Minimal 6.600_next-section-2'))

WebUI.setText(findTestObject('Object Repository/MODENA Energy/Page_MODENA Energy/input_Nama_fullname'), 'Erza')

WebUI.setText(findTestObject('Object Repository/MODENA Energy/Page_MODENA Energy/input_Email_email'), 'erza.akbar@ui.ac.id')

WebUI.setText(findTestObject('Object Repository/MODENA Energy/Page_MODENA Energy/input_Nomor Hp_telp'), '')

WebUI.click(findTestObject('Object Repository/MODENA Energy/Page_MODENA Energy/div_Nomor Hp                               _625d0e'))

WebUI.setText(findTestObject('Object Repository/MODENA Energy/Page_MODENA Energy/input_Nomor Hp_telp'), '081280984758')

WebUI.click(findTestObject('Object Repository/MODENA Energy/Page_MODENA Energy/div_kebijakan privasi_row'))

WebUI.acceptAlert()

WebUI.click(findTestObject('Object Repository/MODENA Energy/Page_MODENA Energy/input_kebijakan privasi_next-section-3'))

