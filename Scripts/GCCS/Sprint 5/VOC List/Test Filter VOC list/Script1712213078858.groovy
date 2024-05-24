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

WebUI.click(findTestObject('Object Repository/gccs/gccs_sprint_5/Page_Dashboard - GCCS/div_Call Center'))

WebUI.click(findTestObject('Object Repository/gccs/gccs_sprint_5/Page_Dashboard - GCCS/div_VOC List'))

WebUI.click(findTestObject('Object Repository/gccs/gccs_sprint_5/Page_VOC List - GCCS/td_VOC NoVOC20240418000070'))

WebUI.setText(findTestObject('Object Repository/gccs/gccs_sprint_5/Page_VOC List - GCCS/input_VOC List_vocNumber'), 'VOC20240418000070')

WebUI.click(findTestObject('Object Repository/gccs/gccs_sprint_5/Page_VOC List - GCCS/img_To_icon-btn'))

WebUI.click(findTestObject('Object Repository/gccs/gccs_sprint_5/Page_VOC List - GCCS/input_Waiting Confirm,Waiting Contact Dept _5531f1'))

WebUI.click(findTestObject('Object Repository/gccs/gccs_sprint_5/Page_VOC List - GCCS/div_Waiting Confirm,Waiting Contact Dept Co_5e6347'))

WebUI.click(findTestObject('Object Repository/gccs/gccs_sprint_5/Page_VOC List - GCCS/li_Waiting Confirm'))

WebUI.click(findTestObject('Object Repository/gccs/gccs_sprint_5/Page_VOC List - GCCS/button_Apply'))

WebUI.click(findTestObject('Object Repository/gccs/gccs_sprint_5/Page_VOC List - GCCS/input_Waiting Confirm_custom-calendar-input_31788b'))

WebUI.click(findTestObject('Object Repository/gccs/gccs_sprint_5/Page_VOC List - GCCS/div_31'))

WebUI.click(findTestObject('Object Repository/gccs/gccs_sprint_5/Page_VOC List - GCCS/input_To_custom-calendar-input-wo react-dat_1ad132'))

WebUI.click(findTestObject('Object Repository/gccs/gccs_sprint_5/Page_VOC List - GCCS/div_17'))

WebUI.click(findTestObject('Object Repository/gccs/gccs_sprint_5/Page_VOC List - GCCS/button_Apply'))

WebUI.click(findTestObject('Object Repository/gccs/gccs_sprint_5/Page_VOC List - GCCS/button_Export Data'))

