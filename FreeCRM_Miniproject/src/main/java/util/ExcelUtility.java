package util;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {

    static Workbook workbook;

    // Load workbook
    public static Workbook loadWorkbook() throws Exception {

        FileInputStream fis = new FileInputStream(
                "/Users/jathin/Downloads/FreeCRM_Miniproject/src/test/resources/Testdata/FreeCRM.xlsx");

        workbook = WorkbookFactory.create(fis);

        return workbook;
    }

    // Get Sheet by name
    public static Sheet getSheet(String sheetName) throws Exception {

        if (workbook == null) {
            loadWorkbook();
        }

        return workbook.getSheet(sheetName);
    }

    // Get Cell Data
    public static String getCellData(String sheetName, int row, int col) throws Exception {

        Sheet sheet = getSheet(sheetName);

        Cell cell = sheet.getRow(row).getCell(col);

        DataFormatter formatter = new DataFormatter();

        return formatter.formatCellValue(cell);
    }

}

//    public static String getCellData(String sheet, int row, int col) throws Exception {
//
//        FileInputStream fis = new FileInputStream(
//                "C:\\Users\\DasariTejashwini\\Downloads\\contacts.xlsx");
//
//        Workbook wb = WorkbookFactory.create(fis);
//
//        Sheet sh = wb.getSheet(sheet);
//
//        Cell cell = sh.getRow(row).getCell(col);
//
//        DataFormatter formatter = new DataFormatter();
//        String value = formatter.formatCellValue(cell);
//
//        wb.close();
//
//        return value;
//    }
