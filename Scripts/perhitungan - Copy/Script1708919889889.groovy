import org.apache.poi.ss.usermodel.*
import org.apache.poi.xssf.usermodel.*

// Path to the Excel file
String filePath = "Path_to_your_excel_file.xlsx"

// Load the Excel file
FileInputStream file = new FileInputStream(new File(filePath))
XSSFWorkbook workbook = new XSSFWorkbook(file)
XSSFSheet sheet = workbook.getSheetAt(0)

// Define the row and cell containing the formula and expected result
int rowNumber = 0 // Row number (0-based index)
int columnNumber = 0 // Column number (0-based index)

// Get the cell containing the formula
XSSFRow row = sheet.getRow(rowNumber)
XSSFCell cell = row.getCell(columnNumber)

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
