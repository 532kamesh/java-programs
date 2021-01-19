package com.testng.datadriven;

import org.testng.annotations.Test;
import org.apache.poi.ss.usermodel.Workbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

public class ExcelExample {
	public WebDriver driver;
	//public Workbook book;
	//public 
	@BeforeMethod
	public void setBrowser()
	{
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\532ka\\Downloads\\chromedriver_win32\\chromedriver.exe");
	         driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://www.browserstack.com/users/sign_in");
	}
	@Test(dataProvider="testdata")
	public void excelDemo(String usernm, String pass)
	{
		driver.findElement(By.id("user_email_login")).sendKeys(usernm);
		driver.findElement(By.id("user_password")).sendKeys(pass);
		driver.findElement(By.id("user_submit")).click();
	}
	
	
	@DataProvider(name="testdata")
	public Object[][] testDataExample() throws Exception{
		ReadDataExcel configuration = new ReadDataExcel("C:\\Users\\532ka\\eclipse-workspace\\java programs\\Excelfile\\Exeldata.xlsx");
		int rows = configuration.getRowCount(0);
		Object[][]signin_credentials = new Object[rows][2];

		for(int i=0;i<rows;i++)
		{
		signin_credentials[i][0] = configuration.getData(i, 0, 0);
		signin_credentials[i][1] = configuration.getData(i, 1, 0);
		}
		return signin_credentials;
		}}
