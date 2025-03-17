package ExcelTest;

import org.apache.poi.ss.usermodel.DataFormat;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Arrays;

public class ExcelRead {
    @DataProvider(name = "readexcel")
    public Object[][] readexcel() throws Exception {

        File fl = new File("src//test//resources//ReadExcel.xlsx");
        FileInputStream fi = new FileInputStream(fl);
        XSSFWorkbook wb = new XSSFWorkbook(fi);
        XSSFSheet sh = wb.getSheet("Read");

        int row = sh.getPhysicalNumberOfRows();
        int col = sh.getRow(0).getLastCellNum();

        String[][] dt = new String[row - 1][col];

        DataFormatter df = new DataFormatter();

        for (int i = 0; i < row - 1; i++) {

            for (int j = 0; j < col; j++) {
                dt[i][j] = df.formatCellValue(sh.getRow(i + 1).getCell(j));
            }
        }
        wb.close();
        fi.close();

        return dt;

    }
}
