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

WebUI.click(findTestObject('Object Repository/more/Page_More 2.0/button_Add Campaign'))

WebUI.setText(findTestObject('Object Repository/more/Page_More 2.0/input__campaign_name'), 'Diskon 30%')

WebUI.selectOptionByValue(findTestObject('Object Repository/more/Page_More 2.0/select_Choose CategoryarmanCampaign Reguler_c1a7b3'), 
    '9|VHCR', false)

WebUI.selectOptionByValue(findTestObject('Object Repository/more/Page_More 2.0/select_Choose BudgetGeneralMarketingSales'), 
    'General', true)

WebUI.setText(findTestObject('Object Repository/more/Page_More 2.0/textarea__remarks'), 'test 50%')

WebUI.click(findTestObject('more/Page_More 2.0/Page_More 2.0/input__endDate'))

WebUI.click(findTestObject('Object Repository/more/Page_More 2.0/span_30'))

WebUI.click(findTestObject('more/Page_More 2.0/upload/Page_More 2.0/div_Upload File'))

WebUI.uploadFile(findTestObject('more/Page_More 2.0/upload/Page_More 2.0/div_Upload File'), 'C:\\Users\\ryan.ananda\\Downloads\\MicrosoftTeams-image (17).png')

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/more/Page_More 2.0/button_Next Step'))

WebUI.click(findTestObject('Object Repository/more/Page_More 2.0/button_Continue'))

