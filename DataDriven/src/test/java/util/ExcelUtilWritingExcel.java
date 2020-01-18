package util;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

    public class ExcelUtilWritingExcel {
        private static final String FILE_NAME = "/home/admin265/Documents/sample2.xlsx";

        @Test(description = "writing into excel sheet")
        public void methodFor_WritingIntoExcelSheet(String[] args) {
            XSSFWorkbook workbook = new XSSFWorkbook();
            XSSFSheet sheet = workbook.createSheet("Datatypes in Java");
            Object[][] datatypes = {
                    {"Username", "Password", "Status"},
                    {"jitendraB", "123abc", "true"},
                    {"Abhi", "123xyz", "true"},
                    {"Vishal", "xyzabc", "false"},
                    {"Tushar", "abcxyz", "false"}
            };

            int rowNum = 0;
            System.out.println("Creating excel");

            for (Object[] datatype : datatypes) {
                Row row = sheet.createRow(rowNum++);
                int colNum = 0;
                for (Object field : datatype) {
                    Cell cell = row.createCell(colNum++);
                    if (field instanceof String) {
                        cell.setCellValue((String) field);
                    } else if (field instanceof Integer) {
                        cell.setCellValue((Integer) field);
                    }
                }
            }

            try {
                FileOutputStream outputStream = new FileOutputStream(FILE_NAME);
                workbook.write(outputStream);
                workbook.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

            System.out.println("Done");
        }
    }

