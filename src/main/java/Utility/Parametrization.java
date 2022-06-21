package Utility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Parametrization {
  public static String getdata(int row,int cell)throws EncryptedDocumentException, IOException {
	 FileInputStream file = new FileInputStream("E:\\automation\\KiteZerodha\\src\\test\\resources\\TestData.xlsx");
	 String cellvalue = WorkbookFactory.create(file).getSheet("Credentials").getRow(row).getCell(cell).getStringCellValue();
     return cellvalue;
  }
}
