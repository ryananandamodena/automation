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

WebUI.callTestCase(findTestCase('B2B Vendor/Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/B2B Vendor/Page_B2B Portal/Page_B2B Portal/div_keyboard_double_arrow_rightHide Menu'))

WebUI.click(findTestObject('Object Repository/B2B Vendor/Page_B2B Portal/Page_B2B Portal/div_Configuration Setting'))

WebUI.click(findTestObject('Object Repository/B2B Vendor/Page_B2B Portal/Page_B2B Portal/a_Budget'))


def countries = [
	['country': 'ALBANIA', 'country_code': '2232'],
	]
for (Map countryData : countries) {
	
//	def countryParts = countryData.split('=')
	
    def country = countryData['country']

    def countryCode = countryData['country_code']

    WebUI.click(findTestObject('Object Repository/B2B Vendor/Page_B2B Portal/Page_B2B Portal/button_Add COA'))

    WebUI.setText(findTestObject('Object Repository/B2B Vendor/Page_B2B Portal/Page_B2B Portal/input_Account Name_account_name'), 
        country)

    WebUI.setText(findTestObject('Object Repository/B2B Vendor/Page_B2B Portal/Page_B2B Portal/input_Account Code_account_code'), 
        countryCode)

    WebUI.click(findTestObject('Object Repository/B2B Vendor/Page_B2B Portal/Page_B2B Portal/span__swal2-x-mark'))

    WebUI.click(findTestObject('Object Repository/B2B Vendor/Page_B2B Portal/Page_B2B Portal/div_Save'))

    def checkSuccess = WebUI.getText(findTestObject('B2B Vendor/Page_B2B Portal/Page_B2B Portal/h2_Error'))

    if (checkSuccess == Success) {
        WebUI.click(findTestObject('Object Repository/B2B Vendor/Page_B2B Portal/Page_B2B Portal/button_OK'), FailureHandling.STOP_ON_FAILURE)
    } else {
        WebUI.click(findTestObject('Object Repository/B2B Vendor/Page_B2B Portal/Page_B2B Portal/button_OK'))

        WebUI.click(findTestObject('Object Repository/B2B Vendor/Page_B2B Portal/Page_B2B Portal/button_Add COA'))
    }
}

