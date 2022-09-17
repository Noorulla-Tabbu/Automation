package qsp;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteDataToExl {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		Scanner sc= new Scanner(System.in);
		FileInputStream fis = new FileInputStream("./data/testscript.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet s = wb.getSheet("userdata");
		int rowNum = s.getLastRowNum();
		short colNum = s.getRow(1).getLastCellNum();
		System.out.println(colNum);
		System.out.println(rowNum);
		for (int i=2;i<=rowNum;i++) {
			for (int j = 1; j <colNum; j++) {
				String data = s.getRow(1).getCell(j).getStringCellValue();

				if(data.equals("Id"))
				{
					System.out.println("Enter the "+data);
					s.getRow(i).getCell(j).setCellValue(sc.nextInt());					
				}
				else if(data.equals("Name"))
				{
					System.out.println("Enter the "+data);
					s.getRow(i).getCell(j).setCellValue(sc.next());					
				}
				else if(data.equals("Location"))
				{
					System.out.println("Enter the "+data);
					s.getRow(i).getCell(j).setCellValue(sc.next());				
				}
				else if(data.equals("Job"))
				{
					System.out.println("Enter the "+data);
					s.getRow(i).getCell(j).setCellValue(sc.next());				
				}
				else if(data.equals("Salary"))
				{
					System.out.println("Enter the "+data);
					s.getRow(i).getCell(j).setCellValue(sc.nextDouble());					
				}
				else if(data.equals("Number"))
				{
					System.out.println("Enter the "+data);
					s.getRow(i).getCell(j).setCellValue(sc.nextLong());					
				}
				else
				{
					System.out.println("Invalid data");
					break;
				}
			}
		}
		FileOutputStream fos = new FileOutputStream("./data/testscript.xlsx");
		wb.write(fos);
		wb.close();
		System.out.println("Details saved sucessfully");
	}
}
