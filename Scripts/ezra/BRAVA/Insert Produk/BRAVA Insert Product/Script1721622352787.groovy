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

WebUI.setText(findTestObject('Object Repository/BRAVA/Page_/input_Please Sign In_t_nama'), '0000.0000')

WebUI.setEncryptedText(findTestObject('Object Repository/BRAVA/Page_/input_Please Sign In_t_pass'), '4nvbrPglk7k=')

WebUI.click(findTestObject('Object Repository/BRAVA/Page_/input_Please Sign In_t_akses'))

WebUI.click(findTestObject('Object Repository/BRAVA/Page_/input_Force Access_btn-submit'))

WebUI.click(findTestObject('Object Repository/BRAVA/Page_Home - CSMS/a_E-catalog'))

WebUI.rightClick(findTestObject('Object Repository/BRAVA/Page_Home - CSMS/a_Create'))

WebUI.click(findTestObject('Object Repository/BRAVA/Page_Home - CSMS/a_Create Part Number'))

WebUI.click(findTestObject('Object Repository/BRAVA/Page_Part - CSMS/span_-- Select a segment --'))

WebUI.setText(findTestObject('BRAVA/Insert Product/Page_/Page_Part - CSMS/input_concat(id(, , model_seq, , ))_select2-search__field'), 
    'professional', Keys.chord(Keys.ENTER))

WebUI.sendKeys(findTestObject('Object Repository/BRAVA/Page_Part - CSMS/input_concat(id(, , model_seq, , ))_select2-search__field'), 
    Keys.chord(Keys.ENTER))
WebUI.click(findTestObject('Object Repository/BRAVA/Page_Part - CSMS/span_-- Select a branch --'))

WebUI.setText(findTestObject('BRAVA/Insert Product/Page_/Page_Part - CSMS/input_concat(id(, , model_seq, , ))_select2-search__field'), 
    'modena - professional')

