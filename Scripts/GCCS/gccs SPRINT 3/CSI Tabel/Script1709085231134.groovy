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

WebUI.navigateToUrl('https://gccs-test.modena.com/')

WebUI.setText(findTestObject('Object Repository/gccs/cr_gccs/Page_Login - GCCS/input_Username_userName'), 'sa_cc004')

WebUI.setEncryptedText(findTestObject('Object Repository/gccs/cr_gccs/Page_Login - GCCS/input_Password_password'), 'QiSQiLhspCy/AIcOjDjVqQ==')

WebUI.click(findTestObject('Object Repository/gccs/cr_gccs/Page_Login - GCCS/button_Login'))

WebUI.click(findTestObject('Object Repository/gccs/gccs sprint 3/csi table/Page_Dashboard - GCCS/div_Customer Survey'))

WebUI.click(findTestObject('Object Repository/gccs/gccs sprint 3/csi table/Page_Dashboard - GCCS/div_Survey Progress'))

WebUI.click(findTestObject('Object Repository/gccs/gccs sprint 3/csi table/Page_Survey Progress - GCCS/span_CSI Table'))

WebUI.click(findTestObject('Object Repository/gccs/gccs sprint 3/csi table/Page_Survey Progress - GCCS/span_Repair  Warranty  Happy Call'))

WebUI.click(findTestObject('Object Repository/gccs/gccs sprint 3/csi table/Page_Survey Progress - GCCS/span_p-ink p-ink-active'))

WebUI.click(findTestObject('Object Repository/gccs/gccs sprint 3/csi table/Page_Survey Progress - GCCS/div_p-dropdown-trigger'))

WebUI.click(findTestObject('Object Repository/gccs/gccs sprint 3/csi table/Page_Survey Progress - GCCS/span_p-ink p-ink-active'))

WebUI.click(findTestObject('Object Repository/gccs/gccs sprint 3/csi table/Page_Survey Progress - GCCS/input_custom-calendar-input-wo react-datepi_3ca036'))

WebUI.click(findTestObject('Object Repository/gccs/gccs sprint 3/csi table/Page_Survey Progress - GCCS/div_1'))

WebUI.click(findTestObject('Object Repository/gccs/gccs sprint 3/csi table/Page_Survey Progress - GCCS/input_custom-calendar-input-wo react-datepi_3ca036_1'))

WebUI.click(findTestObject('Object Repository/gccs/gccs sprint 3/csi table/Page_Survey Progress - GCCS/div_28'))

WebUI.click(findTestObject('Object Repository/gccs/gccs sprint 3/csi table/Page_Survey Progress - GCCS/span_p-ink p-ink-active_1'))

WebUI.click(findTestObject('Object Repository/gccs/gccs sprint 3/csi table/Page_Survey Progress - GCCS/span_p-ink p-ink-active_1_2'))

WebUI.click(findTestObject('gccs/gccs sprint 3/csi table/Page_Survey Progress - GCCS/p_FEB-2024'))

WebUI.switchToWindowUrl('https://gccs-test.modena.com/customer-survey/survey-progress/csi/monthly/ST02/5?month=FEB-2024&periodStart=2024-02-01&periodEnd=2024-02-29')

WebUI.click(findTestObject('gccs/gccs sprint 3/csi table/Page_GCCS/span_Show details'))

WebUI.click(findTestObject('gccs/gccs sprint 3/csi table/Page_GCCS/path_highcharts-point highcharts-color-0 hi_ae8484'))

