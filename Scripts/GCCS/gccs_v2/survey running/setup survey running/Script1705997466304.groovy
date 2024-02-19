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

WebUI.setText(findTestObject('Object Repository/gccs_surveymanagement/survey running/Page_Login - GCCS/input_Username_userName'), 'sa_cc004')

WebUI.setEncryptedText(findTestObject('Object Repository/gccs_surveymanagement/survey running/Page_Login - GCCS/input_Password_password'), 'QiSQiLhspCy/AIcOjDjVqQ==')

WebUI.click(findTestObject('Object Repository/gccs_surveymanagement/survey running/Page_Login - GCCS/button_Login'))

WebUI.click(findTestObject('Object Repository/gccs_surveymanagement/survey running/Page_Dashboard - GCCS/span_Customer Survey'))

WebUI.click(findTestObject('Object Repository/gccs_surveymanagement/survey running/Page_Dashboard - GCCS/div_Survey Running'))

WebUI.click(findTestObject('Object Repository/gccs_surveymanagement/survey running/Page_Dashboard - GCCS/span_Select Type'))

WebUI.click(findTestObject('Object Repository/gccs_surveymanagement/survey running/Page_Dashboard - GCCS/li_Visit In-Home'))

WebUI.click(findTestObject('Object Repository/gccs_surveymanagement/survey running/Page_Dashboard - GCCS/span_Select Title'))

WebUI.click(findTestObject('Object Repository/gccs_surveymanagement/survey running/Page_Dashboard - GCCS/li_Visit Home'))

WebUI.click(findTestObject('Object Repository/gccs_surveymanagement/survey running/Page_Dashboard - GCCS/span_Select Questionnaire'))

WebUI.click(findTestObject('gccs_surveymanagement/survey running/Page_Dashboard - GCCS/li_Visit Home - Copy'))

WebUI.click(findTestObject('Object Repository/gccs_surveymanagement/survey running/Page_Dashboard - GCCS/span_Select Target'))

WebUI.click(findTestObject('Object Repository/gccs_surveymanagement/survey running/Page_Dashboard - GCCS/li_SCT20240116000017'))

WebUI.click(findTestObject('Object Repository/gccs_surveymanagement/survey running/Page_Dashboard - GCCS/button_Apply'))

//WebUI.click(findTestObject('Object Repository/gccs_surveymanagement/survey running/Page_Dashboard - GCCS/span_Call'))
//
//WebUI.click(findTestObject('Object Repository/gccs_surveymanagement/survey running/Page_Dashboard - GCCS/button_Continue Survey'))
//
//WebUI.click(findTestObject('Object Repository/gccs_surveymanagement/survey running/Page_Dashboard - GCCS/input_nama dealer_209'))
//
//WebUI.click(findTestObject('Object Repository/gccs_surveymanagement/survey running/Page_Dashboard - GCCS/input_nama product_210'))
//
//WebUI.setText(findTestObject('Object Repository/gccs_surveymanagement/survey running/Page_Dashboard - GCCS/textarea_test'), 'test')
//
//WebUI.setText(findTestObject('Object Repository/gccs_surveymanagement/survey running/Page_Dashboard - GCCS/textarea_test'), 'test')
//
//WebUI.click(findTestObject('Object Repository/gccs_surveymanagement/survey running/Page_Dashboard - GCCS/input_checkbox'))
//
//WebUI.click(findTestObject('Object Repository/gccs_surveymanagement/survey running/Page_Dashboard - GCCS/span_Save'))
//
//WebUI.click(findTestObject('Object Repository/gccs_surveymanagement/survey running/Page_Dashboard - GCCS/button_Close Survey'))

WebUI.click(findTestObject('gccs_surveymanagement/survey running/Page_Dashboard - GCCS/span_Call - Copy'))

WebUI.click(findTestObject('Object Repository/gccs_surveymanagement/survey running/Page_Dashboard - GCCS/span_Start Survey'))

WebUI.click(findTestObject('Object Repository/gccs_surveymanagement/survey running/Page_Dashboard - GCCS/input_nama dealer_209'))

WebUI.click(findTestObject('Object Repository/gccs_surveymanagement/survey running/Page_Dashboard - GCCS/input_nama product_210'))

WebUI.setText(findTestObject('Object Repository/gccs_surveymanagement/survey running/Page_Dashboard - GCCS/textarea_test'), 'test')

WebUI.setText(findTestObject('Object Repository/gccs_surveymanagement/survey running/Page_Dashboard - GCCS/textarea_test'), 'test')

