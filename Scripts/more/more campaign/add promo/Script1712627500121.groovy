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

WebUI.callTestCase(findTestCase('more/more campaign/Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/more/Page_More 2.0/p_MODENA Indonesia (MODENA_LIVE)'))

WebUI.click(findTestObject('Object Repository/more/Page_More 2.0/Campaign Management'))

WebUI.click(findTestObject('Object Repository/more/Page_More 2.0/a_Campaign'))

WebUI.click(findTestObject('more/Page_More 2.0/div_Draft_flex justify-content-center'))

//WebUI.click(findTestObject('Object Repository/more/Page_More 2.0/img_Draft_campaign_dot_menu__ZAXio'))
WebUI.click(findTestObject('Object Repository/more/Page_More 2.0/a_View'))

WebUI.click(findTestObject('Object Repository/more/Page_More 2.0/button_Add Promo'))

WebUI.setText(findTestObject('Object Repository/more/Page_More 2.0/input__promo_name'), 'promo takbiran 40%')

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.selectAllOption(findTestObject('more/Page_More 2.0/upload/Page_More 2.0/li_Discount'))

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('more/Page_More 2.0/upload/Page_More 2.0/li_Voucher'))

WebUI.setText(findTestObject('Object Repository/more/Page_More 2.0/input_END-_promo_code'), 'takbir 2024')

WebUI.click(findTestObject('Object Repository/more/Page_More 2.0/input__promo_name'))

WebUI.setText(findTestObject('Object Repository/more/Page_More 2.0/textarea__remarks'), 'promo takbiran 40%')

WebUI.click(findTestObject('Object Repository/more/Page_More 2.0/button_Next Step'))

WebUI.click(findTestObject('Object Repository/more/Page_More 2.0/button_Continue'))

WebUI.selectOptionByValue(findTestObject('Object Repository/more/Page_More 2.0/select_Filter by CategoryCustomer BranchCus_e27386'), 
    '5|customer-group|Customer Group|promo_customer_group', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/more/Page_More 2.0/select_Filter by CategoryIncludeExclude'), 
    '7', true)

WebUI.setText(findTestObject('Object Repository/more/Page_More 2.0/input__value-0'), 'e-')

WebUI.click(findTestObject('Object Repository/more/Page_More 2.0/li_E-Commerce'))

WebUI.click(findTestObject('Object Repository/more/Page_More 2.0/img__mt-16 add_criteria'))

WebUI.selectOptionByValue(findTestObject('Object Repository/more/Page_More 2.0/select_Filter by CategoryCustomer BranchCus_e27386_1'), 
    '11|item|Item Name|promo_item_name', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/more/Page_More 2.0/select_Filter by CategoryIncludeExclude_1'), 
    '7', true)

WebUI.setText(findTestObject('Object Repository/more/Page_More 2.0/input__value-1'), 'Bh 1728 ')

WebUI.click(findTestObject('Object Repository/more/Page_More 2.0/li_BH1728AABK.IDAAC0A - MODENA GAS HOB - BH_96b79b'))

WebUI.click(findTestObject('Object Repository/more/Page_More 2.0/button_Next Step'))

WebUI.click(findTestObject('Object Repository/more/Page_More 2.0/button_Continue'))

WebUI.click(findTestObject('Object Repository/more/Page_More 2.0/button_Add Formula'))

WebUI.click(findTestObject('Object Repository/more/Page_More 2.0/input__quantity'))

WebUI.setText(findTestObject('Object Repository/more/Page_More 2.0/textarea__promo_remark'), 'promo takbiran 40%')

WebUI.selectOptionByValue(findTestObject('Object Repository/more/Page_More 2.0/select_Choose FormulaTotal Order item crite_8a030e'), 
    '5', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/more/Page_More 2.0/select_Choose Formula'), '2', true)

WebUI.setText(findTestObject('Object Repository/more/Page_More 2.0/input__quantity'), '5')

WebUI.click(findTestObject('Object Repository/more/Page_More 2.0/form_Add FormulaMultipleRemark Choose Match_e2c0a2'))

WebUI.selectOptionByValue(findTestObject('Object Repository/more/Page_More 2.0/select_ChooseDiscount Item CriteriaFree ite_7e642f'), 
    '1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/more/Page_More 2.0/select_ChoosePercentageAmount'), '1-true-true-null', 
    true)

