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

WebUI.setText(findTestObject('Object Repository/Pages PO Outstanding/Page_B2B Portal/input_Email Account_username'), 'hastri.danahiswari@modena.com')

WebUI.selectOptionByValue(findTestObject('Object Repository/Pages PO Outstanding/Page_B2B Portal/select_-- Choose Your Company --PT Autosave'), 
    '205', true)

WebUI.setEncryptedText(findTestObject('Object Repository/Pages PO Outstanding/Page_B2B Portal/input_Password_password'), 
    'iFGeFYmXIrUhQZHvW7P22w==')

WebUI.sendKeys(findTestObject('Object Repository/Pages PO Outstanding/Page_B2B Portal/input_Password_password'), Keys.chord(
        Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Pages PO Outstanding/Page_B2B Portal/span_keyboard_double_arrow_right'))

WebUI.click(findTestObject('Object Repository/Pages PO Outstanding/Page_B2B Portal/div'))

WebUI.click(findTestObject('Object Repository/Pages PO Outstanding/Page_B2B Portal/span_Goods Receipt'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Pages PO Outstanding/Page_B2B Portal/select_Show 5Show 10Show 25Show 50Show 100'), 
    '5', true)

WebUI.click(findTestObject('Object Repository/Pages PO Outstanding/Page_B2B Portal/button_2'))

WebUI.click(findTestObject('Object Repository/Pages PO Outstanding/Page_B2B Portal/i_navigate_before'))

WebUI.click(findTestObject('Object Repository/Pages PO Outstanding/Page_B2B Portal/i_navigate_next'))

