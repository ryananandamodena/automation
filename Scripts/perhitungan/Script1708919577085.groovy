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
import org.apache.poi.ss.usermodel.*
import org.apache.poi.xssf.usermodel.*

// Path to the Excel file
String filePath = "Path_to_your_excel_file.xlsx"

// Load the Excel file
FileInputStream file = new FileInputStream(new File(filePath))
XSSFWorkbook workbook = new XSSFWorkbook(file)
XSSFSheet sheet = workbook.getSheetAt(0)

// Get the cell containing the formula (Assuming formula is in cell A1)
XSSFRow row = sheet.getRow(0)
XSSFCell cell = row.getCell(0)

// Evaluate the formula
FormulaEvaluator evaluator = workbook.getCreationHelper().createFormulaEvaluator()
CellValue cellValue = evaluator.evaluate(cell)

// Get the actual result
double actualResult = cellValue.getNumberValue() // Assuming it's a numeric value

// Define the expected result (you may read it from another cell)
double expectedResult = 10.0

// Compare actual vs expected
if (actualResult == expectedResult) {
	println("Test Passed")
} else {
	println("Test Failed")
}

// Close the file
file.close()
