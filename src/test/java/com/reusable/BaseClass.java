package com.reusable;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	
	public static void loadDriver() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	}
	public static void loadUrl(String url) {
		driver.get(url);
		driver.manage().window().maximize();
	}
	public WebElement findElement(String attribute) {
		WebElement element = driver.findElement(By.id(attribute));
		return element;
	}
	public WebElement findElementName(String attribute) {
		WebElement element = driver.findElement(By.name(attribute));
		return element;
	}

	public String getDataFromExcel(int rows,int cells) throws IOException {
		String data=null;
		File file=new File("C:\\Users\\PRITHIVIRAJ\\eclipse-workspace3\\Cucumber\\Excel\\Recent.xlsx");
		FileInputStream stream=new FileInputStream(file);
		Workbook workbook=new XSSFWorkbook(stream);
		Sheet sheet=workbook.getSheet("MyWorkbook");
		Row row=sheet.getRow(rows);
		Cell cell=row.getCell(cells);
		CellType type = cell.getCellType();
		switch(type) {
		case STRING:
			data= cell.getStringCellValue();
			break;
		
		case NUMERIC:
			if(DateUtil.isCellDateFormatted(cell)) {
				Date dateCellValue = cell.getDateCellValue();
				SimpleDateFormat dateFormat=new SimpleDateFormat("dd-MMM-yy");
				data= dateFormat.format(dateCellValue);
			}
			else {
				double numericCellValue = cell.getNumericCellValue();
				BigDecimal bigDecimal=BigDecimal.valueOf(numericCellValue);
				data= bigDecimal.toString();
				break;
			}
		default:
			break;
		}
		return data;
	}
	
	

}
