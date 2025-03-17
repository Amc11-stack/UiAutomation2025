package ExcelTest;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExcelWrite {

    public static void writedata() throws IOException {

        XSSFWorkbook wb= new XSSFWorkbook();

        XSSFSheet sh= wb.createSheet("Test");

        Object[][] Data= {{"FIRST NAME","LAST NAME"},{"AMAN","CHOUDHURY"},{"RAHUL","SHETTY"}};

        int rowcount=0;


        for(Object[] ob:Data){
            Row rr= sh.createRow(rowcount++);
            int colcount=0;
            for(Object ss:ob){
             Cell cc= rr.createCell(colcount++);

             if(ss instanceof String){

                 cc.setCellValue((String) ss);
             }
             else{

                 cc.setCellValue((Integer)ss);
             }

            }
        }


        FileOutputStream fo= new FileOutputStream(new File("C:\\Users\\ASUS\\IdeaProjects\\untitled1\\src\\test\\resources\\ExcelTest.xlsx"));
        wb.write(fo);
        fo.close();;
        wb.close();
        System.out.println("Writeen done");
    }

    public static void main(String[] args) throws IOException {

   writedata();


    }
}
