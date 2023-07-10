package ReadExcelData;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

import DataDrivenFramework.FileLibrary;

public class WriteToExcelSheet 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException 
	{
			FileLibrary flib = new FileLibrary();
			flib.writeIntoExcelSheet("./Data/TestData.xlsx", "IPL", 11, 0, "Pune");
			flib.writeIntoExcelSheet("./Data/TestData.xlsx", "IPL", 12, 0, "Indore");
			
			flib.writeIntoExcelSheet("./Data/TestData.xlsx", "IPL", 11, 1, "Jadeja");
			flib.writeIntoExcelSheet("./Data/TestData.xlsx", "IPL", 12, 1, "SRK");
	}
}
