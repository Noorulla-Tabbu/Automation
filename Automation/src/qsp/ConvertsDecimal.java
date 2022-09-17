package qsp;

import java.util.Scanner;

public class ConvertsDecimal {

	public static void main(String[] args)
	{
		//Converting the decimal to binaries.........
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the decimal value:");
		int dec=sc.nextInt();
		do {
			int r=dec%2;
			System.out.print(r);//458=010100111
			dec=dec/2;
		} while (dec!=0);
		System.out.println();

		//Converting the decimal to Octa.........
		System.out.println("Enter the decimal value:");
		int dec2=sc.nextInt();

		do {
			int r=dec2%8;
			System.out.print(r);//4856=07311
			dec2=dec2/8;
		} while (dec2!=0);
		System.out.println();

		//Converting the decimal to Hexa.........
		System.out.println("Enter the decimal value:");
		int dec3=sc.nextInt();

		do {
			int r=dec3%16;
			if(r<10)
			System.out.print(r);
			if(r==11)
				System.out.print((char)(r+65));
				dec3=dec3/16;
		} while (dec3!=0);
		System.out.println();

	}

}
