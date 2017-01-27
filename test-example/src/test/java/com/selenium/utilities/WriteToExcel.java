
package com.selenium.utilities;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;


public class WriteToExcel  {
	
	public void writeToExcel() throws IOException {
        XSSFWorkbook wb = new XSSFWorkbook();
        XSSFSheet sheet = wb.createSheet("excelfile");

        // Create a row and put some cells in it. Rows are 0 based.
        XSSFRow row1 = sheet.createRow(0);

        // Create a cell
        row1.createCell(0).setCellValue("EmpID");
        row1.createCell(1).setCellValue("Name");
        
        XSSFRow row2 = sheet.createRow(1);
        row2.createCell(0).setCellValue("54601");
        row2.createCell(1).setCellValue("Soha S");
       
        // Write the output to a file
        FileOutputStream fileOut = new FileOutputStream("excelfilw.xlsx");
        wb.write(fileOut);
        fileOut.close();
        System.out.println("Successfully Created workbook");
        wb.close();
    }
}