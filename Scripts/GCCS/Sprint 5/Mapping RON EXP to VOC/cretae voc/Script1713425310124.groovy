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

WebUI.callTestCase(findTestCase('GCCS/login/login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/gccs/gccs_sprint_5/Page_Dashboard - GCCS/span_Call Center'))

WebUI.click(findTestObject('Object Repository/gccs/gccs_sprint_5/Page_Dashboard - GCCS/div_Call Entry'))

WebUI.setText(findTestObject('Object Repository/gccs/gccs_sprint_5/Page_Call Entry - GCCS/input_Phone Number_phone'), '087770666214')

WebUI.sendKeys(findTestObject('Object Repository/gccs/gccs_sprint_5/Page_Call Entry - GCCS/input_Phone Number_phone'), Keys.chord(
        Keys.ENTER))

WebUI.click(findTestObject('Object Repository/gccs/gccs_sprint_5/Page_Call Entry - GCCS/svg'))

WebUI.click(findTestObject('Object Repository/gccs/gccs_sprint_5/Page_Call Entry - GCCS/span_Work Order'))

WebUI.click(findTestObject('Object Repository/gccs/gccs_sprint_5/Page_Call Entry - GCCS/td_SVC CodeSVC-15'))

WebUI.click(findTestObject('Object Repository/gccs/gccs_sprint_5/Page_Call Entry - GCCS/button_Select'))

WebUI.click(findTestObject('Object Repository/gccs/gccs_sprint_5/Page_Call Entry - GCCS/svg_1'))

WebUI.click(findTestObject('Object Repository/gccs/gccs_sprint_5/Page_Call Entry - GCCS/div_Select Received Method_p-dropdown-trigger'))

WebUI.click(findTestObject('Object Repository/gccs/gccs_sprint_5/Page_Call Entry - GCCS/li_Call Center'))

WebUI.setText(findTestObject('Object Repository/gccs/gccs_sprint_5/Page_Call Entry - GCCS/input_Complaint Customer_customerComplaintNotes'), 
    'test')

WebUI.click(findTestObject('Object Repository/gccs/gccs_sprint_5/Page_Call Entry - GCCS/input_Request Date  (Local Time)_requestDate'))

WebUI.click(findTestObject('Object Repository/gccs/gccs_sprint_5/Page_Call Entry - GCCS/div_18'))

WebUI.click(findTestObject('Object Repository/gccs/gccs_sprint_5/Page_Call Entry - GCCS/input_hidden_requestTime'))

WebUI.click(findTestObject('Object Repository/gccs/gccs_sprint_5/Page_Call Entry - GCCS/li_500 PM'))

WebUI.click(findTestObject('Object Repository/gccs/gccs_sprint_5/Page_Call Entry - GCCS/span_Select Technician'))

WebUI.click(findTestObject('Object Repository/gccs/gccs_sprint_5/Page_Call Entry - GCCS/li_AAN SUGIANTO'))

WebUI.click(findTestObject('Object Repository/gccs/gccs_sprint_5/Page_Call Entry - GCCS/div_9'))

WebUI.setText(findTestObject('Object Repository/gccs/gccs_sprint_5/Page_Call Entry - GCCS/input_Call Agent Note_callAgentNotes'), 
    'ttt')

WebUI.click(findTestObject('Object Repository/gccs/gccs_sprint_5/Page_Call Entry - GCCS/span_Save'))

WebUI.click(findTestObject('Object Repository/gccs/gccs_sprint_5/Page_Call Entry - GCCS/span_List Work Order'))

WebUI.click(findTestObject('Object Repository/gccs/gccs_sprint_5/Page_Call Entry - GCCS/svg_1_2'))

WebUI.click(findTestObject('Object Repository/gccs/gccs_sprint_5/Page_Call Entry - GCCS/span_Select VOC Title_p-dropdown-trigger-ic_04b13d'))

WebUI.click(findTestObject('Object Repository/gccs/gccs_sprint_5/Page_Call Entry - GCCS/li_Product Issue'))

WebUI.setText(findTestObject('Object Repository/gccs/gccs_sprint_5/Page_Call Entry - GCCS/textarea_VOC Description_vocDescription'), 
    '')

WebUI.setText(findTestObject('Object Repository/gccs/gccs_sprint_5/Page_Call Entry - GCCS/textarea_s'), 's')

WebUI.setText(findTestObject('Object Repository/gccs/gccs_sprint_5/Page_Call Entry - GCCS/textarea_st'), 'st')

WebUI.setText(findTestObject('Object Repository/gccs/gccs_sprint_5/Page_Call Entry - GCCS/textarea_stw'), 'stw')

WebUI.setText(findTestObject('Object Repository/gccs/gccs_sprint_5/Page_Call Entry - GCCS/textarea_stww'), 'stww')

WebUI.click(findTestObject('Object Repository/gccs/gccs_sprint_5/Page_Call Entry - GCCS/div_Low_p-radiobutton-box'))

WebUI.click(findTestObject('Object Repository/gccs/gccs_sprint_5/Page_Call Entry - GCCS/span_Select Customer Request'))

WebUI.click(findTestObject('Object Repository/gccs/gccs_sprint_5/Page_Call Entry - GCCS/li_Gratis Perbaikan'))

WebUI.click(findTestObject('Object Repository/gccs/gccs_sprint_5/Page_Call Entry - GCCS/span_Select Media'))

WebUI.click(findTestObject('Object Repository/gccs/gccs_sprint_5/Page_Call Entry - GCCS/li_Dealer  Carrier'))

WebUI.click(findTestObject('Object Repository/gccs/gccs_sprint_5/Page_Call Entry - GCCS/span_Select Depth 1'))

WebUI.click(findTestObject('Object Repository/gccs/gccs_sprint_5/Page_Call Entry - GCCS/li_iqbal'))

WebUI.click(findTestObject('Object Repository/gccs/gccs_sprint_5/Page_Call Entry - GCCS/span_Select Depth 2'))

WebUI.click(findTestObject('Object Repository/gccs/gccs_sprint_5/Page_Call Entry - GCCS/li_Install'))

WebUI.click(findTestObject('Object Repository/gccs/gccs_sprint_5/Page_Call Entry - GCCS/span_Select Depth 3'))

WebUI.click(findTestObject('Object Repository/gccs/gccs_sprint_5/Page_Call Entry - GCCS/li_Kompensasi'))

WebUI.click(findTestObject('Object Repository/gccs/gccs_sprint_5/Page_Call Entry - GCCS/button_Save'))