WebUI.setText(findTestObject('Object Repository/more/Page_More 2.0/input__quantity'), '40')

WebUI.click(findTestObject('Object Repository/more/Page_More 2.0/button_Next Step'))

WebUI.click(findTestObject('Object Repository/more/Page_More 2.0/button_Continue'))

WebUI.click(findTestObject('Object Repository/more/Page_More 2.0/button_Next Step'))

WebUI.click(findTestObject('Object Repository/more/Page_More 2.0/button_Add Simulation'))

WebUI.setText(findTestObject('Object Repository/more/Page_More 2.0/input_Back to list simulation_search'), 'e-')

WebUI.click(findTestObject('Object Repository/more/Page_More 2.0/td_TEKNOLOGIKA INTEGRATOR INDONESIA,PT'))

WebUI.click(findTestObject('Object Repository/more/Page_More 2.0/button_Add Item'))

WebUI.click(findTestObject('Object Repository/more/Page_More 2.0/input__r2'))

WebUI.click(findTestObject('Object Repository/more/Page_More 2.0/li_MODENA GAS HOB - BH 1728 (CKD)'))

WebUI.setText(findTestObject('Object Repository/more/Page_More 2.0/input__quantity'), '10')

WebUI.click(findTestObject('Object Repository/more/Page_More 2.0/input__r4'))

WebUI.click(findTestObject('Object Repository/more/Page_More 2.0/li_General Warehouse'))

WebUI.click(findTestObject('Object Repository/more/Page_More 2.0/button_Save And Close'))

WebUI.click(findTestObject('Object Repository/more/Page_More 2.0/button_Calculate Promo'))

WebUI.click(findTestObject('Object Repository/more/Page_More 2.0/button_Submit'))

WebUI.click(findTestObject('Object Repository/more/Page_More 2.0/button_Continue'))

WebUI.click(findTestObject('Object Repository/more/Page_More 2.0/button_Back to list simulation'))

WebUI.click(findTestObject('Object Repository/more/Page_More 2.0/button_Add Simulation'))

WebUI.setText(findTestObject('Object Repository/more/Page_More 2.0/input_Back to list simulation_search'), 'e-c')

WebUI.click(findTestObject('Object Repository/more/Page_More 2.0/td_SUMBER ALFARIA TRIJAYA, PT'))

WebUI.click(findTestObject('Object Repository/more/Page_More 2.0/button_Add Item'))

WebUI.click(findTestObject('Object Repository/more/Page_More 2.0/input__r6'))

WebUI.click(findTestObject('Object Repository/more/Page_More 2.0/li_MODENA GAS HOB - BH 1728 (CKD)_1'))

WebUI.setText(findTestObject('Object Repository/more/Page_More 2.0/input__quantity'), '15')

WebUI.click(findTestObject('Object Repository/more/Page_More 2.0/input__r8'))

WebUI.click(findTestObject('Object Repository/more/Page_More 2.0/li_General Warehouse_1'))

WebUI.click(findTestObject('Object Repository/more/Page_More 2.0/button_Save And Close'))

WebUI.click(findTestObject('Object Repository/more/Page_More 2.0/button_Calculate Promo'))

WebUI.click(findTestObject('Object Repository/more/Page_More 2.0/button_Submit'))

WebUI.click(findTestObject('Object Repository/more/Page_More 2.0/button_Continue'))

WebUI.click(findTestObject('Object Repository/more/Page_More 2.0/button_Back to list simulation'))

WebUI.click(findTestObject('Object Repository/more/Page_More 2.0/button_Next Step'))

WebUI.click(findTestObject('Object Repository/more/Page_More 2.0/button_Finish'))

WebUI.click(findTestObject('Object Repository/more/Page_More 2.0/button_Continue'))

WebUI.click(findTestObject('Object Repository/more/Page_More 2.0/button_OK'))

WebUI.click(findTestObject('Object Repository/more/Page_More 2.0/button_Send To Verificator'))

WebUI.click(findTestObject('Object Repository/more/Page_More 2.0/button_Continue'))

WebUI.click(findTestObject('Object Repository/more/Page_More 2.0/button_OK'))

WebUI.acceptAlert()

WebUI.acceptAlert()

