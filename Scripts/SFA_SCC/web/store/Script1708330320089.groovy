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

WebUI.navigateToUrl('https://salesmobiledev.modena.com/')

WebUI.setText(findTestObject('Object Repository/scc/store/Page_Sales Force Automation/input_Email or Username_username'), 'arman.septian')

WebUI.click(findTestObject('Object Repository/scc/store/Page_Sales Force Automation/div_Password'))

WebUI.setEncryptedText(findTestObject('Object Repository/scc/store/Page_Sales Force Automation/input_Password_password'), 'iFGeFYmXIrUhQZHvW7P22w==')

WebUI.click(findTestObject('Object Repository/scc/store/Page_Sales Force Automation/button_Login'))

WebUI.click(findTestObject('Object Repository/scc/store/Page_Sales Force Automation/p_SCC Master Data'))

WebUI.click(findTestObject('Object Repository/scc/store/Page_Sales Force Automation/p_Stores'))

WebUI.click(findTestObject('Object Repository/scc/store/Page_Sales Force Automation/button_Add'))

WebUI.selectOptionByValue(findTestObject('Object Repository/scc/store/Page_Sales Force Automation/select_Select AreaBANDUNGBANJARMASINBATAMBO_9aa89c'), 
    '32', true)

WebUI.setText(findTestObject('Object Repository/scc/store/Page_Sales Force Automation/input_Search Location_search'), 'bogor')

WebUI.click(findTestObject('Object Repository/scc/store/Page_Sales Force Automation/span_Bogor Utara, Bogor City, West Java, Indonesia'))

WebUI.setText(findTestObject('Object Repository/scc/store/Page_Sales Force Automation/input_Store Code_store_code'), '1220')

WebUI.setText(findTestObject('Object Repository/scc/store/Page_Sales Force Automation/input_Store Name_store_name'), 'modena bogor2')

WebUI.setText(findTestObject('Object Repository/scc/store/Page_Sales Force Automation/textarea_Address_address'), 'bogor utara')

WebUI.click(findTestObject('Object Repository/scc/store/Page_Sales Force Automation/button_Save'))

WebUI.click(findTestObject('Object Repository/scc/store/Page_Sales Force Automation/button_OK'))

WebUI.setText(findTestObject('Object Repository/scc/store/Page_Sales Force Automation/input_List of Store Data_search'), '1220')

