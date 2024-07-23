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

WebUI.navigateToUrl('https://ciao.modena.com/')

WebUI.setText(findTestObject('Object Repository/Object Repository Erza Copy Local/website/Page_Claim Cash Back  MODENA/input_Nama_name'), 
    'Erza')

WebUI.setText(findTestObject('Object Repository/Object Repository Erza Copy Local/website/Page_Claim Cash Back  MODENA/input_NIK (E-KTPSIMKITAS)_nik'), 
    '999999999')

WebUI.setText(findTestObject('Object Repository/Object Repository Erza Copy Local/website/Page_Claim Cash Back  MODENA/input_Nomor Handphone_handphone'), 
    '99999999')

WebUI.setText(findTestObject('Object Repository/Object Repository Erza Copy Local/website/Page_Claim Cash Back  MODENA/input_Email_email'), 
    'asdfasdfasd')

WebUI.setText(findTestObject('Object Repository/Object Repository Erza Copy Local/website/Page_Claim Cash Back  MODENA/input_Alamat_address'), 
    'jl.asdfasfdas')

WebUI.setText(findTestObject('Object Repository/Object Repository Erza Copy Local/website/Page_Claim Cash Back  MODENA/input_Kode Pos_postal_code'), 
    '1293021')

WebUI.click(findTestObject('Object Repository/Object Repository Erza Copy Local/website/Page_Claim Cash Back  MODENA/span_-- Ketik Lokasi Pembelian atau Nama Toko --'))

WebUI.setText(findTestObject('Object Repository/Object Repository Erza Copy Local/website/Page_Claim Cash Back  MODENA/input_Ajukan Klaim_select2-search__field'), 
    'mangga dua')

WebUI.sendKeys(findTestObject('Object Repository/Object Repository Erza Copy Local/website/Page_Claim Cash Back  MODENA/input_Ajukan Klaim_select2-search__field'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Object Repository Erza Copy Local/website/Page_Claim Cash Back  MODENA/input_Tanggal Pembelian_datebuy'))

WebUI.click(findTestObject('Object Repository/Object Repository Erza Copy Local/website/Page_Claim Cash Back  MODENA/li_3'))

WebUI.setText(findTestObject('Object Repository/Object Repository Erza Copy Local/website/Page_Claim Cash Back  MODENA/input_Nomor Seri 1_series_number1'), 
    '234234234234')

WebUI.click(findTestObject('website/Page_Claim Cash Back  MODENA/span_Pilih Metode Berikut'))

WebUI.click(findTestObject('website/Page_Claim Cash Back  MODENA/li_Transfer Bank'))

WebUI.setText(findTestObject('website/Page_Claim Cash Back  MODENA/input_Nomer Rekening_bank_account_number'), '234234234234')

WebUI.setText(findTestObject('website/Page_Claim Cash Back  MODENA/input_Atas Nama_bank_account_name'), '234234234234')

WebUI.click(findTestObject('website/Page_Claim Cash Back  MODENA/label_Saya setuju dengan syarat dan ketentuan di atas'))

WebUI.click(findTestObject('website/Page_Claim Cash Back  MODENA/button_Ajukan Klaim'))

