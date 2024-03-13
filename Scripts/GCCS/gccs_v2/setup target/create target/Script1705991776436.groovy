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

WebUI.setText(findTestObject('Object Repository/gccs/gccs_surveymanagement/survey target/Page_Login - GCCS/input_Username_userName'), 
    'sa_CC004')

WebUI.setEncryptedText(findTestObject('Object Repository/gccs/gccs_surveymanagement/survey target/Page_Login - GCCS/input_Password_password'), 
    'QiSQiLhspCy/AIcOjDjVqQ==')

WebUI.click(findTestObject('Object Repository/gccs/gccs_surveymanagement/survey target/Page_Login - GCCS/button_Login'))

WebUI.click(findTestObject('Object Repository/gccs/gccs_surveymanagement/survey target/Page_Dashboard - GCCS/span_Customer Survey'))

WebUI.click(findTestObject('Object Repository/gccs/gccs_surveymanagement/survey target/Page_Dashboard - GCCS/div_Setup Target'))

WebUI.click(findTestObject('Object Repository/gccs/gccs_surveymanagement/survey target/Page_Setup Target - GCCS/button_Add Target'))

WebUI.click(findTestObject('Object Repository/gccs/gccs_surveymanagement/survey target/Page_Setup Target - GCCS/span_Repair  Warranty  Happy Call'))

WebUI.click(findTestObject('Object Repository/gccs/gccs_surveymanagement/survey target/Page_Setup Target - GCCS/li_Visit In-Home'))

WebUI.click(findTestObject('Object Repository/gccs/gccs_surveymanagement/survey target/Page_Setup Target - GCCS/span_Select Title'))

WebUI.click(findTestObject('Object Repository/gccs/gccs_surveymanagement/survey target/Page_Setup Target - GCCS/li_test 26'))

WebUI.click(findTestObject('Object Repository/gccs/gccs_surveymanagement/survey target/Page_Setup Target - GCCS/span_Select Questionnaire_p-dropdown-trigge_8ff898'))

WebUI.click(findTestObject('Object Repository/gccs/gccs_surveymanagement/survey target/Page_Setup Target - GCCS/li_test survey 1'))

WebUI.click(findTestObject('Object Repository/gccs/gccs_surveymanagement/survey target/Page_Setup Target - GCCS/input_test survey 1_custom-calendar-input-w_8c3b62'))

WebUI.click(findTestObject('Object Repository/gccs/gccs_surveymanagement/survey target/Page_Setup Target - GCCS/button_Previous Month'))

WebUI.click(findTestObject('Object Repository/gccs/gccs_surveymanagement/survey target/Page_Setup Target - GCCS/div_1'))

WebUI.click(findTestObject('Object Repository/gccs/gccs_surveymanagement/survey target/Page_Setup Target - GCCS/input_To_custom-calendar-input-wo react-dat_1ad132'))

WebUI.click(findTestObject('gccs/gccs_surveymanagement/survey target/Page_Setup Target - GCCS/div_2'))

WebUI.click(findTestObject('Object Repository/gccs/gccs_surveymanagement/survey target/Page_Setup Target - GCCS/span_ALL'))

WebUI.click(findTestObject('Object Repository/gccs/gccs_surveymanagement/survey target/Page_Setup Target - GCCS/li_IN WARRANTY'))

WebUI.click(findTestObject('Object Repository/gccs/gccs_surveymanagement/survey target/Page_Setup Target - GCCS/div_All'))

WebUI.click(findTestObject('Object Repository/gccs/gccs_surveymanagement/survey target/Page_Setup Target - GCCS/div_All'))

WebUI.click(findTestObject('Object Repository/gccs/gccs_surveymanagement/survey target/Page_Setup Target - GCCS/span_Repair'))

WebUI.click(findTestObject('Object Repository/gccs/gccs_surveymanagement/survey target/Page_Setup Target - GCCS/li_Installation'))

WebUI.click(findTestObject('Object Repository/gccs/gccs_surveymanagement/survey target/Page_Setup Target - GCCS/button_Apply'))

WebUI.click(findTestObject('Object Repository/gccs/gccs_surveymanagement/survey target/Page_Setup Target - GCCS/span_Installation'))

WebUI.click(findTestObject('Object Repository/gccs/gccs_surveymanagement/survey target/Page_Setup Target - GCCS/li_Recheck Repair'))

WebUI.click(findTestObject('gccs/gccs_surveymanagement/survey target/Page_Setup Target - GCCS/Service Center Type'))

WebUI.click(findTestObject('Object Repository/gccs/gccs_surveymanagement/survey target/Page_Setup Target - GCCS/div_Recheck Repair_p-dropdown-trigger'))

WebUI.click(findTestObject('gccs/gccs_surveymanagement/survey target/Page_Setup Target - GCCS/div_membership visit'))

WebUI.click(findTestObject('Object Repository/gccs/gccs_surveymanagement/survey target/Page_Setup Target - GCCS/button_Apply'))

