package Activity;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Activity13_2a {
    void writeExcel(String filePath){
        //Blank workbook
        XSSFWorkbook workbook = new XSSFWorkbook();

        //Create a blank sheet
        XSSFSheet sheet = workbook.createSheet("Sheet1");

        //This data needs to be written (Object[])
        List<String[]> data = new ArrayList<String[]>();
        String[] heading = {"ID", "First Name", "Last Name", "Email", "Ph.No."};
        String[] row1 = {"1", "Satvik", "Shah", "satshah@example.com", "4537829158"};
        String[] row2 = {"2", "Avinash", "Kati", "avinashK@example.com", "4892184058"};
        String[] row3 = {"3", "Lahri", "Rath", "lahri.rath@example.com", "4528727830"};

        data.add(heading);
        data.add(row1);
        data.add(row2);
        data.add(row3);

        int rownum = 0;

        for(String[] rowData: data){
            Row row = sheet.createRow(rownum++);
            int cellNum = 0;
            for(String cellData: rowData){
                Cell cell = row.createCell(cellNum++);
                cell.setCellValue(cellData);
            }


        }

        try {
            //this Writes to the workbook
            FileOutputStream out = new FileOutputStream(new File(filePath));
            workbook.write(out);
            out.close();
            workbook.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    void readExcel(String filePath) throws IOException {
        try {
            FileInputStream file = new FileInputStream(filePath);

            //Create Workbook instance holding reference to Excel file
            XSSFWorkbook workbook = new XSSFWorkbook(file);

            //Get first sheet from the workbook
            XSSFSheet sheet = workbook.getSheetAt(0);

            //Iterate through each rows one by one
            Iterator<Row> rowIterator = sheet.iterator();
            while (rowIterator.hasNext()) {
                Row row = rowIterator.next();
                //For each row, iterate through all the columns
                Iterator<Cell> cellIterator = row.cellIterator();

                while (cellIterator.hasNext()) {
                    Cell cell = cellIterator.next();
                    //Check the cell type and format accordingly
                    switch (cell.getCellType()) {
                        case NUMERIC:
                            System.out.print(cell.getNumericCellValue() + " \t ");
                            break;
                        case STRING:
                            System.out.print(cell.getStringCellValue() + " \t ");
                            break;
                        default:
                            System.out.println("Invalid value");
                            break;
                    }
                }
                System.out.println("");
            }
            file.close();
            workbook.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void main(String args[]) throws IOException {
        //Prepare the path of excel file
        String filePath = "C:/Users/0031N4744/Documents/sample.xlsx";

        //Create an object of current class
        Activity13_2a objExcelFile = new Activity13_2a();

        //Write the file using file name, sheet name and the data to be filled
        objExcelFile.writeExcel(filePath);

        //Call read file method of the class to read data
        objExcelFile.readExcel(filePath);
    }
}