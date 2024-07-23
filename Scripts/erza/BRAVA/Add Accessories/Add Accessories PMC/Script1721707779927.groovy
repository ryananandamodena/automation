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

WebUI.navigateToUrl('http://192.168.3.87:5057/site/index')

WebUI.setText(findTestObject('Object Repository/Page_/input_Please Sign In_t_nama'), '0000.0000')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_/input_Please Sign In_t_pass'), '4nvbrPglk7k=')

WebUI.click(findTestObject('Object Repository/Page_/input_Please Sign In_t_akses'))

WebUI.click(findTestObject('Object Repository/Page_/input_Force Access_btn-submit'))

WebUI.click(findTestObject('Object Repository/Page_Home - CSMS/a_E-catalog'))

WebUI.click(findTestObject('Object Repository/Page_Home - CSMS/a_Part Accessories'))

WebUI.click(findTestObject('Object Repository/Page_Part - CSMS/center_Rp. 144.500,00'))

WebUI.click(findTestObject('Object Repository/Page_Part - CSMS/button_Update Skow'))

WebUI.setText(findTestObject('Object Repository/Page_Part - CSMS/input_Display Name_dsp_name'), DisplayCode)

WebUI.setText(findTestObject('Object Repository/Page_Part - CSMS/input_Display Code_dsp_code'), DisplayCode)

WebUI.setText(findTestObject('Object Repository/Page_Part - CSMS/textarea_Acc. Info_accs_info'), 'test')

WebUI.setText(findTestObject('Object Repository/Page_Part - CSMS/input_W_dim_d'), Width)

WebUI.setText(findTestObject('Object Repository/Page_Part - CSMS/input_D_dim_w'), Diameter)

WebUI.setText(findTestObject('Object Repository/Page_Part - CSMS/input_H_dim_h'), Height)

WebUI.setText(findTestObject('Object Repository/Page_Part - CSMS/input_Diameter_part_diameter'), DiameterPart)

WebUI.setText(findTestObject('Object Repository/Page_Part - CSMS/input_Weight_part_weight'), Weight)

WebUI.setText(findTestObject('Object Repository/Page_Part - CSMS/textarea_Description_description'), Description)

WebUI.click(findTestObject('Object Repository/Page_Part - CSMS/input_Description_btn_save'))

