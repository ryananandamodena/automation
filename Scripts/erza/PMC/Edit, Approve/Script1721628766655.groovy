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

WebUI.setText(findTestObject('Object Repository/PMC/Edit Product Detail/input_Email or Username_username'), UsernameEdit)

WebUI.setText(findTestObject('Object Repository/PMC/Edit Product Detail/input_Password_password'), Password)

WebUI.click(findTestObject('Object Repository/PMC/Edit Product Detail/button_Sign In'))

WebUI.click(findTestObject('Object Repository/PMC/Edit Product Detail/a_Product'))

WebUI.click(findTestObject('Object Repository/PMC/Edit Product Detail/a_Master Product'))

WebUI.click(findTestObject('PMC/Edit Product Detail/td_AX993567GB.BSBXC4H'))

WebUI.scrollToElement(findTestObject('PMC/Edit Product Detail/button_Edit Product'), 0)

WebUI.click(findTestObject('Object Repository/PMC/Edit Product Detail/button_Edit Product'))

WebUI.setText(findTestObject('Object Repository/PMC/Edit Product Detail/input_Item Name_item_name'), 'testaaaa')

WebUI.setText(findTestObject('PMC/Edit Product Detail/input_Outer Height (mm)_outer_height'), '234')

WebUI.click(findTestObject('Object Repository/PMC/Edit Product Detail/button_Save'))

WebUI.setText(findTestObject('Object Repository/PMC/Edit Product Detail/textarea_Please enter a remarkmessage about_b9e68f'), 
    'testaaaa')

WebUI.click(findTestObject('Object Repository/PMC/Edit Product Detail/button_Submit'))

WebUI.click(findTestObject('Object Repository/PMC/Edit Product Detail/button_OK'))

WebUI.click(findTestObject('Object Repository/PMC/Edit Product Detail/span_Arman Septian'))

WebUI.click(findTestObject('Object Repository/PMC/Edit Product Detail/i_Sign Out'))

WebUI.setText(findTestObject('Object Repository/PMC/Edit Product Detail/input_Email or Username_username'), UsernameApprove)

WebUI.setText(findTestObject('Object Repository/PMC/Edit Product Detail/input_Password_password'), Password)

WebUI.click(findTestObject('PMC/Edit Product Detail/button_Sign In'))

WebUI.click(findTestObject('Object Repository/PMC/Edit Product Detail/a_Approvals'))

WebUI.click(findTestObject('PMC/Edit Product Detail/span_View AX993567GB.BSBXC4H'))

WebUI.scrollToElement(findTestObject('PMC/Edit Product Detail/button_Approve'), 0)

WebUI.click(findTestObject('Object Repository/PMC/Edit Product Detail/button_Approve'))

WebUI.setText(findTestObject('Object Repository/PMC/Edit Product Detail/textarea_Please enter a remarkmessage about_b9e68f'), 
    'test')

WebUI.click(findTestObject('Object Repository/PMC/Edit Product Detail/button_Submit'))

WebUI.click(findTestObject('Object Repository/PMC/Edit Product Detail/button_OK'))

