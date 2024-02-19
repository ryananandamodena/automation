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

WebUI.navigateToUrl('https://gccs-test.modena.com/dashboard')

WebUI.setText(findTestObject('Object Repository/gccs_surveymanagement/survey management/Page_Login - GCCS/input_Username_userName'), 'sa_CC004')

WebUI.setEncryptedText(findTestObject('Object Repository/gccs_surveymanagement/survey management/Page_Login - GCCS/input_Password_password'), 
    'QiSQiLhspCy/AIcOjDjVqQ==')

WebUI.click(findTestObject('Object Repository/gccs_surveymanagement/survey management/Page_Login - GCCS/button_Login'))

WebUI.click(findTestObject('Object Repository/gccs_surveymanagement/survey management/Page_Dashboard - GCCS/div_Customer Survey'))

WebUI.click(findTestObject('Object Repository/gccs_surveymanagement/survey management/Page_Dashboard - GCCS/div_Survey Management'))

WebUI.click(findTestObject('Object Repository/gccs_surveymanagement/survey management/Page_Survey Management - GCCS/span_Detail'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/gccs_surveymanagement/survey management/Page_Edit Survey Management - GCCS/button_Add choise'))

WebUI.delay(3)

WebUI.click(findTestObject('gccs_surveymanagement/survey management/Page_Edit Survey Management - GCCS/button_Add choise_1'))

WebUI.click(findTestObject('gccs_surveymanagement/survey management/Page_Edit Survey Management - GCCS/input_List Question_1'))

WebUI.setText(findTestObject('gccs_surveymanagement/survey management/Page_Edit Survey Management - GCCS/input_List Question_1'), 'Nama Model')

WebUI.setText(findTestObject('gccs_surveymanagement/survey management/Page_Edit Survey Management - GCCS/input_List Question_1.1'), 'BH')

WebUI.setText(findTestObject('gccs_surveymanagement/survey management/Page_Edit Survey Management - GCCS/input_List Question_1.2'), 'WF')

WebUI.setText(findTestObject('gccs_surveymanagement/survey management/Page_Edit Survey Management - GCCS/input_List Question_1.3'), 'DD')

WebUI.click(findTestObject('gccs_surveymanagement/survey management/Page_Edit Survey Management - GCCS/button_Add Teks'))

WebUI.setText(findTestObject('gccs_surveymanagement/survey management/Page_Edit Survey Management - GCCS/input_List Question_2'), 'Nama konsumen ??')

WebUI.click(findTestObject('gccs_surveymanagement/survey management/Page_Edit Survey Management - GCCS/button_Add Teks'))

WebUI.setText(findTestObject('gccs_surveymanagement/survey management/Page_Edit Survey Management - GCCS/input_List Question_2.1'), 'alamat Consument')

WebUI.click(findTestObject('gccs_surveymanagement/survey management/Page_Edit Survey Management - GCCS/button_Add Teks'))

WebUI.setText(findTestObject('gccs_surveymanagement/survey management/Page_Edit Survey Management - GCCS/input_List Question_2.2'), 'Nama Product')

WebUI.click(findTestObject('gccs_surveymanagement/survey management/Page_Edit Survey Management - GCCS/button_Save'))

WebUI.closeBrowser(FailureHandling.STOP_ON_FAILURE)