WebUI.click(findTestObject('Object Repository/gccs_surveymanagement/survey running/Page_Dashboard - GCCS/input_checkbox'))

WebUI.click(findTestObject('Object Repository/gccs_surveymanagement/survey running/Page_Dashboard - GCCS/span_Select Reason'))

WebUI.click(findTestObject('Object Repository/gccs_surveymanagement/survey running/Page_Dashboard - GCCS/li_Sibuk'))

WebUI.click(findTestObject('Object Repository/gccs_surveymanagement/survey running/Page_Dashboard - GCCS/button_Save'))

WebUI.click(findTestObject('Object Repository/gccs_surveymanagement/survey running/Page_Dashboard - GCCS/button_Close Survey'))

//WebUI.click(findTestObject('gccs_surveymanagement/survey running/Page_Dashboard - GCCS/span_Call - Copy (1)'))
//
//WebUI.click(findTestObject('Object Repository/gccs_surveymanagement/survey running/Page_Dashboard - GCCS/button_Start Survey'))
//
//WebUI.click(findTestObject('Object Repository/gccs_surveymanagement/survey running/Page_Dashboard - GCCS/input_nama dealer_209'))
//
//WebUI.click(findTestObject('Object Repository/gccs_surveymanagement/survey running/Page_Dashboard - GCCS/input_nama product_210'))
//
//WebUI.setText(findTestObject('Object Repository/gccs_surveymanagement/survey running/Page_Dashboard - GCCS/textarea_test'), 'test')
//
//WebUI.setText(findTestObject('Object Repository/gccs_surveymanagement/survey running/Page_Dashboard - GCCS/textarea_test'), 'test')
//
//WebUI.click(findTestObject('Object Repository/gccs_surveymanagement/survey running/Page_Dashboard - GCCS/input_checkbox'))
//
//WebUI.click(findTestObject('Object Repository/gccs_surveymanagement/survey running/Page_Dashboard - GCCS/span_Select Reason'))
//
//WebUI.click(findTestObject('Object Repository/gccs_surveymanagement/survey running/Page_Dashboard - GCCS/li_Alamat TokoDelaer'))
//
//WebUI.click(findTestObject('Object Repository/gccs_surveymanagement/survey running/Page_Dashboard - GCCS/span_Alamat TokoDelaer'))
//
//WebUI.click(findTestObject('Object Repository/gccs_surveymanagement/survey running/Page_Dashboard - GCCS/li_No. Telpon Salah'))
//
//WebUI.click(findTestObject('Object Repository/gccs_surveymanagement/survey running/Page_Dashboard - GCCS/span_Save'))
//
//WebUI.click(findTestObject('Object Repository/gccs_surveymanagement/survey running/Page_Dashboard - GCCS/button_Close Survey'))
//
//WebUI.click(findTestObject('gccs_surveymanagement/survey running/Page_Dashboard - GCCS/span_Call - Copy (2)'))
//
//WebUI.click(findTestObject('Object Repository/gccs_surveymanagement/survey running/Page_Dashboard - GCCS/button_Start Survey'))
//
//WebUI.click(findTestObject('Object Repository/gccs_surveymanagement/survey running/Page_Dashboard - GCCS/input_nama dealer_209'))
//
//WebUI.click(findTestObject('Object Repository/gccs_surveymanagement/survey running/Page_Dashboard - GCCS/input_nama product_210'))
//
//WebUI.setText(findTestObject('Object Repository/gccs_surveymanagement/survey running/Page_Dashboard - GCCS/textarea_ress'), 'ress')
//
//WebUI.setText(findTestObject('Object Repository/gccs_surveymanagement/survey running/Page_Dashboard - GCCS/textarea_rrrr'), 'rrrr')
//
//WebUI.click(findTestObject('Object Repository/gccs_surveymanagement/survey running/Page_Dashboard - GCCS/input_checkbox'))
//
//WebUI.click(findTestObject('Object Repository/gccs_surveymanagement/survey running/Page_Dashboard - GCCS/span_Select Reason'))
//
//WebUI.click(findTestObject('Object Repository/gccs_surveymanagement/survey running/Page_Dashboard - GCCS/li_Garansi, tidak dikenakan biaya'))
//
//WebUI.click(findTestObject('Object Repository/gccs_surveymanagement/survey running/Page_Dashboard - GCCS/button_Save'))
//
//WebUI.click(findTestObject('Object Repository/gccs_surveymanagement/survey running/Page_Dashboard - GCCS/button_Close Survey'))
//
