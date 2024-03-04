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

WebUI.delay(1)

WebUI.takeFullPageScreenshot()

if (Username == Username) {
    WebUI.setText(findTestObject('Object Repository/gccs/gccs_surveymanagement/survey management/Page_Login - GCCS/input_Username_userName'), 
        Username)

    WebUI.delay(1)

    WebUI.takeFullPageScreenshot()
} else {
    WebUI.verifyElementText(findTestObject('gccs/cr_gccs/Page_Login - GCCS/Page_Login - GCCS/small_Username is required'), 
        usernamewarningerror)
}

WebUI.delay(1)

if (Password == Password) {
    WebUI.setText(findTestObject('Object Repository/gccs/gccs_surveymanagement/survey management/Page_Login - GCCS/input_Password_password'), 
        passwordwarningerror)

    WebUI.delay(1)

    WebUI.takeFullPageScreenshot()
} else {
    WebUI.verifyElementText(findTestObject('gccs/cr_gccs/Page_Login - GCCS/small_Password is required'), passwordwarningerror)
}

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/gccs/gccs_surveymanagement/survey management/Page_Login - GCCS/button_Login'))

WebUI.delay(1)

if (testtype == testtype1) {
    WebUI.waitForElementVisible(findTestObject('gccs/cr_gccs/Page_Login - GCCS/nama profil'), 0)

    WebUI.delay(1)

    WebUI.takeFullPageScreenshot()
} else {
    WebUI.verifyElementText(findTestObject('gccs/cr_gccs/Page_Login - GCCS/small_Username or Password Invalid'), loginwarningerror)
}

WebUI.closeBrowser()