WebUI.sendKeys(findTestObject('Object Repository/BRAVA/Page_Part - CSMS/input_concat(id(, , model_seq, , ))_select2-search__field'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/BRAVA/Page_Part - CSMS/span_-- Select a group --'))

WebUI.setText(findTestObject('Object Repository/BRAVA/Page_Part - CSMS/input_concat(id(, , model_seq, , ))_select2-search__field'), 
    'cooling - professional')

WebUI.sendKeys(findTestObject('Object Repository/BRAVA/Page_Part - CSMS/input_concat(id(, , model_seq, , ))_select2-search__field'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/BRAVA/Page_Part - CSMS/span_-- Select a product category --'))

WebUI.setText(findTestObject('Object Repository/BRAVA/Page_Part - CSMS/input_concat(id(, , model_seq, , ))_select2-search__field'), 
    'blast chiller')

WebUI.sendKeys(findTestObject('Object Repository/BRAVA/Page_Part - CSMS/input_concat(id(, , model_seq, , ))_select2-search__field'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/BRAVA/Page_Part - CSMS/span_-- Select a base classification --'))

WebUI.setText(findTestObject('Object Repository/BRAVA/Page_Part - CSMS/input_concat(id(, , model_seq, , ))_select2-search__field'), 
    'electrical e')

WebUI.sendKeys(findTestObject('Object Repository/BRAVA/Page_Part - CSMS/input_concat(id(, , model_seq, , ))_select2-search__field'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/BRAVA/Page_Part - CSMS/span_-- Select a functional classification --'))

WebUI.setText(findTestObject('Object Repository/BRAVA/Page_Part - CSMS/input_concat(id(, , model_seq, , ))_select2-search__field'), 
    'aesthetics q')

WebUI.sendKeys(findTestObject('Object Repository/BRAVA/Page_Part - CSMS/input_concat(id(, , model_seq, , ))_select2-search__field'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/BRAVA/Page_Part - CSMS/span_-- Select a part category --'))

WebUI.setText(findTestObject('Object Repository/BRAVA/Page_Part - CSMS/input_concat(id(, , model_seq, , ))_select2-search__field'), 
    'body cbb')

WebUI.sendKeys(findTestObject('Object Repository/BRAVA/Page_Part - CSMS/input_concat(id(, , model_seq, , ))_select2-search__field'), 
    Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/BRAVA/Page_Part - CSMS/input_concat(id(, , model_seq, , ))_select2-search__field'), 
    'body back')

WebUI.sendKeys(findTestObject('Object Repository/BRAVA/Page_Part - CSMS/input_concat(id(, , model_seq, , ))_select2-search__field'), 
    Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/BRAVA/Page_Part - CSMS/input_Catalog Part Name_model_name'), 'test')

WebUI.click(findTestObject('Object Repository/BRAVA/Page_Part - CSMS/span_-- Select a lot num --'))

WebUI.click(findTestObject('Object Repository/BRAVA/Page_Part - CSMS/span_04'))

WebUI.setText(findTestObject('Object Repository/BRAVA/Page_Part - CSMS/input_concat(id(, , model_seq, , ))_select2-search__field'), 
    '04')

WebUI.sendKeys(findTestObject('Object Repository/BRAVA/Page_Part - CSMS/input_concat(id(, , model_seq, , ))_select2-search__field'), 
    Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/BRAVA/Page_Part - CSMS/input_Applied Year_tahun'), '2024')

WebUI.click(findTestObject('Object Repository/BRAVA/Page_Part - CSMS/a_Secondary Data Skow'))

WebUI.setText(findTestObject('Object Repository/BRAVA/Page_Part - CSMS/input_Supplier Part Name_spl_part_name'), 'test')

WebUI.setText(findTestObject('Object Repository/BRAVA/Page_Part - CSMS/input_Supplier Part Code_spl_part_code'), 'test')

WebUI.click(findTestObject('Object Repository/BRAVA/Page_Part - CSMS/span_-- Select a material --'))

WebUI.setText(findTestObject('Object Repository/BRAVA/Page_Part - CSMS/input_concat(id(, , model_seq, , ))_select2-search__field'), 
    'brass')

WebUI.sendKeys(findTestObject('Object Repository/BRAVA/Page_Part - CSMS/input_concat(id(, , model_seq, , ))_select2-search__field'), 
    Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/BRAVA/Page_Part - CSMS/input_Color_color'), 'black')

WebUI.setText(findTestObject('Object Repository/BRAVA/Page_Part - CSMS/input_W_dim_d'), '10')

WebUI.setText(findTestObject('Object Repository/BRAVA/Page_Part - CSMS/input_D_dim_w'), '10')

WebUI.setText(findTestObject('Object Repository/BRAVA/Page_Part - CSMS/input_H_dim_h'), '10')

WebUI.setText(findTestObject('Object Repository/BRAVA/Page_Part - CSMS/input_Diameter_diameter'), '20')

WebUI.click(findTestObject('Object Repository/BRAVA/Page_Part - CSMS/td_Weight_td-sc-textbox'))

WebUI.setText(findTestObject('Object Repository/BRAVA/Page_Part - CSMS/input_Weight_weight'), '20')

WebUI.setText(findTestObject('Object Repository/BRAVA/Page_Part - CSMS/textarea_Description_description'), 'test')

WebUI.setText(findTestObject('Object Repository/BRAVA/Page_Part - CSMS/textarea_Specification_spec'), 'test')

WebUI.click(findTestObject('Object Repository/BRAVA/Page_Part - CSMS/span_-- Select a currency --'))

WebUI.setText(findTestObject('Object Repository/BRAVA/Page_Part - CSMS/input_Buy Price_buy_price'), '20')

WebUI.click(findTestObject('Object Repository/BRAVA/Page_Part - CSMS/span_-- Select a supplier --'))

WebUI.setText(findTestObject('Object Repository/BRAVA/Page_Part - CSMS/input_concat(id(, , model_seq, , ))_select2-search__field'), 
    'arcair')

WebUI.sendKeys(findTestObject('Object Repository/BRAVA/Page_Part - CSMS/input_concat(id(, , model_seq, , ))_select2-search__field'), 
    Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/BRAVA/Page_Part - CSMS/input_Others_other'), 'test')

WebUI.click(findTestObject('Object Repository/BRAVA/Page_Part - CSMS/button_Save'))

WebUI.closeBrowser()

