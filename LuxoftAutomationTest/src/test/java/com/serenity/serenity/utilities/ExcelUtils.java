package com.serenity.serenity.utilities; /**
 * Created by stivanov on 30.1.2017 г..
 */

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;
import java.util.Iterator;
import java.util.List;

public class ExcelUtils {


    public static void writeTableToExcel(
    		String fileName,String sheetName,
    		Object[][] table,
    		int startWritingFromColumnNumber,
    		int startWritingFromRowNumber) throws IOException {
        XSSFWorkbook workbook = new XSSFWorkbook();
        Sheet sheet = workbook.createSheet(sheetName);


        int rowCount = startWritingFromRowNumber;

        for (Object[] aBook : table) {
            Row row = sheet.createRow(rowCount++);

            int columnCount = startWritingFromColumnNumber;

            for (Object field : aBook) {
                Cell cell = row.createCell(columnCount++);
                if (field instanceof String) {
                    cell.setCellValue((String) field);
                } else if (field instanceof Integer) {
                    cell.setCellValue((Integer) field);
                }
            }

        }


        FileOutputStream outputStream = new FileOutputStream(fileName);
            workbook.write(outputStream);
    }


    public static void writeListToExcelColumn(String fileName,String sheetName, List<String> listOfData,int columnNumber,int startWritingFromRowNumber) throws IOException {

        XSSFWorkbook workbook = null;
        File file = new File(fileName);
        workbook = new XSSFWorkbook();
        Sheet sheet = workbook.createSheet(sheetName);

        int rowIndex = startWritingFromRowNumber;

        Iterator<String> it = listOfData.iterator();
        while(it.hasNext()){
            String id = it.next();
            Row row = sheet.createRow(rowIndex++);
            row.createCell(columnNumber).setCellValue(id);

        }
        //workbook.close();
        FileOutputStream os = new FileOutputStream(fileName);
        workbook.write(os);
        System.out.println("Writing on XLSX file Finished ...");

    }

}