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

WebUI.navigateToUrl('https://b2b-dev.modena.com/')

WebUI.setText(findTestObject('B2B/Brand/Page_B2B Portal/Username'), 'ryan.ananda@modena.com')

WebUI.selectOptionByValue(findTestObject('B2B/Brand/Page_B2B Portal/select_Company'), '1', false)

WebUI.setEncryptedText(findTestObject('B2B/Brand/Page_B2B Portal/Password'), 'iFGeFYmXIrUhQZHvW7P22w==')

WebUI.click(findTestObject('B2B/Brand/Page_B2B Portal/button_Login'))

WebUI.click(findTestObject('B2B/Brand/Page_B2B Portal/arrow_right_menu'))

WebUI.click(findTestObject('B2B/Brand/Page_B2B Portal/Configuration Setting'))

WebUI.click(findTestObject('B2B/Brand/Page_B2B Portal/Brand'))

WebUI.click(findTestObject('B2B/Brand/Page_B2B Portal/div_Import Data'))

WebUI.delay(2)

WebUI.uploadFile(findTestObject('B2B/Brand/b2binput/Page_B2B Portal/input__kpi_name'), 'C:\\Users\\ryan.ananda\\Downloads\\Sample_Brands.xlsx')

WebUI.delay(5)

WebUI.click(findTestObject('B2B/Brand/Page_B2B Portal/check'))

not_run: WebUI.click(findTestObject('B2B/Brand/Page_B2B Portal/upload'))

