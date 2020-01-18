package util;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

public class ExcelUtilReadingExcel {
    private static final String FILE_NAME = "/home/admin265/Documents/sample2.xlsx";

    @Test(description = "read the excel sheet records from given file")
    public void methodFor_ReadingExcelData_FromGivenPath(){
        try {
            FileInputStream excelFile = new FileInputStream(new File(FILE_NAME));
            Workbook workbook = new XSSFWorkbook(excelFile);
            Sheet dataTypeSheet = workbook.getSheetAt(0);
            Iterator<Row> iterator = dataTypeSheet.iterator();

            while (iterator.hasNext()) {

                Row currentRow = iterator.next();
                Iterator<Cell> cellIterator = currentRow.iterator();

                while (cellIterator.hasNext()) {

                    Cell currentCell = cellIterator.next();
                    //getCellTypeEnum shown as deprecated for version 3.15
                    //getCellTypeEnum ill be renamed to getCellType starting from version 4.0
                    if (currentCell.getCellTypeEnum() == CellType.STRING) {
                        System.out.print(currentCell.getStringCellValue() + "--");
                    } else if (currentCell.getCellTypeEnum() == CellType.NUMERIC) {
                        System.out.print(currentCell.getNumericCellValue() + "--");
                    }
                }
                System.out.println();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
