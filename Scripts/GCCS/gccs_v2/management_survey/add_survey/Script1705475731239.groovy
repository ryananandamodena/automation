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

WebUI.setText(findTestObject('Object Repository/gccs/gccs_surveymanagement/survey management/Page_Login - GCCS/input_Username_userName'), 
    'sa_CC004')

WebUI.delay(1)

WebUI.setEncryptedText(findTestObject('Object Repository/gccs/gccs_surveymanagement/survey management/Page_Login - GCCS/input_Password_password'), 
    'QiSQiLhspCy/AIcOjDjVqQ==')

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/gccs/gccs_surveymanagement/survey management/Page_Login - GCCS/button_Login'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/gccs/gccs_surveymanagement/survey management/Page_Dashboard - GCCS/div_Customer Survey'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/gccs/gccs_surveymanagement/survey management/Page_Dashboard - GCCS/div_Survey Management'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/gccs/gccs_surveymanagement/survey management/Page_Survey Management - GCCS/button_Add Survey'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/gccs/gccs_surveymanagement/survey management/Page_Create Survey Management - GCCS/span_Survey Type'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/gccs/gccs_surveymanagement/survey management/Page_Create Survey Management - GCCS/li_Visit In-Home'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/gccs/gccs_surveymanagement/survey management/Page_Create Survey Management - GCCS/input_Questionnaire Title_questionnaireTitle'))

WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/gccs/gccs_surveymanagement/survey management/Page_Create Survey Management - GCCS/input_Survey Title_surveyTitle'), 
    'Test 31')

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/gccs/gccs_surveymanagement/survey management/Page_Create Survey Management - GCCS/span_Target Type'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/gccs/gccs_surveymanagement/survey management/Page_Create Survey Management - GCCS/li_Daily Batch'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/gccs/gccs_surveymanagement/survey management/Page_Create Survey Management - GCCS/span_Equipment'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/gccs/gccs_surveymanagement/survey management/Page_Create Survey Management - GCCS/li_Phone'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/gccs/gccs_surveymanagement/survey management/Page_Create Survey Management - GCCS/span_Execution'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/gccs/gccs_surveymanagement/survey management/Page_Create Survey Management - GCCS/li_Yes'))

WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/gccs/gccs_surveymanagement/survey management/Page_Create Survey Management - GCCS/textarea_test 2'), 
    'test 31')

WebUI.setText(findTestObject('Object Repository/gccs/gccs_surveymanagement/survey management/Page_Create Survey Management - GCCS/input_Questionnaire Title_questionnaireTitle'), 
    'test survey 31')

WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/gccs/gccs_surveymanagement/survey management/Page_Create Survey Management - GCCS/textarea_test_1_2'), 
    'test Survey 31')

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/gccs/gccs_surveymanagement/survey management/Page_Create Survey Management - GCCS/button_Save'))

WebUI.closeBrowser()

