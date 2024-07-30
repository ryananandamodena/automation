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

WebUI.navigateToUrl('https://more-dev.modena.com/')

WebUI.setText(findTestObject('Object Repository/More Sales Management/Customer/Page_More 2.0/input_Email or Username_username'), 
    'asma.nasyith')

WebUI.setEncryptedText(findTestObject('Object Repository/More Sales Management/Customer/Page_More 2.0/input_Password_password'), 
    'W3hObB4uSEA=')

WebUI.click(findTestObject('Object Repository/More Sales Management/Customer/Page_More 2.0/button_Login'))

WebUI.click(findTestObject('Object Repository/More Sales Management/Customer/Page_More 2.0/p_MODENA Indonesia (MODENA_LIVE)'))

WebUI.click(findTestObject('Object Repository/More Sales Management/Customer/Page_More 2.0/p_Customer'))

WebUI.click(findTestObject('Object Repository/More Sales Management/Customer/Page_More 2.0/a_Customer Info'))

WebUI.click(findTestObject('Object Repository/More Sales Management/Customer/Page_More 2.0/img_Key Account Trading Term_customer_dot_m_b5e78c'))

WebUI.click(findTestObject('Object Repository/More Sales Management/Customer/Page_More 2.0/a_View'))

WebUI.click(findTestObject('Object Repository/More Sales Management/Customer/Page_More 2.0/b_Asma Karimah'))

WebUI.click(findTestObject('Object Repository/More Sales Management/Customer/Page_More 2.0/li_Logout'))

