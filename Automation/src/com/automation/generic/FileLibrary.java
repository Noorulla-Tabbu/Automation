package com.automation.generic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileLibrary {

///Reading the data from property file***********************************************************
	public String ReadPropertyData(String key) throws IOException
	{
		FileInputStream fis= new FileInputStream("./data/commondata.property.txt");
		Properties p = new Properties();
		p.load(fis);
		String value = p.getProperty(key);
		return value;
	}
	
///Reading the data from Excel file****************************************************************
	public String ReadExcelData(String sheet,int row,int cell) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis= new FileInputStream("./data/testscript.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		String cellvalue = wb.getSheet(sheet).getRow(row).getCell(cell).getStringCellValue();
		return cellvalue;
	}
	
///Reading the matrix******************************************************************************
	public int[][] readMatrix() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the order of matrix:(rows,columns)");
		int row=sc.nextInt();
		int col=sc.nextInt();
		int x[][]=new int[row][col];
		System.out.println("enter the "+row*col+" values");
		for(int i=0;i<x.length;i++)
		{
			for (int j = 0; j < x[i].length; j++) {
				x[i][j]=sc.nextInt();
			}
		}
		return x;
	}
	
///Displaying the matrix******************************************************************************
	public void displayMatrix(int mat[][]) {
		for(int i=0;i<mat.length;i++)
		{
			for (int j = 0; j < mat[i].length; j++) {
				System.out.print(mat[i][j]+"  ");
			}
			System.out.println();
		}
	}
	
///Addition of two matrixes****************************************************************************
	public int[][] addMatrix(int a[][],int b[][]) {
		int add[][]=new int[a.length][b[0].length];
		if(a.length!=b.length || a[0].length!=b[0].length)
			return null;
		for (int i = 0; i < add.length; i++) {
			for(int j=0;j<add[0].length;j++)
			{
				add[i][j]=a[i][j]+b[i][j];
			}
		}
		return add;
	}
	
///Subtraction of two matrixes**************************************************************************
	public int[][] subMatrix(int a[][],int b[][]) {
		int sub[][]=new int[a.length][b[0].length];
		if(a.length!=b.length || a[0].length!=b[0].length)
			return null;
		for (int i = 0; i < sub.length; i++) {
			for(int j=0;j<sub[0].length;j++)
			{
				sub[i][j]=a[i][j]-b[i][j];
			}
		}
		return sub;
	}
	
///multiplication of two matrixes**************************************************************************
	public int[][] multipleMatrix(int a[][],int b[][]) {
		int mul[][]=new int[a.length][b[0].length];
		if(a.length!=b.length || a[0].length!=b[0].length)
			return null;
		for (int i = 0; i < mul.length; i++) {
			for(int j=0;j<mul[0].length;j++)
			{
				mul[i][j]=a[i][j]*b[i][j];
			}
		}
		return mul;
	}
	
///Transpose of matrixes***********************************************************************************
	public int[][] tranposeMatrix(int a[][]) {
		int transpose[][]=new int[a[0].length][a.length];
		for (int i = 0; i < transpose.length; i++) {
			for(int j=0;j<transpose[0].length;j++) {
				transpose[i][j]=a[j][i];
			}
		}
		return transpose;
	}
	
///Row-Wise-Biggest element in a matrix*********************************************************************
	public int[] rowWiseBig(int a[][]) {
		int b[]=new int[a.length];
		for(int i=0;i<a.length;i++) {
			b[i]=a[i][0];
			for(int j=0;j<a[i].length;j++) {
				if(a[i][j]>b[i]) {
					b[i]=a[i][j];
				}
			}
		}
		return b;
	}
	
///Col-Wise-Biggest element in a matrix*********************************************************************
	public int[] colWiseBig(int a[][]) {
		int b[]=new int[a[0].length];
		for(int i=0;i<a.length;i++) {
			b[i]=a[i][0];
			for(int j=0;j<a[i].length;j++)
				if(a[j][i]>b[i])
					b[i]=a[j][i];
		}
		return b;
	}
	
}
