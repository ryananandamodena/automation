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

WebUI.click(findTestObject('Object Repository/gccs/gccs_sprint_5/Page_Dashboard - GCCS/div_Repair Center'))

WebUI.click(findTestObject('Object Repository/gccs/gccs_sprint_5/Page_Dashboard - GCCS/div_Work Order Pending'))

WebUI.click(findTestObject('Object Repository/gccs/gccs_sprint_5/Page_Work Order Pending - GCCS/span_Service Center'))

WebUI.click(findTestObject('Object Repository/gccs/gccs_sprint_5/Page_Work Order Pending - GCCS/li_Reason'))

WebUI.click(findTestObject('Object Repository/gccs/gccs_sprint_5/Page_Work Order Pending - GCCS/span_ABDI SERVICE ELEKTRONIK'))

WebUI.click(findTestObject('Object Repository/gccs/gccs_sprint_5/Page_Work Order Pending - GCCS/span_Grouping'))

WebUI.click(findTestObject('Object Repository/gccs/gccs_sprint_5/Page_Work Order Pending - GCCS/span_Reason'))

WebUI.click(findTestObject('Object Repository/gccs/gccs_sprint_5/Page_Work Order Pending - GCCS/li_Follow Up Action'))

WebUI.click(findTestObject('Object Repository/gccs/gccs_sprint_5/Page_Work Order Pending - GCCS/button_Filter'))

WebUI.click(findTestObject('Object Repository/gccs/gccs_sprint_5/Page_Work Order Pending - GCCS/span_Informasi ketersediaan sparepart'))

WebUI.click(findTestObject('Object Repository/gccs/gccs_sprint_5/Page_Work Order Pending - GCCS/span_Grouping'))

WebUI.click(findTestObject('Object Repository/gccs/gccs_sprint_5/Page_Work Order Pending - GCCS/span_Follow Up Action'))

WebUI.click(findTestObject('Object Repository/gccs/gccs_sprint_5/Page_Work Order Pending - GCCS/button_Filter'))

WebUI.click(findTestObject('Object Repository/gccs/gccs_sprint_5/Page_Work Order Pending - GCCS/span_Permintaan support untuk perbaikan ke _f8ba21'))

WebUI.click(findTestObject('Object Repository/gccs/gccs_sprint_5/Page_Work Order Pending - GCCS/div_Work Order Pending'))

