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

WebUI.navigateToUrl('https://energy.modena.com/contact-us')

WebUI.setText(findTestObject('Object Repository/MODENA Energy/Page_Hubungi kami MODENA Energy/input_Nama Lengkap_fullname'), 
    'Erza Akbar')

WebUI.setText(findTestObject('Object Repository/MODENA Energy/Page_Hubungi kami MODENA Energy/input_Email_email'), 'erza.akbar@modena.com')

WebUI.setText(findTestObject('Object Repository/MODENA Energy/Page_Hubungi kami MODENA Energy/input_Nomor Hp_telp'), 'test')

WebUI.setText(findTestObject('Object Repository/MODENA Energy/Page_Hubungi kami MODENA Energy/textarea_Pesan_pesan'), 'Saya QA Modena. Ini hanya untuk keperluan testing.')

WebUI.click(findTestObject('Object Repository/MODENA Energy/Page_Hubungi kami MODENA Energy/input_kebijakan privasi_button-send-contactus-page'))

