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

WebUI.navigateToUrl('https://pmcdev.modena.com/')

WebUI.setText(findTestObject('Object Repository/PMC/Approve With Muhamad Nur/input_Email or Username_username'), 'muhamad.nur')

WebUI.setEncryptedText(findTestObject('Object Repository/PMC/Approve With Muhamad Nur/input_Password_password'), 'iFGeFYmXIrUhQZHvW7P22w==')

WebUI.click(findTestObject('Object Repository/PMC/Approve With Muhamad Nur/button_Sign In'))

WebUI.click(findTestObject('Object Repository/PMC/Approve With Muhamad Nur/p_Approvals'))

WebUI.click(findTestObject('Object Repository/PMC/Approve With Muhamad Nur/span_View top row'))

WebUI.scrollToElement(findTestObject('PMC/Approve With Muhamad Nur/button_Approve'), 0)

WebUI.click(findTestObject('Object Repository/PMC/Approve With Muhamad Nur/button_Approve'))

WebUI.setText(findTestObject('Object Repository/PMC/Approve With Muhamad Nur/textarea_Please enter a remarkmessage about_b9e68f'), 
    'approved')

WebUI.click(findTestObject('Object Repository/PMC/Approve With Muhamad Nur/button_Submit'))

WebUI.click(findTestObject('Object Repository/PMC/Approve With Muhamad Nur/button_OK'))

